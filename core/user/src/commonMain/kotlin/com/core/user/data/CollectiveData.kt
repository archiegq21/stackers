package com.core.user.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CollectiveData(
    @SerialName("description") val description: String,
    @SerialName("external_links") val externalLinks: List<ExternalLinkData>,
    @SerialName("link") val link: String,
    @SerialName("name") val name: String,
    @SerialName("slug") val slug: String,
    @SerialName("tags") val tags: Set<String>,
)
