package com.feature.search.sources

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.map
import com.core.user.data.BadgeCounts
import com.core.user.data.BadgeCountsData
import com.core.user.data.Collective
import com.core.user.data.CollectiveData
import com.core.user.data.CollectiveMembership
import com.core.user.data.CollectiveMembershipData
import com.core.user.data.ExternalLink
import com.core.user.data.ExternalLinkData
import com.core.user.data.User
import com.core.user.data.UserData
import com.core.user.sources.UserService
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlin.time.Instant

internal class RealSearchRepository(
    private val userService: UserService,
) : SearchRepository {

    override fun getSearchPagedUser(
        search: String,
        config: PagingConfig,
        initialKey: Int?,
    ): Flow<PagingData<User>> = Pager(
        config = config,
        initialKey = initialKey,
        pagingSourceFactory = {
            SearchUserPagingSource(
                search = search,
                userService = userService,
            )
        }
    ).flow.map { it.map(::toUser) }

    private fun toUser(data: UserData): User {
        return User(
            aboutMe = data.aboutMe,
            acceptRate = data.acceptRate,
            accountId = data.accountId,
            age = data.age,
            answerCount = data.answerCount,
            badgeCounts = toBadgeCounts(data.badgeCounts),
            collectives = toCollectives(data.collectives),
            creationDate = Instant.fromEpochSeconds(data.creationDate),
            displayName = data.displayName,
            downVoteCount = data.downVoteCount,
            isEmployee = data.isEmployee,
            lastAccessDate = Instant.fromEpochSeconds(data.lastAccessDate),
            lastModifiedDate = data.lastModifiedDate?.let(Instant::fromEpochSeconds),
            link = data.link,
            location = data.location,
            profileImage = data.profileImage,
            questionCount = data.questionCount,
            reputation = data.reputation,
            reputationChangeDay = data.reputationChangeDay,
            reputationChangeMonth = data.reputationChangeMonth,
            reputationChangeQuarter = data.reputationChangeQuarter,
            reputationChangeWeek = data.reputationChangeWeek,
            reputationChangeYear = data.reputationChangeYear,
            timedPenaltyDate = data.timedPenaltyDate?.let(Instant::fromEpochSeconds),
            upVoteCount = data.upVoteCount,
            userId = data.userId,
            userType = data.userType,
            viewCount = data.viewCount,
            websiteUrl = data.websiteUrl,
        )
    }

    private fun toBadgeCounts(data: BadgeCountsData): BadgeCounts {
        return BadgeCounts(
            bronze = data.bronze,
            gold = data.gold,
            silver = data.silver,
        )
    }

    private fun toCollectives(data: List<CollectiveMembershipData>): List<CollectiveMembership> {
        return data.map(::toCollectiveMembership)
    }

    private fun toCollectiveMembership(data: CollectiveMembershipData): CollectiveMembership {
        return CollectiveMembership(
            collective = toCollective(data.collective),
            role = data.role,
        )
    }

    private fun toCollective(data: CollectiveData): Collective {
        return Collective(
            description = data.description,
            externalLinks = toExternalLinks(data.externalLinks),
            link = data.link,
            name = data.name,
            slug = data.slug,
            tags = data.tags
        )
    }

    private fun toExternalLinks(data: List<ExternalLinkData>): List<ExternalLink> {
        return data.map(::toExternalLink)
    }

    private fun toExternalLink(data: ExternalLinkData): ExternalLink {
        return ExternalLink(
            link = data.link,
            type = data.type,
        )
    }

    override suspend fun getUser(id: String): User? {
        val userData = userService.fetchUser(id = id)
        return userData?.let(::toUser)
    }

}