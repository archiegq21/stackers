package com.core.designsystem.icon

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

@Suppress("UnusedReceiverParameter")
val StackersIcons.AppIcon: ImageVector
    get() {
        val current = appIcon
        if (current != null) return current

        return ImageVector.Builder(
            name = "Stacker Icon",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 960.0f,
            viewportHeight = 960.0f,
        ).apply {
            // M480 -240 q134 0 227 -93.5 T800 -560 q0 -31 -5 -59.5 T779 -675 q-27 17 -57 26 t-62 9 q-54 0 -101.5 -24.5 T480 -734 q-31 45 -78.5 69.5 T300 -640 q-32 0 -62 -9 t-57 -26 q-11 27 -16 55.5 t-5 59.5 q0 133 93.5 226.5 T480 -240Z m-84.5 -244.5 Q410 -499 410 -520 t-14.5 -35.5 Q381 -570 360 -570 t-35.5 14.5 Q310 -541 310 -520 t14.5 35.5 Q339 -470 360 -470 t35.5 -14.5Z m240 0 Q650 -499 650 -520 t-14.5 -35.5 Q621 -570 600 -570 t-35.5 14.5 Q550 -541 550 -520 t14.5 35.5 Q579 -470 600 -470 t35.5 -14.5Z M88 -80 q-35 0 -59 -26 T8 -167 l36 -395 q8 -84 45.5 -157 t96 -126.5 q58.5 -53.5 134 -84 T480 -960 q85 0 160.5 30.5 t134 84 Q833 -792 870.5 -719 T916 -562 l36 395 q3 35 -21 61 t-59 26 H88Z
            path(
                fill = SolidColor(Color(0xFFE3E3E3)),
            ) {
                // M 480 720
                moveTo(x = 480.0f, y = 720.0f)
                // q 134 0 227 -93.5
                quadToRelative(
                    dx1 = 134.0f,
                    dy1 = 0.0f,
                    dx2 = 227.0f,
                    dy2 = -93.5f,
                )
                // T 800 400
                reflectiveQuadTo(
                    x1 = 800.0f,
                    y1 = 400.0f,
                )
                // q 0 -31 -5 -59.5
                quadToRelative(
                    dx1 = 0.0f,
                    dy1 = -31.0f,
                    dx2 = -5.0f,
                    dy2 = -59.5f,
                )
                // T 779 285
                reflectiveQuadTo(
                    x1 = 779.0f,
                    y1 = 285.0f,
                )
                // q -27 17 -57 26
                quadToRelative(
                    dx1 = -27.0f,
                    dy1 = 17.0f,
                    dx2 = -57.0f,
                    dy2 = 26.0f,
                )
                // t -62 9
                reflectiveQuadToRelative(
                    dx1 = -62.0f,
                    dy1 = 9.0f,
                )
                // q -54 0 -101.5 -24.5
                quadToRelative(
                    dx1 = -54.0f,
                    dy1 = 0.0f,
                    dx2 = -101.5f,
                    dy2 = -24.5f,
                )
                // T 480 226
                reflectiveQuadTo(
                    x1 = 480.0f,
                    y1 = 226.0f,
                )
                // q -31 45 -78.5 69.5
                quadToRelative(
                    dx1 = -31.0f,
                    dy1 = 45.0f,
                    dx2 = -78.5f,
                    dy2 = 69.5f,
                )
                // T 300 320
                reflectiveQuadTo(
                    x1 = 300.0f,
                    y1 = 320.0f,
                )
                // q -32 0 -62 -9
                quadToRelative(
                    dx1 = -32.0f,
                    dy1 = 0.0f,
                    dx2 = -62.0f,
                    dy2 = -9.0f,
                )
                // t -57 -26
                reflectiveQuadToRelative(
                    dx1 = -57.0f,
                    dy1 = -26.0f,
                )
                // q -11 27 -16 55.5
                quadToRelative(
                    dx1 = -11.0f,
                    dy1 = 27.0f,
                    dx2 = -16.0f,
                    dy2 = 55.5f,
                )
                // t -5 59.5
                reflectiveQuadToRelative(
                    dx1 = -5.0f,
                    dy1 = 59.5f,
                )
                // q 0 133 93.5 226.5
                quadToRelative(
                    dx1 = 0.0f,
                    dy1 = 133.0f,
                    dx2 = 93.5f,
                    dy2 = 226.5f,
                )
                // T 480 720z
                reflectiveQuadTo(
                    x1 = 480.0f,
                    y1 = 720.0f,
                )
                close()
                // m -84.5 -244.5
                moveToRelative(dx = -84.5f, dy = -244.5f)
                // Q 410 461 410 440
                quadTo(
                    x1 = 410.0f,
                    y1 = 461.0f,
                    x2 = 410.0f,
                    y2 = 440.0f,
                )
                // t -14.5 -35.5
                reflectiveQuadToRelative(
                    dx1 = -14.5f,
                    dy1 = -35.5f,
                )
                // Q 381 390 360 390
                quadTo(
                    x1 = 381.0f,
                    y1 = 390.0f,
                    x2 = 360.0f,
                    y2 = 390.0f,
                )
                // t -35.5 14.5
                reflectiveQuadToRelative(
                    dx1 = -35.5f,
                    dy1 = 14.5f,
                )
                // Q 310 419 310 440
                quadTo(
                    x1 = 310.0f,
                    y1 = 419.0f,
                    x2 = 310.0f,
                    y2 = 440.0f,
                )
                // t 14.5 35.5
                reflectiveQuadToRelative(
                    dx1 = 14.5f,
                    dy1 = 35.5f,
                )
                // Q 339 490 360 490
                quadTo(
                    x1 = 339.0f,
                    y1 = 490.0f,
                    x2 = 360.0f,
                    y2 = 490.0f,
                )
                // t 35.5 -14.5z
                reflectiveQuadToRelative(
                    dx1 = 35.5f,
                    dy1 = -14.5f,
                )
                close()
                // m 240 0
                moveToRelative(dx = 240.0f, dy = 0.0f)
                // Q 650 461 650 440
                quadTo(
                    x1 = 650.0f,
                    y1 = 461.0f,
                    x2 = 650.0f,
                    y2 = 440.0f,
                )
                // t -14.5 -35.5
                reflectiveQuadToRelative(
                    dx1 = -14.5f,
                    dy1 = -35.5f,
                )
                // Q 621 390 600 390
                quadTo(
                    x1 = 621.0f,
                    y1 = 390.0f,
                    x2 = 600.0f,
                    y2 = 390.0f,
                )
                // t -35.5 14.5
                reflectiveQuadToRelative(
                    dx1 = -35.5f,
                    dy1 = 14.5f,
                )
                // Q 550 419 550 440
                quadTo(
                    x1 = 550.0f,
                    y1 = 419.0f,
                    x2 = 550.0f,
                    y2 = 440.0f,
                )
                // t 14.5 35.5
                reflectiveQuadToRelative(
                    dx1 = 14.5f,
                    dy1 = 35.5f,
                )
                // Q 579 490 600 490
                quadTo(
                    x1 = 579.0f,
                    y1 = 490.0f,
                    x2 = 600.0f,
                    y2 = 490.0f,
                )
                // t 35.5 -14.5z
                reflectiveQuadToRelative(
                    dx1 = 35.5f,
                    dy1 = -14.5f,
                )
                close()
                // M 88 880
                moveTo(x = 88.0f, y = 880.0f)
                // q -35 0 -59 -26
                quadToRelative(
                    dx1 = -35.0f,
                    dy1 = 0.0f,
                    dx2 = -59.0f,
                    dy2 = -26.0f,
                )
                // T 8 793
                reflectiveQuadTo(
                    x1 = 8.0f,
                    y1 = 793.0f,
                )
                // l 36 -395
                lineToRelative(dx = 36.0f, dy = -395.0f)
                // q 8 -84 45.5 -157
                quadToRelative(
                    dx1 = 8.0f,
                    dy1 = -84.0f,
                    dx2 = 45.5f,
                    dy2 = -157.0f,
                )
                // t 96 -126.5
                reflectiveQuadToRelative(
                    dx1 = 96.0f,
                    dy1 = -126.5f,
                )
                // q 58.5 -53.5 134 -84
                quadToRelative(
                    dx1 = 58.5f,
                    dy1 = -53.5f,
                    dx2 = 134.0f,
                    dy2 = -84.0f,
                )
                // T 480 0
                reflectiveQuadTo(
                    x1 = 480.0f,
                    y1 = 0.0f,
                )
                // q 85 0 160.5 30.5
                quadToRelative(
                    dx1 = 85.0f,
                    dy1 = 0.0f,
                    dx2 = 160.5f,
                    dy2 = 30.5f,
                )
                // t 134 84
                reflectiveQuadToRelative(
                    dx1 = 134.0f,
                    dy1 = 84.0f,
                )
                // Q 833 168 870.5 241
                quadTo(
                    x1 = 833.0f,
                    y1 = 168.0f,
                    x2 = 870.5f,
                    y2 = 241.0f,
                )
                // T 916 398
                reflectiveQuadTo(
                    x1 = 916.0f,
                    y1 = 398.0f,
                )
                // l 36 395
                lineToRelative(dx = 36.0f, dy = 395.0f)
                // q 3 35 -21 61
                quadToRelative(
                    dx1 = 3.0f,
                    dy1 = 35.0f,
                    dx2 = -21.0f,
                    dy2 = 61.0f,
                )
                // t -59 26
                reflectiveQuadToRelative(
                    dx1 = -59.0f,
                    dy1 = 26.0f,
                )
                // L 88 880z
                lineTo(x = 88.0f, y = 880.0f)
                close()
            }
        }.build().also { appIcon = it }
    }

private var appIcon: ImageVector? = null

@Preview
@Composable
private fun AppIconPreview() {
    Box(Modifier.size(48.dp)) {
        Icon(
            imageVector = StackersIcons.AppIcon,
            contentDescription = null,
            modifier = Modifier.matchParentSize()
        )
    }
}