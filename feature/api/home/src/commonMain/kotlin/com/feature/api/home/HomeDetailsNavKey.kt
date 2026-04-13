package com.feature.api.home

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data class HomeDetailsNavKey(
    val userId: String,
): NavKey