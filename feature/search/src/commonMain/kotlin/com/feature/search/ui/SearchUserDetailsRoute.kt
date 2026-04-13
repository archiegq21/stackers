package com.feature.search.ui

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.core.user.ui.EmptyUserDetails
import com.core.user.ui.LoadingUserHeader
import com.core.user.ui.UserDetailsView
import com.feature.search.domain.SearchUserDetailViewModel
import com.feature.search.domain.UserState
import org.koin.compose.viewmodel.koinViewModel
import org.koin.core.parameter.parametersOf

@Composable
fun SearchUserDetailsRoute(
    userId: String,
    viewModel: SearchUserDetailViewModel = koinViewModel { parametersOf(userId) },
    modifier: Modifier = Modifier,
) {
    val userState by viewModel.userStateFlow.collectAsStateWithLifecycle()

    AnimatedContent(
        targetState = userState,
        transitionSpec = { fadeIn() togetherWith fadeOut() },
        modifier = Modifier.fillMaxSize(),
    ) { state ->
        when (state) {
            UserState.Error -> EmptyUserDetails(
                modifier = modifier.fillMaxSize()
            )
            UserState.Loading -> LoadingUserHeader(
                modifier = modifier.fillMaxSize()
            )
            is UserState.Success -> UserDetailsView(
                uiModel = state.user,
                modifier = modifier.fillMaxSize(),
            )
        }
    }
}