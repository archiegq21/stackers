package com.core.user.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class Sort {
    @SerialName("reputation") REPUTATION,
    @SerialName("creation") CREATION,
    @SerialName("name") NAME,
    @SerialName("modified") MODIFIED,
}