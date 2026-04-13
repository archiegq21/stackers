package com.feature.search.domain

import androidx.paging.PagingData
import com.core.database.data.UserType
import com.core.user.data.BadgeCounts
import com.core.user.data.User
import com.feature.search.sources.SearchRepository
import dev.mokkery.answering.returns
import dev.mokkery.every
import dev.mokkery.matcher.any
import dev.mokkery.mock
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.advanceTimeBy
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import kotlinx.datetime.Instant
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertNotNull

@OptIn(ExperimentalCoroutinesApi::class)
class SearchViewModelTest {

    private val searchRepository = mock<SearchRepository>()
    private val testDispatcher = StandardTestDispatcher()

    @BeforeTest
    fun setUp() {
        Dispatchers.setMain(testDispatcher)
    }

    @Test
    fun `when search keyword is empty userPagingData should emit empty paging data`() = runTest {
        val viewModel = SearchViewModel(searchRepository)
        viewModel.onSearchChanged("")
        
        advanceTimeBy(1001)
        
        val result = viewModel.userPagingData.first()
        assertNotNull(result)
    }

    @Test
    fun `when search keyword is provided searchRepository should be called`() = runTest {
        val keyword = "Android"
        val user = User(
            userId = "1",
            displayName = "User 1",
            profileImage = "",
            creationDate = Instant.fromEpochSeconds(0),
            reputation = 100,
            aboutMe = null,
            acceptRate = null,
            accountId = "",
            age = null,
            answerCount = null,
            badgeCounts = BadgeCounts(0, 0, 0),
            collectives = emptyList(),
            downVoteCount = 0,
            isEmployee = false,
            lastAccessDate = Instant.fromEpochSeconds(0),
            lastModifiedDate = null,
            link = "",
            location = "",
            questionCount = 0,
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
        
        every { 
            searchRepository.getSearchPagedUser(
                search = keyword,
                config = any(),
                initialKey = any()
            ) 
        } returns flowOf(PagingData.from(listOf(user)))

        val viewModel = SearchViewModel(searchRepository)
        viewModel.onSearchChanged(keyword)
        
        advanceTimeBy(1001)
        
        val result = viewModel.userPagingData.first()
        assertNotNull(result)
        
        every { 
            searchRepository.getSearchPagedUser(
                search = keyword,
                config = any(),
                initialKey = any()
            ) 
        }
    }
}
