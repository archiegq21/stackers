package com.core.designsystem.icon

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
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
val StackersIcons.Hero.SelectHero: ImageVector
    @Composable
    get() {
        val current = selectHero
        if (current != null) return current

        return ImageVector.Builder(
            name = "Select Hero",
            defaultWidth = 700.0.dp,
            defaultHeight = 500.0.dp,
            viewportWidth = 700.0f,
            viewportHeight = 500.0f,
        ).apply {
            // <ellipse cx="289.02" cy="220.777" rx="232.754" ry="165.915" fill="#F5F5FF" style="fill:#F5F5FF;" />
            path(
                fill = SolidColor(Color(0xFFF5F5FF)),
            ) {
                // M 289.02 54.861999999999995
                moveTo(x = 289.02f, y = 54.861999999999995f)
                // A 232.754 165.915 0 1 0 289.02 386.692
                arcTo(
                    horizontalEllipseRadius = 232.754f,
                    verticalEllipseRadius = 165.915f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 289.02f,
                    y1 = 386.692f,
                )
                // A 232.754 165.915 0 1 0 289.02 54.861999999999995z
                arcTo(
                    horizontalEllipseRadius = 232.754f,
                    verticalEllipseRadius = 165.915f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 289.02f,
                    y1 = 54.861999999999995f,
                )
                close()
            }
            // <ellipse cx="540.283" cy="439.709" rx="106.251" ry="14.741" fill="#DFDFEB" style="fill:#DFDFEB;" />
            path(
                fill = SolidColor(Color(0xFFDFDFEB)),
            ) {
                // M 540.283 424.968
                moveTo(x = 540.283f, y = 424.968f)
                // A 106.251 14.741 0 1 0 540.283 454.45
                arcTo(
                    horizontalEllipseRadius = 106.251f,
                    verticalEllipseRadius = 14.741f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 540.283f,
                    y1 = 454.45f,
                )
                // A 106.251 14.741 0 1 0 540.283 424.968z
                arcTo(
                    horizontalEllipseRadius = 106.251f,
                    verticalEllipseRadius = 14.741f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 540.283f,
                    y1 = 424.968f,
                )
                close()
            }
            // <ellipse cx="317.581" cy="446.822" rx="191.948" ry="16.346" fill="#DFDFEB" style="fill:#DFDFEB;" />
            path(
                fill = SolidColor(Color(0xFFDFDFEB)),
            ) {
                // M 317.581 430.476
                moveTo(x = 317.581f, y = 430.476f)
                // A 191.948 16.346 0 1 0 317.581 463.168
                arcTo(
                    horizontalEllipseRadius = 191.948f,
                    verticalEllipseRadius = 16.346f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 317.581f,
                    y1 = 463.168f,
                )
                // A 191.948 16.346 0 1 0 317.581 430.476z
                arcTo(
                    horizontalEllipseRadius = 191.948f,
                    verticalEllipseRadius = 16.346f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 317.581f,
                    y1 = 430.476f,
                )
                close()
            }
            // M354.278 157.1 c0 0 -3.552 20.617 -29.434 47.155 c0 0 -2.86 -3.54 2.089 -18.207  C331.881 171.381 352.802 152.106 354.278 157.1z
            path(
                fill = SolidColor(Color(0xFF7E9E6E)),
            ) {
                // M 354.278 157.1
                moveTo(x = 354.278f, y = 157.1f)
                // c 0 0 -3.552 20.617 -29.434 47.155
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -3.552f,
                    dy2 = 20.617f,
                    dx3 = -29.434f,
                    dy3 = 47.155f,
                )
                // c 0 0 -2.86 -3.54 2.089 -18.207
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -2.86f,
                    dy2 = -3.54f,
                    dx3 = 2.089f,
                    dy3 = -18.207f,
                )
                // C 331.881 171.381 352.802 152.106 354.278 157.1z
                curveTo(
                    x1 = 331.881f,
                    y1 = 171.381f,
                    x2 = 352.802f,
                    y2 = 152.106f,
                    x3 = 354.278f,
                    y3 = 157.1f,
                )
                close()
            }
            // M354.278 157.1  c0 0 -23.29 16.659 -29.434 47.155 c0 0 -1.191 10.458 2.393 19.52
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineMiter = 10.0f,
            ) {
                // M 354.278 157.1
                moveTo(x = 354.278f, y = 157.1f)
                // c 0 0 -23.29 16.659 -29.434 47.155
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -23.29f,
                    dy2 = 16.659f,
                    dx3 = -29.434f,
                    dy3 = 47.155f,
                )
                // c 0 0 -1.191 10.458 2.393 19.52
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -1.191f,
                    dy2 = 10.458f,
                    dx3 = 2.393f,
                    dy3 = 19.52f,
                )
            }
            // M291.678 173.754 c0 0 6.534 -4.951 -4.707 -17.316 c-10.678 -11.747 -21.983 -22.279 -44.079 -26.139  c0 0 6.669 29.929 21.067 37.063 C278.357 174.496 291.678 173.754 291.678 173.754z
            path(
                fill = SolidColor(Color(0xFF7E9E6E)),
            ) {
                // M 291.678 173.754
                moveTo(x = 291.678f, y = 173.754f)
                // c 0 0 6.534 -4.951 -4.707 -17.316
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 6.534f,
                    dy2 = -4.951f,
                    dx3 = -4.707f,
                    dy3 = -17.316f,
                )
                // c -10.678 -11.747 -21.983 -22.279 -44.079 -26.139
                curveToRelative(
                    dx1 = -10.678f,
                    dy1 = -11.747f,
                    dx2 = -21.983f,
                    dy2 = -22.279f,
                    dx3 = -44.079f,
                    dy3 = -26.139f,
                )
                // c 0 0 6.669 29.929 21.067 37.063
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 6.669f,
                    dy2 = 29.929f,
                    dx3 = 21.067f,
                    dy3 = 37.063f,
                )
                // C 278.357 174.496 291.678 173.754 291.678 173.754z
                curveTo(
                    x1 = 278.357f,
                    y1 = 174.496f,
                    x2 = 291.678f,
                    y2 = 173.754f,
                    x3 = 291.678f,
                    y3 = 173.754f,
                )
                close()
            }
            // M238.046 195.761 c0 0 23.053 5.029 62.152 -8.019 c0 0 -2.424 -4.042 -19.895 -5.401  C262.832 180.981 233.496 192.402 238.046 195.761z
            path(
                fill = SolidColor(Color(0xFF7E9E6E)),
            ) {
                // M 238.046 195.761
                moveTo(x = 238.046f, y = 195.761f)
                // c 0 0 23.053 5.029 62.152 -8.019
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 23.053f,
                    dy2 = 5.029f,
                    dx3 = 62.152f,
                    dy3 = -8.019f,
                )
                // c 0 0 -2.424 -4.042 -19.895 -5.401
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -2.424f,
                    dy2 = -4.042f,
                    dx3 = -19.895f,
                    dy3 = -5.401f,
                )
                // C 262.832 180.981 233.496 192.402 238.046 195.761z
                curveTo(
                    x1 = 262.832f,
                    y1 = 180.981f,
                    x2 = 233.496f,
                    y2 = 192.402f,
                    x3 = 238.046f,
                    y3 = 195.761f,
                )
                close()
            }
            // M238.046 195.761  c0 0 27.659 -14.642 62.152 -8.019 c0 0 3.548 0.888 7.161 5.714
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineMiter = 10.0f,
            ) {
                // M 238.046 195.761
                moveTo(x = 238.046f, y = 195.761f)
                // c 0 0 27.659 -14.642 62.152 -8.019
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 27.659f,
                    dy2 = -14.642f,
                    dx3 = 62.152f,
                    dy3 = -8.019f,
                )
                // c 0 0 3.548 0.888 7.161 5.714
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 3.548f,
                    dy2 = 0.888f,
                    dx3 = 7.161f,
                    dy3 = 5.714f,
                )
            }
            // M257.154 216.648 c0 0 24.67 16.239 63.768 3.192 c0 0 -7.604 -13.755 -25.074 -15.115  C278.377 203.365 252.603 213.289 257.154 216.648z
            path(
                fill = SolidColor(Color(0xFF7E9E6E)),
            ) {
                // M 257.154 216.648
                moveTo(x = 257.154f, y = 216.648f)
                // c 0 0 24.67 16.239 63.768 3.192
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 24.67f,
                    dy2 = 16.239f,
                    dx3 = 63.768f,
                    dy3 = 3.192f,
                )
                // c 0 0 -7.604 -13.755 -25.074 -15.115
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -7.604f,
                    dy2 = -13.755f,
                    dx3 = -25.074f,
                    dy3 = -15.115f,
                )
                // C 278.377 203.365 252.603 213.289 257.154 216.648z
                curveTo(
                    x1 = 278.377f,
                    y1 = 203.365f,
                    x2 = 252.603f,
                    y2 = 213.289f,
                    x3 = 257.154f,
                    y3 = 216.648f,
                )
                close()
            }
            // M257.154 216.648  c0 0 26.59 -12.407 63.768 3.192 c0 0 4.372 1.946 7.985 6.772
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineMiter = 10.0f,
            ) {
                // M 257.154 216.648
                moveTo(x = 257.154f, y = 216.648f)
                // c 0 0 26.59 -12.407 63.768 3.192
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 26.59f,
                    dy2 = -12.407f,
                    dx3 = 63.768f,
                    dy3 = 3.192f,
                )
                // c 0 0 4.372 1.946 7.985 6.772
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 4.372f,
                    dy2 = 1.946f,
                    dx3 = 7.985f,
                    dy3 = 6.772f,
                )
            }
            // M340.658 137.578 c0 0 7.281 -0.872 -10.486 15.563 c-16.777 15.52 -14.644 15.641 -14.644 15.641  S321.894 145.559 340.658 137.578z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 340.658 137.578
                moveTo(x = 340.658f, y = 137.578f)
                // c 0 0 7.281 -0.872 -10.486 15.563
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 7.281f,
                    dy2 = -0.872f,
                    dx3 = -10.486f,
                    dy3 = 15.563f,
                )
                // c -16.777 15.52 -14.644 15.641 -14.644 15.641
                curveToRelative(
                    dx1 = -16.777f,
                    dy1 = 15.52f,
                    dx2 = -14.644f,
                    dy2 = 15.641f,
                    dx3 = -14.644f,
                    dy3 = 15.641f,
                )
                // S 321.894 145.559 340.658 137.578z
                reflectiveCurveTo(
                    x1 = 321.894f,
                    y1 = 145.559f,
                    x2 = 340.658f,
                    y2 = 137.578f,
                )
                close()
            }
            // M303.323 176.643 c0 0 5.438 2.097 15.246 -6.904 c9.808 -9.001 13.464 -29.061 22.089 -32.161  C340.658 137.578 319.02 144.568 303.323 176.643z
            path(
                fill = SolidColor(Color(0xFF7E9E6E)),
            ) {
                // M 303.323 176.643
                moveTo(x = 303.323f, y = 176.643f)
                // c 0 0 5.438 2.097 15.246 -6.904
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 5.438f,
                    dy2 = 2.097f,
                    dx3 = 15.246f,
                    dy3 = -6.904f,
                )
                // c 9.808 -9.001 13.464 -29.061 22.089 -32.161
                curveToRelative(
                    dx1 = 9.808f,
                    dy1 = -9.001f,
                    dx2 = 13.464f,
                    dy2 = -29.061f,
                    dx3 = 22.089f,
                    dy3 = -32.161f,
                )
                // C 340.658 137.578 319.02 144.568 303.323 176.643z
                curveTo(
                    x1 = 340.658f,
                    y1 = 137.578f,
                    x2 = 319.02f,
                    y2 = 144.568f,
                    x3 = 303.323f,
                    y3 = 176.643f,
                )
                close()
            }
            // M338.985 245.566  c-11.063 -22.284 -26.422 -47.6 -47.307 -71.811 c0 0 -5.131 -6.719 -22.956 -24.138 c-17.825 -17.419 -25.83 -19.317 -25.83 -19.317
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineMiter = 10.0f,
            ) {
                // M 338.985 245.566
                moveTo(x = 338.985f, y = 245.566f)
                // c -11.063 -22.284 -26.422 -47.6 -47.307 -71.811
                curveToRelative(
                    dx1 = -11.063f,
                    dy1 = -22.284f,
                    dx2 = -26.422f,
                    dy2 = -47.6f,
                    dx3 = -47.307f,
                    dy3 = -71.811f,
                )
                // c 0 0 -5.131 -6.719 -22.956 -24.138
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -5.131f,
                    dy2 = -6.719f,
                    dx3 = -22.956f,
                    dy3 = -24.138f,
                )
                // c -17.825 -17.419 -25.83 -19.317 -25.83 -19.317
                curveToRelative(
                    dx1 = -17.825f,
                    dy1 = -17.419f,
                    dx2 = -25.83f,
                    dy2 = -19.317f,
                    dx3 = -25.83f,
                    dy3 = -19.317f,
                )
            }
            // M338.103 138.646  c0 0 -20.59 8.985 -34.779 37.997 c-3.437 7.029 0.675 12.591 4.036 16.813
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineMiter = 10.0f,
            ) {
                // M 338.103 138.646
                moveTo(x = 338.103f, y = 138.646f)
                // c 0 0 -20.59 8.985 -34.779 37.997
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -20.59f,
                    dy2 = 8.985f,
                    dx3 = -34.779f,
                    dy3 = 37.997f,
                )
                // c -3.437 7.029 0.675 12.591 4.036 16.813
                curveToRelative(
                    dx1 = -3.437f,
                    dy1 = 7.029f,
                    dx2 = 0.675f,
                    dy2 = 12.591f,
                    dx3 = 4.036f,
                    dy3 = 16.813f,
                )
            }
            // M525.859 379.153 c0 0 -17.209 12.699 -56.862 3.379 c0 0 0.105 -6.36 14.336 -12.477  C497.565 363.937 528.109 373.263 525.859 379.153z
            path(
                fill = SolidColor(Color(0xFF7E9E6E)),
            ) {
                // M 525.859 379.153
                moveTo(x = 525.859f, y = 379.153f)
                // c 0 0 -17.209 12.699 -56.862 3.379
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -17.209f,
                    dy2 = 12.699f,
                    dx3 = -56.862f,
                    dy3 = 3.379f,
                )
                // c 0 0 0.105 -6.36 14.336 -12.477
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 0.105f,
                    dy2 = -6.36f,
                    dx3 = 14.336f,
                    dy3 = -12.477f,
                )
                // C 497.565 363.937 528.109 373.263 525.859 379.153z
                curveTo(
                    x1 = 497.565f,
                    y1 = 363.937f,
                    x2 = 528.109f,
                    y2 = 373.263f,
                    x3 = 525.859f,
                    y3 = 379.153f,
                )
                close()
            }
            // M524.629 377.995  c0 0 -27.158 -9.077 -55.454 3.849 c0 0 -9.166 5.175 -14.398 13.396
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineMiter = 10.0f,
            ) {
                // M 524.629 377.995
                moveTo(x = 524.629f, y = 377.995f)
                // c 0 0 -27.158 -9.077 -55.454 3.849
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -27.158f,
                    dy2 = -9.077f,
                    dx3 = -55.454f,
                    dy3 = 3.849f,
                )
                // c 0 0 -9.166 5.175 -14.398 13.396
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -9.166f,
                    dy2 = 5.175f,
                    dx3 = -14.398f,
                    dy3 = 13.396f,
                )
            }
            // M468.48 351.215 c0 0 7.844 2.383 11.256 -13.975 c3.242 -15.54 5.134 -30.875 -4.712 -51.03  c0 0 -20.316 22.967 -17.64 38.811 C460.06 340.866 468.48 351.215 468.48 351.215z
            path(
                fill = SolidColor(Color(0xFF7E9E6E)),
            ) {
                // M 468.48 351.215
                moveTo(x = 468.48f, y = 351.215f)
                // c 0 0 7.844 2.383 11.256 -13.975
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 7.844f,
                    dy2 = 2.383f,
                    dx3 = 11.256f,
                    dy3 = -13.975f,
                )
                // c 3.242 -15.54 5.134 -30.875 -4.712 -51.03
                curveToRelative(
                    dx1 = 3.242f,
                    dy1 = -15.54f,
                    dx2 = 5.134f,
                    dy2 = -30.875f,
                    dx3 = -4.712f,
                    dy3 = -51.03f,
                )
                // c 0 0 -20.316 22.967 -17.64 38.811
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -20.316f,
                    dy2 = 22.967f,
                    dx3 = -17.64f,
                    dy3 = 38.811f,
                )
                // C 460.06 340.866 468.48 351.215 468.48 351.215z
                curveTo(
                    x1 = 460.06f,
                    y1 = 340.866f,
                    x2 = 468.48f,
                    y2 = 351.215f,
                    x3 = 468.48f,
                    y3 = 351.215f,
                )
                close()
            }
            // M526.807 357.347 c0 0 6.052 4.14 -18.142 4.802 c-22.845 0.626 -21.321 2.122 -21.321 2.122 S507.431 350.991 526.807 357.347z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 526.807 357.347
                moveTo(x = 526.807f, y = 357.347f)
                // c 0 0 6.052 4.14 -18.142 4.802
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 6.052f,
                    dy2 = 4.14f,
                    dx3 = -18.142f,
                    dy3 = 4.802f,
                )
                // c -22.845 0.626 -21.321 2.122 -21.321 2.122
                curveToRelative(
                    dx1 = -22.845f,
                    dy1 = 0.626f,
                    dx2 = -21.321f,
                    dy2 = 2.122f,
                    dx3 = -21.321f,
                    dy3 = 2.122f,
                )
                // S 507.431 350.991 526.807 357.347z
                reflectiveCurveTo(
                    x1 = 507.431f,
                    y1 = 350.991f,
                    x2 = 526.807f,
                    y2 = 357.347f,
                )
                close()
            }
            // M472.984 362.147 c0 0 2.71 5.16 16.019 4.848 c13.309 -0.312 29.274 -12.996 37.805 -9.648  C526.807 357.347 505.922 348.353 472.984 362.147z
            path(
                fill = SolidColor(Color(0xFF7E9E6E)),
            ) {
                // M 472.984 362.147
                moveTo(x = 472.984f, y = 362.147f)
                // c 0 0 2.71 5.16 16.019 4.848
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 2.71f,
                    dy2 = 5.16f,
                    dx3 = 16.019f,
                    dy3 = 4.848f,
                )
                // c 13.309 -0.312 29.274 -12.996 37.805 -9.648
                curveToRelative(
                    dx1 = 13.309f,
                    dy1 = -0.312f,
                    dx2 = 29.274f,
                    dy2 = -12.996f,
                    dx3 = 37.805f,
                    dy3 = -9.648f,
                )
                // C 526.807 357.347 505.922 348.353 472.984 362.147z
                curveTo(
                    x1 = 526.807f,
                    y1 = 357.347f,
                    x2 = 505.922f,
                    y2 = 348.353f,
                    x3 = 472.984f,
                    y3 = 362.147f,
                )
                close()
            }
            // M438.111 431.667  c11.548 -22.037 23.027 -49.332 30.369 -80.452 c0 0 2.428 -8.098 6.067 -32.754 c3.639 -24.656 0.477 -32.251 0.477 -32.251
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineMiter = 10.0f,
            ) {
                // M 438.111 431.667
                moveTo(x = 438.111f, y = 431.667f)
                // c 11.548 -22.037 23.027 -49.332 30.369 -80.452
                curveToRelative(
                    dx1 = 11.548f,
                    dy1 = -22.037f,
                    dx2 = 23.027f,
                    dy2 = -49.332f,
                    dx3 = 30.369f,
                    dy3 = -80.452f,
                )
                // c 0 0 2.428 -8.098 6.067 -32.754
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 2.428f,
                    dy2 = -8.098f,
                    dx3 = 6.067f,
                    dy3 = -32.754f,
                )
                // c 3.639 -24.656 0.477 -32.251 0.477 -32.251
                curveToRelative(
                    dx1 = 3.639f,
                    dy1 = -24.656f,
                    dx2 = 0.477f,
                    dy2 = -32.251f,
                    dx3 = 0.477f,
                    dy3 = -32.251f,
                )
            }
            // M524.181 356.467  c0 0 -21.41 -6.803 -51.197 5.679 c-7.216 3.024 -9.264 7.799 -12.314 16.651
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineMiter = 10.0f,
            ) {
                // M 524.181 356.467
                moveTo(x = 524.181f, y = 356.467f)
                // c 0 0 -21.41 -6.803 -51.197 5.679
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -21.41f,
                    dy2 = -6.803f,
                    dx3 = -51.197f,
                    dy3 = 5.679f,
                )
                // c -7.216 3.024 -9.264 7.799 -12.314 16.651
                curveToRelative(
                    dx1 = -7.216f,
                    dy1 = 3.024f,
                    dx2 = -9.264f,
                    dy2 = 7.799f,
                    dx3 = -12.314f,
                    dy3 = 16.651f,
                )
            }
            // M251.612 232.331 c-5.57 0 -10.962 -1.954 -15.239 -5.523 l-11.865 -9.901  c-4.27 -3.563 -9.342 -5.472 -14.538 -5.472 h-58.887 c-5.344 0 -9.676 4.332 -9.676 9.676 v11.22 V434.3 c0 9.221 7.475 16.696 16.696 16.696  h293.551 c7.172 0 12.986 -5.814 12.986 -12.987 V245.318 c0 -7.172 -5.814 -12.986 -12.986 -12.986 H251.612z
            path(
                fill = SolidColor(Color(0xFF333969)),
            ) {
                // M 251.612 232.331
                moveTo(x = 251.612f, y = 232.331f)
                // c -5.57 0 -10.962 -1.954 -15.239 -5.523
                curveToRelative(
                    dx1 = -5.57f,
                    dy1 = 0.0f,
                    dx2 = -10.962f,
                    dy2 = -1.954f,
                    dx3 = -15.239f,
                    dy3 = -5.523f,
                )
                // l -11.865 -9.901
                lineToRelative(dx = -11.865f, dy = -9.901f)
                // c -4.27 -3.563 -9.342 -5.472 -14.538 -5.472
                curveToRelative(
                    dx1 = -4.27f,
                    dy1 = -3.563f,
                    dx2 = -9.342f,
                    dy2 = -5.472f,
                    dx3 = -14.538f,
                    dy3 = -5.472f,
                )
                // h -58.887
                horizontalLineToRelative(dx = -58.887f)
                // c -5.344 0 -9.676 4.332 -9.676 9.676
                curveToRelative(
                    dx1 = -5.344f,
                    dy1 = 0.0f,
                    dx2 = -9.676f,
                    dy2 = 4.332f,
                    dx3 = -9.676f,
                    dy3 = 9.676f,
                )
                // v 11.22
                verticalLineToRelative(dy = 11.22f)
                // V 434.3
                verticalLineTo(y = 434.3f)
                // c 0 9.221 7.475 16.696 16.696 16.696
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 9.221f,
                    dx2 = 7.475f,
                    dy2 = 16.696f,
                    dx3 = 16.696f,
                    dy3 = 16.696f,
                )
                // h 293.551
                horizontalLineToRelative(dx = 293.551f)
                // c 7.172 0 12.986 -5.814 12.986 -12.987
                curveToRelative(
                    dx1 = 7.172f,
                    dy1 = 0.0f,
                    dx2 = 12.986f,
                    dy2 = -5.814f,
                    dx3 = 12.986f,
                    dy3 = -12.987f,
                )
                // V 245.318
                verticalLineTo(y = 245.318f)
                // c 0 -7.172 -5.814 -12.986 -12.986 -12.986
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -7.172f,
                    dx2 = -5.814f,
                    dy2 = -12.986f,
                    dx3 = -12.986f,
                    dy3 = -12.986f,
                )
                // H 251.612z
                horizontalLineTo(x = 251.612f)
                close()
            }
            // M464.639 439.097 c0 0 -19.978 -37.474 -21.976 -41.778 l-54.599 -111.232  c-1.372 -2.956 -4.335 -4.847 -7.594 -4.847 H177.576 c-7.376 0 -18.044 -3.866 -23.708 -8.592 l-8.187 -6.832  c-4.27 -3.563 -9.342 -5.472 -14.538 -5.472 H75.102 c-5.965 0 -10.017 6.06 -7.738 11.572 l67.766 163.899  c3.799 9.187 12.76 15.179 22.701 15.179 h303.143 c1.976 0 3.801 -1.693 3.8 -3.669 L464.639 439.097z
            path(
                fill = SolidColor(Color(0xFF7584F1)),
            ) {
                // M 464.639 439.097
                moveTo(x = 464.639f, y = 439.097f)
                // c 0 0 -19.978 -37.474 -21.976 -41.778
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -19.978f,
                    dy2 = -37.474f,
                    dx3 = -21.976f,
                    dy3 = -41.778f,
                )
                // l -54.599 -111.232
                lineToRelative(dx = -54.599f, dy = -111.232f)
                // c -1.372 -2.956 -4.335 -4.847 -7.594 -4.847
                curveToRelative(
                    dx1 = -1.372f,
                    dy1 = -2.956f,
                    dx2 = -4.335f,
                    dy2 = -4.847f,
                    dx3 = -7.594f,
                    dy3 = -4.847f,
                )
                // H 177.576
                horizontalLineTo(x = 177.576f)
                // c -7.376 0 -18.044 -3.866 -23.708 -8.592
                curveToRelative(
                    dx1 = -7.376f,
                    dy1 = 0.0f,
                    dx2 = -18.044f,
                    dy2 = -3.866f,
                    dx3 = -23.708f,
                    dy3 = -8.592f,
                )
                // l -8.187 -6.832
                lineToRelative(dx = -8.187f, dy = -6.832f)
                // c -4.27 -3.563 -9.342 -5.472 -14.538 -5.472
                curveToRelative(
                    dx1 = -4.27f,
                    dy1 = -3.563f,
                    dx2 = -9.342f,
                    dy2 = -5.472f,
                    dx3 = -14.538f,
                    dy3 = -5.472f,
                )
                // H 75.102
                horizontalLineTo(x = 75.102f)
                // c -5.965 0 -10.017 6.06 -7.738 11.572
                curveToRelative(
                    dx1 = -5.965f,
                    dy1 = 0.0f,
                    dx2 = -10.017f,
                    dy2 = 6.06f,
                    dx3 = -7.738f,
                    dy3 = 11.572f,
                )
                // l 67.766 163.899
                lineToRelative(dx = 67.766f, dy = 163.899f)
                // c 3.799 9.187 12.76 15.179 22.701 15.179
                curveToRelative(
                    dx1 = 3.799f,
                    dy1 = 9.187f,
                    dx2 = 12.76f,
                    dy2 = 15.179f,
                    dx3 = 22.701f,
                    dy3 = 15.179f,
                )
                // h 303.143
                horizontalLineToRelative(dx = 303.143f)
                // c 1.976 0 3.801 -1.693 3.8 -3.669
                curveToRelative(
                    dx1 = 1.976f,
                    dy1 = 0.0f,
                    dx2 = 3.801f,
                    dy2 = -1.693f,
                    dx3 = 3.8f,
                    dy3 = -3.669f,
                )
                // L 464.639 439.097z
                lineTo(x = 464.639f, y = 439.097f)
                close()
            }
            // M349.099 318.656 h-69.013  c-1.882 0 -3.633 -0.947 -4.644 -2.51 v0 c-2.332 -3.608 0.3 -8.331 4.644 -8.331 h69.013 c1.882 0 3.633 0.947 4.644 2.51 l0 0  C356.075 313.934 353.443 318.656 349.099 318.656z
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
            ) {
                // M 349.099 318.656
                moveTo(x = 349.099f, y = 318.656f)
                // h -69.013
                horizontalLineToRelative(dx = -69.013f)
                // c -1.882 0 -3.633 -0.947 -4.644 -2.51
                curveToRelative(
                    dx1 = -1.882f,
                    dy1 = 0.0f,
                    dx2 = -3.633f,
                    dy2 = -0.947f,
                    dx3 = -4.644f,
                    dy3 = -2.51f,
                )
                // v 0
                verticalLineToRelative(dy = 0.0f)
                // c -2.332 -3.608 0.3 -8.331 4.644 -8.331
                curveToRelative(
                    dx1 = -2.332f,
                    dy1 = -3.608f,
                    dx2 = 0.3f,
                    dy2 = -8.331f,
                    dx3 = 4.644f,
                    dy3 = -8.331f,
                )
                // h 69.013
                horizontalLineToRelative(dx = 69.013f)
                // c 1.882 0 3.633 0.947 4.644 2.51
                curveToRelative(
                    dx1 = 1.882f,
                    dy1 = 0.0f,
                    dx2 = 3.633f,
                    dy2 = 0.947f,
                    dx3 = 4.644f,
                    dy3 = 2.51f,
                )
                // l 0 0
                lineToRelative(dx = 0.0f, dy = 0.0f)
                // C 356.075 313.934 353.443 318.656 349.099 318.656z
                curveTo(
                    x1 = 356.075f,
                    y1 = 313.934f,
                    x2 = 353.443f,
                    y2 = 318.656f,
                    x3 = 349.099f,
                    y3 = 318.656f,
                )
                close()
            }
            // <ellipse cx="246.202" cy="387.933" rx="30.525" ry="40.403" fill="none" style="fill:none;stroke:#000000;stroke-linecap:round;stroke-linejoin:round;stroke-miterlimit:10;" stroke="#000000" stroke-line-join="round" stroke-line-cap="round" stroke-miter-limit="10" />
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
            ) {
                // M 207.25296719999997 377.1437104
                moveTo(x = 207.25296719999997f, y = 377.1437104f)
                // A 40.402717178010136 30.524786324252144 15.462157701224882 1 0 285.13379 398.68659
                arcTo(
                    horizontalEllipseRadius = 40.402717178010136f,
                    verticalEllipseRadius = 30.524786324252144f,
                    theta = 15.462157701224882f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 285.13379f,
                    y1 = 398.68659f,
                )
                // A 40.402717178010136 30.524786324252144 15.462157701224882 1 0 207.25296719999997 377.1437104z
                arcTo(
                    horizontalEllipseRadius = 40.402717178010136f,
                    verticalEllipseRadius = 30.524786324252144f,
                    theta = 15.462157701224882f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 207.25296719999997f,
                    y1 = 377.1437104f,
                )
                close()
            }
            // M524.377 232.436 c1.289 -5.57 -4.638 -12.514 -10.249 -11.419 c-4.568 0.891 -6.842 1.986 -7.575 2.228  c-1.435 0.473 -12.143 -0.224 -13.369 1.56 c-0.888 1.292 4.698 2.784 8.271 3.139 c0.736 0.073 0.953 1.035 0.324 1.424  c-3.511 2.177 -10.501 6.602 -11.095 7.695 c-0.797 1.465 -4.428 7.162 -3.405 7.794 c1.023 0.633 4.117 -2.213 6.127 -4.233  c2.011 -2.02 7.886 -3.738 7.886 -3.738 s-10.215 10.253 -11.562 13.096 c-2.005 4.233 3.813 2.377 3.813 2.377  c-0.911 2.392 3.861 1.868 4.989 0.965 c2.228 -1.783 9.115 -10.093 9.135 -9.247 c0.02 0.847 -7.115 9.902 -6.392 12.017  c0.723 2.115 3.609 -0.539 5.278 -2.77 c1.67 -2.231 6.573 -8.467 6.573 -8.467 s5.57 -4.066 10.22 -11.089  C523.383 233.712 524.362 232.502 524.377 232.436z
            path(
                fill = SolidColor(Color(0xFFDB9C7F)),
            ) {
                // M 524.377 232.436
                moveTo(x = 524.377f, y = 232.436f)
                // c 1.289 -5.57 -4.638 -12.514 -10.249 -11.419
                curveToRelative(
                    dx1 = 1.289f,
                    dy1 = -5.57f,
                    dx2 = -4.638f,
                    dy2 = -12.514f,
                    dx3 = -10.249f,
                    dy3 = -11.419f,
                )
                // c -4.568 0.891 -6.842 1.986 -7.575 2.228
                curveToRelative(
                    dx1 = -4.568f,
                    dy1 = 0.891f,
                    dx2 = -6.842f,
                    dy2 = 1.986f,
                    dx3 = -7.575f,
                    dy3 = 2.228f,
                )
                // c -1.435 0.473 -12.143 -0.224 -13.369 1.56
                curveToRelative(
                    dx1 = -1.435f,
                    dy1 = 0.473f,
                    dx2 = -12.143f,
                    dy2 = -0.224f,
                    dx3 = -13.369f,
                    dy3 = 1.56f,
                )
                // c -0.888 1.292 4.698 2.784 8.271 3.139
                curveToRelative(
                    dx1 = -0.888f,
                    dy1 = 1.292f,
                    dx2 = 4.698f,
                    dy2 = 2.784f,
                    dx3 = 8.271f,
                    dy3 = 3.139f,
                )
                // c 0.736 0.073 0.953 1.035 0.324 1.424
                curveToRelative(
                    dx1 = 0.736f,
                    dy1 = 0.073f,
                    dx2 = 0.953f,
                    dy2 = 1.035f,
                    dx3 = 0.324f,
                    dy3 = 1.424f,
                )
                // c -3.511 2.177 -10.501 6.602 -11.095 7.695
                curveToRelative(
                    dx1 = -3.511f,
                    dy1 = 2.177f,
                    dx2 = -10.501f,
                    dy2 = 6.602f,
                    dx3 = -11.095f,
                    dy3 = 7.695f,
                )
                // c -0.797 1.465 -4.428 7.162 -3.405 7.794
                curveToRelative(
                    dx1 = -0.797f,
                    dy1 = 1.465f,
                    dx2 = -4.428f,
                    dy2 = 7.162f,
                    dx3 = -3.405f,
                    dy3 = 7.794f,
                )
                // c 1.023 0.633 4.117 -2.213 6.127 -4.233
                curveToRelative(
                    dx1 = 1.023f,
                    dy1 = 0.633f,
                    dx2 = 4.117f,
                    dy2 = -2.213f,
                    dx3 = 6.127f,
                    dy3 = -4.233f,
                )
                // c 2.011 -2.02 7.886 -3.738 7.886 -3.738
                curveToRelative(
                    dx1 = 2.011f,
                    dy1 = -2.02f,
                    dx2 = 7.886f,
                    dy2 = -3.738f,
                    dx3 = 7.886f,
                    dy3 = -3.738f,
                )
                // s -10.215 10.253 -11.562 13.096
                reflectiveCurveToRelative(
                    dx1 = -10.215f,
                    dy1 = 10.253f,
                    dx2 = -11.562f,
                    dy2 = 13.096f,
                )
                // c -2.005 4.233 3.813 2.377 3.813 2.377
                curveToRelative(
                    dx1 = -2.005f,
                    dy1 = 4.233f,
                    dx2 = 3.813f,
                    dy2 = 2.377f,
                    dx3 = 3.813f,
                    dy3 = 2.377f,
                )
                // c -0.911 2.392 3.861 1.868 4.989 0.965
                curveToRelative(
                    dx1 = -0.911f,
                    dy1 = 2.392f,
                    dx2 = 3.861f,
                    dy2 = 1.868f,
                    dx3 = 4.989f,
                    dy3 = 0.965f,
                )
                // c 2.228 -1.783 9.115 -10.093 9.135 -9.247
                curveToRelative(
                    dx1 = 2.228f,
                    dy1 = -1.783f,
                    dx2 = 9.115f,
                    dy2 = -10.093f,
                    dx3 = 9.135f,
                    dy3 = -9.247f,
                )
                // c 0.02 0.847 -7.115 9.902 -6.392 12.017
                curveToRelative(
                    dx1 = 0.02f,
                    dy1 = 0.847f,
                    dx2 = -7.115f,
                    dy2 = 9.902f,
                    dx3 = -6.392f,
                    dy3 = 12.017f,
                )
                // c 0.723 2.115 3.609 -0.539 5.278 -2.77
                curveToRelative(
                    dx1 = 0.723f,
                    dy1 = 2.115f,
                    dx2 = 3.609f,
                    dy2 = -0.539f,
                    dx3 = 5.278f,
                    dy3 = -2.77f,
                )
                // c 1.67 -2.231 6.573 -8.467 6.573 -8.467
                curveToRelative(
                    dx1 = 1.67f,
                    dy1 = -2.231f,
                    dx2 = 6.573f,
                    dy2 = -8.467f,
                    dx3 = 6.573f,
                    dy3 = -8.467f,
                )
                // s 5.57 -4.066 10.22 -11.089
                reflectiveCurveToRelative(
                    dx1 = 5.57f,
                    dy1 = -4.066f,
                    dx2 = 10.22f,
                    dy2 = -11.089f,
                )
                // C 523.383 233.712 524.362 232.502 524.377 232.436z
                curveTo(
                    x1 = 523.383f,
                    y1 = 233.712f,
                    x2 = 524.362f,
                    y2 = 232.502f,
                    x3 = 524.377f,
                    y3 = 232.436f,
                )
                close()
            }
            // M451.104 199.487 l35.062 -21.875 c0.217 -0.142 0.424 -0.299 0.62 -0.47 l11.562 -11.897  c2.517 -2.206 6.399 -1.692 8.255 1.093 l5.667 8.5 c1.2 1.8 1.242 4.134 0.107 5.976 l-8.138 13.203  c-0.599 0.972 -1.476 1.731 -2.525 2.181 c-6.547 2.804 -31.561 13.369 -46.481 17.584 c-3.705 1.047 -7.306 -1.969 -6.982 -5.806  l0.366 -4.321 C448.76 201.956 449.677 200.419 451.104 199.487z
            path(
                fill = SolidColor(Color(0xFF9EC68A)),
            ) {
                // M 451.104 199.487
                moveTo(x = 451.104f, y = 199.487f)
                // l 35.062 -21.875
                lineToRelative(dx = 35.062f, dy = -21.875f)
                // c 0.217 -0.142 0.424 -0.299 0.62 -0.47
                curveToRelative(
                    dx1 = 0.217f,
                    dy1 = -0.142f,
                    dx2 = 0.424f,
                    dy2 = -0.299f,
                    dx3 = 0.62f,
                    dy3 = -0.47f,
                )
                // l 11.562 -11.897
                lineToRelative(dx = 11.562f, dy = -11.897f)
                // c 2.517 -2.206 6.399 -1.692 8.255 1.093
                curveToRelative(
                    dx1 = 2.517f,
                    dy1 = -2.206f,
                    dx2 = 6.399f,
                    dy2 = -1.692f,
                    dx3 = 8.255f,
                    dy3 = 1.093f,
                )
                // l 5.667 8.5
                lineToRelative(dx = 5.667f, dy = 8.5f)
                // c 1.2 1.8 1.242 4.134 0.107 5.976
                curveToRelative(
                    dx1 = 1.2f,
                    dy1 = 1.8f,
                    dx2 = 1.242f,
                    dy2 = 4.134f,
                    dx3 = 0.107f,
                    dy3 = 5.976f,
                )
                // l -8.138 13.203
                lineToRelative(dx = -8.138f, dy = 13.203f)
                // c -0.599 0.972 -1.476 1.731 -2.525 2.181
                curveToRelative(
                    dx1 = -0.599f,
                    dy1 = 0.972f,
                    dx2 = -1.476f,
                    dy2 = 1.731f,
                    dx3 = -2.525f,
                    dy3 = 2.181f,
                )
                // c -6.547 2.804 -31.561 13.369 -46.481 17.584
                curveToRelative(
                    dx1 = -6.547f,
                    dy1 = 2.804f,
                    dx2 = -31.561f,
                    dy2 = 13.369f,
                    dx3 = -46.481f,
                    dy3 = 17.584f,
                )
                // c -3.705 1.047 -7.306 -1.969 -6.982 -5.806
                curveToRelative(
                    dx1 = -3.705f,
                    dy1 = 1.047f,
                    dx2 = -7.306f,
                    dy2 = -1.969f,
                    dx3 = -6.982f,
                    dy3 = -5.806f,
                )
                // l 0.366 -4.321
                lineToRelative(dx = 0.366f, dy = -4.321f)
                // C 448.76 201.956 449.677 200.419 451.104 199.487z
                curveTo(
                    x1 = 448.76f,
                    y1 = 201.956f,
                    x2 = 449.677f,
                    y2 = 200.419f,
                    x3 = 451.104f,
                    y3 = 199.487f,
                )
                close()
            }
            // M531.854 418.06 L530 430.656 c0 0 -34.743 13.346 -31.52 13.539 c3.223 0.193 53.151 -2.712 53.151 -2.712 l-2.938 -22.867  L531.854 418.06z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 531.854 418.06
                moveTo(x = 531.854f, y = 418.06f)
                // L 530 430.656
                lineTo(x = 530.0f, y = 430.656f)
                // c 0 0 -34.743 13.346 -31.52 13.539
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -34.743f,
                    dy2 = 13.346f,
                    dx3 = -31.52f,
                    dy3 = 13.539f,
                )
                // c 3.223 0.193 53.151 -2.712 53.151 -2.712
                curveToRelative(
                    dx1 = 3.223f,
                    dy1 = 0.193f,
                    dx2 = 53.151f,
                    dy2 = -2.712f,
                    dx3 = 53.151f,
                    dy3 = -2.712f,
                )
                // l -2.938 -22.867
                lineToRelative(dx = -2.938f, dy = -22.867f)
                // L 531.854 418.06z
                lineTo(x = 531.854f, y = 418.06f)
                close()
            }
            // M541.532 214.226 c0 0 2.769 26.648 4.845 28.032  c2.076 1.384 4.845 2.076 4.845 2.076 l-4.499 -30.454 L541.532 214.226z
            path(
                stroke = SolidColor(Color(0xFF424242)),
                strokeLineMiter = 10.0f,
            ) {
                // M 541.532 214.226
                moveTo(x = 541.532f, y = 214.226f)
                // c 0 0 2.769 26.648 4.845 28.032
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 2.769f,
                    dy2 = 26.648f,
                    dx3 = 4.845f,
                    dy3 = 28.032f,
                )
                // c 2.076 1.384 4.845 2.076 4.845 2.076
                curveToRelative(
                    dx1 = 2.076f,
                    dy1 = 1.384f,
                    dx2 = 4.845f,
                    dy2 = 2.076f,
                    dx3 = 4.845f,
                    dy3 = 2.076f,
                )
                // l -4.499 -30.454
                lineToRelative(dx = -4.499f, dy = -30.454f)
                // L 541.532 214.226z
                lineTo(x = 541.532f, y = 214.226f)
                close()
            }
            // M596.396 195.91 c0 0 14.082 28.676 9.994 44.653 l-78.062 -10.738 l1.629 -29.791 L596.396 195.91z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 596.396 195.91
                moveTo(x = 596.396f, y = 195.91f)
                // c 0 0 14.082 28.676 9.994 44.653
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 14.082f,
                    dy2 = 28.676f,
                    dx3 = 9.994f,
                    dy3 = 44.653f,
                )
                // l -78.062 -10.738
                lineToRelative(dx = -78.062f, dy = -10.738f)
                // l 1.629 -29.791
                lineToRelative(dx = 1.629f, dy = -29.791f)
                // L 596.396 195.91z
                lineTo(x = 596.396f, y = 195.91f)
                close()
            }
            // M598.54 201.719  c0 0 -11.034 20.433 -32.148 22.067
            path(
                stroke = SolidColor(Color(0xFF424242)),
                strokeLineCap = StrokeCap.Round,
                strokeLineMiter = 10.0f,
            ) {
                // M 598.54 201.719
                moveTo(x = 598.54f, y = 201.719f)
                // c 0 0 -11.034 20.433 -32.148 22.067
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -11.034f,
                    dy2 = 20.433f,
                    dx3 = -32.148f,
                    dy3 = 22.067f,
                )
            }
            // M580.877 219.427  c0 0 4.277 13.245 16.694 13.518
            path(
                stroke = SolidColor(Color(0xFF424242)),
                strokeLineCap = StrokeCap.Round,
                strokeLineMiter = 10.0f,
            ) {
                // M 580.877 219.427
                moveTo(x = 580.877f, y = 219.427f)
                // c 0 0 4.277 13.245 16.694 13.518
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 4.277f,
                    dy2 = 13.245f,
                    dx3 = 16.694f,
                    dy3 = 13.518f,
                )
            }
            // M528.328 229.825 c0 0 -20.914 74.457 -21.456 98.427 l15.281 92.343 c0 0 14.577 7.248 29.76 1.391  c0.622 -0.24 -7.697 -47.894 -8.282 -96.96 l43.644 -91.319 L528.328 229.825z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 528.328 229.825
                moveTo(x = 528.328f, y = 229.825f)
                // c 0 0 -20.914 74.457 -21.456 98.427
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -20.914f,
                    dy2 = 74.457f,
                    dx3 = -21.456f,
                    dy3 = 98.427f,
                )
                // l 15.281 92.343
                lineToRelative(dx = 15.281f, dy = 92.343f)
                // c 0 0 14.577 7.248 29.76 1.391
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 14.577f,
                    dy2 = 7.248f,
                    dx3 = 29.76f,
                    dy3 = 1.391f,
                )
                // c 0.622 -0.24 -7.697 -47.894 -8.282 -96.96
                curveToRelative(
                    dx1 = 0.622f,
                    dy1 = -0.24f,
                    dx2 = -7.697f,
                    dy2 = -47.894f,
                    dx3 = -8.282f,
                    dy3 = -96.96f,
                )
                // l 43.644 -91.319
                lineToRelative(dx = 43.644f, dy = -91.319f)
                // L 528.328 229.825z
                lineTo(x = 528.328f, y = 229.825f)
                close()
            }
            // M606.734 237.439 l-3.074 89.85 l34.377 93.935 c0 0 -14.385 12.153 -32.556 1.092 l-37.322 -89.444 l3.828 -65.081 l-16.265 -9.849  l-2.423 -28.187 L606.734 237.439z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 606.734 237.439
                moveTo(x = 606.734f, y = 237.439f)
                // l -3.074 89.85
                lineToRelative(dx = -3.074f, dy = 89.85f)
                // l 34.377 93.935
                lineToRelative(dx = 34.377f, dy = 93.935f)
                // c 0 0 -14.385 12.153 -32.556 1.092
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -14.385f,
                    dy2 = 12.153f,
                    dx3 = -32.556f,
                    dy3 = 1.092f,
                )
                // l -37.322 -89.444
                lineToRelative(dx = -37.322f, dy = -89.444f)
                // l 3.828 -65.081
                lineToRelative(dx = 3.828f, dy = -65.081f)
                // l -16.265 -9.849
                lineToRelative(dx = -16.265f, dy = -9.849f)
                // l -2.423 -28.187
                lineToRelative(dx = -2.423f, dy = -28.187f)
                // L 606.734 237.439z
                lineTo(x = 606.734f, y = 237.439f)
                close()
            }
            // <polygon points="546.324 221.017 562.896 233.503 586.653 206.98 528.945 215.224 543.066 233.949" fill="#FFFFFF" style="fill:#FFFFFF;" />
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 546.324 221.017
                moveTo(x = 546.324f, y = 221.017f)
                // L 562.896 233.503
                lineTo(x = 562.896f, y = 233.503f)
                // L 586.653 206.98
                lineTo(x = 586.653f, y = 206.98f)
                // L 528.945 215.224
                lineTo(x = 528.945f, y = 215.224f)
                // L 543.066 233.949z
                lineTo(x = 543.066f, y = 233.949f)
                close()
            }
            // M613.746 416.541 l-2.999 10.867 c0 0 -21.918 23.773 -18.688 23.773 c3.23 0 39.222 -14.716 39.222 -14.716 l-4.614 -22.641  L613.746 416.541z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 613.746 416.541
                moveTo(x = 613.746f, y = 416.541f)
                // l -2.999 10.867
                lineToRelative(dx = -2.999f, dy = 10.867f)
                // c 0 0 -21.918 23.773 -18.688 23.773
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -21.918f,
                    dy2 = 23.773f,
                    dx3 = -18.688f,
                    dy3 = 23.773f,
                )
                // c 3.23 0 39.222 -14.716 39.222 -14.716
                curveToRelative(
                    dx1 = 3.23f,
                    dy1 = 0.0f,
                    dx2 = 39.222f,
                    dy2 = -14.716f,
                    dx3 = 39.222f,
                    dy3 = -14.716f,
                )
                // l -4.614 -22.641
                lineToRelative(dx = -4.614f, dy = -22.641f)
                // L 613.746 416.541z
                lineTo(x = 613.746f, y = 416.541f)
                close()
            }
            // M593.591 208.62  c0 0 9.48 23.303 2.65 121.054 c0 0 23.943 52.695 36.358 94.374
            path(
                stroke = SolidColor(Color(0xFF424242)),
                strokeLineCap = StrokeCap.Round,
                strokeLineMiter = 10.0f,
            ) {
                // M 593.591 208.62
                moveTo(x = 593.591f, y = 208.62f)
                // c 0 0 9.48 23.303 2.65 121.054
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 9.48f,
                    dy2 = 23.303f,
                    dx3 = 2.65f,
                    dy3 = 121.054f,
                )
                // c 0 0 23.943 52.695 36.358 94.374
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 23.943f,
                    dy2 = 52.695f,
                    dx3 = 36.358f,
                    dy3 = 94.374f,
                )
            }
            // <polyline points="558.75 260.272 534.855 326.831 545.102 424.048" fill="none" style="fill:none;stroke:#424242;stroke-linecap:round;stroke-miterlimit:10;" stroke="#424242" stroke-line-cap="round" stroke-miter-limit="10" />
            path(
                stroke = SolidColor(Color(0xFF424242)),
                strokeLineCap = StrokeCap.Round,
                strokeLineMiter = 10.0f,
            ) {
                // M 558.75 260.272
                moveTo(x = 558.75f, y = 260.272f)
                // L 534.855 326.831
                lineTo(x = 534.855f, y = 326.831f)
                // L 545.102 424.048
                lineTo(x = 545.102f, y = 424.048f)
            }
            // M454.536 212.628 c0 0 0.464 2.331 -4.697 4.111 c-5.161 1.78 -8.198 1.215 -8.198 1.215  s-11.578 -13.656 -12.092 -14.138 c-0.514 -0.483 0.361 -5.734 3.786 -7.837 c2.08 -1.277 10.146 0.805 16.162 2.637  c4.194 1.277 6.782 5.478 6.077 9.805 C455.298 210.122 454.952 211.699 454.536 212.628z
            path(
                fill = SolidColor(Color(0xFFDB9C7F)),
            ) {
                // M 454.536 212.628
                moveTo(x = 454.536f, y = 212.628f)
                // c 0 0 0.464 2.331 -4.697 4.111
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 0.464f,
                    dy2 = 2.331f,
                    dx3 = -4.697f,
                    dy3 = 4.111f,
                )
                // c -5.161 1.78 -8.198 1.215 -8.198 1.215
                curveToRelative(
                    dx1 = -5.161f,
                    dy1 = 1.78f,
                    dx2 = -8.198f,
                    dy2 = 1.215f,
                    dx3 = -8.198f,
                    dy3 = 1.215f,
                )
                // s -11.578 -13.656 -12.092 -14.138
                reflectiveCurveToRelative(
                    dx1 = -11.578f,
                    dy1 = -13.656f,
                    dx2 = -12.092f,
                    dy2 = -14.138f,
                )
                // c -0.514 -0.483 0.361 -5.734 3.786 -7.837
                curveToRelative(
                    dx1 = -0.514f,
                    dy1 = -0.483f,
                    dx2 = 0.361f,
                    dy2 = -5.734f,
                    dx3 = 3.786f,
                    dy3 = -7.837f,
                )
                // c 2.08 -1.277 10.146 0.805 16.162 2.637
                curveToRelative(
                    dx1 = 2.08f,
                    dy1 = -1.277f,
                    dx2 = 10.146f,
                    dy2 = 0.805f,
                    dx3 = 16.162f,
                    dy3 = 2.637f,
                )
                // c 4.194 1.277 6.782 5.478 6.077 9.805
                curveToRelative(
                    dx1 = 4.194f,
                    dy1 = 1.277f,
                    dx2 = 6.782f,
                    dy2 = 5.478f,
                    dx3 = 6.077f,
                    dy3 = 9.805f,
                )
                // C 455.298 210.122 454.952 211.699 454.536 212.628z
                curveTo(
                    x1 = 455.298f,
                    y1 = 210.122f,
                    x2 = 454.952f,
                    y2 = 211.699f,
                    x3 = 454.536f,
                    y3 = 212.628f,
                )
                close()
            }
            // M445.04 209.004 c0 0 -9.466 -1.374 -13.466 -4.672 c0 0 -5.978 -1.205 -7.249 -0.451  c-1.27 0.754 -2.311 1.825 -5.06 2.289 c-2.749 0.464 -1.92 -1.367 0.968 -3.963 c0.825 -0.742 3.033 -3.409 4.947 -3.77  c2.577 -0.485 8.154 -2.458 8.154 -2.458 l11.19 13.378
            path(
                fill = SolidColor(Color(0xFFDB9C7F)),
            ) {
                // M 445.04 209.004
                moveTo(x = 445.04f, y = 209.004f)
                // c 0 0 -9.466 -1.374 -13.466 -4.672
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -9.466f,
                    dy2 = -1.374f,
                    dx3 = -13.466f,
                    dy3 = -4.672f,
                )
                // c 0 0 -5.978 -1.205 -7.249 -0.451
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -5.978f,
                    dy2 = -1.205f,
                    dx3 = -7.249f,
                    dy3 = -0.451f,
                )
                // c -1.27 0.754 -2.311 1.825 -5.06 2.289
                curveToRelative(
                    dx1 = -1.27f,
                    dy1 = 0.754f,
                    dx2 = -2.311f,
                    dy2 = 1.825f,
                    dx3 = -5.06f,
                    dy3 = 2.289f,
                )
                // c -2.749 0.464 -1.92 -1.367 0.968 -3.963
                curveToRelative(
                    dx1 = -2.749f,
                    dy1 = 0.464f,
                    dx2 = -1.92f,
                    dy2 = -1.367f,
                    dx3 = 0.968f,
                    dy3 = -3.963f,
                )
                // c 0.825 -0.742 3.033 -3.409 4.947 -3.77
                curveToRelative(
                    dx1 = 0.825f,
                    dy1 = -0.742f,
                    dx2 = 3.033f,
                    dy2 = -3.409f,
                    dx3 = 4.947f,
                    dy3 = -3.77f,
                )
                // c 2.577 -0.485 8.154 -2.458 8.154 -2.458
                curveToRelative(
                    dx1 = 2.577f,
                    dy1 = -0.485f,
                    dx2 = 8.154f,
                    dy2 = -2.458f,
                    dx3 = 8.154f,
                    dy3 = -2.458f,
                )
                // l 11.19 13.378
                lineToRelative(dx = 11.19f, dy = 13.378f)
            }
            // M441.641 217.954 c0 0 -3.838 2.408 -5.188 2.342 c-1.35 -0.065 -2.625 -0.87 -2.955 -3.088  c0 0 -7.148 1.312 -4.883 -4.097 c0 0 -4.318 -0.7 -4.433 -3.518 c0 0 -3.835 -1.911 -2.996 -4.974 c0.838 -3.064 12.871 -2.786 12.871 -2.786  l12.768 6.482 L441.641 217.954z
            path(
                fill = SolidColor(Color(0xFFDB9C7F)),
            ) {
                // M 441.641 217.954
                moveTo(x = 441.641f, y = 217.954f)
                // c 0 0 -3.838 2.408 -5.188 2.342
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -3.838f,
                    dy2 = 2.408f,
                    dx3 = -5.188f,
                    dy3 = 2.342f,
                )
                // c -1.35 -0.065 -2.625 -0.87 -2.955 -3.088
                curveToRelative(
                    dx1 = -1.35f,
                    dy1 = -0.065f,
                    dx2 = -2.625f,
                    dy2 = -0.87f,
                    dx3 = -2.955f,
                    dy3 = -3.088f,
                )
                // c 0 0 -7.148 1.312 -4.883 -4.097
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -7.148f,
                    dy2 = 1.312f,
                    dx3 = -4.883f,
                    dy3 = -4.097f,
                )
                // c 0 0 -4.318 -0.7 -4.433 -3.518
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -4.318f,
                    dy2 = -0.7f,
                    dx3 = -4.433f,
                    dy3 = -3.518f,
                )
                // c 0 0 -3.835 -1.911 -2.996 -4.974
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -3.835f,
                    dy2 = -1.911f,
                    dx3 = -2.996f,
                    dy3 = -4.974f,
                )
                // c 0.838 -3.064 12.871 -2.786 12.871 -2.786
                curveToRelative(
                    dx1 = 0.838f,
                    dy1 = -3.064f,
                    dx2 = 12.871f,
                    dy2 = -2.786f,
                    dx3 = 12.871f,
                    dy3 = -2.786f,
                )
                // l 12.768 6.482
                lineToRelative(dx = 12.768f, dy = 6.482f)
                // L 441.641 217.954z
                lineTo(x = 441.641f, y = 217.954f)
                close()
            }
            // M438.93 218.466 c0 0 3.646 -3.233 3.443 -4.53 c-0.203 -1.297 -0.888 -2.01 -1.716 -1.761 c-1.11 0.333 -5.337 3.556 -7.159 5.033
            path(
                stroke = SolidColor(Color(0xFF1A1C30)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 0.7799f,
            ) {
                // M 438.93 218.466
                moveTo(x = 438.93f, y = 218.466f)
                // c 0 0 3.646 -3.233 3.443 -4.53
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 3.646f,
                    dy2 = -3.233f,
                    dx3 = 3.443f,
                    dy3 = -4.53f,
                )
                // c -0.203 -1.297 -0.888 -2.01 -1.716 -1.761
                curveToRelative(
                    dx1 = -0.203f,
                    dy1 = -1.297f,
                    dx2 = -0.888f,
                    dy2 = -2.01f,
                    dx3 = -1.716f,
                    dy3 = -1.761f,
                )
                // c -1.11 0.333 -5.337 3.556 -7.159 5.033
                curveToRelative(
                    dx1 = -1.11f,
                    dy1 = 0.333f,
                    dx2 = -5.337f,
                    dy2 = 3.556f,
                    dx3 = -7.159f,
                    dy3 = 5.033f,
                )
            }
            // M428.615 213.111 c0 0 9.712 -1.516 9.802 -2.955 c0.09 -1.439 -0.589 -3.337 -2.617 -2.933 c-2.411 0.48 -9.324 2.136 -11.617 2.091
            path(
                stroke = SolidColor(Color(0xFF1A1C30)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 0.7799f,
            ) {
                // M 428.615 213.111
                moveTo(x = 428.615f, y = 213.111f)
                // c 0 0 9.712 -1.516 9.802 -2.955
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 9.712f,
                    dy2 = -1.516f,
                    dx3 = 9.802f,
                    dy3 = -2.955f,
                )
                // c 0.09 -1.439 -0.589 -3.337 -2.617 -2.933
                curveToRelative(
                    dx1 = 0.09f,
                    dy1 = -1.439f,
                    dx2 = -0.589f,
                    dy2 = -3.337f,
                    dx3 = -2.617f,
                    dy3 = -2.933f,
                )
                // c -2.411 0.48 -9.324 2.136 -11.617 2.091
                curveToRelative(
                    dx1 = -2.411f,
                    dy1 = 0.48f,
                    dx2 = -9.324f,
                    dy2 = 2.136f,
                    dx3 = -11.617f,
                    dy3 = 2.091f,
                )
            }
            // M440.657 212.175 c0 0 1.785 -1.108 1.079 -2.346 c-0.706 -1.238 -1.67 -1.673 -3.736 -1.136
            path(
                stroke = SolidColor(Color(0xFF1A1C30)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 0.7799f,
            ) {
                // M 440.657 212.175
                moveTo(x = 440.657f, y = 212.175f)
                // c 0 0 1.785 -1.108 1.079 -2.346
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 1.785f,
                    dy2 = -1.108f,
                    dx3 = 1.079f,
                    dy3 = -2.346f,
                )
                // c -0.706 -1.238 -1.67 -1.673 -3.736 -1.136
                curveToRelative(
                    dx1 = -0.706f,
                    dy1 = -1.238f,
                    dx2 = -1.67f,
                    dy2 = -1.673f,
                    dx3 = -3.736f,
                    dy3 = -1.136f,
                )
            }
            // M423.987 205.258 c0 0 0.531 -0.691 1.282 -1.397
            path(
                stroke = SolidColor(Color(0xFF1A1C30)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 0.7799f,
            ) {
                // M 423.987 205.258
                moveTo(x = 423.987f, y = 205.258f)
                // c 0 0 0.531 -0.691 1.282 -1.397
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 0.531f,
                    dy2 = -0.691f,
                    dx3 = 1.282f,
                    dy3 = -1.397f,
                )
            }
            // M445.048 223.266 l-0.167 0.094 c-1.308 0.736 -2.965 0.272 -3.7 -1.036 l-25.248 -44.894 l4.903 -2.757  l25.248 44.894 C446.82 220.874 446.356 222.53 445.048 223.266z
            path(
                fill = SolidColor(Color(0xFF333969)),
            ) {
                // M 445.048 223.266
                moveTo(x = 445.048f, y = 223.266f)
                // l -0.167 0.094
                lineToRelative(dx = -0.167f, dy = 0.094f)
                // c -1.308 0.736 -2.965 0.272 -3.7 -1.036
                curveToRelative(
                    dx1 = -1.308f,
                    dy1 = 0.736f,
                    dx2 = -2.965f,
                    dy2 = 0.272f,
                    dx3 = -3.7f,
                    dy3 = -1.036f,
                )
                // l -25.248 -44.894
                lineToRelative(dx = -25.248f, dy = -44.894f)
                // l 4.903 -2.757
                lineToRelative(dx = 4.903f, dy = -2.757f)
                // l 25.248 44.894
                lineToRelative(dx = 25.248f, dy = 44.894f)
                // C 446.82 220.874 446.356 222.53 445.048 223.266z
                curveTo(
                    x1 = 446.82f,
                    y1 = 220.874f,
                    x2 = 446.356f,
                    y2 = 222.53f,
                    x3 = 445.048f,
                    y3 = 223.266f,
                )
                close()
            }
            // M428.414 184.645 l2.119 3.768 c0.575 1.022 0.315 2.259 -0.581 2.762 l-4.578 2.575  c-0.896 0.504 -2.087 0.083 -2.662 -0.938 l-2.211 -3.931
            path(
                fill = SolidColor(Color(0xFF333969)),
            ) {
                // M 428.414 184.645
                moveTo(x = 428.414f, y = 184.645f)
                // l 2.119 3.768
                lineToRelative(dx = 2.119f, dy = 3.768f)
                // c 0.575 1.022 0.315 2.259 -0.581 2.762
                curveToRelative(
                    dx1 = 0.575f,
                    dy1 = 1.022f,
                    dx2 = 0.315f,
                    dy2 = 2.259f,
                    dx3 = -0.581f,
                    dy3 = 2.762f,
                )
                // l -4.578 2.575
                lineToRelative(dx = -4.578f, dy = 2.575f)
                // c -0.896 0.504 -2.087 0.083 -2.662 -0.938
                curveToRelative(
                    dx1 = -0.896f,
                    dy1 = 0.504f,
                    dx2 = -2.087f,
                    dy2 = 0.083f,
                    dx3 = -2.662f,
                    dy3 = -0.938f,
                )
                // l -2.211 -3.931
                lineToRelative(dx = -2.211f, dy = -3.931f)
            }
            // M418.618 147.775 c-8.758 -16.247 -19.736 -27.431 -26.713 -27.954 l0.231 -1.543 l-3.646 2.377  c-6.266 4.267 -2.936 23.328 7.438 42.573 c10.374 19.245 23.863 31.387 30.129 27.12 l3.428 -2.285 l-0.987 -1.321  C430.909 179.287 427.146 163.597 418.618 147.775z
            path(
                fill = SolidColor(Color(0xFF333969)),
            ) {
                // M 418.618 147.775
                moveTo(x = 418.618f, y = 147.775f)
                // c -8.758 -16.247 -19.736 -27.431 -26.713 -27.954
                curveToRelative(
                    dx1 = -8.758f,
                    dy1 = -16.247f,
                    dx2 = -19.736f,
                    dy2 = -27.431f,
                    dx3 = -26.713f,
                    dy3 = -27.954f,
                )
                // l 0.231 -1.543
                lineToRelative(dx = 0.231f, dy = -1.543f)
                // l -3.646 2.377
                lineToRelative(dx = -3.646f, dy = 2.377f)
                // c -6.266 4.267 -2.936 23.328 7.438 42.573
                curveToRelative(
                    dx1 = -6.266f,
                    dy1 = 4.267f,
                    dx2 = -2.936f,
                    dy2 = 23.328f,
                    dx3 = 7.438f,
                    dy3 = 42.573f,
                )
                // c 10.374 19.245 23.863 31.387 30.129 27.12
                curveToRelative(
                    dx1 = 10.374f,
                    dy1 = 19.245f,
                    dx2 = 23.863f,
                    dy2 = 31.387f,
                    dx3 = 30.129f,
                    dy3 = 27.12f,
                )
                // l 3.428 -2.285
                lineToRelative(dx = 3.428f, dy = -2.285f)
                // l -0.987 -1.321
                lineToRelative(dx = -0.987f, dy = -1.321f)
                // C 430.909 179.287 427.146 163.597 418.618 147.775z
                curveTo(
                    x1 = 430.909f,
                    y1 = 179.287f,
                    x2 = 427.146f,
                    y2 = 163.597f,
                    x3 = 418.618f,
                    y3 = 147.775f,
                )
                close()
            }
            // <ellipse cx="410.919" cy="153.124" rx="13.643" ry="39.616" fill="#7584F1" style="fill:#7584F1;" />
            path(
                fill = SolidColor(Color(0xFF7584F1)),
            ) {
                // M 392.602216 117.99862449999999
                moveTo(x = 392.602216f, y = 117.99862449999999f)
                // A 39.6150224631395 13.642663354821593 62.4765633963277 1 0 429.2153232 188.26156210000002
                arcTo(
                    horizontalEllipseRadius = 39.6150224631395f,
                    verticalEllipseRadius = 13.642663354821593f,
                    theta = 62.4765633963277f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 429.2153232f,
                    y1 = 188.26156210000002f,
                )
                // A 39.6150224631395 13.642663354821593 62.4765633963277 1 0 392.602216 117.99862449999999z
                arcTo(
                    horizontalEllipseRadius = 39.6150224631395f,
                    verticalEllipseRadius = 13.642663354821593f,
                    theta = 62.4765633963277f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    x1 = 392.602216f,
                    y1 = 117.99862449999999f,
                )
                close()
            }
            // M418.802 147.756 c8.443 15.663 11.757 30.763 7.404 33.728  c-4.354 2.965 -14.727 -7.328 -23.17 -22.991 c-8.443 -15.663 -11.757 -30.763 -7.404 -33.728  C399.986 121.8 410.359 132.093 418.802 147.756z
            path(
                fill = SolidColor(Color(0xFFD3DDF7)),
            ) {
                // M 418.802 147.756
                moveTo(x = 418.802f, y = 147.756f)
                // c 8.443 15.663 11.757 30.763 7.404 33.728
                curveToRelative(
                    dx1 = 8.443f,
                    dy1 = 15.663f,
                    dx2 = 11.757f,
                    dy2 = 30.763f,
                    dx3 = 7.404f,
                    dy3 = 33.728f,
                )
                // c -4.354 2.965 -14.727 -7.328 -23.17 -22.991
                curveToRelative(
                    dx1 = -4.354f,
                    dy1 = 2.965f,
                    dx2 = -14.727f,
                    dy2 = -7.328f,
                    dx3 = -23.17f,
                    dy3 = -22.991f,
                )
                // c -8.443 -15.663 -11.757 -30.763 -7.404 -33.728
                curveToRelative(
                    dx1 = -8.443f,
                    dy1 = -15.663f,
                    dx2 = -11.757f,
                    dy2 = -30.763f,
                    dx3 = -7.404f,
                    dy3 = -33.728f,
                )
                // C 399.986 121.8 410.359 132.093 418.802 147.756z
                curveTo(
                    x1 = 399.986f,
                    y1 = 121.8f,
                    x2 = 410.359f,
                    y2 = 132.093f,
                    x3 = 418.802f,
                    y3 = 147.756f,
                )
                close()
            }
            // M445.04 209.004 c0 0 -9.466 -1.374 -13.466 -4.672 c0 0 -5.978 -1.205 -7.249 -0.451  c-1.27 0.754 -2.311 1.825 -5.06 2.289 c-2.749 0.464 -1.92 -1.367 0.968 -3.963 c0.825 -0.742 3.033 -3.409 4.947 -3.77  c2.577 -0.485 8.154 -2.458 8.154 -2.458 l11.19 13.378
            path(
                fill = SolidColor(Color(0xFFDB9C7F)),
            ) {
                // M 445.04 209.004
                moveTo(x = 445.04f, y = 209.004f)
                // c 0 0 -9.466 -1.374 -13.466 -4.672
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -9.466f,
                    dy2 = -1.374f,
                    dx3 = -13.466f,
                    dy3 = -4.672f,
                )
                // c 0 0 -5.978 -1.205 -7.249 -0.451
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -5.978f,
                    dy2 = -1.205f,
                    dx3 = -7.249f,
                    dy3 = -0.451f,
                )
                // c -1.27 0.754 -2.311 1.825 -5.06 2.289
                curveToRelative(
                    dx1 = -1.27f,
                    dy1 = 0.754f,
                    dx2 = -2.311f,
                    dy2 = 1.825f,
                    dx3 = -5.06f,
                    dy3 = 2.289f,
                )
                // c -2.749 0.464 -1.92 -1.367 0.968 -3.963
                curveToRelative(
                    dx1 = -2.749f,
                    dy1 = 0.464f,
                    dx2 = -1.92f,
                    dy2 = -1.367f,
                    dx3 = 0.968f,
                    dy3 = -3.963f,
                )
                // c 0.825 -0.742 3.033 -3.409 4.947 -3.77
                curveToRelative(
                    dx1 = 0.825f,
                    dy1 = -0.742f,
                    dx2 = 3.033f,
                    dy2 = -3.409f,
                    dx3 = 4.947f,
                    dy3 = -3.77f,
                )
                // c 2.577 -0.485 8.154 -2.458 8.154 -2.458
                curveToRelative(
                    dx1 = 2.577f,
                    dy1 = -0.485f,
                    dx2 = 8.154f,
                    dy2 = -2.458f,
                    dx3 = 8.154f,
                    dy3 = -2.458f,
                )
                // l 11.19 13.378
                lineToRelative(dx = 11.19f, dy = 13.378f)
            }
            // M445.04 209.004 c0 0 -9.466 -1.374 -13.466 -4.672 c0 0 -5.978 -1.205 -7.249 -0.451 c-1.27 0.754 -2.311 1.825 -5.06 2.289
            path(
                stroke = SolidColor(Color(0xFF1A1C30)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 0.7799f,
            ) {
                // M 445.04 209.004
                moveTo(x = 445.04f, y = 209.004f)
                // c 0 0 -9.466 -1.374 -13.466 -4.672
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -9.466f,
                    dy2 = -1.374f,
                    dx3 = -13.466f,
                    dy3 = -4.672f,
                )
                // c 0 0 -5.978 -1.205 -7.249 -0.451
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -5.978f,
                    dy2 = -1.205f,
                    dx3 = -7.249f,
                    dy3 = -0.451f,
                )
                // c -1.27 0.754 -2.311 1.825 -5.06 2.289
                curveToRelative(
                    dx1 = -1.27f,
                    dy1 = 0.754f,
                    dx2 = -2.311f,
                    dy2 = 1.825f,
                    dx3 = -5.06f,
                    dy3 = 2.289f,
                )
            }
            // M418.802 147.756 c-8.443 -15.663 -18.816 -25.956 -23.17 -22.991 c-0.344 0.234 -0.634 0.552 -0.884 0.932  c5.033 0.306 13.836 9.863 21.18 23.487 c7.776 14.426 11.196 28.366 8.287 32.796 c0.753 0.046 1.423 -0.111 1.989 -0.496  C430.559 178.519 427.244 163.418 418.802 147.756z
            path(
                fill = SolidColor(Color(0xFF333969)),
            ) {
                // M 418.802 147.756
                moveTo(x = 418.802f, y = 147.756f)
                // c -8.443 -15.663 -18.816 -25.956 -23.17 -22.991
                curveToRelative(
                    dx1 = -8.443f,
                    dy1 = -15.663f,
                    dx2 = -18.816f,
                    dy2 = -25.956f,
                    dx3 = -23.17f,
                    dy3 = -22.991f,
                )
                // c -0.344 0.234 -0.634 0.552 -0.884 0.932
                curveToRelative(
                    dx1 = -0.344f,
                    dy1 = 0.234f,
                    dx2 = -0.634f,
                    dy2 = 0.552f,
                    dx3 = -0.884f,
                    dy3 = 0.932f,
                )
                // c 5.033 0.306 13.836 9.863 21.18 23.487
                curveToRelative(
                    dx1 = 5.033f,
                    dy1 = 0.306f,
                    dx2 = 13.836f,
                    dy2 = 9.863f,
                    dx3 = 21.18f,
                    dy3 = 23.487f,
                )
                // c 7.776 14.426 11.196 28.366 8.287 32.796
                curveToRelative(
                    dx1 = 7.776f,
                    dy1 = 14.426f,
                    dx2 = 11.196f,
                    dy2 = 28.366f,
                    dx3 = 8.287f,
                    dy3 = 32.796f,
                )
                // c 0.753 0.046 1.423 -0.111 1.989 -0.496
                curveToRelative(
                    dx1 = 0.753f,
                    dy1 = 0.046f,
                    dx2 = 1.423f,
                    dy2 = -0.111f,
                    dx3 = 1.989f,
                    dy3 = -0.496f,
                )
                // C 430.559 178.519 427.244 163.418 418.802 147.756z
                curveTo(
                    x1 = 430.559f,
                    y1 = 178.519f,
                    x2 = 427.244f,
                    y2 = 163.418f,
                    x3 = 418.802f,
                    y3 = 147.756f,
                )
                close()
            }
            // M412.924 141.617 c4.491 8.332 6.254 16.365 3.938 17.942 c-2.316 1.577 -7.834 -3.898 -12.325 -12.23  c-4.491 -8.332 -6.254 -16.365 -3.938 -17.942 C402.914 127.81 408.433 133.285 412.924 141.617z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 412.924 141.617
                moveTo(x = 412.924f, y = 141.617f)
                // c 4.491 8.332 6.254 16.365 3.938 17.942
                curveToRelative(
                    dx1 = 4.491f,
                    dy1 = 8.332f,
                    dx2 = 6.254f,
                    dy2 = 16.365f,
                    dx3 = 3.938f,
                    dy3 = 17.942f,
                )
                // c -2.316 1.577 -7.834 -3.898 -12.325 -12.23
                curveToRelative(
                    dx1 = -2.316f,
                    dy1 = 1.577f,
                    dx2 = -7.834f,
                    dy2 = -3.898f,
                    dx3 = -12.325f,
                    dy3 = -12.23f,
                )
                // c -4.491 -8.332 -6.254 -16.365 -3.938 -17.942
                curveToRelative(
                    dx1 = -4.491f,
                    dy1 = -8.332f,
                    dx2 = -6.254f,
                    dy2 = -16.365f,
                    dx3 = -3.938f,
                    dy3 = -17.942f,
                )
                // C 402.914 127.81 408.433 133.285 412.924 141.617z
                curveTo(
                    x1 = 402.914f,
                    y1 = 127.81f,
                    x2 = 408.433f,
                    y2 = 133.285f,
                    x3 = 412.924f,
                    y3 = 141.617f,
                )
                close()
            }
            // M580.859 168.434 l-6.965 -24.852 c-2.557 -9.123 -7.038 -17.565 -12.96 -24.961  c-10.489 -13.102 -38.041 -11.91 -38.041 -11.91 l-21.198 15.253 c-0.065 0.035 -0.13 0.071 -0.195 0.107  c-12.481 6.887 -14.774 17.511 -14.446 33.886 l0.773 22.111 l14.35 -13.704 l3.622 4.966 c-0.016 -0.143 -0.03 -0.276 -0.042 -0.405  l1.715 2.7 l-1.673 -2.294 c0.508 4.562 2.887 16.18 13.947 21.608 l6.301 9.915 l-1.671 13.703  c59.135 21.504 73.862 -20.721 73.862 -20.721 L580.859 168.434z
            path(
                fill = SolidColor(Color(0xFF9EC68A)),
            ) {
                // M 580.859 168.434
                moveTo(x = 580.859f, y = 168.434f)
                // l -6.965 -24.852
                lineToRelative(dx = -6.965f, dy = -24.852f)
                // c -2.557 -9.123 -7.038 -17.565 -12.96 -24.961
                curveToRelative(
                    dx1 = -2.557f,
                    dy1 = -9.123f,
                    dx2 = -7.038f,
                    dy2 = -17.565f,
                    dx3 = -12.96f,
                    dy3 = -24.961f,
                )
                // c -10.489 -13.102 -38.041 -11.91 -38.041 -11.91
                curveToRelative(
                    dx1 = -10.489f,
                    dy1 = -13.102f,
                    dx2 = -38.041f,
                    dy2 = -11.91f,
                    dx3 = -38.041f,
                    dy3 = -11.91f,
                )
                // l -21.198 15.253
                lineToRelative(dx = -21.198f, dy = 15.253f)
                // c -0.065 0.035 -0.13 0.071 -0.195 0.107
                curveToRelative(
                    dx1 = -0.065f,
                    dy1 = 0.035f,
                    dx2 = -0.13f,
                    dy2 = 0.071f,
                    dx3 = -0.195f,
                    dy3 = 0.107f,
                )
                // c -12.481 6.887 -14.774 17.511 -14.446 33.886
                curveToRelative(
                    dx1 = -12.481f,
                    dy1 = 6.887f,
                    dx2 = -14.774f,
                    dy2 = 17.511f,
                    dx3 = -14.446f,
                    dy3 = 33.886f,
                )
                // l 0.773 22.111
                lineToRelative(dx = 0.773f, dy = 22.111f)
                // l 14.35 -13.704
                lineToRelative(dx = 14.35f, dy = -13.704f)
                // l 3.622 4.966
                lineToRelative(dx = 3.622f, dy = 4.966f)
                // c -0.016 -0.143 -0.03 -0.276 -0.042 -0.405
                curveToRelative(
                    dx1 = -0.016f,
                    dy1 = -0.143f,
                    dx2 = -0.03f,
                    dy2 = -0.276f,
                    dx3 = -0.042f,
                    dy3 = -0.405f,
                )
                // l 1.715 2.7
                lineToRelative(dx = 1.715f, dy = 2.7f)
                // l -1.673 -2.294
                lineToRelative(dx = -1.673f, dy = -2.294f)
                // c 0.508 4.562 2.887 16.18 13.947 21.608
                curveToRelative(
                    dx1 = 0.508f,
                    dy1 = 4.562f,
                    dx2 = 2.887f,
                    dy2 = 16.18f,
                    dx3 = 13.947f,
                    dy3 = 21.608f,
                )
                // l 6.301 9.915
                lineToRelative(dx = 6.301f, dy = 9.915f)
                // l -1.671 13.703
                lineToRelative(dx = -1.671f, dy = 13.703f)
                // c 59.135 21.504 73.862 -20.721 73.862 -20.721
                curveToRelative(
                    dx1 = 59.135f,
                    dy1 = 21.504f,
                    dx2 = 73.862f,
                    dy2 = -20.721f,
                    dx3 = 73.862f,
                    dy3 = -20.721f,
                )
                // L 580.859 168.434z
                lineTo(x = 580.859f, y = 168.434f)
                close()
            }
            // M499.144 162.084 l7.743 9.469  c0 0 -1.058 14.594 13.647 19.273
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineMiter = 10.0f,
            ) {
                // M 499.144 162.084
                moveTo(x = 499.144f, y = 162.084f)
                // l 7.743 9.469
                lineToRelative(dx = 7.743f, dy = 9.469f)
                // c 0 0 -1.058 14.594 13.647 19.273
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -1.058f,
                    dy2 = 14.594f,
                    dx3 = 13.647f,
                    dy3 = 19.273f,
                )
            }
            // M557.91 181.357 l-45.008 39.215 c0 0 8.912 12.477 12.923 12.923 l53.92 -34.313
            path(
                fill = SolidColor(Color(0xFF9EC68A)),
            ) {
                // M 557.91 181.357
                moveTo(x = 557.91f, y = 181.357f)
                // l -45.008 39.215
                lineToRelative(dx = -45.008f, dy = 39.215f)
                // c 0 0 8.912 12.477 12.923 12.923
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 8.912f,
                    dy2 = 12.477f,
                    dx3 = 12.923f,
                    dy3 = 12.923f,
                )
                // l 53.92 -34.313
                lineToRelative(dx = 53.92f, dy = -34.313f)
            }
            // M526.271 208.54  c0 0 24.509 -27.629 32.976 -31.639
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineMiter = 10.0f,
            ) {
                // M 526.271 208.54
                moveTo(x = 526.271f, y = 208.54f)
                // c 0 0 24.509 -27.629 32.976 -31.639
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 24.509f,
                    dy2 = -27.629f,
                    dx3 = 32.976f,
                    dy3 = -31.639f,
                )
            }
            // M546.268 151.556  c0 0 1.17 6.183 9.024 27.907
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineMiter = 10.0f,
            ) {
                // M 546.268 151.556
                moveTo(x = 546.268f, y = 151.556f)
                // c 0 0 1.17 6.183 9.024 27.907
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 1.17f,
                    dy2 = 6.183f,
                    dx3 = 9.024f,
                    dy3 = 27.907f,
                )
            }
            // M532.064 229.93  c0 0 50.355 -32.085 50.801 -41.443 c0.446 -9.358 -12.7 -52.806 -12.7 -52.806
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineMiter = 10.0f,
            ) {
                // M 532.064 229.93
                moveTo(x = 532.064f, y = 229.93f)
                // c 0 0 50.355 -32.085 50.801 -41.443
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 50.355f,
                    dy2 = -32.085f,
                    dx3 = 50.801f,
                    dy3 = -41.443f,
                )
                // c 0.446 -9.358 -12.7 -52.806 -12.7 -52.806
                curveToRelative(
                    dx1 = 0.446f,
                    dy1 = -9.358f,
                    dx2 = -12.7f,
                    dy2 = -52.806f,
                    dx3 = -12.7f,
                    dy3 = -52.806f,
                )
            }
            // M537.578 184.476  c0 0 12.12 1.141 15.875 -9.859
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineMiter = 10.0f,
            ) {
                // M 537.578 184.476
                moveTo(x = 537.578f, y = 184.476f)
                // c 0 0 12.12 1.141 15.875 -9.859
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 12.12f,
                    dy2 = 1.141f,
                    dx3 = 15.875f,
                    dy3 = -9.859f,
                )
            }
            // M488.497 176.285  c0 0 3.342 -3.342 6.684 0.446
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineMiter = 10.0f,
            ) {
                // M 488.497 176.285
                moveTo(x = 488.497f, y = 176.285f)
                // c 0 0 3.342 -3.342 6.684 0.446
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 3.342f,
                    dy2 = -3.342f,
                    dx3 = 6.684f,
                    dy3 = 0.446f,
                )
            }
            // M448.844 198.346 l7.13 -3.342 c0 0 8.69 9.469 5.57 17.602 l-8.69 2.562  C452.855 215.169 456.865 206.256 448.844 198.346z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 448.844 198.346
                moveTo(x = 448.844f, y = 198.346f)
                // l 7.13 -3.342
                lineToRelative(dx = 7.13f, dy = -3.342f)
                // c 0 0 8.69 9.469 5.57 17.602
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 8.69f,
                    dy2 = 9.469f,
                    dx3 = 5.57f,
                    dy3 = 17.602f,
                )
                // l -8.69 2.562
                lineToRelative(dx = -8.69f, dy = 2.562f)
                // C 452.855 215.169 456.865 206.256 448.844 198.346z
                curveTo(
                    x1 = 452.855f,
                    y1 = 215.169f,
                    x2 = 456.865f,
                    y2 = 206.256f,
                    x3 = 448.844f,
                    y3 = 198.346f,
                )
                close()
            }
            // M515.743 215.558 c0 0 9.358 4.011 16.042 15.541 l-7.186 5.515 c0 0 -8.857 -12.7 -15.04 -14.706  L515.743 215.558z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 515.743 215.558
                moveTo(x = 515.743f, y = 215.558f)
                // c 0 0 9.358 4.011 16.042 15.541
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 9.358f,
                    dy2 = 4.011f,
                    dx3 = 16.042f,
                    dy3 = 15.541f,
                )
                // l -7.186 5.515
                lineToRelative(dx = -7.186f, dy = 5.515f)
                // c 0 0 -8.857 -12.7 -15.04 -14.706
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -8.857f,
                    dy2 = -12.7f,
                    dx3 = -15.04f,
                    dy3 = -14.706f,
                )
                // L 515.743 215.558z
                lineTo(x = 515.743f, y = 215.558f)
                close()
            }
            // M507.889 105.267 l29.522 2.172 c0 0 1.119 16.239 -16.709 30.56 l-8.006 -7.779 l-4.362 9.471  c0 0 -6.775 -3.811 -7.688 -14.75 l1.439 -13.281 L507.889 105.267z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 507.889 105.267
                moveTo(x = 507.889f, y = 105.267f)
                // l 29.522 2.172
                lineToRelative(dx = 29.522f, dy = 2.172f)
                // c 0 0 1.119 16.239 -16.709 30.56
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 1.119f,
                    dy2 = 16.239f,
                    dx3 = -16.709f,
                    dy3 = 30.56f,
                )
                // l -8.006 -7.779
                lineToRelative(dx = -8.006f, dy = -7.779f)
                // l -4.362 9.471
                lineToRelative(dx = -4.362f, dy = 9.471f)
                // c 0 0 -6.775 -3.811 -7.688 -14.75
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -6.775f,
                    dy2 = -3.811f,
                    dx3 = -7.688f,
                    dy3 = -14.75f,
                )
                // l 1.439 -13.281
                lineToRelative(dx = 1.439f, dy = -13.281f)
                // L 507.889 105.267z
                lineTo(x = 507.889f, y = 105.267f)
                close()
            }
            // M522.894 106.71 c1.077 0.918 1.588 2.332 1.338 3.725 c-0.948 5.285 -3.814 18.077 -9.56 19.684  c-7.267 2.033 -11.799 -12.318 -11.799 -12.318 l3.623 -25.067 L522.894 106.71z
            path(
                fill = SolidColor(Color(0xFFDB9C7F)),
            ) {
                // M 522.894 106.71
                moveTo(x = 522.894f, y = 106.71f)
                // c 1.077 0.918 1.588 2.332 1.338 3.725
                curveToRelative(
                    dx1 = 1.077f,
                    dy1 = 0.918f,
                    dx2 = 1.588f,
                    dy2 = 2.332f,
                    dx3 = 1.338f,
                    dy3 = 3.725f,
                )
                // c -0.948 5.285 -3.814 18.077 -9.56 19.684
                curveToRelative(
                    dx1 = -0.948f,
                    dy1 = 5.285f,
                    dx2 = -3.814f,
                    dy2 = 18.077f,
                    dx3 = -9.56f,
                    dy3 = 19.684f,
                )
                // c -7.267 2.033 -11.799 -12.318 -11.799 -12.318
                curveToRelative(
                    dx1 = -7.267f,
                    dy1 = 2.033f,
                    dx2 = -11.799f,
                    dy2 = -12.318f,
                    dx3 = -11.799f,
                    dy3 = -12.318f,
                )
                // l 3.623 -25.067
                lineToRelative(dx = 3.623f, dy = -25.067f)
                // L 522.894 106.71z
                lineTo(x = 522.894f, y = 106.71f)
                close()
            }
            // M499.873 112.654 l-0.089 3.65 c-0.068 0.037 -1.309 10.812 2.312 11.227 c15.134 -2.736 16.086 -17.085 17.381 -31.325  C519.477 96.207 498.404 109.811 499.873 112.654z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 499.873 112.654
                moveTo(x = 499.873f, y = 112.654f)
                // l -0.089 3.65
                lineToRelative(dx = -0.089f, dy = 3.65f)
                // c -0.068 0.037 -1.309 10.812 2.312 11.227
                curveToRelative(
                    dx1 = -0.068f,
                    dy1 = 0.037f,
                    dx2 = -1.309f,
                    dy2 = 10.812f,
                    dx3 = 2.312f,
                    dy3 = 11.227f,
                )
                // c 15.134 -2.736 16.086 -17.085 17.381 -31.325
                curveToRelative(
                    dx1 = 15.134f,
                    dy1 = -2.736f,
                    dx2 = 16.086f,
                    dy2 = -17.085f,
                    dx3 = 17.381f,
                    dy3 = -31.325f,
                )
                // C 519.477 96.207 498.404 109.811 499.873 112.654z
                curveTo(
                    x1 = 519.477f,
                    y1 = 96.207f,
                    x2 = 498.404f,
                    y2 = 109.811f,
                    x3 = 499.873f,
                    y3 = 112.654f,
                )
                close()
            }
            // M474.678 85.777 c0 0 -3.688 35.148 18.147 41.196 c21.836 6.049 27.067 -29.561 26.314 -41.876  c-0.753 -12.315 -6.242 -16.895 -21.546 -17.447 C474.951 66.834 474.678 85.777 474.678 85.777z
            path(
                fill = SolidColor(Color(0xFFDB9C7F)),
            ) {
                // M 474.678 85.777
                moveTo(x = 474.678f, y = 85.777f)
                // c 0 0 -3.688 35.148 18.147 41.196
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -3.688f,
                    dy2 = 35.148f,
                    dx3 = 18.147f,
                    dy3 = 41.196f,
                )
                // c 21.836 6.049 27.067 -29.561 26.314 -41.876
                curveToRelative(
                    dx1 = 21.836f,
                    dy1 = 6.049f,
                    dx2 = 27.067f,
                    dy2 = -29.561f,
                    dx3 = 26.314f,
                    dy3 = -41.876f,
                )
                // c -0.753 -12.315 -6.242 -16.895 -21.546 -17.447
                curveToRelative(
                    dx1 = -0.753f,
                    dy1 = -12.315f,
                    dx2 = -6.242f,
                    dy2 = -16.895f,
                    dx3 = -21.546f,
                    dy3 = -17.447f,
                )
                // C 474.951 66.834 474.678 85.777 474.678 85.777z
                curveTo(
                    x1 = 474.951f,
                    y1 = 66.834f,
                    x2 = 474.678f,
                    y2 = 85.777f,
                    x3 = 474.678f,
                    y3 = 85.777f,
                )
                close()
            }
            // M494.295 102.76 c0.062 1.265 -0.539 2.324 -1.343 2.365 c-0.804 0.041 -1.506 -0.952 -1.568 -2.217  c-0.062 -1.265 0.539 -2.324 1.343 -2.365 C493.531 100.503 494.233 101.495 494.295 102.76z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 494.295 102.76
                moveTo(x = 494.295f, y = 102.76f)
                // c 0.062 1.265 -0.539 2.324 -1.343 2.365
                curveToRelative(
                    dx1 = 0.062f,
                    dy1 = 1.265f,
                    dx2 = -0.539f,
                    dy2 = 2.324f,
                    dx3 = -1.343f,
                    dy3 = 2.365f,
                )
                // c -0.804 0.041 -1.506 -0.952 -1.568 -2.217
                curveToRelative(
                    dx1 = -0.804f,
                    dy1 = 0.041f,
                    dx2 = -1.506f,
                    dy2 = -0.952f,
                    dx3 = -1.568f,
                    dy3 = -2.217f,
                )
                // c -0.062 -1.265 0.539 -2.324 1.343 -2.365
                curveToRelative(
                    dx1 = -0.062f,
                    dy1 = -1.265f,
                    dx2 = 0.539f,
                    dy2 = -2.324f,
                    dx3 = 1.343f,
                    dy3 = -2.365f,
                )
                // C 493.531 100.503 494.233 101.495 494.295 102.76z
                curveTo(
                    x1 = 493.531f,
                    y1 = 100.503f,
                    x2 = 494.233f,
                    y2 = 101.495f,
                    x3 = 494.295f,
                    y3 = 102.76f,
                )
                close()
            }
            // M496.693 96.285  c0 0 -7.214 3.14 -7.922 -2.314
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineMiter = 10.0f,
            ) {
                // M 496.693 96.285
                moveTo(x = 496.693f, y = 96.285f)
                // c 0 0 -7.214 3.14 -7.922 -2.314
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -7.214f,
                    dy2 = 3.14f,
                    dx3 = -7.922f,
                    dy3 = -2.314f,
                )
            }
            // M480.017 96.299  c0 0 -2.383 4.137 -5.123 2.299
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineMiter = 10.0f,
            ) {
                // M 480.017 96.299
                moveTo(x = 480.017f, y = 96.299f)
                // c 0 0 -2.383 4.137 -5.123 2.299
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -2.383f,
                    dy2 = 4.137f,
                    dx3 = -5.123f,
                    dy3 = 2.299f,
                )
            }
            // M476.184 103.647  c0 0 1.363 -0.44 3.363 0.616
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineMiter = 10.0f,
            ) {
                // M 476.184 103.647
                moveTo(x = 476.184f, y = 103.647f)
                // c 0 0 1.363 -0.44 3.363 0.616
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 1.363f,
                    dy2 = -0.44f,
                    dx3 = 3.363f,
                    dy3 = 0.616f,
                )
            }
            // M497.564 116.758  c0 0 1.967 -1.881 3.591 -2.309
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineMiter = 10.0f,
            ) {
                // M 497.564 116.758
                moveTo(x = 497.564f, y = 116.758f)
                // c 0 0 1.967 -1.881 3.591 -2.309
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 1.967f,
                    dy2 = -1.881f,
                    dx3 = 3.591f,
                    dy3 = -2.309f,
                )
            }
            // M482.805 107.697  c0 0 -1.254 2.85 1.938 4.218
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineMiter = 10.0f,
            ) {
                // M 482.805 107.697
                moveTo(x = 482.805f, y = 107.697f)
                // c 0 0 -1.254 2.85 1.938 4.218
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -1.254f,
                    dy2 = 2.85f,
                    dx3 = 1.938f,
                    dy3 = 4.218f,
                )
            }
            // M474.422 93.334 c0 0 0.37 -10.292 4.93 -16.107 c0 0 6.27 14.251 33.289 17.158 l7.866 -1.653 c0 0 3.221 -16.502 -8.066 -23  c-11.286 -6.498 -28.559 -2.907 -34.116 2.936 C468.905 82.572 474.422 93.334 474.422 93.334z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 474.422 93.334
                moveTo(x = 474.422f, y = 93.334f)
                // c 0 0 0.37 -10.292 4.93 -16.107
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 0.37f,
                    dy2 = -10.292f,
                    dx3 = 4.93f,
                    dy3 = -16.107f,
                )
                // c 0 0 6.27 14.251 33.289 17.158
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 6.27f,
                    dy2 = 14.251f,
                    dx3 = 33.289f,
                    dy3 = 17.158f,
                )
                // l 7.866 -1.653
                lineToRelative(dx = 7.866f, dy = -1.653f)
                // c 0 0 3.221 -16.502 -8.066 -23
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 3.221f,
                    dy2 = -16.502f,
                    dx3 = -8.066f,
                    dy3 = -23.0f,
                )
                // c -11.286 -6.498 -28.559 -2.907 -34.116 2.936
                curveToRelative(
                    dx1 = -11.286f,
                    dy1 = -6.498f,
                    dx2 = -28.559f,
                    dy2 = -2.907f,
                    dx3 = -34.116f,
                    dy3 = 2.936f,
                )
                // C 468.905 82.572 474.422 93.334 474.422 93.334z
                curveTo(
                    x1 = 468.905f,
                    y1 = 82.572f,
                    x2 = 474.422f,
                    y2 = 93.334f,
                    x3 = 474.422f,
                    y3 = 93.334f,
                )
                close()
            }
            // <polygon points="507.397 92.504 512.071 101.738 515.377 91.364" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 507.397 92.504
                moveTo(x = 507.397f, y = 92.504f)
                // L 512.071 101.738
                lineTo(x = 512.071f, y = 101.738f)
                // L 515.377 91.364z
                lineTo(x = 515.377f, y = 91.364f)
                close()
            }
            // M523.734 100.779 c-1.346 4.912 -5.211 8.159 -8.631 7.253 c-3.42 -0.906 -5.102 -5.623 -3.755 -10.535  c1.346 -4.912 5.211 -8.159 8.631 -7.253 C523.399 91.15 525.08 95.867 523.734 100.779z
            path(
                fill = SolidColor(Color(0xFFDB9C7F)),
            ) {
                // M 523.734 100.779
                moveTo(x = 523.734f, y = 100.779f)
                // c -1.346 4.912 -5.211 8.159 -8.631 7.253
                curveToRelative(
                    dx1 = -1.346f,
                    dy1 = 4.912f,
                    dx2 = -5.211f,
                    dy2 = 8.159f,
                    dx3 = -8.631f,
                    dy3 = 7.253f,
                )
                // c -3.42 -0.906 -5.102 -5.623 -3.755 -10.535
                curveToRelative(
                    dx1 = -3.42f,
                    dy1 = -0.906f,
                    dx2 = -5.102f,
                    dy2 = -5.623f,
                    dx3 = -3.755f,
                    dy3 = -10.535f,
                )
                // c 1.346 -4.912 5.211 -8.159 8.631 -7.253
                curveToRelative(
                    dx1 = 1.346f,
                    dy1 = -4.912f,
                    dx2 = 5.211f,
                    dy2 = -8.159f,
                    dx3 = 8.631f,
                    dy3 = -7.253f,
                )
                // C 523.399 91.15 525.08 95.867 523.734 100.779z
                curveTo(
                    x1 = 523.399f,
                    y1 = 91.15f,
                    x2 = 525.08f,
                    y2 = 95.867f,
                    x3 = 523.734f,
                    y3 = 100.779f,
                )
                close()
            }
            // M520.301 96.502  c0 0 -3.847 -3.31 -5.949 2.742 c0 0 2.247 2.385 0.829 4.257 c0 0 2.215 0.503 3.308 -1.451
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
            ) {
                // M 520.301 96.502
                moveTo(x = 520.301f, y = 96.502f)
                // c 0 0 -3.847 -3.31 -5.949 2.742
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -3.847f,
                    dy2 = -3.31f,
                    dx3 = -5.949f,
                    dy3 = 2.742f,
                )
                // c 0 0 2.247 2.385 0.829 4.257
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 2.247f,
                    dy2 = 2.385f,
                    dx3 = 0.829f,
                    dy3 = 4.257f,
                )
                // c 0 0 2.215 0.503 3.308 -1.451
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 2.215f,
                    dy2 = 0.503f,
                    dx3 = 3.308f,
                    dy3 = -1.451f,
                )
            }
            // M518.636 98.817  c0 0 -0.214 -1.345 -1.708 -2.879
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
            ) {
                // M 518.636 98.817
                moveTo(x = 518.636f, y = 98.817f)
                // c 0 0 -0.214 -1.345 -1.708 -2.879
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = -0.214f,
                    dy2 = -1.345f,
                    dx3 = -1.708f,
                    dy3 = -2.879f,
                )
            }
            // M520.507 107.866 c0 1.842 -1.493 3.335 -3.335 3.335 s-3.335 -1.493 -3.335 -3.335  c0 -1.842 1.493 -3.335 3.335 -3.335 S520.507 106.024 520.507 107.866z
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
            ) {
                // M 520.507 107.866
                moveTo(x = 520.507f, y = 107.866f)
                // c 0 1.842 -1.493 3.335 -3.335 3.335
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.842f,
                    dx2 = -1.493f,
                    dy2 = 3.335f,
                    dx3 = -3.335f,
                    dy3 = 3.335f,
                )
                // s -3.335 -1.493 -3.335 -3.335
                reflectiveCurveToRelative(
                    dx1 = -3.335f,
                    dy1 = -1.493f,
                    dx2 = -3.335f,
                    dy2 = -3.335f,
                )
                // c 0 -1.842 1.493 -3.335 3.335 -3.335
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.842f,
                    dx2 = 1.493f,
                    dy2 = -3.335f,
                    dx3 = 3.335f,
                    dy3 = -3.335f,
                )
                // S 520.507 106.024 520.507 107.866z
                reflectiveCurveTo(
                    x1 = 520.507f,
                    y1 = 106.024f,
                    x2 = 520.507f,
                    y2 = 107.866f,
                )
                close()
            }
            // M511.159 74.035 c0 0 4.104 -21.433 13.681 -17.329 c9.576 4.104 13.909 24.625 4.788 26.221  c-9.12 1.596 -16.189 -2.736 -16.189 -2.736 L511.159 74.035z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 511.159 74.035
                moveTo(x = 511.159f, y = 74.035f)
                // c 0 0 4.104 -21.433 13.681 -17.329
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 4.104f,
                    dy2 = -21.433f,
                    dx3 = 13.681f,
                    dy3 = -17.329f,
                )
                // c 9.576 4.104 13.909 24.625 4.788 26.221
                curveToRelative(
                    dx1 = 9.576f,
                    dy1 = 4.104f,
                    dx2 = 13.909f,
                    dy2 = 24.625f,
                    dx3 = 4.788f,
                    dy3 = 26.221f,
                )
                // c -9.12 1.596 -16.189 -2.736 -16.189 -2.736
                curveToRelative(
                    dx1 = -9.12f,
                    dy1 = 1.596f,
                    dx2 = -16.189f,
                    dy2 = -2.736f,
                    dx3 = -16.189f,
                    dy3 = -2.736f,
                )
                // L 511.159 74.035z
                lineTo(x = 511.159f, y = 74.035f)
                close()
            }
            // M511.273 80.191  c0 0 15.847 13.225 20.977 1.026
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineMiter = 10.0f,
            ) {
                // M 511.273 80.191
                moveTo(x = 511.273f, y = 80.191f)
                // c 0 0 15.847 13.225 20.977 1.026
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.0f,
                    dx2 = 15.847f,
                    dy2 = 13.225f,
                    dx3 = 20.977f,
                    dy3 = 1.026f,
                )
            }
            // M154.786 131.333 c19.821 0.54 36.221 16.416 37.362 36.212 c0.671 11.64 -3.84 22.232 -11.432 29.705  c-1.122 1.104 -1.643 2.678 -1.381 4.23 l2.851 16.871 l-17.542 -10.221 c-0.999 -0.582 -2.176 -0.796 -3.31 -0.567  c-4.288 0.865 -8.831 1.024 -13.514 0.315 c-17.329 -2.625 -30.849 -16.971 -32.447 -34.425  C113.243 150.19 131.824 130.707 154.786 131.333z
            path(
                fill = SolidColor(Color(0xFFD3DDF7)),
            ) {
                // M 154.786 131.333
                moveTo(x = 154.786f, y = 131.333f)
                // c 19.821 0.54 36.221 16.416 37.362 36.212
                curveToRelative(
                    dx1 = 19.821f,
                    dy1 = 0.54f,
                    dx2 = 36.221f,
                    dy2 = 16.416f,
                    dx3 = 37.362f,
                    dy3 = 36.212f,
                )
                // c 0.671 11.64 -3.84 22.232 -11.432 29.705
                curveToRelative(
                    dx1 = 0.671f,
                    dy1 = 11.64f,
                    dx2 = -3.84f,
                    dy2 = 22.232f,
                    dx3 = -11.432f,
                    dy3 = 29.705f,
                )
                // c -1.122 1.104 -1.643 2.678 -1.381 4.23
                curveToRelative(
                    dx1 = -1.122f,
                    dy1 = 1.104f,
                    dx2 = -1.643f,
                    dy2 = 2.678f,
                    dx3 = -1.381f,
                    dy3 = 4.23f,
                )
                // l 2.851 16.871
                lineToRelative(dx = 2.851f, dy = 16.871f)
                // l -17.542 -10.221
                lineToRelative(dx = -17.542f, dy = -10.221f)
                // c -0.999 -0.582 -2.176 -0.796 -3.31 -0.567
                curveToRelative(
                    dx1 = -0.999f,
                    dy1 = -0.582f,
                    dx2 = -2.176f,
                    dy2 = -0.796f,
                    dx3 = -3.31f,
                    dy3 = -0.567f,
                )
                // c -4.288 0.865 -8.831 1.024 -13.514 0.315
                curveToRelative(
                    dx1 = -4.288f,
                    dy1 = 0.865f,
                    dx2 = -8.831f,
                    dy2 = 1.024f,
                    dx3 = -13.514f,
                    dy3 = 0.315f,
                )
                // c -17.329 -2.625 -30.849 -16.971 -32.447 -34.425
                curveToRelative(
                    dx1 = -17.329f,
                    dy1 = -2.625f,
                    dx2 = -30.849f,
                    dy2 = -16.971f,
                    dx3 = -32.447f,
                    dy3 = -34.425f,
                )
                // C 113.243 150.19 131.824 130.707 154.786 131.333z
                curveTo(
                    x1 = 113.243f,
                    y1 = 150.19f,
                    x2 = 131.824f,
                    y2 = 130.707f,
                    x3 = 154.786f,
                    y3 = 131.333f,
                )
                close()
            }
            // M151.954 183.149 l-0.108 -9.205 c1.343 -0.327 2.568 -0.753 3.676 -1.28 c1.107 -0.526 2.079 -1.134 2.914 -1.825  c0.835 -0.689 1.534 -1.461 2.098 -2.315 c0.563 -0.853 0.988 -1.77 1.28 -2.75 c0.29 -0.98 0.436 -2.015 0.436 -3.105  c0 -1.561 -0.382 -3.032 -1.145 -4.412 c-0.762 -1.379 -1.852 -2.496 -3.268 -3.35 c-1.416 -0.853 -3.104 -1.28 -5.065 -1.28  c-2.106 0 -4.058 0.582 -5.855 1.743 c-1.798 1.163 -3.169 3.141 -4.112 5.937 l-0.98 -0.654 c0.835 -2.65 2.233 -4.684 4.194 -6.1  c1.961 -1.417 4.193 -2.125 6.699 -2.125 c2.143 0 4.021 0.455 5.638 1.362 c1.615 0.908 2.877 2.134 3.785 3.677  c0.907 1.543 1.362 3.277 1.362 5.202 c0 1.453 -0.245 2.814 -0.735 4.085 c-0.49 1.271 -1.181 2.433 -2.07 3.486  c-0.89 1.054 -1.97 1.97 -3.241 2.751 c-1.271 0.782 -2.705 1.371 -4.303 1.77 l-0.108 8.388 H151.954z M151.301 190.012  c0 -0.472 0.127 -0.862 0.381 -1.171 c0.254 -0.308 0.6 -0.463 1.035 -0.463 c0.508 0 0.871 0.146 1.09 0.436  c0.218 0.291 0.326 0.69 0.326 1.198 c0 0.436 -0.118 0.817 -0.354 1.144 c-0.237 0.327 -0.591 0.49 -1.063 0.49  c-0.473 0 -0.826 -0.146 -1.063 -0.436 C151.418 190.92 151.301 190.521 151.301 190.012z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 151.954 183.149
                moveTo(x = 151.954f, y = 183.149f)
                // l -0.108 -9.205
                lineToRelative(dx = -0.108f, dy = -9.205f)
                // c 1.343 -0.327 2.568 -0.753 3.676 -1.28
                curveToRelative(
                    dx1 = 1.343f,
                    dy1 = -0.327f,
                    dx2 = 2.568f,
                    dy2 = -0.753f,
                    dx3 = 3.676f,
                    dy3 = -1.28f,
                )
                // c 1.107 -0.526 2.079 -1.134 2.914 -1.825
                curveToRelative(
                    dx1 = 1.107f,
                    dy1 = -0.526f,
                    dx2 = 2.079f,
                    dy2 = -1.134f,
                    dx3 = 2.914f,
                    dy3 = -1.825f,
                )
                // c 0.835 -0.689 1.534 -1.461 2.098 -2.315
                curveToRelative(
                    dx1 = 0.835f,
                    dy1 = -0.689f,
                    dx2 = 1.534f,
                    dy2 = -1.461f,
                    dx3 = 2.098f,
                    dy3 = -2.315f,
                )
                // c 0.563 -0.853 0.988 -1.77 1.28 -2.75
                curveToRelative(
                    dx1 = 0.563f,
                    dy1 = -0.853f,
                    dx2 = 0.988f,
                    dy2 = -1.77f,
                    dx3 = 1.28f,
                    dy3 = -2.75f,
                )
                // c 0.29 -0.98 0.436 -2.015 0.436 -3.105
                curveToRelative(
                    dx1 = 0.29f,
                    dy1 = -0.98f,
                    dx2 = 0.436f,
                    dy2 = -2.015f,
                    dx3 = 0.436f,
                    dy3 = -3.105f,
                )
                // c 0 -1.561 -0.382 -3.032 -1.145 -4.412
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -1.561f,
                    dx2 = -0.382f,
                    dy2 = -3.032f,
                    dx3 = -1.145f,
                    dy3 = -4.412f,
                )
                // c -0.762 -1.379 -1.852 -2.496 -3.268 -3.35
                curveToRelative(
                    dx1 = -0.762f,
                    dy1 = -1.379f,
                    dx2 = -1.852f,
                    dy2 = -2.496f,
                    dx3 = -3.268f,
                    dy3 = -3.35f,
                )
                // c -1.416 -0.853 -3.104 -1.28 -5.065 -1.28
                curveToRelative(
                    dx1 = -1.416f,
                    dy1 = -0.853f,
                    dx2 = -3.104f,
                    dy2 = -1.28f,
                    dx3 = -5.065f,
                    dy3 = -1.28f,
                )
                // c -2.106 0 -4.058 0.582 -5.855 1.743
                curveToRelative(
                    dx1 = -2.106f,
                    dy1 = 0.0f,
                    dx2 = -4.058f,
                    dy2 = 0.582f,
                    dx3 = -5.855f,
                    dy3 = 1.743f,
                )
                // c -1.798 1.163 -3.169 3.141 -4.112 5.937
                curveToRelative(
                    dx1 = -1.798f,
                    dy1 = 1.163f,
                    dx2 = -3.169f,
                    dy2 = 3.141f,
                    dx3 = -4.112f,
                    dy3 = 5.937f,
                )
                // l -0.98 -0.654
                lineToRelative(dx = -0.98f, dy = -0.654f)
                // c 0.835 -2.65 2.233 -4.684 4.194 -6.1
                curveToRelative(
                    dx1 = 0.835f,
                    dy1 = -2.65f,
                    dx2 = 2.233f,
                    dy2 = -4.684f,
                    dx3 = 4.194f,
                    dy3 = -6.1f,
                )
                // c 1.961 -1.417 4.193 -2.125 6.699 -2.125
                curveToRelative(
                    dx1 = 1.961f,
                    dy1 = -1.417f,
                    dx2 = 4.193f,
                    dy2 = -2.125f,
                    dx3 = 6.699f,
                    dy3 = -2.125f,
                )
                // c 2.143 0 4.021 0.455 5.638 1.362
                curveToRelative(
                    dx1 = 2.143f,
                    dy1 = 0.0f,
                    dx2 = 4.021f,
                    dy2 = 0.455f,
                    dx3 = 5.638f,
                    dy3 = 1.362f,
                )
                // c 1.615 0.908 2.877 2.134 3.785 3.677
                curveToRelative(
                    dx1 = 1.615f,
                    dy1 = 0.908f,
                    dx2 = 2.877f,
                    dy2 = 2.134f,
                    dx3 = 3.785f,
                    dy3 = 3.677f,
                )
                // c 0.907 1.543 1.362 3.277 1.362 5.202
                curveToRelative(
                    dx1 = 0.907f,
                    dy1 = 1.543f,
                    dx2 = 1.362f,
                    dy2 = 3.277f,
                    dx3 = 1.362f,
                    dy3 = 5.202f,
                )
                // c 0 1.453 -0.245 2.814 -0.735 4.085
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 1.453f,
                    dx2 = -0.245f,
                    dy2 = 2.814f,
                    dx3 = -0.735f,
                    dy3 = 4.085f,
                )
                // c -0.49 1.271 -1.181 2.433 -2.07 3.486
                curveToRelative(
                    dx1 = -0.49f,
                    dy1 = 1.271f,
                    dx2 = -1.181f,
                    dy2 = 2.433f,
                    dx3 = -2.07f,
                    dy3 = 3.486f,
                )
                // c -0.89 1.054 -1.97 1.97 -3.241 2.751
                curveToRelative(
                    dx1 = -0.89f,
                    dy1 = 1.054f,
                    dx2 = -1.97f,
                    dy2 = 1.97f,
                    dx3 = -3.241f,
                    dy3 = 2.751f,
                )
                // c -1.271 0.782 -2.705 1.371 -4.303 1.77
                curveToRelative(
                    dx1 = -1.271f,
                    dy1 = 0.782f,
                    dx2 = -2.705f,
                    dy2 = 1.371f,
                    dx3 = -4.303f,
                    dy3 = 1.77f,
                )
                // l -0.108 8.388
                lineToRelative(dx = -0.108f, dy = 8.388f)
                // H 151.954z
                horizontalLineTo(x = 151.954f)
                close()
                // M 151.301 190.012
                moveTo(x = 151.301f, y = 190.012f)
                // c 0 -0.472 0.127 -0.862 0.381 -1.171
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.472f,
                    dx2 = 0.127f,
                    dy2 = -0.862f,
                    dx3 = 0.381f,
                    dy3 = -1.171f,
                )
                // c 0.254 -0.308 0.6 -0.463 1.035 -0.463
                curveToRelative(
                    dx1 = 0.254f,
                    dy1 = -0.308f,
                    dx2 = 0.6f,
                    dy2 = -0.463f,
                    dx3 = 1.035f,
                    dy3 = -0.463f,
                )
                // c 0.508 0 0.871 0.146 1.09 0.436
                curveToRelative(
                    dx1 = 0.508f,
                    dy1 = 0.0f,
                    dx2 = 0.871f,
                    dy2 = 0.146f,
                    dx3 = 1.09f,
                    dy3 = 0.436f,
                )
                // c 0.218 0.291 0.326 0.69 0.326 1.198
                curveToRelative(
                    dx1 = 0.218f,
                    dy1 = 0.291f,
                    dx2 = 0.326f,
                    dy2 = 0.69f,
                    dx3 = 0.326f,
                    dy3 = 1.198f,
                )
                // c 0 0.436 -0.118 0.817 -0.354 1.144
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.436f,
                    dx2 = -0.118f,
                    dy2 = 0.817f,
                    dx3 = -0.354f,
                    dy3 = 1.144f,
                )
                // c -0.237 0.327 -0.591 0.49 -1.063 0.49
                curveToRelative(
                    dx1 = -0.237f,
                    dy1 = 0.327f,
                    dx2 = -0.591f,
                    dy2 = 0.49f,
                    dx3 = -1.063f,
                    dy3 = 0.49f,
                )
                // c -0.473 0 -0.826 -0.146 -1.063 -0.436
                curveToRelative(
                    dx1 = -0.473f,
                    dy1 = 0.0f,
                    dx2 = -0.826f,
                    dy2 = -0.146f,
                    dx3 = -1.063f,
                    dy3 = -0.436f,
                )
                // C 151.418 190.92 151.301 190.521 151.301 190.012z
                curveTo(
                    x1 = 151.418f,
                    y1 = 190.92f,
                    x2 = 151.301f,
                    y2 = 190.521f,
                    x3 = 151.301f,
                    y3 = 190.012f,
                )
                close()
            }
            // M598.721 201.355
            path(
                stroke = SolidColor(Color(0xFF424242)),
                strokeLineCap = StrokeCap.Round,
                strokeLineMiter = 10.0f,
            ) {
                // M 598.721 201.355
                moveTo(x = 598.721f, y = 201.355f)
            }
        }.build().also { selectHero = it }
    }

private var selectHero: ImageVector? = null


@Preview
@Composable
private fun SelectHeroPreview() {
    Box(Modifier.wrapContentSize()) {
        Image(
            imageVector = StackersIcons.Hero.SelectHero,
            contentDescription = null,
            modifier = Modifier.matchParentSize()
        )
    }
}