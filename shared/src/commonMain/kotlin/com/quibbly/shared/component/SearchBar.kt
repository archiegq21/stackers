package com.quibbly.shared.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.input.TextFieldLineLimits
import androidx.compose.foundation.text.input.TextFieldState
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.core.designsystem.icon.StackersIcons
import com.core.designsystem.icon.filled.Search
import com.core.user.search_users
import org.jetbrains.compose.resources.stringResource

@Composable
fun SearchTextField(
    state: TextFieldState,
    readOnly: Boolean = false,
    modifier: Modifier = Modifier,
) {
    OutlinedTextField(
        state = state,
        readOnly = readOnly,
        lineLimits = TextFieldLineLimits.SingleLine,
        placeholder = {
            Text(
                text = stringResource(com.core.user.Res.string.search_users),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
            )
        },
        shape = CircleShape,
        trailingIcon = {
            Icon(
                modifier = Modifier.size(24.dp),
                imageVector = StackersIcons.Filled.Search,
                contentDescription = null,
            )
        },
        modifier = modifier
    )
}