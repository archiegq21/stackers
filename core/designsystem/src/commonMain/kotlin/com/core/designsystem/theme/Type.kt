package com.core.designsystem.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import com.core.designsystem.Res
import com.core.designsystem.alfa_slab_one_regular
import com.core.designsystem.gentium_book_plus_bold
import com.core.designsystem.gentium_book_plus_bold_italic
import com.core.designsystem.gentium_book_plus_italic
import com.core.designsystem.gentium_book_plus_regular
import org.jetbrains.compose.resources.Font


internal val bodyFontFamily: FontFamily
    @Composable
    get() = FontFamily(
        Font(
            resource = Res.font.gentium_book_plus_bold,
            weight = FontWeight.Bold,
            style = FontStyle.Normal,
        ),
        Font(
            resource = Res.font.gentium_book_plus_bold_italic,
            weight = FontWeight.Bold,
            style = FontStyle.Italic,
        ),
        Font(
            resource = Res.font.gentium_book_plus_italic,
            weight = FontWeight.Normal,
            style = FontStyle.Italic,
        ),
        Font(
            resource = Res.font.gentium_book_plus_regular,
            weight = FontWeight.Normal,
            style = FontStyle.Normal,
        ),
    )


internal val displayFontFamily: FontFamily
    @Composable
    get() = FontFamily(
        Font(
            resource = Res.font.alfa_slab_one_regular,
            weight = FontWeight.Normal,
            style = FontStyle.Normal,
        ),
    )

private val baseline = Typography()

internal val DawnTypography: Typography
    @Composable
    get() = Typography(
        displayLarge = baseline.displayLarge.copy(fontFamily = displayFontFamily),
        displayMedium = baseline.displayMedium.copy(fontFamily = displayFontFamily),
        displaySmall = baseline.displaySmall.copy(fontFamily = displayFontFamily),
        headlineLarge = baseline.headlineLarge.copy(fontFamily = displayFontFamily),
        headlineMedium = baseline.headlineMedium.copy(fontFamily = displayFontFamily),
        headlineSmall = baseline.headlineSmall.copy(fontFamily = displayFontFamily),
        titleLarge = baseline.titleLarge.copy(fontFamily = displayFontFamily),
        titleMedium = baseline.titleMedium.copy(fontFamily = displayFontFamily),
        titleSmall = baseline.titleSmall.copy(fontFamily = displayFontFamily),
        bodyLarge = baseline.bodyLarge.copy(fontFamily = bodyFontFamily),
        bodyMedium = baseline.bodyMedium.copy(fontFamily = bodyFontFamily),
        bodySmall = baseline.bodySmall.copy(fontFamily = bodyFontFamily),
        labelLarge = baseline.labelLarge.copy(fontFamily = bodyFontFamily),
        labelMedium = baseline.labelMedium.copy(fontFamily = bodyFontFamily),
        labelSmall = baseline.labelSmall.copy(fontFamily = bodyFontFamily),
    )

