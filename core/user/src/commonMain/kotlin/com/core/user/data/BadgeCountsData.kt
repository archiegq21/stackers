package com.core.user.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class BadgeCountsData(
    @SerialName("bronze") val bronze: Int,
    @SerialName("gold") val gold: Int,
    @SerialName("silver") val silver: Int
)