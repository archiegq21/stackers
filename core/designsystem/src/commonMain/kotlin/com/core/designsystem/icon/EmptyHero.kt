package com.core.designsystem.icon

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Suppress("UnusedReceiverParameter")
val StackersIcons.Hero.EmptyHero: ImageVector
    @Composable
    get() {
        val accentColor = MaterialTheme.colorScheme.tertiary
        val accentColor2 = MaterialTheme.colorScheme.tertiaryContainer
        return remember(accentColor, accentColor2) {
            ImageVector.Builder(
                name = "Empty Hero",
                defaultWidth = 500.0.dp,
                defaultHeight = 500.0.dp,
                viewportWidth = 500.0f,
                viewportHeight = 500.0f,
            ).apply {
                // <ellipse cx="260.935" cy="231.996" rx="150.609" ry="134.674" fill="#F5F5FF" style="fill:#F5F5FF;" />
                path(
                    fill = SolidColor(Color(0xFFF5F5FF)),
                ) {
                    // M 260.935 97.322
                    moveTo(x = 260.935f, y = 97.322f)
                    // A 150.609 134.674 0 1 0 260.935 366.67
                    arcTo(
                        horizontalEllipseRadius = 150.609f,
                        verticalEllipseRadius = 134.674f,
                        theta = 0.0f,
                        isMoreThanHalf = true,
                        isPositiveArc = false,
                        x1 = 260.935f,
                        y1 = 366.67f,
                    )
                    // A 150.609 134.674 0 1 0 260.935 97.322z
                    arcTo(
                        horizontalEllipseRadius = 150.609f,
                        verticalEllipseRadius = 134.674f,
                        theta = 0.0f,
                        isMoreThanHalf = true,
                        isPositiveArc = false,
                        x1 = 260.935f,
                        y1 = 97.322f,
                    )
                    close()
                }
                // M321.352 388.504 H314.2 c-31.526 0 -57.083 -25.557 -57.083 -57.083 v-44.033  c0 -31.526 25.557 -57.083 57.083 -57.083 h7.152 c31.526 0 57.083 25.557 57.083 57.083 v44.033  C378.435 362.947 352.878 388.504 321.352 388.504z
                path(
                    fill = SolidColor(accentColor),
                ) {
                    // M 321.352 388.504
                    moveTo(x = 321.352f, y = 388.504f)
                    // H 314.2
                    horizontalLineTo(x = 314.2f)
                    // c -31.526 0 -57.083 -25.557 -57.083 -57.083
                    curveToRelative(
                        dx1 = -31.526f,
                        dy1 = 0.0f,
                        dx2 = -57.083f,
                        dy2 = -25.557f,
                        dx3 = -57.083f,
                        dy3 = -57.083f,
                    )
                    // v -44.033
                    verticalLineToRelative(dy = -44.033f)
                    // c 0 -31.526 25.557 -57.083 57.083 -57.083
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = -31.526f,
                        dx2 = 25.557f,
                        dy2 = -57.083f,
                        dx3 = 57.083f,
                        dy3 = -57.083f,
                    )
                    // h 7.152
                    horizontalLineToRelative(dx = 7.152f)
                    // c 31.526 0 57.083 25.557 57.083 57.083
                    curveToRelative(
                        dx1 = 31.526f,
                        dy1 = 0.0f,
                        dx2 = 57.083f,
                        dy2 = 25.557f,
                        dx3 = 57.083f,
                        dy3 = 57.083f,
                    )
                    // v 44.033
                    verticalLineToRelative(dy = 44.033f)
                    // C 378.435 362.947 352.878 388.504 321.352 388.504z
                    curveTo(
                        x1 = 378.435f,
                        y1 = 362.947f,
                        x2 = 352.878f,
                        y2 = 388.504f,
                        x3 = 321.352f,
                        y3 = 388.504f,
                    )
                    close()
                }
                // M321.352 388.504 H314.2 c-31.526 0 -57.083 -25.557 -57.083 -57.083 v-44.033  c0 -31.526 25.557 -57.083 57.083 -57.083 h7.152 c31.526 0 57.083 25.557 57.083 57.083 v44.033  C378.435 362.947 352.878 388.504 321.352 388.504z
                path(
                    fill = SolidColor(accentColor),
                ) {
                    // M 321.352 388.504
                    moveTo(x = 321.352f, y = 388.504f)
                    // H 314.2
                    horizontalLineTo(x = 314.2f)
                    // c -31.526 0 -57.083 -25.557 -57.083 -57.083
                    curveToRelative(
                        dx1 = -31.526f,
                        dy1 = 0.0f,
                        dx2 = -57.083f,
                        dy2 = -25.557f,
                        dx3 = -57.083f,
                        dy3 = -57.083f,
                    )
                    // v -44.033
                    verticalLineToRelative(dy = -44.033f)
                    // c 0 -31.526 25.557 -57.083 57.083 -57.083
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = -31.526f,
                        dx2 = 25.557f,
                        dy2 = -57.083f,
                        dx3 = 57.083f,
                        dy3 = -57.083f,
                    )
                    // h 7.152
                    horizontalLineToRelative(dx = 7.152f)
                    // c 31.526 0 57.083 25.557 57.083 57.083
                    curveToRelative(
                        dx1 = 31.526f,
                        dy1 = 0.0f,
                        dx2 = 57.083f,
                        dy2 = 25.557f,
                        dx3 = 57.083f,
                        dy3 = 57.083f,
                    )
                    // v 44.033
                    verticalLineToRelative(dy = 44.033f)
                    // C 378.435 362.947 352.878 388.504 321.352 388.504z
                    curveTo(
                        x1 = 378.435f,
                        y1 = 362.947f,
                        x2 = 352.878f,
                        y2 = 388.504f,
                        x3 = 321.352f,
                        y3 = 388.504f,
                    )
                    close()
                }
                // M311.969 388.504 h-15.816 c-29.799 0 -53.956 -24.157 -53.956 -53.956 V284.26  c0 -29.799 24.157 -53.956 53.956 -53.956 h15.816 c29.799 0 53.956 24.157 53.956 53.956 v50.288  C365.925 364.347 341.768 388.504 311.969 388.504z
                path(
                    fill = SolidColor(accentColor2),
                ) {
                    // M 311.969 388.504
                    moveTo(x = 311.969f, y = 388.504f)
                    // h -15.816
                    horizontalLineToRelative(dx = -15.816f)
                    // c -29.799 0 -53.956 -24.157 -53.956 -53.956
                    curveToRelative(
                        dx1 = -29.799f,
                        dy1 = 0.0f,
                        dx2 = -53.956f,
                        dy2 = -24.157f,
                        dx3 = -53.956f,
                        dy3 = -53.956f,
                    )
                    // V 284.26
                    verticalLineTo(y = 284.26f)
                    // c 0 -29.799 24.157 -53.956 53.956 -53.956
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = -29.799f,
                        dx2 = 24.157f,
                        dy2 = -53.956f,
                        dx3 = 53.956f,
                        dy3 = -53.956f,
                    )
                    // h 15.816
                    horizontalLineToRelative(dx = 15.816f)
                    // c 29.799 0 53.956 24.157 53.956 53.956
                    curveToRelative(
                        dx1 = 29.799f,
                        dy1 = 0.0f,
                        dx2 = 53.956f,
                        dy2 = 24.157f,
                        dx3 = 53.956f,
                        dy3 = 53.956f,
                    )
                    // v 50.288
                    verticalLineToRelative(dy = 50.288f)
                    // C 365.925 364.347 341.768 388.504 311.969 388.504z
                    curveTo(
                        x1 = 365.925f,
                        y1 = 364.347f,
                        x2 = 341.768f,
                        y2 = 388.504f,
                        x3 = 311.969f,
                        y3 = 388.504f,
                    )
                    close()
                }
                // M255.939 186.331  c0 0 -17.148 52.38 -22.379 74.205
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Round,
                    strokeLineMiter = 10.0f,
                ) {
                    // M 255.939 186.331
                    moveTo(x = 255.939f, y = 186.331f)
                    // c 0 0 -17.148 52.38 -22.379 74.205
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 0.0f,
                        dx2 = -17.148f,
                        dy2 = 52.38f,
                        dx3 = -22.379f,
                        dy3 = 74.205f,
                    )
                }
                // M328.475 167.106 c0 0 -10.063 -8.804 -10.544 -9.012 c-0.481 -0.208 -6.268 -5.326 -13.111 -4.546  l14.013 31.724 c0 0 -5.265 4.433 -4.239 7.125 c1.026 2.692 4.755 -1.722 6.675 -2.539 c1.92 -0.817 5.1 -4.544 6.023 -6.154  C328.214 182.094 328.475 167.106 328.475 167.106z
                path(
                    fill = SolidColor(Color(0xFFBA6F4C)),
                ) {
                    // M 328.475 167.106
                    moveTo(x = 328.475f, y = 167.106f)
                    // c 0 0 -10.063 -8.804 -10.544 -9.012
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 0.0f,
                        dx2 = -10.063f,
                        dy2 = -8.804f,
                        dx3 = -10.544f,
                        dy3 = -9.012f,
                    )
                    // c -0.481 -0.208 -6.268 -5.326 -13.111 -4.546
                    curveToRelative(
                        dx1 = -0.481f,
                        dy1 = -0.208f,
                        dx2 = -6.268f,
                        dy2 = -5.326f,
                        dx3 = -13.111f,
                        dy3 = -4.546f,
                    )
                    // l 14.013 31.724
                    lineToRelative(dx = 14.013f, dy = 31.724f)
                    // c 0 0 -5.265 4.433 -4.239 7.125
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 0.0f,
                        dx2 = -5.265f,
                        dy2 = 4.433f,
                        dx3 = -4.239f,
                        dy3 = 7.125f,
                    )
                    // c 1.026 2.692 4.755 -1.722 6.675 -2.539
                    curveToRelative(
                        dx1 = 1.026f,
                        dy1 = 2.692f,
                        dx2 = 4.755f,
                        dy2 = -1.722f,
                        dx3 = 6.675f,
                        dy3 = -2.539f,
                    )
                    // c 1.92 -0.817 5.1 -4.544 6.023 -6.154
                    curveToRelative(
                        dx1 = 1.92f,
                        dy1 = -0.817f,
                        dx2 = 5.1f,
                        dy2 = -4.544f,
                        dx3 = 6.023f,
                        dy3 = -6.154f,
                    )
                    // C 328.214 182.094 328.475 167.106 328.475 167.106z
                    curveTo(
                        x1 = 328.214f,
                        y1 = 182.094f,
                        x2 = 328.475f,
                        y2 = 167.106f,
                        x3 = 328.475f,
                        y3 = 167.106f,
                    )
                    close()
                }
                // M312.574 164.344  c0 0 3.632 8.245 8.539 10.208
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Round,
                    strokeLineMiter = 10.0f,
                ) {
                    // M 312.574 164.344
                    moveTo(x = 312.574f, y = 164.344f)
                    // c 0 0 3.632 8.245 8.539 10.208
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 0.0f,
                        dx2 = 3.632f,
                        dy2 = 8.245f,
                        dx3 = 8.539f,
                        dy3 = 10.208f,
                    )
                }
                // M306.881 161.891 c0 0 36.513 48.292 37.691 77.738 c0 0 -32.097 53.396 -106.301 13.055 l13.251 -65.174 L306.881 161.891z
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    // M 306.881 161.891
                    moveTo(x = 306.881f, y = 161.891f)
                    // c 0 0 36.513 48.292 37.691 77.738
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 0.0f,
                        dx2 = 36.513f,
                        dy2 = 48.292f,
                        dx3 = 37.691f,
                        dy3 = 77.738f,
                    )
                    // c 0 0 -32.097 53.396 -106.301 13.055
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 0.0f,
                        dx2 = -32.097f,
                        dy2 = 53.396f,
                        dx3 = -106.301f,
                        dy3 = 13.055f,
                    )
                    // l 13.251 -65.174
                    lineToRelative(dx = 13.251f, dy = -65.174f)
                    // L 306.881 161.891z
                    lineTo(x = 306.881f, y = 161.891f)
                    close()
                }
                // M311.69 168.369  c0 0 21.594 30.624 36.906 61.248
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Round,
                    strokeLineMiter = 10.0f,
                ) {
                    // M 311.69 168.369
                    moveTo(x = 311.69f, y = 168.369f)
                    // c 0 0 21.594 30.624 36.906 61.248
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 0.0f,
                        dx2 = 21.594f,
                        dy2 = 30.624f,
                        dx3 = 36.906f,
                        dy3 = 61.248f,
                    )
                }
                // M312.181 229.911 c0 0 45.936 -8.834 67.432 -6.478 c0 0 13.251 15.018 18.257 24.735 l-38.673 24.342  c0 0 4.515 59.874 -11.091 98.449 H202.347 c0 0 8.477 -82.505 15.607 -96.289 c4.417 -8.539 8.343 -17.962 29.152 -25.618  c20.809 -7.656 24.44 -14.723 24.44 -14.723 L312.181 229.911z
                path(
                    fill = SolidColor(Color(0xFF9EC68A)),
                ) {
                    // M 312.181 229.911
                    moveTo(x = 312.181f, y = 229.911f)
                    // c 0 0 45.936 -8.834 67.432 -6.478
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 0.0f,
                        dx2 = 45.936f,
                        dy2 = -8.834f,
                        dx3 = 67.432f,
                        dy3 = -6.478f,
                    )
                    // c 0 0 13.251 15.018 18.257 24.735
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 0.0f,
                        dx2 = 13.251f,
                        dy2 = 15.018f,
                        dx3 = 18.257f,
                        dy3 = 24.735f,
                    )
                    // l -38.673 24.342
                    lineToRelative(dx = -38.673f, dy = 24.342f)
                    // c 0 0 4.515 59.874 -11.091 98.449
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 0.0f,
                        dx2 = 4.515f,
                        dy2 = 59.874f,
                        dx3 = -11.091f,
                        dy3 = 98.449f,
                    )
                    // H 202.347
                    horizontalLineTo(x = 202.347f)
                    // c 0 0 8.477 -82.505 15.607 -96.289
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 0.0f,
                        dx2 = 8.477f,
                        dy2 = -82.505f,
                        dx3 = 15.607f,
                        dy3 = -96.289f,
                    )
                    // c 4.417 -8.539 8.343 -17.962 29.152 -25.618
                    curveToRelative(
                        dx1 = 4.417f,
                        dy1 = -8.539f,
                        dx2 = 8.343f,
                        dy2 = -17.962f,
                        dx3 = 29.152f,
                        dy3 = -25.618f,
                    )
                    // c 20.809 -7.656 24.44 -14.723 24.44 -14.723
                    curveToRelative(
                        dx1 = 20.809f,
                        dy1 = -7.656f,
                        dx2 = 24.44f,
                        dy2 = -14.723f,
                        dx3 = 24.44f,
                        dy3 = -14.723f,
                    )
                    // L 312.181 229.911z
                    lineTo(x = 312.181f, y = 229.911f)
                    close()
                }
                // M310.694 230.779  c0 0 5.176 -0.636 6.493 7.401
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Round,
                    strokeLineMiter = 10.0f,
                ) {
                    // M 310.694 230.779
                    moveTo(x = 310.694f, y = 230.779f)
                    // c 0 0 5.176 -0.636 6.493 7.401
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 0.0f,
                        dx2 = 5.176f,
                        dy2 = -0.636f,
                        dx3 = 6.493f,
                        dy3 = 7.401f,
                    )
                }
                // M271.372 241.336  c0 0 -5.935 5.286 -1.09 13.463
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Round,
                    strokeLineMiter = 10.0f,
                ) {
                    // M 271.372 241.336
                    moveTo(x = 271.372f, y = 241.336f)
                    // c 0 0 -5.935 5.286 -1.09 13.463
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 0.0f,
                        dx2 = -5.935f,
                        dy2 = 5.286f,
                        dx3 = -1.09f,
                        dy3 = 13.463f,
                    )
                }
                // M286.268 252.585 L286.268 252.585 c-10.191 0 -12.956 -14.249 -12.956 -24.44 l0.294 -21.986 h36.906  v27.589 C310.513 243.939 296.46 252.585 286.268 252.585z
                path(
                    fill = SolidColor(Color(0xFFBA6F4C)),
                ) {
                    // M 286.268 252.585
                    moveTo(x = 286.268f, y = 252.585f)
                    // L 286.268 252.585
                    lineTo(x = 286.268f, y = 252.585f)
                    // c -10.191 0 -12.956 -14.249 -12.956 -24.44
                    curveToRelative(
                        dx1 = -10.191f,
                        dy1 = 0.0f,
                        dx2 = -12.956f,
                        dy2 = -14.249f,
                        dx3 = -12.956f,
                        dy3 = -24.44f,
                    )
                    // l 0.294 -21.986
                    lineToRelative(dx = 0.294f, dy = -21.986f)
                    // h 36.906
                    horizontalLineToRelative(dx = 36.906f)
                    // v 27.589
                    verticalLineToRelative(dy = 27.589f)
                    // C 310.513 243.939 296.46 252.585 286.268 252.585z
                    curveTo(
                        x1 = 310.513f,
                        y1 = 243.939f,
                        x2 = 296.46f,
                        y2 = 252.585f,
                        x3 = 286.268f,
                        y3 = 252.585f,
                    )
                    close()
                }
                // M307.067 206.158 h-33.461 l-0.294 21.987 c0 6.231 1.038 13.974 4.171 19.055  C296.073 244.128 304.231 225.795 307.067 206.158z
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    // M 307.067 206.158
                    moveTo(x = 307.067f, y = 206.158f)
                    // h -33.461
                    horizontalLineToRelative(dx = -33.461f)
                    // l -0.294 21.987
                    lineToRelative(dx = -0.294f, dy = 21.987f)
                    // c 0 6.231 1.038 13.974 4.171 19.055
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 6.231f,
                        dx2 = 1.038f,
                        dy2 = 13.974f,
                        dx3 = 4.171f,
                        dy3 = 19.055f,
                    )
                    // C 296.073 244.128 304.231 225.795 307.067 206.158z
                    curveTo(
                        x1 = 296.073f,
                        y1 = 244.128f,
                        x2 = 304.231f,
                        y2 = 225.795f,
                        x3 = 307.067f,
                        y3 = 206.158f,
                    )
                    close()
                }
                // M327.291 183.704 l64.542 68.44 c0 0 13.3 -4.76 21.152 -14.969  c7.852 -10.208 -8.736 -27.876 -30.722 -42.01 s-55.114 -29.152 -55.114 -29.152 S326.506 170.747 327.291 183.704z
                path(
                    fill = SolidColor(Color(0xFFBA6F4C)),
                ) {
                    // M 327.291 183.704
                    moveTo(x = 327.291f, y = 183.704f)
                    // l 64.542 68.44
                    lineToRelative(dx = 64.542f, dy = 68.44f)
                    // c 0 0 13.3 -4.76 21.152 -14.969
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 0.0f,
                        dx2 = 13.3f,
                        dy2 = -4.76f,
                        dx3 = 21.152f,
                        dy3 = -14.969f,
                    )
                    // c 7.852 -10.208 -8.736 -27.876 -30.722 -42.01
                    curveToRelative(
                        dx1 = 7.852f,
                        dy1 = -10.208f,
                        dx2 = -8.736f,
                        dy2 = -27.876f,
                        dx3 = -30.722f,
                        dy3 = -42.01f,
                    )
                    // s -55.114 -29.152 -55.114 -29.152
                    reflectiveCurveToRelative(
                        dx1 = -55.114f,
                        dy1 = -29.152f,
                        dx2 = -55.114f,
                        dy2 = -29.152f,
                    )
                    // S 326.506 170.747 327.291 183.704z
                    reflectiveCurveTo(
                        x1 = 326.506f,
                        y1 = 170.747f,
                        x2 = 327.291f,
                        y2 = 183.704f,
                    )
                    close()
                }
                // M343.885 296.853  c0 0 -3.534 35.949 -35.728 34.005
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Round,
                    strokeLineMiter = 10.0f,
                ) {
                    // M 343.885 296.853
                    moveTo(x = 343.885f, y = 296.853f)
                    // c 0 0 -3.534 35.949 -35.728 34.005
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 0.0f,
                        dx2 = -3.534f,
                        dy2 = 35.949f,
                        dx3 = -35.728f,
                        dy3 = 34.005f,
                    )
                }
                // M259.261 222.928  c1.103 1.531 1.62 3.921 1.233 6.483 c-0.62 4.1 -3.318 7.093 -6.027 6.683 c-2.709 -0.409 -4.403 -4.065 -3.784 -8.166  c0.369 -2.445 1.477 -4.495 2.886 -5.666
                path(
                    stroke = SolidColor(Color(0xFFFFFFFF)),
                    strokeLineCap = StrokeCap.Round,
                    strokeLineMiter = 10.0f,
                ) {
                    // M 259.261 222.928
                    moveTo(x = 259.261f, y = 222.928f)
                    // c 1.103 1.531 1.62 3.921 1.233 6.483
                    curveToRelative(
                        dx1 = 1.103f,
                        dy1 = 1.531f,
                        dx2 = 1.62f,
                        dy2 = 3.921f,
                        dx3 = 1.233f,
                        dy3 = 6.483f,
                    )
                    // c -0.62 4.1 -3.318 7.093 -6.027 6.683
                    curveToRelative(
                        dx1 = -0.62f,
                        dy1 = 4.1f,
                        dx2 = -3.318f,
                        dy2 = 7.093f,
                        dx3 = -6.027f,
                        dy3 = 6.683f,
                    )
                    // c -2.709 -0.409 -4.403 -4.065 -3.784 -8.166
                    curveToRelative(
                        dx1 = -2.709f,
                        dy1 = -0.409f,
                        dx2 = -4.403f,
                        dy2 = -4.065f,
                        dx3 = -3.784f,
                        dy3 = -8.166f,
                    )
                    // c 0.369 -2.445 1.477 -4.495 2.886 -5.666
                    curveToRelative(
                        dx1 = 0.369f,
                        dy1 = -2.445f,
                        dx2 = 1.477f,
                        dy2 = -4.495f,
                        dx3 = 2.886f,
                        dy3 = -5.666f,
                    )
                }
                // M242.958 179.731 c0 0 -0.886 58.963 32.318 63.035 c28.879 3.542 33.402 -44.91 31.33 -63.296  c-2.072 -18.386 -10.252 -28.056 -32.833 -27.706 C240.369 152.281 242.958 179.731 242.958 179.731z
                path(
                    fill = SolidColor(Color(0xFFBA6F4C)),
                ) {
                    // M 242.958 179.731
                    moveTo(x = 242.958f, y = 179.731f)
                    // c 0 0 -0.886 58.963 32.318 63.035
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 0.0f,
                        dx2 = -0.886f,
                        dy2 = 58.963f,
                        dx3 = 32.318f,
                        dy3 = 63.035f,
                    )
                    // c 28.879 3.542 33.402 -44.91 31.33 -63.296
                    curveToRelative(
                        dx1 = 28.879f,
                        dy1 = 3.542f,
                        dx2 = 33.402f,
                        dy2 = -44.91f,
                        dx3 = 31.33f,
                        dy3 = -63.296f,
                    )
                    // c -2.072 -18.386 -10.252 -28.056 -32.833 -27.706
                    curveToRelative(
                        dx1 = -2.072f,
                        dy1 = -18.386f,
                        dx2 = -10.252f,
                        dy2 = -28.056f,
                        dx3 = -32.833f,
                        dy3 = -27.706f,
                    )
                    // C 240.369 152.281 242.958 179.731 242.958 179.731z
                    curveTo(
                        x1 = 240.369f,
                        y1 = 152.281f,
                        x2 = 242.958f,
                        y2 = 179.731f,
                        x3 = 242.958f,
                        y3 = 179.731f,
                    )
                    close()
                }
                // M303.053 191.042 l0.86 4.581 c0 0 18.791 2.52 23.581 -0.458 c0 0 -10.652 -28.722 -17.962 -37.397  c-7.31 -8.675 -17.697 -16.782 -40.636 -13.545 c-22.939 3.237 -28.465 25.226 -28.465 25.226 s-5.497 15.14 4.712 32.612  c0 0 0.104 -20.012 4.515 -25.839 C249.657 176.221 270.788 199.976 303.053 191.042
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    // M 303.053 191.042
                    moveTo(x = 303.053f, y = 191.042f)
                    // l 0.86 4.581
                    lineToRelative(dx = 0.86f, dy = 4.581f)
                    // c 0 0 18.791 2.52 23.581 -0.458
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 0.0f,
                        dx2 = 18.791f,
                        dy2 = 2.52f,
                        dx3 = 23.581f,
                        dy3 = -0.458f,
                    )
                    // c 0 0 -10.652 -28.722 -17.962 -37.397
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 0.0f,
                        dx2 = -10.652f,
                        dy2 = -28.722f,
                        dx3 = -17.962f,
                        dy3 = -37.397f,
                    )
                    // c -7.31 -8.675 -17.697 -16.782 -40.636 -13.545
                    curveToRelative(
                        dx1 = -7.31f,
                        dy1 = -8.675f,
                        dx2 = -17.697f,
                        dy2 = -16.782f,
                        dx3 = -40.636f,
                        dy3 = -13.545f,
                    )
                    // c -22.939 3.237 -28.465 25.226 -28.465 25.226
                    curveToRelative(
                        dx1 = -22.939f,
                        dy1 = 3.237f,
                        dx2 = -28.465f,
                        dy2 = 25.226f,
                        dx3 = -28.465f,
                        dy3 = 25.226f,
                    )
                    // s -5.497 15.14 4.712 32.612
                    reflectiveCurveToRelative(
                        dx1 = -5.497f,
                        dy1 = 15.14f,
                        dx2 = 4.712f,
                        dy2 = 32.612f,
                    )
                    // c 0 0 0.104 -20.012 4.515 -25.839
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 0.0f,
                        dx2 = 0.104f,
                        dy2 = -20.012f,
                        dx3 = 4.515f,
                        dy3 = -25.839f,
                    )
                    // C 249.657 176.221 270.788 199.976 303.053 191.042
                    curveTo(
                        x1 = 249.657f,
                        y1 = 176.221f,
                        x2 = 270.788f,
                        y2 = 199.976f,
                        x3 = 303.053f,
                        y3 = 191.042f,
                    )
                }
                // M312.109 208.384 c-1.433 6.688 -6.308 11.315 -10.887 10.333 c-4.579 -0.981 -7.13 -7.199 -5.696 -13.887  c1.433 -6.688 6.308 -11.315 10.887 -10.333 C310.992 195.478 313.542 201.696 312.109 208.384z
                path(
                    fill = SolidColor(Color(0xFFBA6F4C)),
                ) {
                    // M 312.109 208.384
                    moveTo(x = 312.109f, y = 208.384f)
                    // c -1.433 6.688 -6.308 11.315 -10.887 10.333
                    curveToRelative(
                        dx1 = -1.433f,
                        dy1 = 6.688f,
                        dx2 = -6.308f,
                        dy2 = 11.315f,
                        dx3 = -10.887f,
                        dy3 = 10.333f,
                    )
                    // c -4.579 -0.981 -7.13 -7.199 -5.696 -13.887
                    curveToRelative(
                        dx1 = -4.579f,
                        dy1 = -0.981f,
                        dx2 = -7.13f,
                        dy2 = -7.199f,
                        dx3 = -5.696f,
                        dy3 = -13.887f,
                    )
                    // c 1.433 -6.688 6.308 -11.315 10.887 -10.333
                    curveToRelative(
                        dx1 = 1.433f,
                        dy1 = -6.688f,
                        dx2 = 6.308f,
                        dy2 = -11.315f,
                        dx3 = 10.887f,
                        dy3 = -10.333f,
                    )
                    // C 310.992 195.478 313.542 201.696 312.109 208.384z
                    curveTo(
                        x1 = 310.992f,
                        y1 = 195.478f,
                        x2 = 313.542f,
                        y2 = 201.696f,
                        x3 = 312.109f,
                        y3 = 208.384f,
                    )
                    close()
                }
                // M307.41 202.593  c0 0 -4.381 -3.761 -6.32 3.682 c0 0 2.586 2.742 1.149 5.093 c0 0 2.442 0.47 3.519 -1.959
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round,
                    strokeLineMiter = 10.0f,
                ) {
                    // M 307.41 202.593
                    moveTo(x = 307.41f, y = 202.593f)
                    // c 0 0 -4.381 -3.761 -6.32 3.682
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 0.0f,
                        dx2 = -4.381f,
                        dy2 = -3.761f,
                        dx3 = -6.32f,
                        dy3 = 3.682f,
                    )
                    // c 0 0 2.586 2.742 1.149 5.093
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 0.0f,
                        dx2 = 2.586f,
                        dy2 = 2.742f,
                        dx3 = 1.149f,
                        dy3 = 5.093f,
                    )
                    // c 0 0 2.442 0.47 3.519 -1.959
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 0.0f,
                        dx2 = 2.442f,
                        dy2 = 0.47f,
                        dx3 = 3.519f,
                        dy3 = -1.959f,
                    )
                }
                // M305.73 205.494  c0 0 -0.311 -1.612 -2.027 -3.373
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round,
                    strokeLineMiter = 10.0f,
                ) {
                    // M 305.73 205.494
                    moveTo(x = 305.73f, y = 205.494f)
                    // c 0 0 -0.311 -1.612 -2.027 -3.373
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 0.0f,
                        dx2 = -0.311f,
                        dy2 = -1.612f,
                        dx3 = -2.027f,
                        dy3 = -3.373f,
                    )
                }
                // M277.813 210.176 c0.056 1.66 -0.706 3.034 -1.702 3.068 c-0.996 0.034 -1.85 -1.285 -1.906 -2.945  c-0.056 -1.66 0.706 -3.034 1.702 -3.068 C276.903 207.197 277.757 208.516 277.813 210.176z
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    // M 277.813 210.176
                    moveTo(x = 277.813f, y = 210.176f)
                    // c 0.056 1.66 -0.706 3.034 -1.702 3.068
                    curveToRelative(
                        dx1 = 0.056f,
                        dy1 = 1.66f,
                        dx2 = -0.706f,
                        dy2 = 3.034f,
                        dx3 = -1.702f,
                        dy3 = 3.068f,
                    )
                    // c -0.996 0.034 -1.85 -1.285 -1.906 -2.945
                    curveToRelative(
                        dx1 = -0.996f,
                        dy1 = 0.034f,
                        dx2 = -1.85f,
                        dy2 = -1.285f,
                        dx3 = -1.906f,
                        dy3 = -2.945f,
                    )
                    // c -0.056 -1.66 0.706 -3.034 1.702 -3.068
                    curveToRelative(
                        dx1 = -0.056f,
                        dy1 = -1.66f,
                        dx2 = 0.706f,
                        dy2 = -3.034f,
                        dx3 = 1.702f,
                        dy3 = -3.068f,
                    )
                    // C 276.903 207.197 277.757 208.516 277.813 210.176z
                    curveTo(
                        x1 = 276.903f,
                        y1 = 207.197f,
                        x2 = 277.757f,
                        y2 = 208.516f,
                        x3 = 277.813f,
                        y3 = 210.176f,
                    )
                    close()
                }
                // M256.216 213.105 c0.056 1.66 -0.706 3.034 -1.702 3.068 s-1.85 -1.285 -1.906 -2.945 c-0.056 -1.661 0.706 -3.034 1.702 -3.068  C255.307 210.126 256.16 211.445 256.216 213.105z
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    // M 256.216 213.105
                    moveTo(x = 256.216f, y = 213.105f)
                    // c 0.056 1.66 -0.706 3.034 -1.702 3.068
                    curveToRelative(
                        dx1 = 0.056f,
                        dy1 = 1.66f,
                        dx2 = -0.706f,
                        dy2 = 3.034f,
                        dx3 = -1.702f,
                        dy3 = 3.068f,
                    )
                    // s -1.85 -1.285 -1.906 -2.945
                    reflectiveCurveToRelative(
                        dx1 = -1.85f,
                        dy1 = -1.285f,
                        dx2 = -1.906f,
                        dy2 = -2.945f,
                    )
                    // c -0.056 -1.661 0.706 -3.034 1.702 -3.068
                    curveToRelative(
                        dx1 = -0.056f,
                        dy1 = -1.661f,
                        dx2 = 0.706f,
                        dy2 = -3.034f,
                        dx3 = 1.702f,
                        dy3 = -3.068f,
                    )
                    // C 255.307 210.126 256.16 211.445 256.216 213.105z
                    curveTo(
                        x1 = 255.307f,
                        y1 = 210.126f,
                        x2 = 256.16f,
                        y2 = 211.445f,
                        x3 = 256.216f,
                        y3 = 213.105f,
                    )
                    close()
                }
                // M253.402 204.602  c0 0 -0.768 3.374 -3.843 2.439
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Round,
                    strokeLineMiter = 10.0f,
                ) {
                    // M 253.402 204.602
                    moveTo(x = 253.402f, y = 204.602f)
                    // c 0 0 -0.768 3.374 -3.843 2.439
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 0.0f,
                        dx2 = -0.768f,
                        dy2 = 3.374f,
                        dx3 = -3.843f,
                        dy3 = 2.439f,
                    )
                }
                // M277.689 202.183  c0 0 -4.48 1.47 -7.082 -1.486
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Round,
                    strokeLineMiter = 10.0f,
                ) {
                    // M 277.689 202.183
                    moveTo(x = 277.689f, y = 202.183f)
                    // c 0 0 -4.48 1.47 -7.082 -1.486
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 0.0f,
                        dx2 = -4.48f,
                        dy2 = 1.47f,
                        dx3 = -7.082f,
                        dy3 = -1.486f,
                    )
                }
                // M260.133 218.326  c0 0 -0.762 2.878 0.72 3.306 c1.482 0.428 3.458 0.999 5.319 -0.196 c1.861 -1.195 3.739 -0.623 2.041 -3.111
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Round,
                    strokeLineMiter = 10.0f,
                ) {
                    // M 260.133 218.326
                    moveTo(x = 260.133f, y = 218.326f)
                    // c 0 0 -0.762 2.878 0.72 3.306
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 0.0f,
                        dx2 = -0.762f,
                        dy2 = 2.878f,
                        dx3 = 0.72f,
                        dy3 = 3.306f,
                    )
                    // c 1.482 0.428 3.458 0.999 5.319 -0.196
                    curveToRelative(
                        dx1 = 1.482f,
                        dy1 = 0.428f,
                        dx2 = 3.458f,
                        dy2 = 0.999f,
                        dx3 = 5.319f,
                        dy3 = -0.196f,
                    )
                    // c 1.861 -1.195 3.739 -0.623 2.041 -3.111
                    curveToRelative(
                        dx1 = 1.861f,
                        dy1 = -1.195f,
                        dx2 = 3.739f,
                        dy2 = -0.623f,
                        dx3 = 2.041f,
                        dy3 = -3.111f,
                    )
                }
                // M305.409 189.423  c-37.691 17.668 -56.144 -12.711 -56.144 -12.711 s-1.276 1.865 7.264 13.349
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Round,
                    strokeLineMiter = 10.0f,
                ) {
                    // M 305.409 189.423
                    moveTo(x = 305.409f, y = 189.423f)
                    // c -37.691 17.668 -56.144 -12.711 -56.144 -12.711
                    curveToRelative(
                        dx1 = -37.691f,
                        dy1 = 17.668f,
                        dx2 = -56.144f,
                        dy2 = -12.711f,
                        dx3 = -56.144f,
                        dy3 = -12.711f,
                    )
                    // s -1.276 1.865 7.264 13.349
                    reflectiveCurveToRelative(
                        dx1 = -1.276f,
                        dy1 = 1.865f,
                        dx2 = 7.264f,
                        dy2 = 13.349f,
                    )
                }
                // M310.079 213.981  c1.469 1.004 2.693 2.956 3.172 5.352 c0.766 3.834 -0.667 7.352 -3.2 7.857 c-2.533 0.506 -5.207 -2.192 -5.973 -6.025  c-0.456 -2.285 -0.132 -4.459 0.742 -5.948
                path(
                    stroke = SolidColor(Color(0xFFFFFFFF)),
                    strokeLineCap = StrokeCap.Round,
                    strokeLineMiter = 10.0f,
                ) {
                    // M 310.079 213.981
                    moveTo(x = 310.079f, y = 213.981f)
                    // c 1.469 1.004 2.693 2.956 3.172 5.352
                    curveToRelative(
                        dx1 = 1.469f,
                        dy1 = 1.004f,
                        dx2 = 2.693f,
                        dy2 = 2.956f,
                        dx3 = 3.172f,
                        dy3 = 5.352f,
                    )
                    // c 0.766 3.834 -0.667 7.352 -3.2 7.857
                    curveToRelative(
                        dx1 = 0.766f,
                        dy1 = 3.834f,
                        dx2 = -0.667f,
                        dy2 = 7.352f,
                        dx3 = -3.2f,
                        dy3 = 7.857f,
                    )
                    // c -2.533 0.506 -5.207 -2.192 -5.973 -6.025
                    curveToRelative(
                        dx1 = -2.533f,
                        dy1 = 0.506f,
                        dx2 = -5.207f,
                        dy2 = -2.192f,
                        dx3 = -5.973f,
                        dy3 = -6.025f,
                    )
                    // c -0.456 -2.285 -0.132 -4.459 0.742 -5.948
                    curveToRelative(
                        dx1 = -0.456f,
                        dy1 = -2.285f,
                        dx2 = -0.132f,
                        dy2 = -4.459f,
                        dx3 = 0.742f,
                        dy3 = -5.948f,
                    )
                }
                // M280.674 233.396  c0 0 0.663 -3.779 3.975 -3.779
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Round,
                    strokeLineMiter = 10.0f,
                ) {
                    // M 280.674 233.396
                    moveTo(x = 280.674f, y = 233.396f)
                    // c 0 0 0.663 -3.779 3.975 -3.779
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 0.0f,
                        dx2 = 0.663f,
                        dy2 = -3.779f,
                        dx3 = 3.975f,
                        dy3 = -3.779f,
                    )
                }
                // M364.694 223.041 c0 0 -2.945 33.176 27.14 29.103 L364.694 223.041z
                path(
                    fill = SolidColor(Color(0xFFBA6F4C)),
                ) {
                    // M 364.694 223.041
                    moveTo(x = 364.694f, y = 223.041f)
                    // c 0 0 -2.945 33.176 27.14 29.103
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 0.0f,
                        dx2 = -2.945f,
                        dy2 = 33.176f,
                        dx3 = 27.14f,
                        dy3 = 29.103f,
                    )
                    // L 364.694 223.041z
                    lineTo(x = 364.694f, y = 223.041f)
                    close()
                }
                // M364.694 223.041  c0 0 9.03 12.466 18.453 14.232
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Round,
                    strokeLineMiter = 10.0f,
                ) {
                    // M 364.694 223.041
                    moveTo(x = 364.694f, y = 223.041f)
                    // c 0 0 9.03 12.466 18.453 14.232
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 0.0f,
                        dx2 = 9.03f,
                        dy2 = 12.466f,
                        dx3 = 18.453f,
                        dy3 = 14.232f,
                    )
                }
                // M345.161 371.254  c0 0 12.85 -42.384 11.484 -98.939 c0 0 -0.646 -0.329 -2.474 -1.348 c-2.652 -1.479 -6.824 -4.287 -10.777 -8.958
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Round,
                    strokeLineMiter = 10.0f,
                ) {
                    // M 345.161 371.254
                    moveTo(x = 345.161f, y = 371.254f)
                    // c 0 0 12.85 -42.384 11.484 -98.939
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 0.0f,
                        dx2 = 12.85f,
                        dy2 = -42.384f,
                        dx3 = 11.484f,
                        dy3 = -98.939f,
                    )
                    // c 0 0 -0.646 -0.329 -2.474 -1.348
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 0.0f,
                        dx2 = -0.646f,
                        dy2 = -0.329f,
                        dx3 = -2.474f,
                        dy3 = -1.348f,
                    )
                    // c -2.652 -1.479 -6.824 -4.287 -10.777 -8.958
                    curveToRelative(
                        dx1 = -2.652f,
                        dy1 = -1.479f,
                        dx2 = -6.824f,
                        dy2 = -4.287f,
                        dx3 = -10.777f,
                        dy3 = -8.958f,
                    )
                }
                // M384.521 252.781  c0 0 -22.281 16.588 -27.876 19.533
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Round,
                    strokeLineMiter = 10.0f,
                ) {
                    // M 384.521 252.781
                    moveTo(x = 384.521f, y = 252.781f)
                    // c 0 0 -22.281 16.588 -27.876 19.533
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 0.0f,
                        dx2 = -22.281f,
                        dy2 = 16.588f,
                        dx3 = -27.876f,
                        dy3 = 19.533f,
                    )
                }
                // M316.869 231.868  c0 0 5.63 24.247 -24.429 29.877 c-25.857 4.843 -25.972 -18.707 -25.972 -18.707
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Round,
                    strokeLineMiter = 10.0f,
                ) {
                    // M 316.869 231.868
                    moveTo(x = 316.869f, y = 231.868f)
                    // c 0 0 5.63 24.247 -24.429 29.877
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 0.0f,
                        dx2 = 5.63f,
                        dy2 = 24.247f,
                        dx3 = -24.429f,
                        dy3 = 29.877f,
                    )
                    // c -25.857 4.843 -25.972 -18.707 -25.972 -18.707
                    curveToRelative(
                        dx1 = -25.857f,
                        dy1 = 4.843f,
                        dx2 = -25.972f,
                        dy2 = -18.707f,
                        dx3 = -25.972f,
                        dy3 = -18.707f,
                    )
                }
                // M300.795 248.078  c0 0 3.496 1.683 3.356 9.581
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Round,
                    strokeLineMiter = 10.0f,
                ) {
                    // M 300.795 248.078
                    moveTo(x = 300.795f, y = 248.078f)
                    // c 0 0 3.496 1.683 3.356 9.581
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 0.0f,
                        dx2 = 3.496f,
                        dy2 = 1.683f,
                        dx3 = 3.356f,
                        dy3 = 9.581f,
                    )
                }
                // M306.698 242.993  c0 0 3.633 2.316 3.496 10.625
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Round,
                    strokeLineMiter = 10.0f,
                ) {
                    // M 306.698 242.993
                    moveTo(x = 306.698f, y = 242.993f)
                    // c 0 0 3.633 2.316 3.496 10.625
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 0.0f,
                        dx2 = 3.633f,
                        dy2 = 2.316f,
                        dx3 = 3.496f,
                        dy3 = 10.625f,
                    )
                }
                // M310.694 236.273  c0 0 4.06 2.347 3.905 11.442
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Round,
                    strokeLineMiter = 10.0f,
                ) {
                    // M 310.694 236.273
                    moveTo(x = 310.694f, y = 236.273f)
                    // c 0 0 4.06 2.347 3.905 11.442
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 0.0f,
                        dx2 = 4.06f,
                        dy2 = 2.347f,
                        dx3 = 3.905f,
                        dy3 = 11.442f,
                    )
                }
                // M275.527 244.151  c0 0 -4.45 5.812 -0.817 14.802
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Round,
                    strokeLineMiter = 10.0f,
                ) {
                    // M 275.527 244.151
                    moveTo(x = 275.527f, y = 244.151f)
                    // c 0 0 -4.45 5.812 -0.817 14.802
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 0.0f,
                        dx2 = -4.45f,
                        dy2 = 5.812f,
                        dx3 = -0.817f,
                        dy3 = 14.802f,
                    )
                }
                // M279.314 249.486  c0 0 -2.27 4.998 1.934 12.282
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Round,
                    strokeLineMiter = 10.0f,
                ) {
                    // M 279.314 249.486
                    moveTo(x = 279.314f, y = 249.486f)
                    // c 0 0 -2.27 4.998 1.934 12.282
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 0.0f,
                        dx2 = -2.27f,
                        dy2 = 4.998f,
                        dx3 = 1.934f,
                        dy3 = 12.282f,
                    )
                }
                // M286.374 253.05  c0 0 -0.259 5.794 1.208 9.127
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Round,
                    strokeLineMiter = 10.0f,
                ) {
                    // M 286.374 253.05
                    moveTo(x = 286.374f, y = 253.05f)
                    // c 0 0 -0.259 5.794 1.208 9.127
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 0.0f,
                        dx2 = -0.259f,
                        dy2 = 5.794f,
                        dx3 = 1.208f,
                        dy3 = 9.127f,
                    )
                }
                // M294.257 251.688  c0 0 1.993 3.182 1.578 9.127
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Round,
                    strokeLineMiter = 10.0f,
                ) {
                    // M 294.257 251.688
                    moveTo(x = 294.257f, y = 251.688f)
                    // c 0 0 1.993 3.182 1.578 9.127
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 0.0f,
                        dx2 = 1.993f,
                        dy2 = 3.182f,
                        dx3 = 1.578f,
                        dy3 = 9.127f,
                    )
                }
                // M308.764 254.889  c0 0 -10.512 13.94 -29.037 13.94
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Round,
                    strokeLineMiter = 10.0f,
                ) {
                    // M 308.764 254.889
                    moveTo(x = 308.764f, y = 254.889f)
                    // c 0 0 -10.512 13.94 -29.037 13.94
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 0.0f,
                        dx2 = -10.512f,
                        dy2 = 13.94f,
                        dx3 = -29.037f,
                        dy3 = 13.94f,
                    )
                }
                // <polygon points="389.974 398.295 46.33 398.295 90.2 370.91 433.843 370.91" fill="#C6D3F7" style="fill:#C6D3F7;" />
                path(
                    fill = SolidColor(Color(0xFFC6D3F7)),
                ) {
                    // M 389.974 398.295
                    moveTo(x = 389.974f, y = 398.295f)
                    // L 46.33 398.295
                    lineTo(x = 46.33f, y = 398.295f)
                    // L 90.2 370.91
                    lineTo(x = 90.2f, y = 370.91f)
                    // L 433.843 370.91z
                    lineTo(x = 433.843f, y = 370.91f)
                    close()
                }
                // M139.039 359.217 c-3.772 -2.656 -8.79 -4.012 -13.963 -4.059 c-6.805 -0.062 -16.093 1.326 -19.16 1.679  c-1.889 0.217 -1.919 -2.672 -7.641 4.884 c-2.261 2.986 -2.862 3.741 -3.162 4.772 c-0.3 1.031 0.53 12.775 3.424 13.693  c0.09 0.029 0.163 -0.016 0.25 -0.023 c0.151 0.951 0.916 2.476 1.631 3.39 c0.457 0.584 3.114 1.786 3.949 -2.63  c0 0 0.65 3.587 2.653 4.86 c2.079 1.321 3.019 -1.132 3.263 -3.102 c0.266 1.709 1.554 4.562 3.336 3.921  c3.494 -1.257 1.749 -11.501 1.749 -11.501 l4.097 -7.394 l5.815 1.369 c0 0 12.128 5.36 16.817 -1.683  C144.245 364.166 142.049 361.336 139.039 359.217z
                path(
                    fill = SolidColor(Color(0xFFBA6F4C)),
                ) {
                    // M 139.039 359.217
                    moveTo(x = 139.039f, y = 359.217f)
                    // c -3.772 -2.656 -8.79 -4.012 -13.963 -4.059
                    curveToRelative(
                        dx1 = -3.772f,
                        dy1 = -2.656f,
                        dx2 = -8.79f,
                        dy2 = -4.012f,
                        dx3 = -13.963f,
                        dy3 = -4.059f,
                    )
                    // c -6.805 -0.062 -16.093 1.326 -19.16 1.679
                    curveToRelative(
                        dx1 = -6.805f,
                        dy1 = -0.062f,
                        dx2 = -16.093f,
                        dy2 = 1.326f,
                        dx3 = -19.16f,
                        dy3 = 1.679f,
                    )
                    // c -1.889 0.217 -1.919 -2.672 -7.641 4.884
                    curveToRelative(
                        dx1 = -1.889f,
                        dy1 = 0.217f,
                        dx2 = -1.919f,
                        dy2 = -2.672f,
                        dx3 = -7.641f,
                        dy3 = 4.884f,
                    )
                    // c -2.261 2.986 -2.862 3.741 -3.162 4.772
                    curveToRelative(
                        dx1 = -2.261f,
                        dy1 = 2.986f,
                        dx2 = -2.862f,
                        dy2 = 3.741f,
                        dx3 = -3.162f,
                        dy3 = 4.772f,
                    )
                    // c -0.3 1.031 0.53 12.775 3.424 13.693
                    curveToRelative(
                        dx1 = -0.3f,
                        dy1 = 1.031f,
                        dx2 = 0.53f,
                        dy2 = 12.775f,
                        dx3 = 3.424f,
                        dy3 = 13.693f,
                    )
                    // c 0.09 0.029 0.163 -0.016 0.25 -0.023
                    curveToRelative(
                        dx1 = 0.09f,
                        dy1 = 0.029f,
                        dx2 = 0.163f,
                        dy2 = -0.016f,
                        dx3 = 0.25f,
                        dy3 = -0.023f,
                    )
                    // c 0.151 0.951 0.916 2.476 1.631 3.39
                    curveToRelative(
                        dx1 = 0.151f,
                        dy1 = 0.951f,
                        dx2 = 0.916f,
                        dy2 = 2.476f,
                        dx3 = 1.631f,
                        dy3 = 3.39f,
                    )
                    // c 0.457 0.584 3.114 1.786 3.949 -2.63
                    curveToRelative(
                        dx1 = 0.457f,
                        dy1 = 0.584f,
                        dx2 = 3.114f,
                        dy2 = 1.786f,
                        dx3 = 3.949f,
                        dy3 = -2.63f,
                    )
                    // c 0 0 0.65 3.587 2.653 4.86
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 0.0f,
                        dx2 = 0.65f,
                        dy2 = 3.587f,
                        dx3 = 2.653f,
                        dy3 = 4.86f,
                    )
                    // c 2.079 1.321 3.019 -1.132 3.263 -3.102
                    curveToRelative(
                        dx1 = 2.079f,
                        dy1 = 1.321f,
                        dx2 = 3.019f,
                        dy2 = -1.132f,
                        dx3 = 3.263f,
                        dy3 = -3.102f,
                    )
                    // c 0.266 1.709 1.554 4.562 3.336 3.921
                    curveToRelative(
                        dx1 = 0.266f,
                        dy1 = 1.709f,
                        dx2 = 1.554f,
                        dy2 = 4.562f,
                        dx3 = 3.336f,
                        dy3 = 3.921f,
                    )
                    // c 3.494 -1.257 1.749 -11.501 1.749 -11.501
                    curveToRelative(
                        dx1 = 3.494f,
                        dy1 = -1.257f,
                        dx2 = 1.749f,
                        dy2 = -11.501f,
                        dx3 = 1.749f,
                        dy3 = -11.501f,
                    )
                    // l 4.097 -7.394
                    lineToRelative(dx = 4.097f, dy = -7.394f)
                    // l 5.815 1.369
                    lineToRelative(dx = 5.815f, dy = 1.369f)
                    // c 0 0 12.128 5.36 16.817 -1.683
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 0.0f,
                        dx2 = 12.128f,
                        dy2 = 5.36f,
                        dx3 = 16.817f,
                        dy3 = -1.683f,
                    )
                    // C 144.245 364.166 142.049 361.336 139.039 359.217z
                    curveTo(
                        x1 = 144.245f,
                        y1 = 364.166f,
                        x2 = 142.049f,
                        y2 = 361.336f,
                        x3 = 139.039f,
                        y3 = 359.217f,
                    )
                    close()
                }
                // <polyline points="103.7 359.554 97.947 367.816 99.247 379.668" fill="none" style="fill:none;stroke:#000000;stroke-linecap:round;stroke-miterlimit:10;" stroke="#000000" stroke-line-cap="round" stroke-miter-limit="10" />
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Round,
                    strokeLineMiter = 10.0f,
                ) {
                    // M 103.7 359.554
                    moveTo(x = 103.7f, y = 359.554f)
                    // L 97.947 367.816
                    lineTo(x = 97.947f, y = 367.816f)
                    // L 99.247 379.668
                    lineTo(x = 99.247f, y = 379.668f)
                }
                // <polyline points="108.078 361.265 103.53 370.552 104.367 380.925" fill="none" style="fill:none;stroke:#000000;stroke-linecap:round;stroke-miterlimit:10;" stroke="#000000" stroke-line-cap="round" stroke-miter-limit="10" />
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Round,
                    strokeLineMiter = 10.0f,
                ) {
                    // M 108.078 361.265
                    moveTo(x = 108.078f, y = 361.265f)
                    // L 103.53 370.552
                    lineTo(x = 103.53f, y = 370.552f)
                    // L 104.367 380.925
                    lineTo(x = 104.367f, y = 380.925f)
                }
                // <polyline points="114.295 362.997 109.966 371.785 110.27 381.205" fill="none" style="fill:none;stroke:#000000;stroke-linecap:round;stroke-miterlimit:10;" stroke="#000000" stroke-line-cap="round" stroke-miter-limit="10" />
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Round,
                    strokeLineMiter = 10.0f,
                ) {
                    // M 114.295 362.997
                    moveTo(x = 114.295f, y = 362.997f)
                    // L 109.966 371.785
                    lineTo(x = 109.966f, y = 371.785f)
                    // L 110.27 381.205
                    lineTo(x = 110.27f, y = 381.205f)
                }
                // M131.259 368.935 c0 0 -6.522 6.82 -4.685 9.678 c1.837 2.858 17.603 -10.295 14.418 -11.874  C136.327 364.427 131.259 368.935 131.259 368.935z
                path(
                    fill = SolidColor(Color(0xFFBA6F4C)),
                ) {
                    // M 131.259 368.935
                    moveTo(x = 131.259f, y = 368.935f)
                    // c 0 0 -6.522 6.82 -4.685 9.678
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 0.0f,
                        dx2 = -6.522f,
                        dy2 = 6.82f,
                        dx3 = -4.685f,
                        dy3 = 9.678f,
                    )
                    // c 1.837 2.858 17.603 -10.295 14.418 -11.874
                    curveToRelative(
                        dx1 = 1.837f,
                        dy1 = 2.858f,
                        dx2 = 17.603f,
                        dy2 = -10.295f,
                        dx3 = 14.418f,
                        dy3 = -11.874f,
                    )
                    // C 136.327 364.427 131.259 368.935 131.259 368.935z
                    curveTo(
                        x1 = 136.327f,
                        y1 = 364.427f,
                        x2 = 131.259f,
                        y2 = 368.935f,
                        x3 = 131.259f,
                        y3 = 368.935f,
                    )
                    close()
                }
                // M127.938 366.174  c0 0 2.708 1.619 1.568 4.738
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Round,
                    strokeLineMiter = 10.0f,
                ) {
                    // M 127.938 366.174
                    moveTo(x = 127.938f, y = 366.174f)
                    // c 0 0 2.708 1.619 1.568 4.738
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 0.0f,
                        dx2 = 2.708f,
                        dy2 = 1.619f,
                        dx3 = 1.568f,
                        dy3 = 4.738f,
                    )
                }
                // M278.318 373.462 l31.159 0.699 c0.93 0.021 1.674 0.781 1.674 1.712 v2.519  c0 0.674 -0.395 1.285 -1.01 1.561 l-23.872 10.735 l-6.89 0.294 L278.318 373.462z
                path(
                    fill = SolidColor(Color(0xFF8796FF)),
                ) {
                    // M 278.318 373.462
                    moveTo(x = 278.318f, y = 373.462f)
                    // l 31.159 0.699
                    lineToRelative(dx = 31.159f, dy = 0.699f)
                    // c 0.93 0.021 1.674 0.781 1.674 1.712
                    curveToRelative(
                        dx1 = 0.93f,
                        dy1 = 0.021f,
                        dx2 = 1.674f,
                        dy2 = 0.781f,
                        dx3 = 1.674f,
                        dy3 = 1.712f,
                    )
                    // v 2.519
                    verticalLineToRelative(dy = 2.519f)
                    // c 0 0.674 -0.395 1.285 -1.01 1.561
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 0.674f,
                        dx2 = -0.395f,
                        dy2 = 1.285f,
                        dx3 = -1.01f,
                        dy3 = 1.561f,
                    )
                    // l -23.872 10.735
                    lineToRelative(dx = -23.872f, dy = 10.735f)
                    // l -6.89 0.294
                    lineToRelative(dx = -6.89f, dy = 0.294f)
                    // L 278.318 373.462z
                    lineTo(x = 278.318f, y = 373.462f)
                    close()
                }
                // M310.141 375.732 l-23.872 10.736 l-6.89 0.294 v4.221 l6.89 -0.294 l23.872 -10.736  c0.615 -0.276 1.01 -0.888 1.01 -1.561 v-2.519 c0 -0.313 -0.09 -0.602 -0.236 -0.855 C310.738 375.325 310.477 375.581 310.141 375.732z
                path(
                    fill = SolidColor(Color(0xFFE1E7F7)),
                ) {
                    // M 310.141 375.732
                    moveTo(x = 310.141f, y = 375.732f)
                    // l -23.872 10.736
                    lineToRelative(dx = -23.872f, dy = 10.736f)
                    // l -6.89 0.294
                    lineToRelative(dx = -6.89f, dy = 0.294f)
                    // v 4.221
                    verticalLineToRelative(dy = 4.221f)
                    // l 6.89 -0.294
                    lineToRelative(dx = 6.89f, dy = -0.294f)
                    // l 23.872 -10.736
                    lineToRelative(dx = 23.872f, dy = -10.736f)
                    // c 0.615 -0.276 1.01 -0.888 1.01 -1.561
                    curveToRelative(
                        dx1 = 0.615f,
                        dy1 = -0.276f,
                        dx2 = 1.01f,
                        dy2 = -0.888f,
                        dx3 = 1.01f,
                        dy3 = -1.561f,
                    )
                    // v -2.519
                    verticalLineToRelative(dy = -2.519f)
                    // c 0 -0.313 -0.09 -0.602 -0.236 -0.855
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = -0.313f,
                        dx2 = -0.09f,
                        dy2 = -0.602f,
                        dx3 = -0.236f,
                        dy3 = -0.855f,
                    )
                    // C 310.738 375.325 310.477 375.581 310.141 375.732z
                    curveTo(
                        x1 = 310.738f,
                        y1 = 375.325f,
                        x2 = 310.477f,
                        y2 = 375.581f,
                        x3 = 310.141f,
                        y3 = 375.732f,
                    )
                    close()
                }
                // M282.323 390.983 h-143.17 c-2.286 0 -4.248 -1.674 -4.666 -3.982 l-19.007 -89.804  c-0.544 -2.998 4.215 -6.92 7.184 -6.92 h143.17 c2.286 0 4.248 1.674 4.666 3.983 l16.489 90.957  C287.533 388.214 285.293 390.983 282.323 390.983z
                path(
                    fill = SolidColor(Color(0xFFFFFFFF)),
                ) {
                    // M 282.323 390.983
                    moveTo(x = 282.323f, y = 390.983f)
                    // h -143.17
                    horizontalLineToRelative(dx = -143.17f)
                    // c -2.286 0 -4.248 -1.674 -4.666 -3.982
                    curveToRelative(
                        dx1 = -2.286f,
                        dy1 = 0.0f,
                        dx2 = -4.248f,
                        dy2 = -1.674f,
                        dx3 = -4.666f,
                        dy3 = -3.982f,
                    )
                    // l -19.007 -89.804
                    lineToRelative(dx = -19.007f, dy = -89.804f)
                    // c -0.544 -2.998 4.215 -6.92 7.184 -6.92
                    curveToRelative(
                        dx1 = -0.544f,
                        dy1 = -2.998f,
                        dx2 = 4.215f,
                        dy2 = -6.92f,
                        dx3 = 7.184f,
                        dy3 = -6.92f,
                    )
                    // h 143.17
                    horizontalLineToRelative(dx = 143.17f)
                    // c 2.286 0 4.248 1.674 4.666 3.983
                    curveToRelative(
                        dx1 = 2.286f,
                        dy1 = 0.0f,
                        dx2 = 4.248f,
                        dy2 = 1.674f,
                        dx3 = 4.666f,
                        dy3 = 3.983f,
                    )
                    // l 16.489 90.957
                    lineToRelative(dx = 16.489f, dy = 90.957f)
                    // C 287.533 388.214 285.293 390.983 282.323 390.983z
                    curveTo(
                        x1 = 287.533f,
                        y1 = 388.214f,
                        x2 = 285.293f,
                        y2 = 390.983f,
                        x3 = 282.323f,
                        y3 = 390.983f,
                    )
                    close()
                }
                // M259.178 296.607 l7.225 -6.279 c-0.188 -0.023 -0.375 -0.052 -0.569 -0.052 h-143.17  c-2.97 0 -7.728 3.922 -7.184 6.92 l2.508 11.852 l56.188 1.645 L259.178 296.607z
                path(
                    fill = SolidColor(Color(0xFF8796FF)),
                ) {
                    // M 259.178 296.607
                    moveTo(x = 259.178f, y = 296.607f)
                    // l 7.225 -6.279
                    lineToRelative(dx = 7.225f, dy = -6.279f)
                    // c -0.188 -0.023 -0.375 -0.052 -0.569 -0.052
                    curveToRelative(
                        dx1 = -0.188f,
                        dy1 = -0.023f,
                        dx2 = -0.375f,
                        dy2 = -0.052f,
                        dx3 = -0.569f,
                        dy3 = -0.052f,
                    )
                    // h -143.17
                    horizontalLineToRelative(dx = -143.17f)
                    // c -2.97 0 -7.728 3.922 -7.184 6.92
                    curveToRelative(
                        dx1 = -2.97f,
                        dy1 = 0.0f,
                        dx2 = -7.728f,
                        dy2 = 3.922f,
                        dx3 = -7.184f,
                        dy3 = 6.92f,
                    )
                    // l 2.508 11.852
                    lineToRelative(dx = 2.508f, dy = 11.852f)
                    // l 56.188 1.645
                    lineToRelative(dx = 56.188f, dy = 1.645f)
                    // L 259.178 296.607z
                    lineTo(x = 259.178f, y = 296.607f)
                    close()
                }
                // M286.99 385.216 l-16.155 -89.113 c-1.338 0.685 -3.355 2.155 -4.295 5.069  c-1.127 3.494 -0.356 62.391 0.068 89.811 h15.716 C285.293 390.983 287.533 388.214 286.99 385.216z
                path(
                    fill = SolidColor(Color(0xFFE1E7F7)),
                ) {
                    // M 286.99 385.216
                    moveTo(x = 286.99f, y = 385.216f)
                    // l -16.155 -89.113
                    lineToRelative(dx = -16.155f, dy = -89.113f)
                    // c -1.338 0.685 -3.355 2.155 -4.295 5.069
                    curveToRelative(
                        dx1 = -1.338f,
                        dy1 = 0.685f,
                        dx2 = -3.355f,
                        dy2 = 2.155f,
                        dx3 = -4.295f,
                        dy3 = 5.069f,
                    )
                    // c -1.127 3.494 -0.356 62.391 0.068 89.811
                    curveToRelative(
                        dx1 = -1.127f,
                        dy1 = 3.494f,
                        dx2 = -0.356f,
                        dy2 = 62.391f,
                        dx3 = 0.068f,
                        dy3 = 89.811f,
                    )
                    // h 15.716
                    horizontalLineToRelative(dx = 15.716f)
                    // C 285.293 390.983 287.533 388.214 286.99 385.216z
                    curveTo(
                        x1 = 285.293f,
                        y1 = 390.983f,
                        x2 = 287.533f,
                        y2 = 388.214f,
                        x3 = 286.99f,
                        y3 = 385.216f,
                    )
                    close()
                }
                // M279.379 390.983 h-143.17 c-2.286 0 -4.248 -1.63 -4.666 -3.878 l-16.489 -88.563  c-0.544 -2.919 1.697 -5.615 4.666 -5.615 h143.17 c2.286 0 4.248 1.63 4.666 3.878 l16.489 88.563  C284.589 388.287 282.348 390.983 279.379 390.983z
                path(
                    fill = SolidColor(accentColor),
                ) {
                    // M 279.379 390.983
                    moveTo(x = 279.379f, y = 390.983f)
                    // h -143.17
                    horizontalLineToRelative(dx = -143.17f)
                    // c -2.286 0 -4.248 -1.63 -4.666 -3.878
                    curveToRelative(
                        dx1 = -2.286f,
                        dy1 = 0.0f,
                        dx2 = -4.248f,
                        dy2 = -1.63f,
                        dx3 = -4.666f,
                        dy3 = -3.878f,
                    )
                    // l -16.489 -88.563
                    lineToRelative(dx = -16.489f, dy = -88.563f)
                    // c -0.544 -2.919 1.697 -5.615 4.666 -5.615
                    curveToRelative(
                        dx1 = -0.544f,
                        dy1 = -2.919f,
                        dx2 = 1.697f,
                        dy2 = -5.615f,
                        dx3 = 4.666f,
                        dy3 = -5.615f,
                    )
                    // h 143.17
                    horizontalLineToRelative(dx = 143.17f)
                    // c 2.286 0 4.248 1.63 4.666 3.878
                    curveToRelative(
                        dx1 = 2.286f,
                        dy1 = 0.0f,
                        dx2 = 4.248f,
                        dy2 = 1.63f,
                        dx3 = 4.666f,
                        dy3 = 3.878f,
                    )
                    // l 16.489 88.563
                    lineToRelative(dx = 16.489f, dy = 88.563f)
                    // C 284.589 388.287 282.348 390.983 279.379 390.983z
                    curveTo(
                        x1 = 284.589f,
                        y1 = 388.287f,
                        x2 = 282.348f,
                        y2 = 390.983f,
                        x3 = 279.379f,
                        y3 = 390.983f,
                    )
                    close()
                }
                // <ellipse cx="192.694" cy="347.212" rx="11.64" ry="15.607" fill="#7584F1" style="fill:#7584F1;" />
                path(
                    fill = SolidColor(Color(0xFF7584F1)),
                ) {
                    // M 185.9619448 333.1276747
                    moveTo(x = 185.9619448f, y = 333.1276747f)
                    // A 15.606526554473906 11.639646895244203 64.51891836646631 1 0 199.39020759999997 361.30455249999994
                    arcTo(
                        horizontalEllipseRadius = 15.606526554473906f,
                        verticalEllipseRadius = 11.639646895244203f,
                        theta = 64.51891836646631f,
                        isMoreThanHalf = true,
                        isPositiveArc = false,
                        x1 = 199.39020759999997f,
                        y1 = 361.30455249999994f,
                    )
                    // A 15.606526554473906 11.639646895244203 64.51891836646631 1 0 185.9619448 333.1276747z
                    arcTo(
                        horizontalEllipseRadius = 15.606526554473906f,
                        verticalEllipseRadius = 11.639646895244203f,
                        theta = 64.51891836646631f,
                        isMoreThanHalf = true,
                        isPositiveArc = false,
                        x1 = 185.9619448f,
                        y1 = 333.1276747f,
                    )
                    close()
                }
                // <rect width="344" height="7" x="46.33" y="398.295" fill="#7584F1" style="fill:#7584F1;" />
                path(
                    fill = SolidColor(Color(0xFF7584F1)),
                ) {
                    // M 46.33 398.295
                    moveTo(x = 46.33f, y = 398.295f)
                    // h 344
                    horizontalLineToRelative(dx = 344.0f)
                    // v 7
                    verticalLineToRelative(dy = 7.0f)
                    // h -344z
                    horizontalLineToRelative(dx = -344.0f)
                    close()
                }
                // <polygon points="389.974 405.411 433.843 378.026 433.843 370.91 389.974 398.295" fill="#8AA5EB" style="fill:#8AA5EB;" />
                path(
                    fill = SolidColor(Color(0xFF8AA5EB)),
                ) {
                    // M 389.974 405.411
                    moveTo(x = 389.974f, y = 405.411f)
                    // L 433.843 378.026
                    lineTo(x = 433.843f, y = 378.026f)
                    // L 433.843 370.91
                    lineTo(x = 433.843f, y = 370.91f)
                    // L 389.974 398.295z
                    lineTo(x = 389.974f, y = 398.295f)
                    close()
                }
                // M261.019 250.485  c0 0 8.173 31.33 25.609 31.875
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Round,
                    strokeLineMiter = 10.0f,
                ) {
                    // M 261.019 250.485
                    moveTo(x = 261.019f, y = 250.485f)
                    // c 0 0 8.173 31.33 25.609 31.875
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 0.0f,
                        dx2 = 8.173f,
                        dy2 = 31.33f,
                        dx3 = 25.609f,
                        dy3 = 31.875f,
                    )
                }
                // M314.046 169.252
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Round,
                    strokeLineMiter = 10.0f,
                ) {
                    // M 314.046 169.252
                    moveTo(x = 314.046f, y = 169.252f)
                }
                // M405.557 326.094 c0 0 -2.977 -1.138 0.826 -8.563 c3.613 -7.053 7.558 -13.665 16.325 -19.073  c0 0 -0.83 14.556 -6.251 20.155 C411.036 324.212 405.557 326.094 405.557 326.094z
                path(
                    fill = SolidColor(Color(0xFF7E9E6E)),
                ) {
                    // M 405.557 326.094
                    moveTo(x = 405.557f, y = 326.094f)
                    // c 0 0 -2.977 -1.138 0.826 -8.563
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 0.0f,
                        dx2 = -2.977f,
                        dy2 = -1.138f,
                        dx3 = 0.826f,
                        dy3 = -8.563f,
                    )
                    // c 3.613 -7.053 7.558 -13.665 16.325 -19.073
                    curveToRelative(
                        dx1 = 3.613f,
                        dy1 = -7.053f,
                        dx2 = 7.558f,
                        dy2 = -13.665f,
                        dx3 = 16.325f,
                        dy3 = -19.073f,
                    )
                    // c 0 0 -0.83 14.556 -6.251 20.155
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 0.0f,
                        dx2 = -0.83f,
                        dy2 = 14.556f,
                        dx3 = -6.251f,
                        dy3 = 20.155f,
                    )
                    // C 411.036 324.212 405.557 326.094 405.557 326.094z
                    curveTo(
                        x1 = 411.036f,
                        y1 = 324.212f,
                        x2 = 405.557f,
                        y2 = 326.094f,
                        x3 = 405.557f,
                        y3 = 326.094f,
                    )
                    close()
                }
                // M428.817 327.065 c0 0 -9.083 6.092 -25.851 6.73 c0 0 0.733 -2.219 7.772 -5.734  C417.776 324.545 430.461 324.799 428.817 327.065z
                path(
                    fill = SolidColor(Color(0xFF7E9E6E)),
                ) {
                    // M 428.817 327.065
                    moveTo(x = 428.817f, y = 327.065f)
                    // c 0 0 -9.083 6.092 -25.851 6.73
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 0.0f,
                        dx2 = -9.083f,
                        dy2 = 6.092f,
                        dx3 = -25.851f,
                        dy3 = 6.73f,
                    )
                    // c 0 0 0.733 -2.219 7.772 -5.734
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 0.0f,
                        dx2 = 0.733f,
                        dy2 = -2.219f,
                        dx3 = 7.772f,
                        dy3 = -5.734f,
                    )
                    // C 417.776 324.545 430.461 324.799 428.817 327.065z
                    curveTo(
                        x1 = 417.776f,
                        y1 = 324.545f,
                        x2 = 430.461f,
                        y2 = 324.799f,
                        x3 = 428.817f,
                        y3 = 327.065f,
                    )
                    close()
                }
                // M428.817 327.065  c0 0 -12.204 -1.98 -25.851 6.73 c0 0 -1.391 0.989 -2.559 3.758
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Round,
                    strokeLineMiter = 10.0f,
                ) {
                    // M 428.817 327.065
                    moveTo(x = 428.817f, y = 327.065f)
                    // c 0 0 -12.204 -1.98 -25.851 6.73
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 0.0f,
                        dx2 = -12.204f,
                        dy2 = -1.98f,
                        dx3 = -25.851f,
                        dy3 = 6.73f,
                    )
                    // c 0 0 -1.391 0.989 -2.559 3.758
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 0.0f,
                        dx2 = -1.391f,
                        dy2 = 0.989f,
                        dx3 = -2.559f,
                        dy3 = 3.758f,
                    )
                }
                // M422.344 339.625 c0 0 -9.035 11.398 -25.803 12.036 c0 0 2.232 -7.444 9.271 -10.96  C412.851 337.186 423.988 337.36 422.344 339.625z
                path(
                    fill = SolidColor(Color(0xFF7E9E6E)),
                ) {
                    // M 422.344 339.625
                    moveTo(x = 422.344f, y = 339.625f)
                    // c 0 0 -9.035 11.398 -25.803 12.036
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 0.0f,
                        dx2 = -9.035f,
                        dy2 = 11.398f,
                        dx3 = -25.803f,
                        dy3 = 12.036f,
                    )
                    // c 0 0 2.232 -7.444 9.271 -10.96
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 0.0f,
                        dx2 = 2.232f,
                        dy2 = -7.444f,
                        dx3 = 9.271f,
                        dy3 = -10.96f,
                    )
                    // C 412.851 337.186 423.988 337.36 422.344 339.625z
                    curveTo(
                        x1 = 412.851f,
                        y1 = 337.186f,
                        x2 = 423.988f,
                        y2 = 337.36f,
                        x3 = 422.344f,
                        y3 = 339.625f,
                    )
                    close()
                }
                // M422.344 339.625  c0 0 -11.626 -1.153 -25.803 12.036 c0 0 -1.66 1.601 -2.829 4.37
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Round,
                    strokeLineMiter = 10.0f,
                ) {
                    // M 422.344 339.625
                    moveTo(x = 422.344f, y = 339.625f)
                    // c 0 0 -11.626 -1.153 -25.803 12.036
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 0.0f,
                        dx2 = -11.626f,
                        dy2 = -1.153f,
                        dx3 = -25.803f,
                        dy3 = 12.036f,
                    )
                    // c 0 0 -1.66 1.601 -2.829 4.37
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 0.0f,
                        dx2 = -1.66f,
                        dy2 = 1.601f,
                        dx3 = -2.829f,
                        dy3 = 4.37f,
                    )
                }
                // M397.869 337.304 c0 0 -2.085 1.846 -6.653 -0.567 c-4.568 -2.414 -7.326 -10.818 -11.038 -10.777  C380.178 325.959 389.443 325.502 397.869 337.304z
                path(
                    fill = SolidColor(Color(0xFF7E9E6E)),
                ) {
                    // M 397.869 337.304
                    moveTo(x = 397.869f, y = 337.304f)
                    // c 0 0 -2.085 1.846 -6.653 -0.567
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 0.0f,
                        dx2 = -2.085f,
                        dy2 = 1.846f,
                        dx3 = -6.653f,
                        dy3 = -0.567f,
                    )
                    // c -4.568 -2.414 -7.326 -10.818 -11.038 -10.777
                    curveToRelative(
                        dx1 = -4.568f,
                        dy1 = -2.414f,
                        dx2 = -7.326f,
                        dy2 = -10.818f,
                        dx3 = -11.038f,
                        dy3 = -10.777f,
                    )
                    // C 380.178 325.959 389.443 325.502 397.869 337.304z
                    curveTo(
                        x1 = 380.178f,
                        y1 = 325.959f,
                        x2 = 389.443f,
                        y2 = 325.502f,
                        x3 = 397.869f,
                        y3 = 337.304f,
                    )
                    close()
                }
                // M390.8 366.223  c3.104 -11.851 7.769 -25.779 14.757 -40.129 c0 0 1.668 -3.872 7.837 -14.662 s9.314 -12.974 9.314 -12.974
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Round,
                    strokeLineMiter = 10.0f,
                ) {
                    // M 390.8 366.223
                    moveTo(x = 390.8f, y = 366.223f)
                    // c 3.104 -11.851 7.769 -25.779 14.757 -40.129
                    curveToRelative(
                        dx1 = 3.104f,
                        dy1 = -11.851f,
                        dx2 = 7.769f,
                        dy2 = -25.779f,
                        dx3 = 14.757f,
                        dy3 = -40.129f,
                    )
                    // c 0 0 1.668 -3.872 7.837 -14.662
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 0.0f,
                        dx2 = 1.668f,
                        dy2 = -3.872f,
                        dx3 = 7.837f,
                        dy3 = -14.662f,
                    )
                    // s 9.314 -12.974 9.314 -12.974
                    reflectiveCurveToRelative(
                        dx1 = 9.314f,
                        dy1 = -12.974f,
                        dx2 = 9.314f,
                        dy2 = -12.974f,
                    )
                }
                // M381.287 326.014  c0 0 8.964 0.613 16.582 11.289 c1.845 2.586 0.52 5.769 -0.584 8.225
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Round,
                    strokeLineMiter = 10.0f,
                ) {
                    // M 381.287 326.014
                    moveTo(x = 381.287f, y = 326.014f)
                    // c 0 0 8.964 0.613 16.582 11.289
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 0.0f,
                        dx2 = 8.964f,
                        dy2 = 0.613f,
                        dx3 = 16.582f,
                        dy3 = 11.289f,
                    )
                    // c 1.845 2.586 0.52 5.769 -0.584 8.225
                    curveToRelative(
                        dx1 = 1.845f,
                        dy1 = 2.586f,
                        dx2 = 0.52f,
                        dy2 = 5.769f,
                        dx3 = -0.584f,
                        dy3 = 8.225f,
                    )
                }
                // M379.485 360.052 l4.353 23.999 c0 1.471 4.644 2.663 10.373 2.663  c5.729 0 10.373 -1.192 10.373 -2.663 l4.354 -23.999 H379.485z
                path(
                    fill = SolidColor(accentColor),
                ) {
                    // M 379.485 360.052
                    moveTo(x = 379.485f, y = 360.052f)
                    // l 4.353 23.999
                    lineToRelative(dx = 4.353f, dy = 23.999f)
                    // c 0 1.471 4.644 2.663 10.373 2.663
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 1.471f,
                        dx2 = 4.644f,
                        dy2 = 2.663f,
                        dx3 = 10.373f,
                        dy3 = 2.663f,
                    )
                    // c 5.729 0 10.373 -1.192 10.373 -2.663
                    curveToRelative(
                        dx1 = 5.729f,
                        dy1 = 0.0f,
                        dx2 = 10.373f,
                        dy2 = -1.192f,
                        dx3 = 10.373f,
                        dy3 = -2.663f,
                    )
                    // l 4.354 -23.999
                    lineToRelative(dx = 4.354f, dy = -23.999f)
                    // H 379.485z
                    horizontalLineTo(x = 379.485f)
                    close()
                }
                // M408.937 360.052 c0 1.471 -6.593 2.663 -14.726 2.663 s-14.726 -1.192 -14.726 -2.663 c0 -1.471 6.593 -2.663 14.726 -2.663  S408.937 358.581 408.937 360.052z
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    // M 408.937 360.052
                    moveTo(x = 408.937f, y = 360.052f)
                    // c 0 1.471 -6.593 2.663 -14.726 2.663
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 1.471f,
                        dx2 = -6.593f,
                        dy2 = 2.663f,
                        dx3 = -14.726f,
                        dy3 = 2.663f,
                    )
                    // s -14.726 -1.192 -14.726 -2.663
                    reflectiveCurveToRelative(
                        dx1 = -14.726f,
                        dy1 = -1.192f,
                        dx2 = -14.726f,
                        dy2 = -2.663f,
                    )
                    // c 0 -1.471 6.593 -2.663 14.726 -2.663
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = -1.471f,
                        dx2 = 6.593f,
                        dy2 = -2.663f,
                        dx3 = 14.726f,
                        dy3 = -2.663f,
                    )
                    // S 408.937 358.581 408.937 360.052z
                    reflectiveCurveTo(
                        x1 = 408.937f,
                        y1 = 358.581f,
                        x2 = 408.937f,
                        y2 = 360.052f,
                    )
                    close()
                }
                // M352.231 70.326 c-17.604 0.48 -32.169 14.58 -33.182 32.161  c-0.596 10.338 3.41 19.745 10.153 26.382 c0.996 0.981 1.459 2.379 1.226 3.757 l-2.532 14.984 l15.579 -9.077  c0.888 -0.517 1.933 -0.707 2.94 -0.504 c3.808 0.768 7.843 0.91 12.002 0.28 c15.39 -2.332 27.397 -15.073 28.817 -30.574  C389.126 87.073 372.624 69.77 352.231 70.326z
                path(
                    fill = SolidColor(Color(0xFFD3DDF7)),
                ) {
                    // M 352.231 70.326
                    moveTo(x = 352.231f, y = 70.326f)
                    // c -17.604 0.48 -32.169 14.58 -33.182 32.161
                    curveToRelative(
                        dx1 = -17.604f,
                        dy1 = 0.48f,
                        dx2 = -32.169f,
                        dy2 = 14.58f,
                        dx3 = -33.182f,
                        dy3 = 32.161f,
                    )
                    // c -0.596 10.338 3.41 19.745 10.153 26.382
                    curveToRelative(
                        dx1 = -0.596f,
                        dy1 = 10.338f,
                        dx2 = 3.41f,
                        dy2 = 19.745f,
                        dx3 = 10.153f,
                        dy3 = 26.382f,
                    )
                    // c 0.996 0.981 1.459 2.379 1.226 3.757
                    curveToRelative(
                        dx1 = 0.996f,
                        dy1 = 0.981f,
                        dx2 = 1.459f,
                        dy2 = 2.379f,
                        dx3 = 1.226f,
                        dy3 = 3.757f,
                    )
                    // l -2.532 14.984
                    lineToRelative(dx = -2.532f, dy = 14.984f)
                    // l 15.579 -9.077
                    lineToRelative(dx = 15.579f, dy = -9.077f)
                    // c 0.888 -0.517 1.933 -0.707 2.94 -0.504
                    curveToRelative(
                        dx1 = 0.888f,
                        dy1 = -0.517f,
                        dx2 = 1.933f,
                        dy2 = -0.707f,
                        dx3 = 2.94f,
                        dy3 = -0.504f,
                    )
                    // c 3.808 0.768 7.843 0.91 12.002 0.28
                    curveToRelative(
                        dx1 = 3.808f,
                        dy1 = 0.768f,
                        dx2 = 7.843f,
                        dy2 = 0.91f,
                        dx3 = 12.002f,
                        dy3 = 0.28f,
                    )
                    // c 15.39 -2.332 27.397 -15.073 28.817 -30.574
                    curveToRelative(
                        dx1 = 15.39f,
                        dy1 = -2.332f,
                        dx2 = 27.397f,
                        dy2 = -15.073f,
                        dx3 = 28.817f,
                        dy3 = -30.574f,
                    )
                    // C 389.126 87.073 372.624 69.77 352.231 70.326z
                    curveTo(
                        x1 = 389.126f,
                        y1 = 87.073f,
                        x2 = 372.624f,
                        y2 = 69.77f,
                        x3 = 352.231f,
                        y3 = 70.326f,
                    )
                    close()
                }
                // M352.249 119.779 c-0.473 0 -0.836 -0.15 -1.088 -0.449 c-0.253 -0.299 -0.378 -0.716 -0.378 -1.253  c0 -0.504 0.133 -0.914 0.402 -1.229 c0.267 -0.315 0.622 -0.473 1.064 -0.473 c0.504 0 0.875 0.15 1.111 0.449  c0.237 0.3 0.355 0.717 0.355 1.253 c0 0.473 -0.127 0.875 -0.379 1.206 C353.084 119.613 352.723 119.779 352.249 119.779z M351.958 108.004 c-0.036 -0.977 -0.072 -1.978 -0.108 -3.003 c-0.036 -1.024 -0.063 -2.049 -0.081 -3.074  c-0.018 -1.024 -0.01 -2.073 0.027 -3.145 V86.298 h1.186 l0.055 12.485 c0 1.072 -0.01 2.12 -0.027 3.145  c-0.019 1.025 -0.046 2.05 -0.081 3.074 c-0.037 1.025 -0.073 2.026 -0.109 3.003 H351.958z
                path(
                    fill = SolidColor(Color(0xFF000000)),
                ) {
                    // M 352.249 119.779
                    moveTo(x = 352.249f, y = 119.779f)
                    // c -0.473 0 -0.836 -0.15 -1.088 -0.449
                    curveToRelative(
                        dx1 = -0.473f,
                        dy1 = 0.0f,
                        dx2 = -0.836f,
                        dy2 = -0.15f,
                        dx3 = -1.088f,
                        dy3 = -0.449f,
                    )
                    // c -0.253 -0.299 -0.378 -0.716 -0.378 -1.253
                    curveToRelative(
                        dx1 = -0.253f,
                        dy1 = -0.299f,
                        dx2 = -0.378f,
                        dy2 = -0.716f,
                        dx3 = -0.378f,
                        dy3 = -1.253f,
                    )
                    // c 0 -0.504 0.133 -0.914 0.402 -1.229
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = -0.504f,
                        dx2 = 0.133f,
                        dy2 = -0.914f,
                        dx3 = 0.402f,
                        dy3 = -1.229f,
                    )
                    // c 0.267 -0.315 0.622 -0.473 1.064 -0.473
                    curveToRelative(
                        dx1 = 0.267f,
                        dy1 = -0.315f,
                        dx2 = 0.622f,
                        dy2 = -0.473f,
                        dx3 = 1.064f,
                        dy3 = -0.473f,
                    )
                    // c 0.504 0 0.875 0.15 1.111 0.449
                    curveToRelative(
                        dx1 = 0.504f,
                        dy1 = 0.0f,
                        dx2 = 0.875f,
                        dy2 = 0.15f,
                        dx3 = 1.111f,
                        dy3 = 0.449f,
                    )
                    // c 0.237 0.3 0.355 0.717 0.355 1.253
                    curveToRelative(
                        dx1 = 0.237f,
                        dy1 = 0.3f,
                        dx2 = 0.355f,
                        dy2 = 0.717f,
                        dx3 = 0.355f,
                        dy3 = 1.253f,
                    )
                    // c 0 0.473 -0.127 0.875 -0.379 1.206
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 0.473f,
                        dx2 = -0.127f,
                        dy2 = 0.875f,
                        dx3 = -0.379f,
                        dy3 = 1.206f,
                    )
                    // C 353.084 119.613 352.723 119.779 352.249 119.779z
                    curveTo(
                        x1 = 353.084f,
                        y1 = 119.613f,
                        x2 = 352.723f,
                        y2 = 119.779f,
                        x3 = 352.249f,
                        y3 = 119.779f,
                    )
                    close()
                    // M 351.958 108.004
                    moveTo(x = 351.958f, y = 108.004f)
                    // c -0.036 -0.977 -0.072 -1.978 -0.108 -3.003
                    curveToRelative(
                        dx1 = -0.036f,
                        dy1 = -0.977f,
                        dx2 = -0.072f,
                        dy2 = -1.978f,
                        dx3 = -0.108f,
                        dy3 = -3.003f,
                    )
                    // c -0.036 -1.024 -0.063 -2.049 -0.081 -3.074
                    curveToRelative(
                        dx1 = -0.036f,
                        dy1 = -1.024f,
                        dx2 = -0.063f,
                        dy2 = -2.049f,
                        dx3 = -0.081f,
                        dy3 = -3.074f,
                    )
                    // c -0.018 -1.024 -0.01 -2.073 0.027 -3.145
                    curveToRelative(
                        dx1 = -0.018f,
                        dy1 = -1.024f,
                        dx2 = -0.01f,
                        dy2 = -2.073f,
                        dx3 = 0.027f,
                        dy3 = -3.145f,
                    )
                    // V 86.298
                    verticalLineTo(y = 86.298f)
                    // h 1.186
                    horizontalLineToRelative(dx = 1.186f)
                    // l 0.055 12.485
                    lineToRelative(dx = 0.055f, dy = 12.485f)
                    // c 0 1.072 -0.01 2.12 -0.027 3.145
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 1.072f,
                        dx2 = -0.01f,
                        dy2 = 2.12f,
                        dx3 = -0.027f,
                        dy3 = 3.145f,
                    )
                    // c -0.019 1.025 -0.046 2.05 -0.081 3.074
                    curveToRelative(
                        dx1 = -0.019f,
                        dy1 = 1.025f,
                        dx2 = -0.046f,
                        dy2 = 2.05f,
                        dx3 = -0.081f,
                        dy3 = 3.074f,
                    )
                    // c -0.037 1.025 -0.073 2.026 -0.109 3.003
                    curveToRelative(
                        dx1 = -0.037f,
                        dy1 = 1.025f,
                        dx2 = -0.073f,
                        dy2 = 2.026f,
                        dx3 = -0.109f,
                        dy3 = 3.003f,
                    )
                    // H 351.958z
                    horizontalLineTo(x = 351.958f)
                    close()
                }
                // M98.768 184.174 c-1.697 0.003 -3.341 -0.59 -4.646 -1.675 l-3.62 -3.011  c-1.303 -1.083 -2.849 -1.663 -4.432 -1.66 l-17.942 0.028 c-1.628 0.003 -2.946 1.324 -2.943 2.952 l0.005 3.419 l0.096 61.536  c0.004 2.809 2.285 5.083 5.095 5.079 l89.439 -0.14 c2.185 -0.004 3.954 -1.778 3.951 -3.963 l-0.092 -58.709  c-0.003 -2.185 -1.778 -3.954 -3.963 -3.951 L98.768 184.174z
                path(
                    fill = SolidColor(Color(0xFFD3DDF7)),
                ) {
                    // M 98.768 184.174
                    moveTo(x = 98.768f, y = 184.174f)
                    // c -1.697 0.003 -3.341 -0.59 -4.646 -1.675
                    curveToRelative(
                        dx1 = -1.697f,
                        dy1 = 0.003f,
                        dx2 = -3.341f,
                        dy2 = -0.59f,
                        dx3 = -4.646f,
                        dy3 = -1.675f,
                    )
                    // l -3.62 -3.011
                    lineToRelative(dx = -3.62f, dy = -3.011f)
                    // c -1.303 -1.083 -2.849 -1.663 -4.432 -1.66
                    curveToRelative(
                        dx1 = -1.303f,
                        dy1 = -1.083f,
                        dx2 = -2.849f,
                        dy2 = -1.663f,
                        dx3 = -4.432f,
                        dy3 = -1.66f,
                    )
                    // l -17.942 0.028
                    lineToRelative(dx = -17.942f, dy = 0.028f)
                    // c -1.628 0.003 -2.946 1.324 -2.943 2.952
                    curveToRelative(
                        dx1 = -1.628f,
                        dy1 = 0.003f,
                        dx2 = -2.946f,
                        dy2 = 1.324f,
                        dx3 = -2.943f,
                        dy3 = 2.952f,
                    )
                    // l 0.005 3.419
                    lineToRelative(dx = 0.005f, dy = 3.419f)
                    // l 0.096 61.536
                    lineToRelative(dx = 0.096f, dy = 61.536f)
                    // c 0.004 2.809 2.285 5.083 5.095 5.079
                    curveToRelative(
                        dx1 = 0.004f,
                        dy1 = 2.809f,
                        dx2 = 2.285f,
                        dy2 = 5.083f,
                        dx3 = 5.095f,
                        dy3 = 5.079f,
                    )
                    // l 89.439 -0.14
                    lineToRelative(dx = 89.439f, dy = -0.14f)
                    // c 2.185 -0.004 3.954 -1.778 3.951 -3.963
                    curveToRelative(
                        dx1 = 2.185f,
                        dy1 = -0.004f,
                        dx2 = 3.954f,
                        dy2 = -1.778f,
                        dx3 = 3.951f,
                        dy3 = -3.963f,
                    )
                    // l -0.092 -58.709
                    lineToRelative(dx = -0.092f, dy = -58.709f)
                    // c -0.003 -2.185 -1.778 -3.954 -3.963 -3.951
                    curveToRelative(
                        dx1 = -0.003f,
                        dy1 = -2.185f,
                        dx2 = -1.778f,
                        dy2 = -3.954f,
                        dx3 = -3.963f,
                        dy3 = -3.951f,
                    )
                    // L 98.768 184.174z
                    lineTo(x = 98.768f, y = 184.174f)
                    close()
                }
                // M153.209 199.041 h-18.134  c-1.39 0 -2.516 -1.126 -2.516 -2.516 l0 0 c0 -1.39 1.126 -2.516 2.516 -2.516 h18.134 c1.39 0 2.516 1.126 2.516 2.516 l0 0  C155.725 197.915 154.598 199.041 153.209 199.041z
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Round,
                    strokeLineMiter = 10.0f,
                ) {
                    // M 153.209 199.041
                    moveTo(x = 153.209f, y = 199.041f)
                    // h -18.134
                    horizontalLineToRelative(dx = -18.134f)
                    // c -1.39 0 -2.516 -1.126 -2.516 -2.516
                    curveToRelative(
                        dx1 = -1.39f,
                        dy1 = 0.0f,
                        dx2 = -2.516f,
                        dy2 = -1.126f,
                        dx3 = -2.516f,
                        dy3 = -2.516f,
                    )
                    // l 0 0
                    lineToRelative(dx = 0.0f, dy = 0.0f)
                    // c 0 -1.39 1.126 -2.516 2.516 -2.516
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = -1.39f,
                        dx2 = 1.126f,
                        dy2 = -2.516f,
                        dx3 = 2.516f,
                        dy3 = -2.516f,
                    )
                    // h 18.134
                    horizontalLineToRelative(dx = 18.134f)
                    // c 1.39 0 2.516 1.126 2.516 2.516
                    curveToRelative(
                        dx1 = 1.39f,
                        dy1 = 0.0f,
                        dx2 = 2.516f,
                        dy2 = 1.126f,
                        dx3 = 2.516f,
                        dy3 = 2.516f,
                    )
                    // l 0 0
                    lineToRelative(dx = 0.0f, dy = 0.0f)
                    // C 155.725 197.915 154.598 199.041 153.209 199.041z
                    curveTo(
                        x1 = 155.725f,
                        y1 = 197.915f,
                        x2 = 154.598f,
                        y2 = 199.041f,
                        x3 = 153.209f,
                        y3 = 199.041f,
                    )
                    close()
                }
                // M310.513 233.747  c0 10.191 -14.053 18.838 -24.244 18.838 l0 0
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineCap = StrokeCap.Round,
                    strokeLineMiter = 10.0f,
                ) {
                    // M 310.513 233.747
                    moveTo(x = 310.513f, y = 233.747f)
                    // c 0 10.191 -14.053 18.838 -24.244 18.838
                    curveToRelative(
                        dx1 = 0.0f,
                        dy1 = 10.191f,
                        dx2 = -14.053f,
                        dy2 = 18.838f,
                        dx3 = -24.244f,
                        dy3 = 18.838f,
                    )
                    // l 0 0
                    lineToRelative(dx = 0.0f, dy = 0.0f)
                }
            }.build()
        }
    }

@Preview
@Composable
private fun EmptyHeroPreview() {
    Box(Modifier.wrapContentSize()) {
        Image(
            imageVector = StackersIcons.Hero.EmptyHero,
            contentDescription = null,
            modifier = Modifier.matchParentSize()
        )
    }
}