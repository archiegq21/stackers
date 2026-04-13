package com.feature.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.adaptive.ExperimentalMaterial3AdaptiveApi
import androidx.compose.material3.adaptive.navigation3.ListDetailSceneStrategy
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.core.designsystem.decorator.MainTopBarSceneDecoratorStrategy
import com.core.user.ui.EmptyUserDetails
import com.feature.api.home.HomeDetailsNavKey
import com.feature.api.home.HomeNavKey
import com.feature.home.ui.HomeRoute
import com.feature.home.ui.UserDetailsRoute
import kotlinx.serialization.modules.PolymorphicModuleBuilder

fun PolymorphicModuleBuilder<NavKey>.homeNavKeySerializers() {
    subclass(HomeNavKey::class, HomeNavKey.serializer())
    subclass(HomeDetailsNavKey::class, HomeDetailsNavKey.serializer())
}

@OptIn(ExperimentalMaterial3AdaptiveApi::class)
fun EntryProviderScope<NavKey>.homeEntryBuilder(
    backStack: NavBackStack<NavKey>,
) {
    entry<HomeNavKey>(
        metadata = ListDetailSceneStrategy.listPane(
            detailPlaceholder = { EmptyUserDetails(Modifier.fillMaxSize()) },
        ) + MainTopBarSceneDecoratorStrategy.mainAppBar(isHome = true)
    ) {
        HomeRoute(
            selectedUserId = (backStack.lastOrNull() as? HomeDetailsNavKey)?.userId,
            onUserClick = { backStack.add(HomeDetailsNavKey(userId = it.id)) },
            modifier = Modifier,
        )
    }
    entry<HomeDetailsNavKey>(
        metadata = ListDetailSceneStrategy.detailPane()
                + MainTopBarSceneDecoratorStrategy.mainAppBar(isHome = true)
    ) {
        UserDetailsRoute(
            modifier = Modifier,
        )
    }
}