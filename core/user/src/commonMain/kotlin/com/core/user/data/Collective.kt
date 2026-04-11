package com.core.user.data

data class Collective(
    val description: String,
    val externalLinks: List<ExternalLink>,
    val link: String,
    val name: String,
    val slug: String,
    val tags: Set<String>,
)