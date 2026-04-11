package com.core.user.data

import com.core.database.data.Role
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CollectiveMembershipData(
    @SerialName("collective") val collective: CollectiveData,
    @SerialName("role") val role: Role,
)
