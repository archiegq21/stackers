package com.core.user.sources

import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.core.user.data.User
import kotlinx.coroutines.flow.Flow

interface UserRepository {

    fun getStoredPagedUser(
        source: String,
        config: PagingConfig,
        initialKey: Int? = null,
    ): Flow<PagingData<User>>

}