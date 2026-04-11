package com.quibbly.shared

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import androidx.navigation3.runtime.rememberNavBackStack
import com.core.designsystem.theme.DawnTheme
import com.feature.api.home.HomeNavKey


@Composable
fun StackersApp() {
    val backStack: NavBackStack<NavKey> = rememberNavBackStack(Config, HomeNavKey)

    StackersDependencyProvider {
        DawnTheme(
            dynamicColor = true,
        ) {
            StackersNavigation(
                modifier = Modifier.fillMaxWidth(),
                backStack = backStack,
                onBack = { backStack.removeLastOrNull() },
            )
        }
    }
}