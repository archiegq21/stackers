package com.core.user.data

import com.core.database.data.UserType
import kotlinx.datetime.Instant

data class User(
    val aboutMe: String?,
    val acceptRate: Int?,
    val accountId: String,
    val age: Int?,
    val answerCount: Int?,
    val badgeCounts: BadgeCounts,
    val collectives: List<CollectiveMembership>,
    val creationDate: Instant,
    val displayName: String,
    val downVoteCount: Int,
    val isEmployee: Boolean,
    val lastAccessDate: Instant,
    val lastModifiedDate: Instant?,
    val link: String,
    val location: String,
    val profileImage: String,
    val questionCount: Int,
    val reputation: Int,
    val reputationChangeDay: Int,
    val reputationChangeMonth: Int,
    val reputationChangeQuarter: Int,
    val reputationChangeWeek: Int,
    val reputationChangeYear: Int,
    val timedPenaltyDate: Instant?,
    val upVoteCount: Int,
    val userId: String,
    val userType: UserType,
    val viewCount: Int,
    val websiteUrl: String,
)