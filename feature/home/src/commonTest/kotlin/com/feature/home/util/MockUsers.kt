package com.feature.home.util

import com.core.database.data.UserType
import com.core.user.data.BadgeCounts
import com.core.user.data.User
import kotlin.time.Instant

fun createMockUser(
    id: String = "1",
    name: String = "John Doe",
    reputation: Int = 1000,
    location: String = "World",
    aboutMe: String = "I am a mock user",
    creationDate: Instant = Instant.fromEpochMilliseconds(1609459200000), // 2021-01-01
): User {
    return User(
        aboutMe = aboutMe,
        acceptRate = 90,
        accountId = "acc_$id",
        age = 30,
        answerCount = 50,
        badgeCounts = BadgeCounts(gold = 1, silver = 5, bronze = 10),
        collectives = emptyList(),
        creationDate = creationDate,
        displayName = name,
        downVoteCount = 0,
        isEmployee = false,
        lastAccessDate = creationDate,
        lastModifiedDate = null,
        link = "https://stackoverflow.com/users/$id",
        location = location,
        profileImage = "https://example.com/img_$id.png",
        questionCount = 10,
        reputation = reputation,
        reputationChangeDay = 0,
        reputationChangeMonth = 0,
        reputationChangeQuarter = 0,
        reputationChangeWeek = 0,
        reputationChangeYear = 0,
        timedPenaltyDate = null,
        upVoteCount = 5,
        userId = id,
        userType = UserType.REGISTERED,
        viewCount = 100,
        websiteUrl = "https://example.com/$id"
    )
}
