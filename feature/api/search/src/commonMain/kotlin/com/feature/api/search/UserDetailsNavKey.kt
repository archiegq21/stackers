package com.feature.api.search

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data class UserDetailsNavKey(
    val userId: String,
): NavKey