package com.core.user.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.core.user.data.UserDetailsUiModel

@Composable
fun UserDetailsView(
    uiModel: UserDetailsUiModel,
    modifier: Modifier = Modifier,
) {
    val background = MaterialTheme.colorScheme.surface
    CompositionLocalProvider(LocalContentColor provides contentColorFor(background)) {
        Column(
            modifier = modifier.verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Top,
        ) {
            UserHeader(
                uiModel = uiModel,
                modifier = modifier.fillMaxWidth(),
            )
            HorizontalDivider(Modifier.padding(horizontal = 24.dp))
            BadgesSection(
                uiModel = uiModel,
                modifier = modifier.fillMaxWidth(),
            )
            AboutMeSection(
                markdown = uiModel.aboutMe,
                modifier = modifier.fillMaxWidth(),
            )
        }
    }
}

