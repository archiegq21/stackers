package com.feature.search.domain

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.core.user.data.User
import com.core.user.data.UserDetailsUiModel
import com.feature.search.sources.SearchRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime

class SearchUserDetailViewModel(
    private val userId: String,
    private val searchRepository: SearchRepository,
) : ViewModel() {

    private val userState = MutableStateFlow<UserState>(UserState.Loading)
    val userStateFlow = userState
        .onStart { loadUser() }
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5_000), UserState.Loading)

    fun loadUser() {
        viewModelScope.launch {
            userState.value = UserState.Loading

            try {
                val user = searchRepository.getUser(userId)!!
                userState.value = UserState.Success(toUserDetailsUiModel(user))
            } catch (_: Exception) {
                userState.value = UserState.Error
            }
        }
    }

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

sealed interface UserState {
    object Loading : UserState
    data class Success(val user: UserDetailsUiModel) : UserState
    data object Error : UserState
}