package com.core.user.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Users(
    @SerialName("items") val items: List<UserData>,
    @SerialName("has_more") val hasMore: Boolean,
    @SerialName("quota_max") val quotaMax: Int,
    @SerialName("quota_remaining") val quotaRemaining: Int,
)