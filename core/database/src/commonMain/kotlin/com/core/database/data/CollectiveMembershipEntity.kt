package com.core.database.data

import androidx.room.Embedded
import kotlinx.serialization.Serializable

@Serializable
data class CollectiveMembershipEntity(
    @Embedded val collective: CollectiveEntity,
    val role: Role,
)
