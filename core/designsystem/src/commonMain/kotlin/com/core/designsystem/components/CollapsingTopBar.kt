package com.core.designsystem.components

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.AnimationSpec
import androidx.compose.animation.core.AnimationState
import androidx.compose.animation.core.DecayAnimationSpec
import androidx.compose.animation.core.FastOutLinearInEasing
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.animateDecay
import androidx.compose.animation.core.animateTo
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.gestures.rememberDraggableState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.displayCutout
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.only
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.material3.TopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.lerp
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.semantics.hideFromAccessibility
import androidx.compose.ui.semantics.isTraversalGroup
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.Velocity
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.lerp
import androidx.compose.ui.util.lerp
import kotlin.math.abs
import kotlin.math.roundToInt

private enum class Slots {
    Insets,
    Banner,
    NavigationIcon,
    Actions,
    TopStart,
    ContainerBar,
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CollapsingTopBar(
    banner: (@Composable () -> Unit)? = null,
    navigationIcon: (@Composable BoxScope.() -> Unit)? = null,
    actions: (@Composable RowScope.() -> Unit)? = null,
    topStart: @Composable () -> Unit,
    containerBar: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    colors: TopAppBarColors = TopAppBarDefaults.topAppBarColors(),
    elevation: Dp = 0.dp,
    scrolledElevation: Dp = 4.dp,
    scrollBehavior: TopAppBarScrollBehavior? = null,
) {
    val appBarDragModifier =
        if (scrollBehavior != null && !scrollBehavior.isPinned) {
            Modifier.draggable(
                orientation = Orientation.Vertical,
                state =
                    rememberDraggableState { delta ->
                        scrollBehavior.state.heightOffset += delta
                    },
                onDragStopped = { velocity ->
                    @Suppress("RETURN_VALUE_NOT_USED")
                    settleAppBar(
                        scrollBehavior.state,
                        velocity,
                        scrollBehavior.flingAnimationSpec,
                        scrollBehavior.snapAnimationSpec,
                    )
                },
            )
        } else {
            Modifier
        }

    val targetColor by remember(colors, scrollBehavior) {
        derivedStateOf {
            val overlappingFraction = scrollBehavior?.state?.overlappedFraction ?: 0f
            lerp(
                colors.containerColor,
                colors.scrolledContainerColor,
                FastOutLinearInEasing.transform(if (overlappingFraction > 0.01f) 1f else 0f),
            )
        }
    }

    val appBarContainerColor =
        animateColorAsState(targetColor)

    val elevation by remember(scrollBehavior) {
        derivedStateOf {
            val overlappingFraction = scrollBehavior?.state?.overlappedFraction ?: 0f
            lerp(
                elevation,
                scrolledElevation,
                FastOutLinearInEasing.transform(overlappingFraction),
            )
        }
    }

    Layout(
        modifier = modifier
            .then(appBarDragModifier)
            .graphicsLayer {
                shadowElevation = elevation.toPx()
            }
            .drawBehind {
                val color = appBarContainerColor.value
                if (color != Color.Unspecified) {
                    drawRect(color = color)
                }
            }
            .semantics { isTraversalGroup = true }
            .pointerInput(Unit) {},
        content = {
            Box(
                modifier = Modifier
                    .windowInsetsPadding(WindowInsets.statusBars)
                    .layoutId(Slots.Insets),
            )
            CompositionLocalProvider(LocalContentColor provides colors.navigationIconContentColor) {
                Box(
                    modifier = Modifier
                        .wrapContentSize()
                        .layoutId(Slots.NavigationIcon)
                        .windowInsetsPadding(WindowInsets.navigationBars.only(WindowInsetsSides.Right))
                        .windowInsetsPadding(WindowInsets.displayCutout.only(WindowInsetsSides.Right)),
                    contentAlignment = Alignment.Center,
                    content = { navigationIcon?.invoke(this) },
                )
            }
            CompositionLocalProvider(LocalContentColor provides colors.navigationIconContentColor) {
                Box(
                    modifier = Modifier
                        .graphicsLayer {
                            alpha = lerp(
                                1f,
                                0f,
                                FastOutSlowInEasing.transform(
                                    scrollBehavior?.state?.collapsedFraction ?: 0f
                                )
                            )
                        }
                        .semantics {
                            val hideSemantics =
                                (scrollBehavior?.state?.collapsedFraction ?: 0f) >= 1f
                            isTraversalGroup = true
                            if (hideSemantics) hideFromAccessibility()
                        }
                        .layoutId(Slots.TopStart)
                        .adjustHeightOffsetLimit(scrollBehavior),
                    content = { topStart() },
                )
            }

            CompositionLocalProvider(LocalContentColor provides colors.actionIconContentColor) {
                Row(
                    modifier = Modifier
                        .wrapContentSize()
                        .padding(end = 16.dp)
                        .layoutId(Slots.Actions)
                        .windowInsetsPadding(WindowInsets.navigationBars.only(WindowInsetsSides.Right))
                        .windowInsetsPadding(WindowInsets.displayCutout.only(WindowInsetsSides.Right)),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    content = { actions?.invoke(this) },
                )
            }
            CompositionLocalProvider(LocalContentColor provides colors.subtitleContentColor) {
                Box(
                    modifier = Modifier
                        .offset {
                            IntOffset(
                                x = 0,
                                y = (scrollBehavior?.state?.heightOffset?.roundToInt() ?: 0)
                            )
                        }
                        .layoutId(Slots.ContainerBar),
                    content = { containerBar() },
                )
            }
            banner?.let {
                CompositionLocalProvider(LocalContentColor provides colors.scrolledContainerColor) {
                    Box(
                        modifier = Modifier
                            .layoutId(Slots.Banner),
                        content = { banner() },
                    )
                }
            }
        },
    ) { measurables, constraints ->
        val collapseFraction = (scrollBehavior?.state?.collapsedFraction ?: 0f)

        val insetsPlaceable = measurables.firstOrNull { it.layoutId == Slots.Insets }
            ?.measure(constraints.copy(minHeight = 0))

        val bannerPlaceables = measurables.firstOrNull { it.layoutId == Slots.Banner }
            ?.measure(constraints.copy(minHeight = 0))

        val navIconPlaceables = measurables.firstOrNull { it.layoutId == Slots.NavigationIcon }
            ?.measure(constraints.copy(minWidth = 0, minHeight = 0))

        val actionsPlaceable = measurables.firstOrNull { it.layoutId == Slots.Actions }
            ?.measure(constraints.copy(minWidth = 0, minHeight = 0))
        val iconsRowRemainingWidth = (constraints.maxWidth - (actionsPlaceable?.width ?: 0) - (navIconPlaceables?.width ?: 0))
            .coerceAtLeast(0)

        val topStartPlaceable = measurables.firstOrNull { it.layoutId == Slots.TopStart }
            ?.measure(constraints.copy(minWidth = 0, maxWidth = iconsRowRemainingWidth))

        val searchBarMaxWidth =
            lerp(constraints.maxWidth, iconsRowRemainingWidth, FastOutLinearInEasing.transform(collapseFraction))

        val containerBarPlaceable = measurables.firstOrNull { it.layoutId == Slots.ContainerBar }
            ?.measure(constraints.copy(minWidth = 0, maxWidth = searchBarMaxWidth))

        val topContentHeight =
            maxOf(insetsPlaceable?.height ?: 0, bannerPlaceables?.height ?: 0)
        val middleContentHeight =
            maxOf(actionsPlaceable?.height ?: 0, topStartPlaceable?.height ?: 0, navIconPlaceables?.height ?: 0)
        val bottomContentHeight = containerBarPlaceable?.height ?: 0

        val minusHeight = ((scrollBehavior?.state?.collapsedFraction
            ?: 0f) * middleContentHeight).roundToInt()

        val width = constraints.maxWidth
        val height = topContentHeight + middleContentHeight + bottomContentHeight - minusHeight

        val iconsCenter = (actionsPlaceable?.height ?: 0)
        val iconsY = lerp(
            start = (middleContentHeight - iconsCenter) / 2,
            stop = (bottomContentHeight - iconsCenter) / 2,
            fraction = FastOutLinearInEasing.transform(collapseFraction),
        )

        val navIconCenter = (navIconPlaceables?.height ?: 0)
        val navIconsY = lerp(
            start = (middleContentHeight - navIconCenter) / 2,
            stop = (bottomContentHeight - navIconCenter) / 2,
            fraction = FastOutLinearInEasing.transform(collapseFraction),
        )

        val searchBarX =
            lerp(0, (navIconPlaceables?.width ?: 0), FastOutLinearInEasing.transform(collapseFraction))

        layout(width, height) {
            insetsPlaceable?.place(0, 0)
            bannerPlaceables?.place(0, 0, zIndex = 1f)

            topStartPlaceable?.place(
                x = if (collapseFraction >= 1f) -topStartPlaceable.width else (navIconPlaceables?.width ?: 0),
                y = topContentHeight,
            )

            navIconPlaceables?.place(
                x = 0,
                y = topContentHeight + navIconsY,
            )

            actionsPlaceable?.place(
                x = constraints.maxWidth - actionsPlaceable.width,
                y = topContentHeight + iconsY,
            )

            containerBarPlaceable?.place(
                x = searchBarX,
                y = topContentHeight + middleContentHeight,
            )
        }
    }
}

/**
 * Settles the app bar by flinging, in case the given velocity is greater than zero, and snapping
 * after the fling settles.
 */
private suspend fun settleAppBar(
    state: TopAppBarState,
    velocity: Float,
    flingAnimationSpec: DecayAnimationSpec<Float>?,
    snapAnimationSpec: AnimationSpec<Float>?,
): Velocity {
    // Check if the app bar is completely collapsed/expanded. If so, no need to settle the app bar,
    // and just return Zero Velocity.
    // Note that we don't check for 0f due to float precision with the collapsedFraction
    // calculation.
    if (state.collapsedFraction < 0.01f || state.collapsedFraction == 1f) {
        return Velocity.Zero
    }
    var remainingVelocity = velocity
    // In case there is an initial velocity that was left after a previous user fling, animate to
    // continue the motion to expand or collapse the app bar.
    if (flingAnimationSpec != null && abs(velocity) > 1f) {
        var lastValue = 0f
        AnimationState(initialValue = 0f, initialVelocity = velocity).animateDecay(
            flingAnimationSpec
        ) {
            val delta = value - lastValue
            val initialHeightOffset = state.heightOffset
            state.heightOffset = initialHeightOffset + delta
            val consumed = abs(initialHeightOffset - state.heightOffset)
            lastValue = value
            remainingVelocity = this.velocity
            // avoid rounding errors and stop if anything is unconsumed
            if (abs(delta - consumed) > 0.5f) this.cancelAnimation()
        }
    }
    // Snap if animation specs were provided.
    if (snapAnimationSpec != null) {
        if (state.heightOffset < 0 && state.heightOffset > state.heightOffsetLimit) {
            AnimationState(initialValue = state.heightOffset).animateTo(
                if (state.collapsedFraction < 0.5f) {
                    0f
                } else {
                    state.heightOffsetLimit
                },
                animationSpec = snapAnimationSpec,
            ) {
                state.heightOffset = value
            }
        }
    }

    return Velocity(0f, remainingVelocity)
}

@OptIn(ExperimentalMaterial3Api::class)
private fun Modifier.adjustHeightOffsetLimit(scrollBehavior: TopAppBarScrollBehavior?) =
    scrollBehavior?.state?.let {
        onSizeChanged { size ->
            val offset = size.height.toFloat()
            it.heightOffsetLimit = -offset
        }
    } ?: this