package com.core.user.ui

import androidx.compose.animation.core.animateDpAsState
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ProvideTextStyle
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.core.user.Res
import com.core.user.data.UserUiModel
import com.core.user.member_since
import com.core.user.points
import com.core.user.reputation
import com.rolengi.nyuza.library.placeholder.shimmer
import kotlinx.datetime.LocalDate
import org.jetbrains.compose.resources.stringResource

@Composable
fun UserCard(
    uiModel: UserUiModel,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    selected: Boolean = false,
) {
    UserCard(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        selected = selected,
        image = {
            AsyncImage(
                model = uiModel.profileImageUrl,
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
            )
        },
        name = { Text(uiModel.name) },
        memberSince = {
            val displayDate = rememberDisplayDate(uiModel.memberSince)
            Text(buildString {
                append(stringResource(Res.string.member_since))
                append(" ")
                append(displayDate)
            })
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
    )
}

@Composable
fun LoadingUserCard(
    modifier: Modifier = Modifier,
) {
    UserCard(
        onClick = {},
        modifier = modifier,
        enabled = false,
        selected = false,
        image = {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .shimmer(true, RectangleShape)
            )
        },
        name = {
            Text(
                text = "",
                modifier = Modifier
                    .fillMaxWidth(0.8f)
                    .padding(bottom = 2.dp)
                    .shimmer(true)
            )
        },
        memberSince = {
            Text(
                text = "",
                modifier = Modifier
                    .fillMaxWidth(0.4f)
                    .padding(bottom = 2.dp)
                    .shimmer(true)
            )
        },
        reputation = {
            Text(
                text = "",
                modifier = Modifier
                    .fillMaxWidth(0.6f)
                    .padding(bottom = 2.dp)
                    .shimmer(true)
            )
        },
    )
}

@Composable
private fun UserCard(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    selected: Boolean = true,
    image: @Composable () -> Unit,
    name: @Composable () -> Unit,
    memberSince: @Composable () -> Unit,
    reputation: @Composable () -> Unit,
) {
    val elevation by animateDpAsState(if (selected) 2.dp else 0.dp)

    Surface(
        selected = selected,
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        shape = RoundedCornerShape(16.dp),
        color = MaterialTheme.colorScheme.surface,
        tonalElevation = elevation,
        shadowElevation = elevation,
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Top,
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Box(
                    modifier = Modifier
                        .clip(CircleShape)
                        .background(MaterialTheme.colorScheme.surfaceVariant)
                        .size(64.dp)
                ) {
                    image()
                }
                Spacer(Modifier.width(16.dp))
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.Start,
                    verticalArrangement = Arrangement.Top,
                ) {
                    ProvideTextStyle(MaterialTheme.typography.titleLarge) {
                        name()
                    }
                    Spacer(Modifier.width(12.dp))
                    ProvideTextStyle(MaterialTheme.typography.bodyMedium) {
                        memberSince()
                    }
                    Spacer(Modifier.width(8.dp))
                    ProvideTextStyle(MaterialTheme.typography.bodyMedium) {
                        reputation()
                    }
                }
            }
        }
    }
}

@Preview
@Composable
private fun UserCardPreview() {
    UserCard(
        uiModel = UserUiModel(
            id = "1",
            name = "John Doe",
            profileImageUrl = "https://example.com/image.jpg",
            memberSince = LocalDate(2023, 1, 1),
            reputation = 1000,
        ),
        modifier = Modifier.width(320.dp),
        onClick = {}
    )
}

@Preview
@Composable
private fun LoadingUserCardPreview() {
    LoadingUserCard(
        modifier = Modifier.width(320.dp),
    )
}
