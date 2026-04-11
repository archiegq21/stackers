package com.core.user.data

import com.core.database.data.UserType
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.time.Instant

@Serializable
data class UserData(
    @SerialName("about_me") val aboutMe: String?,
    @SerialName("accept_rate") val acceptRate: Int?,
    @SerialName("account_id") val accountId: String,
    @SerialName("age") val age: Int?,
    @SerialName("answer_count") val answerCount: Int?,
    @SerialName("badge_counts") val badgeCounts: BadgeCountsData,
    @SerialName("collectives") val collectives: List<CollectiveMembershipData>,
    @SerialName("creation_date") val creationDate: Instant,
    @SerialName("display_name") val displayName: String,
    @SerialName("down_vote_count") val downVoteCount: Int,
    @SerialName("is_employee") val isEmployee: Boolean,
    @SerialName("last_access_date") val lastAccessDate: Instant,
    @SerialName("last_modified_date") val lastModifiedDate: Instant?,
    @SerialName("link") val link: String,
    @SerialName("location") val location: String,
    @SerialName("profile_image") val profileImage: String,
    @SerialName("question_count") val questionCount: Int,
    @SerialName("reputation") val reputation: Int,
    @SerialName("reputation_change_day") val reputationChangeDay: Int,
    @SerialName("reputation_change_month") val reputationChangeMonth: Int,
    @SerialName("reputation_change_quarter") val reputationChangeQuarter: Int,
    @SerialName("reputation_change_week") val reputationChangeWeek: Int,
    @SerialName("reputation_change_year") val reputationChangeYear: Int,
    @SerialName("timed_penalty_date") val timedPenaltyDate: Instant?,
    @SerialName("up_vote_count") val upVoteCount: Int,
    @SerialName("user_id") val userId: String,
    @SerialName("user_type") val userType: UserType,
    @SerialName("viewCount") val viewCount: Int,
    @SerialName("website_url") val websiteUrl: String,
)