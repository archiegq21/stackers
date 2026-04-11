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
val StackersIcons.Filled.Search: ImageVector
    get() {
        val current = search
        if (current != null) return current

        return ImageVector.Builder(
            name = "Search",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 960.0f,
            viewportHeight = 960.0f,
        ).apply {
            // M380 -320 q-109 0 -184.5 -75.5 T120 -580 q0 -109 75.5 -184.5 T380 -840 q109 0 184.5 75.5 T640 -580 q0 44 -14 83 t-38 69 l224 224 q11 11 11 28 t-11 28 q-11 11 -28 11 t-28 -11 L532 -372 q-30 24 -69 38 t-83 14Z m0 -80 q75 0 127.5 -52.5 T560 -580 q0 -75 -52.5 -127.5 T380 -760 q-75 0 -127.5 52.5 T200 -580 q0 75 52.5 127.5 T380 -400Z
            path(
                fill = SolidColor(Color(0xFFE3E3E3)),
            ) {
                // M 380 640
                moveTo(x = 380.0f, y = 640.0f)
                // q -109 0 -184.5 -75.5
                quadToRelative(
                    dx1 = -109.0f,
                    dy1 = 0.0f,
                    dx2 = -184.5f,
                    dy2 = -75.5f,
                )
                // T 120 380
                reflectiveQuadTo(
                    x1 = 120.0f,
                    y1 = 380.0f,
                )
                // q 0 -109 75.5 -184.5
                quadToRelative(
                    dx1 = 0.0f,
                    dy1 = -109.0f,
                    dx2 = 75.5f,
                    dy2 = -184.5f,
                )
                // T 380 120
                reflectiveQuadTo(
                    x1 = 380.0f,
                    y1 = 120.0f,
                )
                // q 109 0 184.5 75.5
                quadToRelative(
                    dx1 = 109.0f,
                    dy1 = 0.0f,
                    dx2 = 184.5f,
                    dy2 = 75.5f,
                )
                // T 640 380
                reflectiveQuadTo(
                    x1 = 640.0f,
                    y1 = 380.0f,
                )
                // q 0 44 -14 83
                quadToRelative(
                    dx1 = 0.0f,
                    dy1 = 44.0f,
                    dx2 = -14.0f,
                    dy2 = 83.0f,
                )
                // t -38 69
                reflectiveQuadToRelative(
                    dx1 = -38.0f,
                    dy1 = 69.0f,
                )
                // l 224 224
                lineToRelative(dx = 224.0f, dy = 224.0f)
                // q 11 11 11 28
                quadToRelative(
                    dx1 = 11.0f,
                    dy1 = 11.0f,
                    dx2 = 11.0f,
                    dy2 = 28.0f,
                )
                // t -11 28
                reflectiveQuadToRelative(
                    dx1 = -11.0f,
                    dy1 = 28.0f,
                )
                // q -11 11 -28 11
                quadToRelative(
                    dx1 = -11.0f,
                    dy1 = 11.0f,
                    dx2 = -28.0f,
                    dy2 = 11.0f,
                )
                // t -28 -11
                reflectiveQuadToRelative(
                    dx1 = -28.0f,
                    dy1 = -11.0f,
                )
                // L 532 588
                lineTo(x = 532.0f, y = 588.0f)
                // q -30 24 -69 38
                quadToRelative(
                    dx1 = -30.0f,
                    dy1 = 24.0f,
                    dx2 = -69.0f,
                    dy2 = 38.0f,
                )
                // t -83 14z
                reflectiveQuadToRelative(
                    dx1 = -83.0f,
                    dy1 = 14.0f,
                )
                close()
                // m 0 -80
                moveToRelative(dx = 0.0f, dy = -80.0f)
                // q 75 0 127.5 -52.5
                quadToRelative(
                    dx1 = 75.0f,
                    dy1 = 0.0f,
                    dx2 = 127.5f,
                    dy2 = -52.5f,
                )
                // T 560 380
                reflectiveQuadTo(
                    x1 = 560.0f,
                    y1 = 380.0f,
                )
                // q 0 -75 -52.5 -127.5
                quadToRelative(
                    dx1 = 0.0f,
                    dy1 = -75.0f,
                    dx2 = -52.5f,
                    dy2 = -127.5f,
                )
                // T 380 200
                reflectiveQuadTo(
                    x1 = 380.0f,
                    y1 = 200.0f,
                )
                // q -75 0 -127.5 52.5
                quadToRelative(
                    dx1 = -75.0f,
                    dy1 = 0.0f,
                    dx2 = -127.5f,
                    dy2 = 52.5f,
                )
                // T 200 380
                reflectiveQuadTo(
                    x1 = 200.0f,
                    y1 = 380.0f,
                )
                // q 0 75 52.5 127.5
                quadToRelative(
                    dx1 = 0.0f,
                    dy1 = 75.0f,
                    dx2 = 52.5f,
                    dy2 = 127.5f,
                )
                // T 380 560z
                reflectiveQuadTo(
                    x1 = 380.0f,
                    y1 = 560.0f,
                )
                close()
            }
        }.build().also { search = it }
    }

private var search: ImageVector? = null

@Preview
@Composable
private fun SearchIconPreview() {
    Box(Modifier.size(48.dp)) {
        Icon(
            imageVector = StackersIcons.Filled.Search,
            contentDescription = null,
            modifier = Modifier.matchParentSize()
        )
    }
}