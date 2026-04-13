package com.feature.home.domain

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.core.user.data.User
import com.core.user.data.UserDetailsUiModel
import com.core.user.sources.UserRepository
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime

internal class HomeDetailsViewModel(
    userId: String,
    userRepository: UserRepository,
) : ViewModel() {

    val uiModelFlow = userRepository.getUser(userId)
        .map { it?.let(::toUserDetailsUiModel) }
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5_000), null)

    private fun toUserDetailsUiModel(user: User): UserDetailsUiModel {
        return UserDetailsUiModel(
            name = user.displayName,
            profileImageUrl = user.profileImage,
            memberSince = user.creationDate.toLocalDateTime(TimeZone.currentSystemDefault()).date,
            reputation = user.reputation,
            location = user.location,
            goldBadgeCount = user.badgeCounts.gold,
            silverBadgeCount = user.badgeCounts.silver,
            bronzeBadgeCount = user.badgeCounts.bronze,
            aboutMe = user.aboutMe ?: "",
        )
    }
}