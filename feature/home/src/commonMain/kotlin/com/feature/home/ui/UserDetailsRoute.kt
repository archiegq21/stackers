package com.feature.home.ui

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.add
import androidx.compose.foundation.layout.displayCutout
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.only
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.core.user.ui.UserDetailsView
import com.feature.home.domain.HomeDetailsViewModel
import org.koin.compose.viewmodel.koinViewModel
import org.koin.core.parameter.parametersOf

@Composable
internal fun UserDetailsRoute(
    userId: String,
    viewModel: HomeDetailsViewModel = koinViewModel { parametersOf(userId) },
    modifier: Modifier = Modifier,
) {
    val uiModel by viewModel.uiModelFlow.collectAsStateWithLifecycle()

    AnimatedContent(
        targetState = uiModel,
        transitionSpec = { fadeIn() togetherWith fadeOut() },
        modifier = Modifier
            .windowInsetsPadding(
                WindowInsets.navigationBars.only(WindowInsetsSides.Horizontal)
                    .add(WindowInsets.displayCutout.only(WindowInsetsSides.Horizontal))
            )
            .fillMaxSize(),
    ) { state ->
        if (state == null) {
            return@AnimatedContent
        } else {
            UserDetailsView(
                uiModel = state,
                modifier = modifier.fillMaxSize(),
            )
        }
    }
}