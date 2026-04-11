package com.core.database.data

data class CollectiveEntity(
    val description: String,
    val externalLinks: List<ExternalLinkEntity>,
    val link: String,
    val name: String,
    val slug: String,
    val tags: Set<String>,
)
