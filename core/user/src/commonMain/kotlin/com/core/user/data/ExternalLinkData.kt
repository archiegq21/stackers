package com.core.user.data

import com.core.database.data.LinkType
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class ExternalLinkData(
    @SerialName("link") val link: String,
    @SerialName("type") val type: LinkType,
)

