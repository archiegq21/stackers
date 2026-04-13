package com.feature.search.domain

import app.cash.turbine.test
import com.core.database.data.UserType
import com.core.user.data.BadgeCounts
import com.core.user.data.User
import com.feature.search.sources.SearchRepository
import dev.mokkery.answering.returns
import dev.mokkery.answering.throws
import dev.mokkery.everySuspend
import dev.mokkery.mock
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.advanceUntilIdle
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import kotlin.time.Instant

@OptIn(ExperimentalCoroutinesApi::class)
class SearchUserDetailViewModelTest {

    private val searchRepository = mock<SearchRepository>()
    private val testDispatcher = StandardTestDispatcher()

    @BeforeTest
    fun setUp() {
        Dispatchers.setMain(testDispatcher)
    }

    @Test
    fun `loadUser should emit success when repository returns user`() = runTest {
        val userId = "123"
        val user = User(
            userId = userId,
            displayName = "Jane Doe",
            profileImage = "https://example.com/image.png",
            creationDate = Instant.fromEpochSeconds(1600000000),
            reputation = 500,
            aboutMe = "Developer",
            acceptRate = 90,
            accountId = "acc123",
            age = 30,
            answerCount = 50,
            badgeCounts = BadgeCounts(1, 2, 3),
            collectives = emptyList(),
            downVoteCount = 5,
            isEmployee = false,
            lastAccessDate = Instant.fromEpochSeconds(1610000000),
            lastModifiedDate = null,
            link = "https://example.com",
            location = "New York",
            questionCount = 10,
            reputationChangeDay = 1,
            reputationChangeMonth = 10,
            reputationChangeQuarter = 50,
            reputationChangeWeek = 5,
            reputationChangeYear = 200,
            timedPenaltyDate = null,
            upVoteCount = 100,
            userType = UserType.REGISTERED,
            viewCount = 1000,
            websiteUrl = "https://example.com"
        )

        everySuspend { searchRepository.getUser(userId) } returns user

        val viewModel = SearchUserDetailViewModel(userId, searchRepository)

        viewModel.userStateFlow.test {
            assertTrue(awaitItem() is UserState.Loading)

            advanceUntilIdle()

            val state = awaitItem()
            assertTrue(state is UserState.Success)
            assertEquals("Jane Doe", state.user.name)
            assertEquals(500, state.user.reputation)
            assertEquals("Developer", state.user.aboutMe)
        }
    }

    @Test
    fun `loadUser should emit error when repository throws exception`() = runTest {
        val userId = "123"
        everySuspend { searchRepository.getUser(userId) } throws Exception("Network error")

        val viewModel = SearchUserDetailViewModel(userId, searchRepository)

        viewModel.userStateFlow.test {
            assertTrue(awaitItem() is UserState.Loading)

            advanceUntilIdle()

            val state = awaitItem()
            assertTrue(state is UserState.Error)
        }
    }

    @Test
    fun `loadUser should emit error when repository returns null`() = runTest {
        val userId = "123"
        everySuspend { searchRepository.getUser(userId) } returns null

        val viewModel = SearchUserDetailViewModel(userId, searchRepository)

        viewModel.userStateFlow.test {
            assertTrue(awaitItem() is UserState.Loading)

            advanceUntilIdle()

            val value = awaitItem()
            assertTrue(value is UserState.Error)
        }
    }
}
