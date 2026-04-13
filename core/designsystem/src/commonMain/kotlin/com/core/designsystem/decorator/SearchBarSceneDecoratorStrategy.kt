package com.core.designsystem.decorator

import androidx.compose.animation.EnterExitState
import androidx.compose.animation.SharedTransitionScope
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.input.TextFieldState
import androidx.compose.foundation.text.input.clearText
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.LocalContentColor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.movableContentOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation3.scene.Scene
import androidx.navigation3.scene.SceneDecoratorStrategy
import androidx.navigation3.scene.SceneDecoratorStrategyScope
import androidx.navigation3.ui.LocalNavAnimatedContentScope
import com.core.designsystem.utility.cacheSize
import kotlin.collections.contains

class SearchBarSceneDecoratorStrategy<T : Any>(
    private val textFieldState: TextFieldState,
    private val sharedTransitionScope: SharedTransitionScope,
    private val topBarContent: @Composable () -> Unit,
) : SceneDecoratorStrategy<T> {

    override fun SceneDecoratorStrategyScope<T>.decorateScene(scene: Scene<T>): Scene<T> {
        val metadata = scene.entries.lastOrNull()?.metadata
        val showDecorator =
            metadata?.contains(IsSearchScreenKey) == true && metadata[IsSearchScreenKey] == true

        if (!showDecorator) {
            textFieldState.clearText()
        }

        return if (showDecorator) {
            SearchTopNavigationScene(
                scene = scene,
                textFieldState = textFieldState,
                sharedTransitionScope = sharedTransitionScope,
                topBarContent = topBarContent,
            )
        } else {
            scene
        }
    }

    companion object {
        internal const val IsSearchScreenKey: String = "IsSearchScreenKey"

        fun searchAppBar(
            isSearchScreen: Boolean,
        ): Map<String, Any> = mapOf(IsSearchScreenKey to isSearchScreen)
    }

}

private data class SearchTopNavigationScene<T : Any>(
    private val scene: Scene<T>,
    private val textFieldState: TextFieldState,
    private val sharedTransitionScope: SharedTransitionScope,
    private val topBarContent: @Composable (() -> Unit),
) : Scene<T> by scene {
    override val key = scene::class to scene.key

    override val content = @Composable {
        val animatedContentScope = LocalNavAnimatedContentScope.current
        val isMovableContentCaller =
            animatedContentScope.transition.targetState == EnterExitState.Visible

        CompositionLocalProvider(LocalSearchBarTextFieldState provides textFieldState) {
            with(sharedTransitionScope) {

                Column(Modifier.fillMaxSize()) {
                    Box(
                        modifier = Modifier
                            .cacheSize(!isMovableContentCaller)
                            .sharedElement(
                                rememberSharedContentState("nav-bar"),
                                animatedContentScope
                            )
                    ) {
                        if (isMovableContentCaller) {
                            topBarContent()
                        }
                    }
                    Box(modifier = Modifier.weight(1f)) {
                        scene.content()
                    }
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun <T : Any> rememberSearchBarSceneDecoratorStrategy(
    topBar: @Composable () -> Unit,
    sharedTransitionScope: SharedTransitionScope,
): SearchBarSceneDecoratorStrategy<T> {
    val currentTopBar by rememberUpdatedState(topBar)
    val movableTopBar = remember { movableContentOf { currentTopBar() } }
    val textFieldState = rememberTextFieldState("")

    return remember(sharedTransitionScope, textFieldState) {
        SearchBarSceneDecoratorStrategy(
            textFieldState = textFieldState,
            sharedTransitionScope = sharedTransitionScope,
            topBarContent = movableTopBar,
        )
    }
}

val LocalSearchBarTextFieldState = compositionLocalOf { TextFieldState() }