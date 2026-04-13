package com.core.user.sources

import com.core.user.data.Order
import com.core.user.data.Sort
import io.ktor.client.HttpClient
import io.ktor.client.engine.mock.MockEngine
import io.ktor.client.engine.mock.respond
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.http.ContentType
import io.ktor.http.HttpHeaders
import io.ktor.http.HttpStatusCode
import io.ktor.http.headersOf
import io.ktor.serialization.kotlinx.json.json
import kotlinx.coroutines.test.runTest
import kotlinx.serialization.json.Json
import kotlin.test.Test
import kotlin.test.assertEquals

class HttpUserServiceTest {

    private val json = Json {
        explicitNulls = false
        ignoreUnknownKeys = true
        isLenient = true
    }

    @Test
    fun fetchUsersReturnsUsers() = runTest {
        val mockEngine = MockEngine { _ ->
            respond(
                content = """
                    {
                        "items": [
                            {
                                "user_id": "1",
                                "display_name": "John Doe",
                                "account_id": "123",
                                "badge_counts": { "bronze": 1, "gold": 2, "silver": 3 },
                                "creation_date": 1609459200,
                                "down_vote_count": 0,
                                "is_employee": false,
                                "last_access_date": 1609459200,
                                "link": "http://example.com",
                                "profile_image": "http://example.com/img",
                                "question_count": 10,
                                "reputation": 100,
                                "reputation_change_day": 0,
                                "reputation_change_month": 0,
                                "reputation_change_quarter": 0,
                                "reputation_change_week": 0,
                                "reputation_change_year": 0,
                                "up_vote_count": 5,
                                "user_type": "registered",
                                "view_count": 0,
                                "website_url": "",
                                "about_me": "",
                                "accept_rate": 0,
                                "answer_count": 0,
                                "collectives": [],
                                "last_modified_date": 0,
                                "timed_penalty_date": 0
                            }
                        ],
                        "has_more": false,
                        "quota_max": 300,
                        "quota_remaining": 299
                    }
                """.trimIndent(),
                status = HttpStatusCode.OK,
                headers = headersOf(HttpHeaders.ContentType, ContentType.Application.Json.toString())
            )
        }

        val httpClient = HttpClient(mockEngine) {
            install(ContentNegotiation) {
                json(json)
            }
        }

        val userService = HttpUserService(httpClient)
        val result = userService.fetchUsers(
            page = 1,
            pageSize = 30,
            order = Order.DESC,
            sort = Sort.REPUTATION
        )

        assertEquals(1, result.items.size)
        assertEquals("John Doe", result.items[0].displayName)
        assertEquals("1", result.items[0].userId)
    }
}
