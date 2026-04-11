package com.core.user.data

import com.core.database.data.Role

data class CollectiveMembership(
    val collective: Collective,
    val role: Role,
)