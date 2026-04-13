package com.core.user.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.InlineTextContent
import androidx.compose.foundation.text.appendInlineContent
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.Placeholder
import androidx.compose.ui.text.PlaceholderVerticalAlign
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.core.designsystem.icon.StackersIcons
import com.core.designsystem.icon.filled.Cake
import com.core.designsystem.icon.filled.Location
import com.core.user.Res
import com.core.user.data.UserDetailsUiModel
import com.core.user.member_since
import com.core.user.points
import com.core.user.reputation
import com.core.user.ui.UserDetailsViewDefaults.BIRTHDAY_ID
import com.core.user.ui.UserDetailsViewDefaults.LOCATION_ID
import kotlinx.datetime.LocalDate
import org.jetbrains.compose.resources.stringResource

@Composable
internal fun UserHeader(
    uiModel: UserDetailsUiModel,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier.padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
    ) {
        AsyncImage(
            model = uiModel.profileImageUrl,
            contentDescription = null,
            modifier = Modifier
                .size(78.dp)
                .clip(CircleShape)
                .background(MaterialTheme.colorScheme.surfaceVariant)
                .fillMaxSize(),
        )
        Spacer(modifier = Modifier.size(16.dp))
        Text(
            text = uiModel.name,
            style = MaterialTheme.typography.titleLarge,
        )
        Row(
            modifier = Modifier,
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(stringResource(Res.string.reputation))
            Spacer(Modifier.width(4.dp))
            Text(
                text = buildString {
                    append(uiModel.reputation.toString())
                    append(" ")
                    append(stringResource(Res.string.points))
                },
                color = contentColorFor(MaterialTheme.colorScheme.tertiary),
                modifier = Modifier
                    .clip(CircleShape)
                    .background(MaterialTheme.colorScheme.tertiary)
                    .padding(horizontal = 8.dp, vertical = 2.dp),
            )
        }
        Spacer(modifier = Modifier.size(4.dp))
        val displayDate = rememberDisplayDate(uiModel.memberSince)
        Text(
            text = buildAnnotatedString {
                appendInlineContent(BIRTHDAY_ID, "Creation Date")
                append(" ")
                append(stringResource(Res.string.member_since))
                append(" ")
                append(displayDate)
            },
            inlineContent = mapOf(
                BIRTHDAY_ID to InlineTextContent(
                    Placeholder(
                        width = 20.sp,
                        height = 20.sp,
                        placeholderVerticalAlign = PlaceholderVerticalAlign.Center
                    )
                ) {
                    Icon(
                        imageVector = StackersIcons.Filled.Cake,
                        contentDescription = null
                    )
                }
            ))
        Spacer(modifier = Modifier.size(4.dp))
        Text(
            text = buildAnnotatedString {
                appendInlineContent(LOCATION_ID, "Location")
                append(" ")
                append(uiModel.location)
            },
            inlineContent = mapOf(
                LOCATION_ID to InlineTextContent(
                    Placeholder(
                        width = 20.sp,
                        height = 20.sp,
                        placeholderVerticalAlign = PlaceholderVerticalAlign.Center
                    )
                ) {
                    Icon(
                        imageVector = StackersIcons.Filled.Location,
                        contentDescription = null
                    )
                }
            )
        )
    }
}

private data object UserDetailsViewDefaults {
    const val BIRTHDAY_ID = "BirthdayId"
    const val LOCATION_ID = "LocationId"
}