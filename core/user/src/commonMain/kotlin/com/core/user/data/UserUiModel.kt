package com.core.user.data

import kotlinx.datetime.LocalDate

data class UserUiModel(
    val id: String,
    val name: String,
    val profileImageUrl: String,
    val memberSince: LocalDate,
    val reputation: Int,
)