package com.feature.home.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.add
import androidx.compose.foundation.layout.displayCutout
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.only
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyGridScope
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.paging.LoadState
import com.core.user.data.UserUiModel
import com.core.user.ui.ErrorFooter
import com.core.user.ui.LoadingUserCard
import com.core.user.ui.UserCard
import com.feature.home.domain.HomeViewModel
import com.library.paging.collectAsLazyPagingItems
import com.library.paging.items
import org.koin.compose.viewmodel.koinViewModel

@Composable
internal fun HomeRoute(
    selectedUserId: String? = null,
    onUserClick: (UserUiModel) -> Unit,
    viewModel: HomeViewModel = koinViewModel(),
    modifier: Modifier = Modifier,
) {
    val usersPagingItems = viewModel.users.collectAsLazyPagingItems()
    LazyVerticalGrid(
        columns = GridCells.Adaptive(minSize = 280.dp),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        userScrollEnabled = usersPagingItems.itemCount >= 1,
        modifier = modifier
            .windowInsetsPadding(
                WindowInsets.navigationBars.only(WindowInsetsSides.Horizontal)
                    .add(WindowInsets.displayCutout.only(WindowInsetsSides.Horizontal))
            )
            .fillMaxSize(),
    ) {
        if (usersPagingItems.loadState.refresh is LoadState.Loading && usersPagingItems.itemCount == 0) {
            loadingUserItems(count = 30)
        }
        items(
            items = usersPagingItems,
            key = { it.id },
            placeholder = { LoadingUserCard() }
        ) { uiModel ->
            UserCard(
                selected = uiModel.id == selectedUserId,
                uiModel = uiModel,
                onClick = { onUserClick(uiModel) }
            )
        }
        if (usersPagingItems.loadState.append is LoadState.Loading && usersPagingItems.itemCount != 0) {
            loadingUserItems(count = 1)
        }
        if (usersPagingItems.loadState.append is LoadState.Error) {
            item {
                ErrorFooter(
                    onRetry = usersPagingItems::retry,
                    modifier = Modifier.fillMaxWidth(),
                )
            }
        }
    }
}

private fun LazyGridScope.loadingUserItems(count: Int) {
    items(count, contentType = { "LoadingUserItem" }) {
        LoadingUserCard()
    }
}