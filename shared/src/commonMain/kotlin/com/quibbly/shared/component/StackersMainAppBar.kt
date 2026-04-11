package com.quibbly.shared.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.input.TextFieldLineLimits
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.core.designsystem.app_name
import com.core.designsystem.components.CollapsingTopBar
import com.core.designsystem.components.StackersIcon
import com.core.designsystem.icon.StackersIcons
import com.core.designsystem.icon.filled.MoreVert
import com.core.designsystem.icon.filled.Search
import com.core.user.search_users
import org.jetbrains.compose.resources.stringResource

@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun StackersMainAppBar(
    modifier: Modifier = Modifier,
    scrollBehavior: TopAppBarScrollBehavior? = null,
) {
    CollapsingTopBar(
        actions = {
            IconButton(
                onClick = {

                },
            ) {
                Icon(
                    modifier = Modifier.size(24.dp),
                    imageVector = StackersIcons.Filled.MoreVert,
                    contentDescription = null,
                )
            }
        },
        topStart = {
            Row(
                modifier = Modifier
                    .padding(horizontal = 16.dp, vertical = 8.dp,),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                StackersIcon(Modifier.size(48.dp))
                Spacer(Modifier.width(8.dp))
                Text(
                    text = stringResource(com.core.designsystem.Res.string.app_name),
                    style = MaterialTheme.typography.headlineSmall,
                )
            }
        },
        containerBar = {
            OutlinedTextField(
                state = rememberTextFieldState(""),
                readOnly = true,
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
                    IconButton(
                        onClick = {

                        },
                    ) {
                        Icon(
                            modifier = Modifier.size(24.dp),
                            imageVector = StackersIcons.Filled.Search,
                            contentDescription = null,
                        )
                    }
                },
                modifier = Modifier
                    .padding(horizontal = 16.dp, vertical = 8.dp)
                    .fillMaxWidth()
                    .clickable {
                        println("helo")
                    }
            )
        },
        modifier = modifier,
        elevation = 0.dp,
        scrolledElevation = 8.dp,
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.surface,
            actionIconContentColor = contentColorFor(MaterialTheme.colorScheme.surface),
            navigationIconContentColor = contentColorFor(MaterialTheme.colorScheme.surface),
            subtitleContentColor = contentColorFor(MaterialTheme.colorScheme.surface),
        ),
        scrollBehavior = scrollBehavior,
    )
}