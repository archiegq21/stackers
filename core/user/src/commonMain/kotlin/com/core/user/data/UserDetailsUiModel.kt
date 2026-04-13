package com.core.user.data

import kotlinx.datetime.LocalDate

data class UserDetailsUiModel(
    val name: String,
    val profileImageUrl: String,
    val memberSince: LocalDate,
    val reputation: Int,
    val location: String,
    val goldBadgeCount: Int,
    val silverBadgeCount: Int,
    val bronzeBadgeCount: Int,
    val aboutMe: String,
)