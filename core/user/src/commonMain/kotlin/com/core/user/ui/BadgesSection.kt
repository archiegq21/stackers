package com.core.user.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.core.designsystem.icon.StackersIcons
import com.core.designsystem.icon.filled.Trophy
import com.core.user.Res
import com.core.user.bronze_badge
import com.core.user.data.UserDetailsUiModel
import com.core.user.gold_badge
import com.core.user.silver_badge
import com.core.user.ui.BadgeDefaults.BronzeColor
import com.core.user.ui.BadgeDefaults.GoldColor
import com.core.user.ui.BadgeDefaults.SilverColor
import org.jetbrains.compose.resources.stringResource

@Composable
fun BadgesSection(
    uiModel: UserDetailsUiModel,
    modifier: Modifier = Modifier,
) {
    FlowRow(
        modifier = modifier.padding(16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalArrangement = Arrangement.Center,
        itemVerticalAlignment = Alignment.CenterVertically,
    ) {
        Badge(
            count = uiModel.goldBadgeCount,
            type = BadgeType.GOLD,
            modifier = Modifier.weight(1f),
        )
        Badge(
            count = uiModel.silverBadgeCount,
            type = BadgeType.SILVER,
            modifier = Modifier.weight(1f),
        )
        Badge(
            count = uiModel.bronzeBadgeCount,
            type = BadgeType.BRONZE,
            modifier = Modifier.weight(1f),
        )
    }
}

@Composable
private fun Badge(
    count: Int,
    type: BadgeType,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier
            .border(
                border = BorderStroke(1.dp, MaterialTheme.colorScheme.outlineVariant),
                shape = MaterialTheme.shapes.large,
            )
            .padding(8.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start,
    ) {
        Icon(
            imageVector = StackersIcons.Filled.Trophy,
            contentDescription = null,
            tint = when (type) {
                BadgeType.GOLD -> GoldColor
                BadgeType.SILVER -> SilverColor
                BadgeType.BRONZE -> BronzeColor
            },
            modifier = Modifier.size(48.dp)
        )
        Spacer(Modifier.height(4.dp))
        Column(
            modifier = Modifier,
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start,
        ) {
            Text(
                text = count.toString(),
                style = MaterialTheme.typography.titleMedium,
            )
            Spacer(Modifier.height(2.dp))
            Text(
                text = when (type) {
                    BadgeType.GOLD -> stringResource(Res.string.gold_badge)
                    BadgeType.SILVER -> stringResource(Res.string.silver_badge)
                    BadgeType.BRONZE -> stringResource(Res.string.bronze_badge)
                },
                style = MaterialTheme.typography.bodySmall,
            )
        }
    }
}

enum class BadgeType {
    GOLD,
    SILVER,
    BRONZE,
}

private data object BadgeDefaults {
    val GoldColor = Color(0xFFEFBF04)
    val SilverColor = Color(0xFFC4C4C4)
    val BronzeColor = Color(0xFFCE8946)
}