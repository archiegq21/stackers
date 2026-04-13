package com.core.user.sources

import com.core.database.dao.UserDao
import com.core.database.dao.UserRemoteKeyDao
import com.core.database.data.BadgeCountEntity
import com.core.database.data.UserEntity
import com.core.database.data.UserType
import dev.mokkery.answering.returns
import dev.mokkery.every
import dev.mokkery.everySuspend
import dev.mokkery.matcher.any
import dev.mokkery.mock
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.test.runTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.time.Instant

class RealUserRepositoryTest {

    private val userDao = mock<UserDao> {
        every { getUserById(any()) } returns flowOf(
            UserEntity(
                userId = "1",
                aboutMe = "About me",
                acceptRate = 90,
                accountId = "123",
                age = 30,
                answerCount = 50,
                badgeCounts = BadgeCountEntity(1, 2, 3),
                collectives = emptyList(),
                creationDate = Instant.fromEpochMilliseconds(1609459200000),
                displayName = "John Doe",
                downVoteCount = 0,
                isEmployee = false,
                lastAccessDate = Instant.fromEpochMilliseconds(1609459200000),
                lastModifiedDate = null,
                link = "http://example.com",
                location = "London",
                profileImage = "http://example.com/img",
                questionCount = 10,
                reputation = 100,
                reputationChangeDay = 0,
                reputationChangeMonth = 0,
                reputationChangeQuarter = 0,
                reputationChangeWeek = 0,
                reputationChangeYear = 0,
                timedPenaltyDate = null,
                upVoteCount = 5,
                userType = UserType.REGISTERED,
                viewCount = 10,
                websiteUrl = "http://example.com"
            )
        )
    }

    private val userService = mock<UserService>()

    private val remoteKeyDao = mock<UserRemoteKeyDao> {
        everySuspend { remoteKeyByVideoId(any()) } returns null
    }

    @Test
    fun getUserReturnsMappedUser() = runTest {
        val repository = RealUserRepository(userDao, userService, remoteKeyDao)
        val user = repository.getUser("1").first()

        assertEquals("1", user?.userId)
        assertEquals("John Doe", user?.displayName)
        assertEquals(100, user?.reputation)
    }
}
