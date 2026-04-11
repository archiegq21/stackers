package com.core.database.data

import kotlinx.serialization.Serializable

@Serializable
data class ExternalLinkEntity(
    val link: String,
    val type: LinkType,
)

