package com.feature.search.sources

import androidx.paging.PagingSource
import com.core.database.data.UserType
import com.core.user.data.BadgeCountsData
import com.core.user.data.UserData
import com.core.user.data.Users
import com.core.user.sources.UserService
import dev.mokkery.answering.returns
import dev.mokkery.answering.throws
import dev.mokkery.everySuspend
import dev.mokkery.matcher.any
import dev.mokkery.mock
import kotlinx.coroutines.test.runTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class SearchUserPagingSourceTest {

    private val userService = mock<UserService>()
    private val search = "test"
    private val pagingSource = SearchUserPagingSource(search, userService)

    @Test
    fun `load returns success on service response`() = runTest {
        val userData = createFakeUserData("1")
        val usersResponse = Users(
            items = listOf(userData),
            hasMore = true,
            quotaMax = 100,
            quotaRemaining = 99
        )

        everySuspend {
            userService.fetchUsers(
                inName = search,
                pageSize = 2,
                page = 1,
                order = any(),
                sort = any()
            )
        } returns usersResponse

        val expectedResult = PagingSource.LoadResult.Page(
            data = listOf(userData),
            prevKey = null,
            nextKey = 2
        )

        val actualResult = pagingSource.load(
            PagingSource.LoadParams.Refresh(
                key = null,
                loadSize = 2,
                placeholdersEnabled = false
            )
        )

        assertTrue(actualResult is PagingSource.LoadResult.Page)
        assertEquals(expectedResult, actualResult)
    }

    @Test
    fun `load returns success when no more data`() = runTest {
        val userData = createFakeUserData("1")
        val usersResponse = Users(
            items = listOf(userData),
            hasMore = false,
            quotaMax = 100,
            quotaRemaining = 99
        )

        everySuspend {
            userService.fetchUsers(
                inName = search,
                pageSize = 2,
                page = 1,
                order = any(),
                sort = any()
            )
        } returns usersResponse

        val expectedResult = PagingSource.LoadResult.Page(
            data = listOf(userData),
            prevKey = null,
            nextKey = null
        )

        val actualResult = pagingSource.load(
            PagingSource.LoadParams.Refresh(
                key = null,
                loadSize = 2,
                placeholdersEnabled = false
            )
        )

        assertTrue(actualResult is PagingSource.LoadResult.Page)
        assertEquals(expectedResult.data, actualResult.data)
    }

    @Test
    fun `load returns error on service exception`() = runTest {
        val exception = Exception("Network error")
        everySuspend {
            userService.fetchUsers(
                inName = search,
                pageSize = 2,
                page = 1,
                order = any(),
                sort = any()
            )
        } throws exception

        val actualResult = pagingSource.load(
            PagingSource.LoadParams.Refresh(
                key = null,
                loadSize = 2,
                placeholdersEnabled = false
            )
        )

        assertTrue(actualResult is PagingSource.LoadResult.Error)
        assertEquals(exception, actualResult.throwable)
    }

    private fun createFakeUserData(id: String) = UserData(
        aboutMe = null,
        acceptRate = null,
        accountId = "acc$id",
        age = null,
        answerCount = null,
        badgeCounts = BadgeCountsData(0, 0, 0),
        collectives = emptyList(),
        creationDate = 0,
        displayName = "User $id",
        downVoteCount = 0,
        isEmployee = false,
        lastAccessDate = 0,
        lastModifiedDate = null,
        link = "",
        location = "",
        profileImage = "",
        questionCount = 0,
        reputation = 0,
        reputationChangeDay = 0,
        reputationChangeMonth = 0,
        reputationChangeQuarter = 0,
        reputationChangeWeek = 0,
        reputationChangeYear = 0,
        timedPenaltyDate = null,
        upVoteCount = 0,
        userId = id,
        userType = UserType.REGISTERED,
        viewCount = 0,
        websiteUrl = ""
    )
}
