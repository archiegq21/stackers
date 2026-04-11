package com.rolengi.nyuza.library.placeholder

import androidx.annotation.FloatRange
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.AnimationSpec
import androidx.compose.animation.core.AnimationVector1D
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.geometry.toRect
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.LinearGradientShader
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.PaintingStyle
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.drawOutline
import androidx.compose.ui.graphics.drawscope.ContentDrawScope
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.graphics.withSaveLayer
import androidx.compose.ui.layout.Measurable
import androidx.compose.ui.layout.MeasureResult
import androidx.compose.ui.layout.MeasureScope
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode
import androidx.compose.ui.node.DrawModifierNode
import androidx.compose.ui.node.LayoutModifierNode
import androidx.compose.ui.node.ModifierNodeElement
import androidx.compose.ui.node.currentValueOf
import androidx.compose.ui.node.remeasureSync
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlin.math.PI
import kotlin.math.tan

fun Modifier.shimmer(
    visible: Boolean,
    @FloatRange(from = 0.0, to = 1.0) fillFraction: Float = 1f,
    shape: Shape = ShimmerDefaults.shape,
    animationSpec: AnimationSpec<Float> = ShimmerDefaults.animationSpec,
) = this then ShimmerElement(
    visible = visible,
    fillFraction = fillFraction,
    shape = shape,
    animationSpec = animationSpec,
)

fun Modifier.shimmer(
    visible: Boolean,
    shape: Shape = ShimmerDefaults.shape,
    animationSpec: AnimationSpec<Float> = ShimmerDefaults.animationSpec,
) = this then ShimmerElement(
    visible = visible,
    fillFraction = null,
    shape = shape,
    animationSpec = animationSpec,
)

private class ShimmerNode(
    var visible: Boolean,
    var fillFraction: Float?,
    var shape: Shape,
    var animationSpec: AnimationSpec<Float>,
) : DrawModifierNode,
    CompositionLocalConsumerModifierNode,
    LayoutModifierNode,
    Modifier.Node()
{
    private lateinit var progress: Animatable<Float, AnimationVector1D>
    private var showContent: Boolean = !visible
    private var previousOutline: Outline? = null
    private var previousSize: Size? = null
    private var previousLayoutDirection: LayoutDirection? = null

    private var job: Job? = null
    private val emptyPaint = Paint()
    private val basePaint = Paint().apply {
        isAntiAlias = true
        style = PaintingStyle.Fill
    }
    private val highlightPaint = Paint().apply {
        isAntiAlias = true
        style = PaintingStyle.Fill
        blendMode = BlendMode.SrcAtop
    }

    private val angle: Float = 30f

    override fun MeasureScope.measure(
        measurable: Measurable,
        constraints: Constraints
    ): MeasureResult {
        val newConstraints = if (!showContent || visible) {
            constraints.toShimmerConstraint()
        } else {
            constraints
        }

        val placeable = measurable.measure(newConstraints)

        return layout(placeable.width, placeable.height) {
            placeable.place(0, 0)
        }
    }

    private fun Constraints.toShimmerConstraint() = fillFraction?.let { fraction ->
        val width = (maxWidth * fraction).toInt()
        Constraints.fixedWidth(width)
    } ?: this

    override fun ContentDrawScope.draw() {
        val width = calculateWidthFromHeightAndAngle(size.height, angle)

        val totalWidth = (size.width + width * 3f) * progress.value
        val startX = -width / 2f
        val endX = -width * 1.5f

        highlightPaint.shader = LinearGradientShader(
            from = Offset(
                x = totalWidth + endX,
                y = 0f
            ),
            to = Offset(
                x = totalWidth + startX,
                y = size.height,
            ),
            colors = listOf(
                currentValueOf(LocalShimmerColor).highlightColor.copy(0.2f),
                currentValueOf(LocalShimmerColor).highlightColor.copy(0.5f),
                currentValueOf(LocalShimmerColor).highlightColor.copy(0.2f),
            ),
        )

        val outline = previousOutline.takeIf {
            size == previousSize && layoutDirection == previousLayoutDirection
        } ?: shape.createOutline(size, layoutDirection, this)

        previousOutline = outline
        previousSize = size
        previousLayoutDirection = layoutDirection

        drawIntoCanvas { canvas ->
            canvas.withSaveLayer(
                bounds = size.toRect(),
                paint = emptyPaint,
            ) {
                if (showContent) {
                    drawContent()
                }

                if (showContent) return@drawIntoCanvas

                canvas.drawOutline(
                    outline = outline,
                    paint = basePaint.apply {
                        color = currentValueOf(LocalShimmerColor).baseColor
                    },
                )

                canvas.drawOutline(
                    outline = outline,
                    paint = highlightPaint,
                )
            }
        }
    }

    override fun onAttach() {
        progress = Animatable(0f)
        updateAnimation()
    }

    fun updateAnimation() {
        if (job?.isActive == true) return
        job = coroutineScope.launch {
            showContent = false
            while (visible) {
                progress.animateTo(
                    1f,
                    animationSpec,
                )
                progress.snapTo(0f)
            }
            showContent = true
            remeasureSync()
        }
    }

    private fun calculateWidthFromHeightAndAngle(height: Float, angle: Float): Float {
        val angleInRadians = angle * PI / 180.0
        return height / tan(angleInRadians).toFloat()
    }
}

private data class ShimmerElement(
    val visible: Boolean,
    val shape: Shape,
    val fillFraction: Float?,
    val animationSpec: AnimationSpec<Float>,
) : ModifierNodeElement<ShimmerNode>() {

    override fun create() = ShimmerNode(
        visible = visible,
        fillFraction = fillFraction,
        shape = shape,
        animationSpec = animationSpec,
    )

    override fun update(node: ShimmerNode) {
        node.visible = visible
        node.shape = shape
        node.fillFraction = fillFraction
        node.animationSpec = animationSpec
        node.updateAnimation()
    }
}

val LocalShimmerColor = compositionLocalOf { ShimmerColors() }

data class ShimmerColors(
    val baseColor: Color = Color.Gray.copy(alpha = 0.5f),
    val highlightColor: Color = Color.White,
)

private object ShimmerDefaults {
    val animationSpec: AnimationSpec<Float> = tween(durationMillis = 1700, delayMillis = 200)

    val shape = RoundedCornerShape(12)
}