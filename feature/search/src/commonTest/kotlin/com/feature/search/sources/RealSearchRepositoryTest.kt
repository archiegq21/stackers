package com.feature.search.sources

import androidx.paging.PagingConfig
import com.core.database.data.UserType
import com.core.user.data.BadgeCountsData
import com.core.user.data.UserData
import com.core.user.sources.UserService
import dev.mokkery.answering.returns
import dev.mokkery.everySuspend
import dev.mokkery.mock
import kotlinx.coroutines.test.runTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertNull

class RealSearchRepositoryTest {

    private val userService = mock<UserService>()
    private val repository = RealSearchRepository(userService)

    @Test
    fun `getUser should return mapped user when service returns data`() = runTest {
        val userId = "123"
        val userData = UserData(
            aboutMe = "Bio",
            acceptRate = 80,
            accountId = "acc123",
            age = 25,
            answerCount = 10,
            badgeCounts = BadgeCountsData(1, 2, 3),
            collectives = emptyList(),
            creationDate = 1600000000000,
            displayName = "John Doe",
            downVoteCount = 2,
            isEmployee = false,
            lastAccessDate = 1610000000000,
            lastModifiedDate = null,
            link = "link",
            location = "London",
            profileImage = "img",
            questionCount = 5,
            reputation = 1000,
            reputationChangeDay = 0,
            reputationChangeMonth = 0,
            reputationChangeQuarter = 0,
            reputationChangeWeek = 0,
            reputationChangeYear = 0,
            timedPenaltyDate = null,
            upVoteCount = 50,
            userId = userId,
            userType = UserType.REGISTERED,
            viewCount = 100,
            websiteUrl = "site"
        )

        everySuspend { userService.fetchUser(userId) } returns userData

        val result = repository.getUser(userId)

        assertNotNull(result)
        assertEquals("John Doe", result.displayName)
        assertEquals(1000, result.reputation)
        assertEquals(userId, result.userId)
    }

    @Test
    fun `getUser should return null when service returns null`() = runTest {
        val userId = "nonexistent"
        everySuspend { userService.fetchUser(userId) } returns null

        val result = repository.getUser(userId)

        assertNull(result)
    }

    @Test
    fun `getSearchPagedUser should return flow of paging data`() = runTest {
        val flow = repository.getSearchPagedUser(
            search = "test",
            config = PagingConfig(pageSize = 20)
        )

        assertNotNull(flow)
    }
}
