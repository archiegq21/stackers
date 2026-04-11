package com.quibbly.shared

import androidx.compose.ui.window.ComposeUIViewController
import platform.UIKit.UIViewController

/**
 * Used on [:apps:stackers:iosApp]
 * */
@Suppress("unused", "FunctionName")
fun StackersAppController(): UIViewController = ComposeUIViewController {
    StackersApp()
}