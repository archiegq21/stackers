package com.core.database.data

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlin.time.Instant

@Entity
data class UserEntity(
    @PrimaryKey val userId: String,
    val aboutMe: String?,
    val acceptRate: Int?,
    val accountId: String,
    val age: Int?,
    val answerCount: Int?,
    @Embedded val badgeCounts: BadgeCountEntity,
    @Embedded val collectives: List<CollectiveMembershipEntity>,
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
    val userType: UserType,
    val viewCount: Int,
    val websiteUrl: String,
)