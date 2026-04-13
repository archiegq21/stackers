package com.core.user.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.InlineTextContent
import androidx.compose.foundation.text.appendInlineContent
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ProvideTextStyle
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
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
import com.mohamedrejeb.richeditor.model.rememberRichTextState
import com.mohamedrejeb.richeditor.ui.material3.RichText
import com.rolengi.nyuza.library.placeholder.shimmer
import org.jetbrains.compose.resources.stringResource

@Composable
internal fun UserHeader(
    uiModel: UserDetailsUiModel,
    modifier: Modifier = Modifier,
) {
    val name = rememberRichTextState()
    LaunchedEffect(uiModel.name) {
        name.setHtml(uiModel.name)
    }

    UserHeader(
        image = {
            AsyncImage(
                model = uiModel.profileImageUrl,
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
            )
        },
        name = {
            RichText(
                state = name,
                style = MaterialTheme.typography.titleLarge,
            )
        },
        reputation = {
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
        },
        memberSince = {
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
        },
        location = {
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
        },
        modifier = modifier,
    )
}

@Composable
fun LoadingUserHeader(
    modifier: Modifier = Modifier,
) {
    UserHeader(
        image = {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .shimmer(true, CircleShape)
            )
        },
        name = {
            Text(
                text = "",
                modifier = Modifier
                    .fillMaxWidth(0.8f)
                    .padding(bottom = 2.dp)
                    .shimmer(true, CircleShape)
            )
        },
        reputation = {
            Text(
                text = "",
                modifier = Modifier
                    .fillMaxWidth(0.8f)
                    .padding(bottom = 2.dp)
                    .shimmer(true, CircleShape)
            )
        },
        memberSince = {
            Text(
                text = "",
                modifier = Modifier
                    .fillMaxWidth(0.8f)
                    .padding(bottom = 2.dp)
                    .shimmer(true, CircleShape)
            )
        },
        location = {
            Text(
                text = "",
                modifier = Modifier
                    .fillMaxWidth(0.8f)
                    .padding(bottom = 2.dp)
                    .shimmer(true, CircleShape)
            )
        },
        modifier = modifier,
    )
}

@Composable
private fun UserHeader(
    image: @Composable () -> Unit,
    name: @Composable () -> Unit,
    reputation: @Composable () -> Unit,
    memberSince: @Composable () -> Unit,
    location: @Composable () -> Unit,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier.padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
    ) {
        Box(
            Modifier.size(78.dp)
                .clip(CircleShape)
                .background(MaterialTheme.colorScheme.surfaceVariant)
        ) {
            image()
        }
        Spacer(modifier = Modifier.size(16.dp))
        ProvideTextStyle(MaterialTheme.typography.titleLarge) {
            name()
        }
        reputation()
        Spacer(modifier = Modifier.size(4.dp))
        memberSince()
        Spacer(modifier = Modifier.size(4.dp))
        location()
    }
}

private data object UserDetailsViewDefaults {
    const val BIRTHDAY_ID = "BirthdayId"
    const val LOCATION_ID = "LocationId"
}