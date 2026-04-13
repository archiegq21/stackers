package com.core.user.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.core.designsystem.icon.EmptyHero
import com.core.designsystem.icon.StackersIcons
import com.core.user.Res
import com.core.user.select_user_subtitle
import com.core.user.select_user_title
import org.jetbrains.compose.resources.stringResource

@Composable
fun EmptyUserDetails(
    modifier: Modifier = Modifier,
) {
    val background = MaterialTheme.colorScheme.surface
    CompositionLocalProvider(LocalContentColor provides contentColorFor(background)) {
        Column(
            modifier = modifier
                .background(background)
                .padding(24.dp)
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {
            Image(
                imageVector = StackersIcons.Hero.EmptyHero,
                contentDescription = null,
                modifier = Modifier.size(350.dp)
            )
            Spacer(Modifier.height(24.dp))
            Text(
                text = stringResource(Res.string.select_user_title),
                style = MaterialTheme.typography.titleLarge
            )
            Spacer(Modifier.height(8.dp))
            Text(
                text = stringResource(Res.string.select_user_subtitle),
                style = MaterialTheme.typography.bodySmall
            )
        }
    }
}