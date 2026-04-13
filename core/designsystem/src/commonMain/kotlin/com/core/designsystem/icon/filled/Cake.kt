package com.core.designsystem.icon.filled

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.core.designsystem.icon.StackersIcons

@Suppress("UnusedReceiverParameter")
val StackersIcons.Filled.Cake: ImageVector
    get() {
        val current = cake
        if (current != null) return current

        return ImageVector.Builder(
            name = "Cake",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 960.0f,
            viewportHeight = 960.0f,
        ).apply {
            // M160 -80 q-17 0 -28.5 -11.5 T120 -120 v-160 q0 -33 23.5 -56.5 T200 -360 h560 q33 0 56.5 23.5 T840 -280 v160 q0 17 -11.5 28.5 T800 -80 H160Z m40 -360 v-120 q0 -33 23.5 -56.5 T280 -640 h160 v-58 q-18 -12 -29 -29 t-11 -41 q0 -15 6 -29.5 t18 -26.5 l42 -42 q2 -2 14 -6 2 0 14 6 l42 42 q12 12 18 26.5 t6 29.5 q0 24 -11 41 t-29 29 v58 h160 q33 0 56.5 23.5 T760 -560 v120 H200Z
            path(
                fill = SolidColor(Color(0xFFE3E3E3)),
            ) {
                // M 160 880
                moveTo(x = 160.0f, y = 880.0f)
                // q -17 0 -28.5 -11.5
                quadToRelative(
                    dx1 = -17.0f,
                    dy1 = 0.0f,
                    dx2 = -28.5f,
                    dy2 = -11.5f,
                )
                // T 120 840
                reflectiveQuadTo(
                    x1 = 120.0f,
                    y1 = 840.0f,
                )
                // l 0 -160
                lineToRelative(dx = 0.0f, dy = -160.0f)
                // q 0 -33 23.5 -56.5
                quadToRelative(
                    dx1 = 0.0f,
                    dy1 = -33.0f,
                    dx2 = 23.5f,
                    dy2 = -56.5f,
                )
                // T 200 600
                reflectiveQuadTo(
                    x1 = 200.0f,
                    y1 = 600.0f,
                )
                // l 560 0
                lineToRelative(dx = 560.0f, dy = 0.0f)
                // q 33 0 56.5 23.5
                quadToRelative(
                    dx1 = 33.0f,
                    dy1 = 0.0f,
                    dx2 = 56.5f,
                    dy2 = 23.5f,
                )
                // T 840 680
                reflectiveQuadTo(
                    x1 = 840.0f,
                    y1 = 680.0f,
                )
                // l 0 160
                lineToRelative(dx = 0.0f, dy = 160.0f)
                // q 0 17 -11.5 28.5
                quadToRelative(
                    dx1 = 0.0f,
                    dy1 = 17.0f,
                    dx2 = -11.5f,
                    dy2 = 28.5f,
                )
                // T 800 880
                reflectiveQuadTo(
                    x1 = 800.0f,
                    y1 = 880.0f,
                )
                // L 160 880z
                lineTo(x = 160.0f, y = 880.0f)
                close()
                // m 40 -360
                moveToRelative(dx = 40.0f, dy = -360.0f)
                // l 0 -120
                lineToRelative(dx = 0.0f, dy = -120.0f)
                // q 0 -33 23.5 -56.5
                quadToRelative(
                    dx1 = 0.0f,
                    dy1 = -33.0f,
                    dx2 = 23.5f,
                    dy2 = -56.5f,
                )
                // T 280 320
                reflectiveQuadTo(
                    x1 = 280.0f,
                    y1 = 320.0f,
                )
                // l 160 0
                lineToRelative(dx = 160.0f, dy = 0.0f)
                // l 0 -58
                lineToRelative(dx = 0.0f, dy = -58.0f)
                // q -18 -12 -29 -29
                quadToRelative(
                    dx1 = -18.0f,
                    dy1 = -12.0f,
                    dx2 = -29.0f,
                    dy2 = -29.0f,
                )
                // t -11 -41
                reflectiveQuadToRelative(
                    dx1 = -11.0f,
                    dy1 = -41.0f,
                )
                // q 0 -15 6 -29.5
                quadToRelative(
                    dx1 = 0.0f,
                    dy1 = -15.0f,
                    dx2 = 6.0f,
                    dy2 = -29.5f,
                )
                // t 18 -26.5
                reflectiveQuadToRelative(
                    dx1 = 18.0f,
                    dy1 = -26.5f,
                )
                // l 42 -42
                lineToRelative(dx = 42.0f, dy = -42.0f)
                // q 2 -2 14 -6
                quadToRelative(
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                    dx2 = 14.0f,
                    dy2 = -6.0f,
                )
                // q 2 0 14 6
                quadToRelative(
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                    dx2 = 14.0f,
                    dy2 = 6.0f,
                )
                // l 42 42
                lineToRelative(dx = 42.0f, dy = 42.0f)
                // q 12 12 18 26.5
                quadToRelative(
                    dx1 = 12.0f,
                    dy1 = 12.0f,
                    dx2 = 18.0f,
                    dy2 = 26.5f,
                )
                // t 6 29.5
                reflectiveQuadToRelative(
                    dx1 = 6.0f,
                    dy1 = 29.5f,
                )
                // q 0 24 -11 41
                quadToRelative(
                    dx1 = 0.0f,
                    dy1 = 24.0f,
                    dx2 = -11.0f,
                    dy2 = 41.0f,
                )
                // t -29 29
                reflectiveQuadToRelative(
                    dx1 = -29.0f,
                    dy1 = 29.0f,
                )
                // l 0 58
                lineToRelative(dx = 0.0f, dy = 58.0f)
                // l 160 0
                lineToRelative(dx = 160.0f, dy = 0.0f)
                // q 33 0 56.5 23.5
                quadToRelative(
                    dx1 = 33.0f,
                    dy1 = 0.0f,
                    dx2 = 56.5f,
                    dy2 = 23.5f,
                )
                // T 760 400
                reflectiveQuadTo(
                    x1 = 760.0f,
                    y1 = 400.0f,
                )
                // l 0 120
                lineToRelative(dx = 0.0f, dy = 120.0f)
                // L 200 520z
                lineTo(x = 200.0f, y = 520.0f)
                close()
            }
        }.build().also { cake = it }
    }

private var cake: ImageVector? = null


@Preview
@Composable
private fun CakeIconPreview() {
    Box(Modifier.size(48.dp)) {
        Icon(
            imageVector = StackersIcons.Filled.Cake,
            contentDescription = null,
            modifier = Modifier.matchParentSize()
        )
    }
}