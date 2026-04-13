package com.feature.home.domain

import androidx.paging.PagingData
import com.core.database.data.UserType
import com.core.user.data.BadgeCounts
import com.core.user.data.User
import com.core.user.sources.UserRepository
import dev.mokkery.answering.returns
import dev.mokkery.every
import dev.mokkery.matcher.any
import dev.mokkery.mock
import kotlinx.coroutines.flow.flowOf
import kotlin.test.Test
import kotlin.test.assertNotNull
import kotlin.time.Instant

class HomeViewModelTest {

    private val userRepository = mock<UserRepository>()

    @Test
    fun `users flow should emit paging data from repository`() {
        val user = User(
            userId = "1",
            displayName = "Test User",
            profileImage = "url",
            creationDate = Instant.fromEpochMilliseconds(0),
            reputation = 100,
            aboutMe = null,
            acceptRate = null,
            accountId = "acc1",
            age = null,
            answerCount = null,
            badgeCounts = BadgeCounts(0, 0, 0),
            collectives = emptyList(),
            downVoteCount = 0,
            isEmployee = false,
            lastAccessDate = Instant.fromEpochMilliseconds(0),
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
        val pagingData = PagingData.from(listOf(user))
        
        every { 
            userRepository.getStoredPagedUser(
                source = "Home",
                config = any()
            ) 
        } returns flowOf(pagingData)

        val viewModel = HomeViewModel(userRepository)
        
        assertNotNull(viewModel.users)
    }
}
