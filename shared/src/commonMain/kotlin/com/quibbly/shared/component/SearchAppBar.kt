package com.quibbly.shared.component

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.add
import androidx.compose.foundation.layout.displayCutout
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.only
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.text.input.TextFieldState
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import com.core.designsystem.icon.StackersIcons
import com.core.designsystem.icon.filled.ArrowBack

@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun SearchAppBar(
    state: TextFieldState,
    navBackStack: NavBackStack<NavKey>,
    modifier: Modifier = Modifier,
    scrollBehavior: TopAppBarScrollBehavior? = null,
) {
    TopAppBar(
        modifier = modifier,
        navigationIcon = {
            IconButton(onClick = { navBackStack.removeLastOrNull() },) {
                Icon(
                    modifier = Modifier.size(24.dp),
                    imageVector = StackersIcons.Filled.ArrowBack,
                    contentDescription = null,
                )
            }
        },
        title = {
            SearchTextField(
                state = state,
                modifier = Modifier.fillMaxWidth()
            )
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.surface,
            actionIconContentColor = contentColorFor(MaterialTheme.colorScheme.surface),
            navigationIconContentColor = contentColorFor(MaterialTheme.colorScheme.surface),
            subtitleContentColor = contentColorFor(MaterialTheme.colorScheme.surface),
        ),
        scrollBehavior = scrollBehavior,
        windowInsets = WindowInsets.statusBars
            .add(WindowInsets.navigationBars.only(WindowInsetsSides.Horizontal))
            .add(WindowInsets.displayCutout.only(WindowInsetsSides.Horizontal))
    )
}