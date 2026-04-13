package com.feature.search.sources

import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.core.user.data.User
import kotlinx.coroutines.flow.Flow

interface SearchRepository {

    fun getSearchPagedUser(
        search: String,
        config: PagingConfig,
        initialKey: Int? = null,
    ): Flow<PagingData<User>>

    suspend fun getUser(id: String): User?

}