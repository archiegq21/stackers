package com.feature.search.domain

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.LoadState
import androidx.paging.LoadStates
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.cachedIn
import androidx.paging.map
import com.core.user.data.User
import com.core.user.data.UserUiModel
import com.feature.search.sources.SearchRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.map
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime

class SearchViewModel(
    private val searchRepository: SearchRepository,
): ViewModel() {

    fun getPagingDataFlow(keyword: String): Flow<PagingData<UserUiModel>> {
        return if (keyword.isEmpty()) {
            flowOf(PagingData.empty(
                sourceLoadStates = LoadStates(
                    refresh = LoadState.NotLoading(true),
                    prepend = LoadState.NotLoading(true),
                    append = LoadState.NotLoading(true),
                )
            ))
        } else {
            searchRepository.getSearchPagedUser(
                search = keyword,
                config = PagingConfig(
                    initialLoadSize = 20,
                    pageSize = 10,
                    prefetchDistance = 5,
                ),
            ).map { it.map(::toUserUiModel) }
                .cachedIn(viewModelScope)
        }
    }

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