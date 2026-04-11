package com.core.user.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import kotlinx.datetime.LocalDate
import kotlinx.datetime.format
import kotlinx.datetime.format.DateTimeFormat
import kotlinx.datetime.format.MonthNames
import kotlinx.datetime.format.Padding
import kotlinx.datetime.format.char

internal data object UserDateUtil {

    internal val dateFormat = LocalDate.Format {
        monthName(MonthNames.ENGLISH_ABBREVIATED)
        char(' ')
        day(Padding.NONE)
        chars(", ")
        year(Padding.NONE)
    }

}

@Composable
fun rememberDisplayDate(
    date: LocalDate,
    format: DateTimeFormat<LocalDate> = UserDateUtil.dateFormat,
): String {
    return remember(date, format) {
        date.format(format)
    }
}