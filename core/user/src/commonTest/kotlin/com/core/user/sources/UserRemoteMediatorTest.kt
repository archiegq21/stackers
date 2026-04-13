package com.core.user.sources

import androidx.paging.ExperimentalPagingApi
import androidx.paging.LoadType
import androidx.paging.PagingConfig
import androidx.paging.PagingState
import androidx.paging.RemoteMediator
import com.core.database.dao.UserDao
import com.core.database.dao.UserRemoteKeyDao
import com.core.database.data.UserEntity
import com.core.database.data.UserRemoteKeyEntity
import com.core.database.data.UserType
import com.core.user.data.BadgeCountsData
import com.core.user.data.UserData
import com.core.user.data.Users
import dev.mokkery.answering.calls
import dev.mokkery.answering.returns
import dev.mokkery.everySuspend
import dev.mokkery.matcher.any
import dev.mokkery.mock
import dev.mokkery.verify.VerifyMode.Companion.exactly
import dev.mokkery.verifySuspend
import kotlinx.coroutines.test.runTest
import kotlin.test.Test
import kotlin.test.assertTrue

@OptIn(ExperimentalPagingApi::class)
class UserRemoteMediatorTest {

    private val userDao = mock<UserDao>()
    private val userService = mock<UserService>()
    private val remoteKeyDao = mock<UserRemoteKeyDao>()
    private val source = "test_source"

    private val mediator = UserRemoteMediator(
        source = source,
        userDao = userDao,
        userService = userService,
        remoteKeyDao = remoteKeyDao
    )

    @Test
    fun refreshLoadReturnsSuccessWhenMoreDataIsPresent() = runTest {
        val userData = createUserData("1")
        val usersResponse = Users(
            items = listOf(userData),
            hasMore = true,
            quotaMax = 100,
            quotaRemaining = 100
        )

        everySuspend { userService.fetchUsers(any(), any(), any(), any(), any(), any(), any(), any(), any(), any()) } returns usersResponse
        everySuspend { remoteKeyDao.remoteKeyByVideoId(any()) } returns null
        everySuspend { userDao.clearAll() } returns Unit
        everySuspend { remoteKeyDao.deleteBySource(any()) } returns Unit
        everySuspend { userDao.insertAll(any()) } returns Unit
        everySuspend { remoteKeyDao.insert(any()) } returns Unit

        val pagingState = PagingState<Int, UserEntity>(
            pages = emptyList(),
            anchorPosition = null,
            config = PagingConfig(pageSize = 10),
            leadingPlaceholderCount = 0
        )

        val result = mediator.load(LoadType.REFRESH, pagingState)

        assertTrue(result is RemoteMediator.MediatorResult.Success)
        assertTrue(!result.endOfPaginationReached)

        verifySuspend(exactly(1)) { userDao.clearAll() }
        verifySuspend(exactly(1)) { remoteKeyDao.deleteBySource(source) }
        verifySuspend(exactly(1)) { userDao.insertAll(any()) }
        verifySuspend(exactly(1)) { remoteKeyDao.insert(any()) }
    }

    @Test
    fun prependLoadReturnsSuccessWithEndOfPagination() = runTest {
        val pagingState = PagingState<Int, UserEntity>(
            pages = emptyList(),
            anchorPosition = null,
            config = PagingConfig(pageSize = 10),
            leadingPlaceholderCount = 0
        )

        val result = mediator.load(LoadType.PREPEND, pagingState)

        assertTrue(result is RemoteMediator.MediatorResult.Success)
        assertTrue(result.endOfPaginationReached)
    }

    @Test
    fun appendLoadReturnsSuccessWithEndOfPaginationWhenNoRemoteKey() = runTest {
        everySuspend { remoteKeyDao.remoteKeyByVideoId(source) } returns null

        val pagingState = PagingState<Int, UserEntity>(
            pages = emptyList(),
            anchorPosition = null,
            config = PagingConfig(pageSize = 10),
            leadingPlaceholderCount = 0
        )

        val result = mediator.load(LoadType.APPEND, pagingState)

        assertTrue(result is RemoteMediator.MediatorResult.Success)
        assertTrue(result.endOfPaginationReached)
    }

    @Test
    fun appendLoadReturnsSuccessWhenMoreDataIsPresent() = runTest {
        val remoteKey = UserRemoteKeyEntity(source = source, key = 2)
        val userData = createUserData("2")
        val usersResponse = Users(
            items = listOf(userData),
            hasMore = true,
            quotaMax = 100,
            quotaRemaining = 100
        )

        everySuspend { remoteKeyDao.remoteKeyByVideoId(source) } returns remoteKey
        everySuspend { userService.fetchUsers(any(), any(), any(), any(), any(), any(), any(), any(), any(), any()) } returns usersResponse
        everySuspend { userDao.insertAll(any()) } returns Unit
        everySuspend { remoteKeyDao.insert(any()) } returns Unit

        val pagingState = PagingState<Int, UserEntity>(
            pages = emptyList(),
            anchorPosition = null,
            config = PagingConfig(pageSize = 10),
            leadingPlaceholderCount = 0
        )

        val result = mediator.load(LoadType.APPEND, pagingState)

        assertTrue(result is RemoteMediator.MediatorResult.Success)
        assertTrue(!result.endOfPaginationReached)

        verifySuspend(exactly(1)) { userService.fetchUsers(page = 2, any(), any(), any(), any(), any(), any(), any(), any(), any()) }
        verifySuspend(exactly(1)) { userDao.insertAll(any()) }
        verifySuspend(exactly(1)) { remoteKeyDao.insert(any()) }
    }

    @Test
    fun loadReturnsErrorResultWhenExceptionOccurs() = runTest {
        everySuspend { userService.fetchUsers(any(), any(), any(), any(), any(), any(), any(), any(), any(), any()) } calls { throw RuntimeException("Network error") }

        val pagingState = PagingState<Int, UserEntity>(
            pages = emptyList(),
            anchorPosition = null,
            config = PagingConfig(pageSize = 10),
            leadingPlaceholderCount = 0
        )

        val result = mediator.load(LoadType.REFRESH, pagingState)

        assertTrue(result is RemoteMediator.MediatorResult.Error)
    }

    private fun createUserData(userId: String) = UserData(
        userId = userId,
        aboutMe = null,
        acceptRate = null,
        accountId = "acc$userId",
        age = null,
        answerCount = null,
        badgeCounts = BadgeCountsData(0, 0, 0),
        collectives = emptyList(),
        creationDate = 0,
        displayName = "User $userId",
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
        userType = UserType.REGISTERED,
        viewCount = 0,
        websiteUrl = ""
    )
}
