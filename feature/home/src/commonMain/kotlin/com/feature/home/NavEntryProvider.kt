package com.feature.home

import androidx.compose.ui.Modifier
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavKey
import com.feature.api.home.HomeNavKey
import com.feature.home.ui.HomeRoute
import kotlinx.serialization.modules.PolymorphicModuleBuilder

fun PolymorphicModuleBuilder<NavKey>.homeNavKeySerializers() {
    subclass(HomeNavKey::class, HomeNavKey.serializer())
}

fun EntryProviderScope<NavKey>.homeEntryBuilder() {
    entry<HomeNavKey> {
        HomeRoute(
            modifier = Modifier,
        )
    }
}