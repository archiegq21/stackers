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
val StackersIcons.Filled.Location: ImageVector
    get() {
        val current = location
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.example.theme.AppTheme.Location",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 960.0f,
            viewportHeight = 960.0f,
        ).apply {
            // M452 -112 q-14 -5 -25 -15 -65 -60 -115 -117 t-83.5 -110.5 q-33.5 -53.5 -51 -103 T160 -552 q0 -150 96.5 -239 T480 -880 q127 0 223.5 89 T800 -552 q0 45 -17.5 94.5 t-51 103 Q698 -301 648 -244 T533 -127 q-11 10 -25 15 t-28 5 q-14 0 -28 -5Z m84.5 -391.5 Q560 -527 560 -560 t-23.5 -56.5 Q513 -640 480 -640 t-56.5 23.5 Q400 -593 400 -560 t23.5 56.5 Q447 -480 480 -480 t56.5 -23.5Z
            path(
                fill = SolidColor(Color(0xFFE3E3E3)),
            ) {
                // M 452 848
                moveTo(x = 452.0f, y = 848.0f)
                // q -14 -5 -25 -15
                quadToRelative(
                    dx1 = -14.0f,
                    dy1 = -5.0f,
                    dx2 = -25.0f,
                    dy2 = -15.0f,
                )
                // q -65 -60 -115 -117
                quadToRelative(
                    dx1 = -65.0f,
                    dy1 = -60.0f,
                    dx2 = -115.0f,
                    dy2 = -117.0f,
                )
                // t -83.5 -110.5
                reflectiveQuadToRelative(
                    dx1 = -83.5f,
                    dy1 = -110.5f,
                )
                // q -33.5 -53.5 -51 -103
                quadToRelative(
                    dx1 = -33.5f,
                    dy1 = -53.5f,
                    dx2 = -51.0f,
                    dy2 = -103.0f,
                )
                // T 160 408
                reflectiveQuadTo(
                    x1 = 160.0f,
                    y1 = 408.0f,
                )
                // q 0 -150 96.5 -239
                quadToRelative(
                    dx1 = 0.0f,
                    dy1 = -150.0f,
                    dx2 = 96.5f,
                    dy2 = -239.0f,
                )
                // T 480 80
                reflectiveQuadTo(
                    x1 = 480.0f,
                    y1 = 80.0f,
                )
                // q 127 0 223.5 89
                quadToRelative(
                    dx1 = 127.0f,
                    dy1 = 0.0f,
                    dx2 = 223.5f,
                    dy2 = 89.0f,
                )
                // T 800 408
                reflectiveQuadTo(
                    x1 = 800.0f,
                    y1 = 408.0f,
                )
                // q 0 45 -17.5 94.5
                quadToRelative(
                    dx1 = 0.0f,
                    dy1 = 45.0f,
                    dx2 = -17.5f,
                    dy2 = 94.5f,
                )
                // t -51 103
                reflectiveQuadToRelative(
                    dx1 = -51.0f,
                    dy1 = 103.0f,
                )
                // Q 698 659 648 716
                quadTo(
                    x1 = 698.0f,
                    y1 = 659.0f,
                    x2 = 648.0f,
                    y2 = 716.0f,
                )
                // T 533 833
                reflectiveQuadTo(
                    x1 = 533.0f,
                    y1 = 833.0f,
                )
                // q -11 10 -25 15
                quadToRelative(
                    dx1 = -11.0f,
                    dy1 = 10.0f,
                    dx2 = -25.0f,
                    dy2 = 15.0f,
                )
                // t -28 5
                reflectiveQuadToRelative(
                    dx1 = -28.0f,
                    dy1 = 5.0f,
                )
                // q -14 0 -28 -5z
                quadToRelative(
                    dx1 = -14.0f,
                    dy1 = 0.0f,
                    dx2 = -28.0f,
                    dy2 = -5.0f,
                )
                close()
                // m 84.5 -391.5
                moveToRelative(dx = 84.5f, dy = -391.5f)
                // Q 560 433 560 400
                quadTo(
                    x1 = 560.0f,
                    y1 = 433.0f,
                    x2 = 560.0f,
                    y2 = 400.0f,
                )
                // t -23.5 -56.5
                reflectiveQuadToRelative(
                    dx1 = -23.5f,
                    dy1 = -56.5f,
                )
                // Q 513 320 480 320
                quadTo(
                    x1 = 513.0f,
                    y1 = 320.0f,
                    x2 = 480.0f,
                    y2 = 320.0f,
                )
                // t -56.5 23.5
                reflectiveQuadToRelative(
                    dx1 = -56.5f,
                    dy1 = 23.5f,
                )
                // Q 400 367 400 400
                quadTo(
                    x1 = 400.0f,
                    y1 = 367.0f,
                    x2 = 400.0f,
                    y2 = 400.0f,
                )
                // t 23.5 56.5
                reflectiveQuadToRelative(
                    dx1 = 23.5f,
                    dy1 = 56.5f,
                )
                // Q 447 480 480 480
                quadTo(
                    x1 = 447.0f,
                    y1 = 480.0f,
                    x2 = 480.0f,
                    y2 = 480.0f,
                )
                // t 56.5 -23.5z
                reflectiveQuadToRelative(
                    dx1 = 56.5f,
                    dy1 = -23.5f,
                )
                close()
            }
        }.build().also { location = it }
    }

private var location: ImageVector? = null

@Preview
@Composable
private fun LocationIconPreview() {
    Box(Modifier.size(48.dp)) {
        Icon(
            imageVector = StackersIcons.Filled.Location,
            contentDescription = null,
            modifier = Modifier.matchParentSize()
        )
    }
}