package com.core.designsystem.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.unit.dp
import com.core.designsystem.icon.AppIcon

@Composable
fun StackersIcon(
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .clip(CircleShape)
            .appIconBackground(),
        contentAlignment = Alignment.Center,
    ) {
        Image(
            imageVector = com.core.designsystem.icon.StackersIcons.AppIcon,
            modifier = Modifier
                .matchParentSize()
                .padding(12.dp),
            contentDescription = null,
        )
    }
}

@Composable
private fun Modifier.appIconBackground() = this.background(
    Brush.linearGradient(
        0.3f to MaterialTheme.colorScheme.primaryContainer,
        0.98f to MaterialTheme.colorScheme.tertiaryContainer,
        start = Offset(0f, 0f),
        end = Offset(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY),
    )
)