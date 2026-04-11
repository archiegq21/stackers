package com.quibbly.shared

import androidx.compose.runtime.Composable
import co.touchlab.kermit.Logger
import co.touchlab.kermit.koin.KermitKoinLogger
import com.feature.home.di.homeModule
import org.koin.compose.KoinApplication
import org.koin.core.annotation.KoinExperimentalAPI
import org.koin.core.logger.Level
import org.koin.dsl.KoinAppDeclaration
import org.koin.dsl.koinConfiguration

@OptIn(KoinExperimentalAPI::class)
@Composable
internal fun StackersDependencyProvider(
    content: @Composable () -> Unit,
) {
    KoinApplication(
        configuration = koinConfiguration(declaration),
        logLevel = Level.DEBUG,
        content = content
    )
}

private val declaration: KoinAppDeclaration = {
    logger(KermitKoinLogger(Logger.withTag("koin")))
    modules(
        homeModule,
    )
}