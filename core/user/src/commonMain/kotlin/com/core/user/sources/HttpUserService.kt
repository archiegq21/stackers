package com.core.user.sources

import com.core.user.data.Order
import com.core.user.data.Users
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.request.parameter
import kotlin.time.Instant

internal class HttpUserService(
    private val client: HttpClient,
) : UserService {

    override suspend fun fetchUsers(
        page: Int?,
        pageSize: Int?,
        order: Order,
        fromDate: Instant?,
        toDate: Instant?,
        min: Int?,
        max: Int?,
        sort: String?,
        inName: String?,
    ): Users = client.get("users") {
        page?.let { parameter("page", it) }
        pageSize?.let { parameter("pageSize", it) }
        parameter("order", order)
        fromDate?.let { parameter("fromdate", it.toEpochMilliseconds()) }
        toDate?.let { parameter("todate", it.toEpochMilliseconds()) }
        min?.let { parameter("min", it) }
        max?.let { parameter("max", it) }
        sort?.let { parameter("sort", it) }
        inName?.let { parameter("inname", it) }
    }.body()

}