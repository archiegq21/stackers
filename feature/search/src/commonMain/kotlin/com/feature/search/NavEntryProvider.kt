package com.feature.search

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.adaptive.ExperimentalMaterial3AdaptiveApi
import androidx.compose.material3.adaptive.navigation3.ListDetailSceneStrategy
import androidx.compose.ui.Modifier
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.core.designsystem.decorator.SearchBarSceneDecoratorStrategy
import com.core.user.ui.EmptyUserDetails
import com.feature.api.search.SearchNavKey
import com.feature.api.search.UserDetailsNavKey
import com.feature.search.ui.SearchRoute
import com.feature.search.ui.SearchUserDetailsRoute
import kotlinx.serialization.modules.PolymorphicModuleBuilder

fun PolymorphicModuleBuilder<NavKey>.searchNavKeySerializers() {
    subclass(SearchNavKey::class, SearchNavKey.serializer())
    subclass(UserDetailsNavKey::class, UserDetailsNavKey.serializer())
}

@OptIn(ExperimentalMaterial3AdaptiveApi::class)
fun EntryProviderScope<NavKey>.searchEntryBuilder(
    backStack: NavBackStack<NavKey>,
) {
    entry<SearchNavKey>(
        metadata = ListDetailSceneStrategy.listPane(
            detailPlaceholder = { EmptyUserDetails(Modifier.fillMaxSize()) },
        ) + SearchBarSceneDecoratorStrategy.searchAppBar(true)
    ) {
        SearchRoute(
            selectedUserId = (backStack.lastOrNull() as? UserDetailsNavKey)?.userId,
            onUserClick = { backStack.add(UserDetailsNavKey(userId = it.id)) },
            modifier = Modifier,
        )
    }
    entry<UserDetailsNavKey>(
        metadata = ListDetailSceneStrategy.detailPane() +
                SearchBarSceneDecoratorStrategy.searchAppBar(true)
    ) {
        SearchUserDetailsRoute(
            userId = it.userId,
            modifier = Modifier,
        )
    }
}