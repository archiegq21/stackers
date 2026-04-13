package com.core.designsystem.decorator

import androidx.compose.animation.EnterExitState
import androidx.compose.animation.SharedTransitionScope
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.movableContentOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Modifier
import androidx.navigation3.scene.Scene
import androidx.navigation3.scene.SceneDecoratorStrategy
import androidx.navigation3.scene.SceneDecoratorStrategyScope
import androidx.navigation3.ui.LocalNavAnimatedContentScope
import com.core.designsystem.utility.cacheSize
import kotlin.collections.contains

class MainTopBarSceneDecoratorStrategy<T : Any>(
    private val sharedTransitionScope: SharedTransitionScope,
    private val topBarContent: @Composable () -> Unit,
) : SceneDecoratorStrategy<T> {

    override fun SceneDecoratorStrategyScope<T>.decorateScene(scene: Scene<T>): Scene<T> {
        val metadata =  scene.entries.lastOrNull()?.metadata
        val showDecorator = metadata?.contains(IsMainScreenKey) == true && metadata[IsMainScreenKey] == true

        return if (showDecorator) {
            TopNavigationScene(
                scene = scene,
                sharedTransitionScope = sharedTransitionScope,
                topBarContent = topBarContent,
            )
        } else {
            scene
        }
    }

    companion object {
        internal const val IsMainScreenKey: String = "IsMainScreenKey"

        fun mainAppBar(
            isHome: Boolean,
        ): Map<String, Any> = mapOf(IsMainScreenKey to isHome)
    }

}

private data class TopNavigationScene<T : Any>(
    private val scene: Scene<T>,
    private val sharedTransitionScope: SharedTransitionScope,
    private val topBarContent: @Composable (() -> Unit),
) : Scene<T> by scene {
    override val key = scene::class to scene.key

    override val content = @Composable {
        val animatedContentScope = LocalNavAnimatedContentScope.current
        val isMovableContentCaller =
            animatedContentScope.transition.targetState == EnterExitState.Visible

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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun <T : Any> rememberTopBarSceneDecoratorStrategy(
    topBar: @Composable () -> Unit,
    sharedTransitionScope: SharedTransitionScope,
): MainTopBarSceneDecoratorStrategy<T> {
    val currentTopBar by rememberUpdatedState(topBar)
    val movableTopBar = remember { movableContentOf { currentTopBar() } }

    return remember(sharedTransitionScope) {
        MainTopBarSceneDecoratorStrategy(
            sharedTransitionScope = sharedTransitionScope,
            topBarContent = movableTopBar,
        )
    }
}