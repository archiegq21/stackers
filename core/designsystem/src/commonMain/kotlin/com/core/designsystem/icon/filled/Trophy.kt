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
val StackersIcons.Filled.Trophy: ImageVector
    get() {
        val current = trophy
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.example.theme.AppTheme.Trophy",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 960.0f,
            viewportHeight = 960.0f,
        ).apply {
            // M280 -528 v-152 h-80 v40 q0 38 22 68.5 t58 43.5Z m400 0 q36 -13 58 -43.5 t22 -68.5 v-40 h-80 v152Z M440 -200 v-124 q-49 -11 -87.5 -41.5 T296 -442 q-75 -9 -125.5 -65.5 T120 -640 v-40 q0 -33 23.5 -56.5 T200 -760 h80 q0 -33 23.5 -56.5 T360 -840 h240 q33 0 56.5 23.5 T680 -760 h80 q33 0 56.5 23.5 T840 -680 v40 q0 76 -50.5 132.5 T664 -442 q-18 46 -56.5 76.5 T520 -324 v124 h120 q17 0 28.5 11.5 T680 -160 q0 17 -11.5 28.5 T640 -120 H320 q-17 0 -28.5 -11.5 T280 -160 q0 -17 11.5 -28.5 T320 -200 h120Z
            path(
                fill = SolidColor(Color(0xFFE3E3E3)),
            ) {
                // M 280 432
                moveTo(x = 280.0f, y = 432.0f)
                // l 0 -152
                lineToRelative(dx = 0.0f, dy = -152.0f)
                // l -80 0
                lineToRelative(dx = -80.0f, dy = 0.0f)
                // l 0 40
                lineToRelative(dx = 0.0f, dy = 40.0f)
                // q 0 38 22 68.5
                quadToRelative(
                    dx1 = 0.0f,
                    dy1 = 38.0f,
                    dx2 = 22.0f,
                    dy2 = 68.5f,
                )
                // t 58 43.5z
                reflectiveQuadToRelative(
                    dx1 = 58.0f,
                    dy1 = 43.5f,
                )
                close()
                // m 400 0
                moveToRelative(dx = 400.0f, dy = 0.0f)
                // q 36 -13 58 -43.5
                quadToRelative(
                    dx1 = 36.0f,
                    dy1 = -13.0f,
                    dx2 = 58.0f,
                    dy2 = -43.5f,
                )
                // t 22 -68.5
                reflectiveQuadToRelative(
                    dx1 = 22.0f,
                    dy1 = -68.5f,
                )
                // l 0 -40
                lineToRelative(dx = 0.0f, dy = -40.0f)
                // l -80 0
                lineToRelative(dx = -80.0f, dy = 0.0f)
                // l 0 152z
                lineToRelative(dx = 0.0f, dy = 152.0f)
                close()
                // M 440 760
                moveTo(x = 440.0f, y = 760.0f)
                // l 0 -124
                lineToRelative(dx = 0.0f, dy = -124.0f)
                // q -49 -11 -87.5 -41.5
                quadToRelative(
                    dx1 = -49.0f,
                    dy1 = -11.0f,
                    dx2 = -87.5f,
                    dy2 = -41.5f,
                )
                // T 296 518
                reflectiveQuadTo(
                    x1 = 296.0f,
                    y1 = 518.0f,
                )
                // q -75 -9 -125.5 -65.5
                quadToRelative(
                    dx1 = -75.0f,
                    dy1 = -9.0f,
                    dx2 = -125.5f,
                    dy2 = -65.5f,
                )
                // T 120 320
                reflectiveQuadTo(
                    x1 = 120.0f,
                    y1 = 320.0f,
                )
                // l 0 -40
                lineToRelative(dx = 0.0f, dy = -40.0f)
                // q 0 -33 23.5 -56.5
                quadToRelative(
                    dx1 = 0.0f,
                    dy1 = -33.0f,
                    dx2 = 23.5f,
                    dy2 = -56.5f,
                )
                // T 200 200
                reflectiveQuadTo(
                    x1 = 200.0f,
                    y1 = 200.0f,
                )
                // l 80 0
                lineToRelative(dx = 80.0f, dy = 0.0f)
                // q 0 -33 23.5 -56.5
                quadToRelative(
                    dx1 = 0.0f,
                    dy1 = -33.0f,
                    dx2 = 23.5f,
                    dy2 = -56.5f,
                )
                // T 360 120
                reflectiveQuadTo(
                    x1 = 360.0f,
                    y1 = 120.0f,
                )
                // l 240 0
                lineToRelative(dx = 240.0f, dy = 0.0f)
                // q 33 0 56.5 23.5
                quadToRelative(
                    dx1 = 33.0f,
                    dy1 = 0.0f,
                    dx2 = 56.5f,
                    dy2 = 23.5f,
                )
                // T 680 200
                reflectiveQuadTo(
                    x1 = 680.0f,
                    y1 = 200.0f,
                )
                // l 80 0
                lineToRelative(dx = 80.0f, dy = 0.0f)
                // q 33 0 56.5 23.5
                quadToRelative(
                    dx1 = 33.0f,
                    dy1 = 0.0f,
                    dx2 = 56.5f,
                    dy2 = 23.5f,
                )
                // T 840 280
                reflectiveQuadTo(
                    x1 = 840.0f,
                    y1 = 280.0f,
                )
                // l 0 40
                lineToRelative(dx = 0.0f, dy = 40.0f)
                // q 0 76 -50.5 132.5
                quadToRelative(
                    dx1 = 0.0f,
                    dy1 = 76.0f,
                    dx2 = -50.5f,
                    dy2 = 132.5f,
                )
                // T 664 518
                reflectiveQuadTo(
                    x1 = 664.0f,
                    y1 = 518.0f,
                )
                // q -18 46 -56.5 76.5
                quadToRelative(
                    dx1 = -18.0f,
                    dy1 = 46.0f,
                    dx2 = -56.5f,
                    dy2 = 76.5f,
                )
                // T 520 636
                reflectiveQuadTo(
                    x1 = 520.0f,
                    y1 = 636.0f,
                )
                // l 0 124
                lineToRelative(dx = 0.0f, dy = 124.0f)
                // l 120 0
                lineToRelative(dx = 120.0f, dy = 0.0f)
                // q 17 0 28.5 11.5
                quadToRelative(
                    dx1 = 17.0f,
                    dy1 = 0.0f,
                    dx2 = 28.5f,
                    dy2 = 11.5f,
                )
                // T 680 800
                reflectiveQuadTo(
                    x1 = 680.0f,
                    y1 = 800.0f,
                )
                // q 0 17 -11.5 28.5
                quadToRelative(
                    dx1 = 0.0f,
                    dy1 = 17.0f,
                    dx2 = -11.5f,
                    dy2 = 28.5f,
                )
                // T 640 840
                reflectiveQuadTo(
                    x1 = 640.0f,
                    y1 = 840.0f,
                )
                // L 320 840
                lineTo(x = 320.0f, y = 840.0f)
                // q -17 0 -28.5 -11.5
                quadToRelative(
                    dx1 = -17.0f,
                    dy1 = 0.0f,
                    dx2 = -28.5f,
                    dy2 = -11.5f,
                )
                // T 280 800
                reflectiveQuadTo(
                    x1 = 280.0f,
                    y1 = 800.0f,
                )
                // q 0 -17 11.5 -28.5
                quadToRelative(
                    dx1 = 0.0f,
                    dy1 = -17.0f,
                    dx2 = 11.5f,
                    dy2 = -28.5f,
                )
                // T 320 760
                reflectiveQuadTo(
                    x1 = 320.0f,
                    y1 = 760.0f,
                )
                // l 120 0z
                lineToRelative(dx = 120.0f, dy = 0.0f)
                close()
            }
        }.build().also { trophy = it }
    }

private var trophy: ImageVector? = null

@Preview
@Composable
private fun TrophyIconPreview() {
    Box(Modifier.size(48.dp)) {
        Icon(
            imageVector = StackersIcons.Filled.Trophy,
            contentDescription = null,
            modifier = Modifier.matchParentSize()
        )
    }
}