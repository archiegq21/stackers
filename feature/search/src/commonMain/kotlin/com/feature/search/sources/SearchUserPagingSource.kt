package com.feature.search.sources

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.core.user.data.Order
import com.core.user.data.Sort
import com.core.user.data.UserData
import com.core.user.sources.UserService

internal class SearchUserPagingSource(
    private val search: String,
    private val userService: UserService,
) : PagingSource<Int, UserData>() {

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, UserData> {
        return try {
            val page = params.key ?: 1
            val users = userService.fetchUsers(
                inName = search,
                pageSize = params.loadSize,
                page = page,
                order = Order.DESC,
                sort = Sort.CREATION,
            )

            LoadResult.Page(
                data = users.items,
                prevKey = null,
                nextKey = if (users.hasMore) page + 1 else null
            )
        } catch (e: Exception) {
            LoadResult.Error(e)
        }
    }

    override fun getRefreshKey(state: PagingState<Int, UserData>): Int? {
        return null
    }

}