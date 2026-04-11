package com.core.user.sources

import com.core.network.NetworkConfig
import com.core.user.data.Order
import com.core.user.data.Sort
import com.core.user.data.Users
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.request.parameter
import io.ktor.http.appendPathSegments
import io.ktor.http.encodeURLParameter
import io.ktor.http.parameters
import kotlinx.serialization.json.Json
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
        sort: Sort?,
        inName: String?,
        site: String,
    ): Users = client.get {
        url {
            appendPathSegments("users")
            encodedParameters.apply {
                append("order", order.jsonToEncodedParameters())
                sort?.let { append("sort", sort.jsonToEncodedParameters()) }
                inName?.let { append("inname", it) }
                append("site", site)
                append("filter", "!T3Audpe81eZTLAf2z2")
                append("key", NetworkConfig.API_KEY)
            }
            page?.let { parameter("page", it) }
            pageSize?.let { parameter("pageSize", it) }
            fromDate?.let { parameter("fromdate", it.toEpochMilliseconds()) }
            toDate?.let { parameter("todate", it.toEpochMilliseconds()) }
            min?.let { parameter("min", it) }
            max?.let { parameter("max", it) }
        }
    }.body()

    private inline fun <reified T> T.jsonToEncodedParameters() =
        Json.encodeToString(this).removeSurrounding(prefix = "\"", suffix = "\"")

}