package com.core.database.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class LinkType {
    @SerialName("website")
    WEBSITE,

    @SerialName("twitter")
    TWITTER,

    @SerialName("github")
    GITHUB,

    @SerialName("facebook")
    FACEBOOK,

    @SerialName("instagram")
    INSTAGRAM,

    @SerialName("support")
    SUPPORT,

    @SerialName("linkedin")
    LINKEDIN,

}