package com.feature.home.domain

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.ExperimentalPagingApi
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.cachedIn
import androidx.paging.map
import com.core.user.data.User
import com.core.user.data.UserUiModel
import com.core.user.sources.UserRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime

class HomeViewModel(
    private val userRepository: UserRepository,
): ViewModel() {

    @OptIn(ExperimentalPagingApi::class)
    val users: Flow<PagingData<UserUiModel>> =
        userRepository.getStoredPagedUser(
            source = "Home",
            config = PagingConfig(
                initialLoadSize = 300,
                pageSize = 100,
                prefetchDistance = 5,
            ),
        ).map { it.map(::toUserUiModel) }
            .cachedIn(viewModelScope)

    private fun toUserUiModel(user: User): UserUiModel {
        return UserUiModel(
            id = user.userId,
            name = user.displayName,
            profileImageUrl = user.profileImage,
            memberSince = user.creationDate.toLocalDateTime(TimeZone.currentSystemDefault()).date,
            reputation = user.reputation,
        )
    }
}