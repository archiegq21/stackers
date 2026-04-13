package com.feature.home.domain

import com.core.database.data.UserType
import com.core.user.data.BadgeCounts
import com.core.user.data.User
import com.core.user.sources.UserRepository
import dev.mokkery.answering.returns
import dev.mokkery.every
import dev.mokkery.mock
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.test.runTest
import kotlin.time.Instant
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class HomeDetailsViewModelTest {

    private val userRepository = mock<UserRepository>()
    private val userId = "1"

    @Test
    fun `uiModelFlow should emit mapped UserDetailsUiModel`() = runTest {
        val creationDate = Instant.fromEpochMilliseconds(0)
        val user = User(
            userId = userId,
            displayName = "Test User",
            profileImage = "url",
            creationDate = Instant.fromEpochMilliseconds(0),
            reputation = 100,
            aboutMe = "About me",
            acceptRate = null,
            accountId = "acc1",
            age = null,
            answerCount = null,
            badgeCounts = BadgeCounts(1, 2, 3),
            collectives = emptyList(),
            downVoteCount = 0,
            isEmployee = false,
            lastAccessDate = Instant.fromEpochMilliseconds(0),
            lastModifiedDate = null,
            link = "",
            location = "Location",
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

        every { userRepository.getUser(userId) } returns flowOf(user)

        val viewModel = HomeDetailsViewModel(userId, userRepository)
        val uiModel = viewModel.uiModelFlow.first { it != null }

        assertNotNull(uiModel)
        assertEquals(user.displayName, uiModel.name)
        assertEquals(user.profileImage, uiModel.profileImageUrl)
        assertEquals(creationDate.toLocalDateTime(TimeZone.currentSystemDefault()).date, uiModel.memberSince)
        assertEquals(user.reputation, uiModel.reputation)
        assertEquals(user.location, uiModel.location)
        assertEquals(user.badgeCounts.gold, uiModel.goldBadgeCount)
        assertEquals(user.badgeCounts.silver, uiModel.silverBadgeCount)
        assertEquals(user.badgeCounts.bronze, uiModel.bronzeBadgeCount)
        assertEquals(user.aboutMe, uiModel.aboutMe)
    }
}
