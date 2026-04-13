package com.core.user.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.mohamedrejeb.richeditor.model.rememberRichTextState
import com.mohamedrejeb.richeditor.ui.material.RichText

@Composable
internal fun AboutMeSection(
    markdown: String,
    modifier: Modifier = Modifier,
) {
    val richTextState = rememberRichTextState()
    val linkColor = MaterialTheme.colorScheme.tertiary
    LaunchedEffect(Unit, linkColor) {
        richTextState.setMarkdown(markdown)
        richTextState.config.linkColor = linkColor
    }

    val background = MaterialTheme.colorScheme.background
    CompositionLocalProvider(LocalContentColor provides contentColorFor(background)) {
        Column(
            modifier = modifier.padding(16.dp),
        ) {
            Text(
                text = "About Me",
                style = MaterialTheme.typography.titleLarge,
                modifier = Modifier
            )
            Spacer(Modifier.height(8.dp))
            RichText(
                color = contentColorFor(background),
                state = richTextState,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}