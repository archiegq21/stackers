package com.core.database.data

import androidx.room.Embedded

data class CollectiveMembershipEntity(
    @Embedded val collective: CollectiveEntity,
    val role: Role,
)
