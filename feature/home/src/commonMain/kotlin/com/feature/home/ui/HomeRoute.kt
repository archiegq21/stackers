package com.feature.home.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.feature.home.domain.HomeViewModel
import org.koin.compose.viewmodel.koinViewModel

@Composable
internal fun HomeRoute(
    viewModel: HomeViewModel = koinViewModel(),
    modifier: Modifier = Modifier,
) {

}