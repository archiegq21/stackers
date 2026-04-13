package com.quibbly.shared

import androidx.compose.animation.SharedTransitionLayout
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.adaptive.ExperimentalMaterial3AdaptiveApi
import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo
import androidx.compose.material3.adaptive.layout.calculatePaneScaffoldDirective
import androidx.compose.material3.adaptive.navigation.BackNavigationBehavior
import androidx.compose.material3.adaptive.navigation3.rememberListDetailSceneStrategy
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.navigation3.rememberViewModelStoreNavEntryDecorator
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberSaveableStateHolderNavEntryDecorator
import androidx.navigation3.scene.SinglePaneSceneStrategy
import androidx.navigation3.ui.NavDisplay
import androidx.savedstate.serialization.SavedStateConfiguration
import com.feature.home.homeEntryBuilder
import com.feature.home.homeNavKeySerializers
import com.quibbly.shared.component.StackersMainAppBar
import com.core.designsystem.decorator.rememberTopBarSceneDecoratorStrategy
import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.polymorphic


internal val Config = SavedStateConfiguration {
    serializersModule = SerializersModule {
        polymorphic(NavKey::class) {
            homeNavKeySerializers()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3AdaptiveApi::class)
@Composable
internal fun StackersNavigation(
    backStack: NavBackStack<NavKey>,
    onBack: () -> Unit,
    modifier: Modifier = Modifier,
) {
    SharedTransitionLayout {
        val scrollBehavior = TopAppBarDefaults.exitUntilCollapsedScrollBehavior()

        val topBarSceneDecoratorStrategy =
            rememberTopBarSceneDecoratorStrategy<NavKey>(
                topBar = {
                    StackersMainAppBar(
                        navBackStack = backStack,
                        modifier = Modifier.fillMaxWidth(),
                        scrollBehavior = scrollBehavior,
                    )
                },
                sharedTransitionScope = this
            )

        val windowAdaptiveInfo = currentWindowAdaptiveInfo()
        val directive = remember(windowAdaptiveInfo) {
            calculatePaneScaffoldDirective(windowAdaptiveInfo)
                .copy(horizontalPartitionSpacerSize = 0.dp)
        }
        val listDetailSceneStrategy = rememberListDetailSceneStrategy<NavKey>(
            directive = directive,
            backNavigationBehavior = BackNavigationBehavior.PopUntilCurrentDestinationChange,
            shouldHandleSinglePaneLayout = true,
        )

        NavDisplay(
            modifier = modifier
                .background(MaterialTheme.colorScheme.background)
                .nestedScroll(scrollBehavior.nestedScrollConnection),
            backStack = backStack,
            onBack = onBack,
            sharedTransitionScope = this@SharedTransitionLayout,
            sceneStrategies = listOf(listDetailSceneStrategy, SinglePaneSceneStrategy()),
            sceneDecoratorStrategies = listOf(topBarSceneDecoratorStrategy),
            entryDecorators = listOf(
                rememberSaveableStateHolderNavEntryDecorator(),
                rememberViewModelStoreNavEntryDecorator()
            ),
            entryProvider = entryProvider {
                homeEntryBuilder(backStack)
            }
        )
    }
}