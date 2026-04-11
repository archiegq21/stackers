package com.core.user.sources

import com.core.user.data.Order
import com.core.user.data.Sort
import com.core.user.data.Users
import kotlin.time.Instant

interface UserService {

    suspend fun fetchUsers(
        page: Int? = null,
        pageSize: Int? = null,
        order: Order = Order.DESC,
        fromDate: Instant? = null,
        toDate: Instant? = null,
        min: Int? = null,
        max: Int? = null,
        sort: Sort? = null,
        inName: String? = null,
    ): Users

}