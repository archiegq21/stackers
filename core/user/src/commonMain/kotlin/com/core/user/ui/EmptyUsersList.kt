package com.core.user.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.core.designsystem.icon.StackersIcons
import com.core.designsystem.icon.filled.SearchOff
import com.core.user.Res
import com.core.user.empty_user_list
import org.jetbrains.compose.resources.stringResource

@Composable
fun EmptyUsersList(
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier.padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Icon(
            imageVector = StackersIcons.Filled.SearchOff,
            contentDescription = null,
            modifier = Modifier.size(64.dp)
        )
        Spacer(Modifier.height(8.dp))
        Text(
            text = stringResource(Res.string.empty_user_list),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.titleSmall,
        )
    }
}