package com.core.user.sources

import androidx.paging.ExperimentalPagingApi
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.map
import com.core.database.dao.UserDao
import com.core.database.dao.UserRemoteKeyDao
import com.core.database.data.BadgeCountEntity
import com.core.database.data.CollectiveEntity
import com.core.database.data.CollectiveMembershipEntity
import com.core.database.data.ExternalLinkEntity
import com.core.database.data.UserEntity
import com.core.user.data.BadgeCounts
import com.core.user.data.Collective
import com.core.user.data.CollectiveMembership
import com.core.user.data.ExternalLink
import com.core.user.data.User
import kotlinx.coroutines.flow.map

internal class RealUserRepository(
    private val userDao: UserDao,
    private val userService: UserService,
    private val remoteKeyDao: UserRemoteKeyDao,
) : UserRepository {

    @OptIn(ExperimentalPagingApi::class)
    override fun getStoredPagedUser(
        source: String,
        config: PagingConfig,
        initialKey: Int?,
    ) = Pager(
        config = config,
        initialKey = initialKey,
        remoteMediator = UserRemoteMediator(
            source = source,
            userDao = userDao,
            userService = userService,
            remoteKeyDao = remoteKeyDao,
        ),
        pagingSourceFactory = { userDao.userPagingSource() }
    ).flow.map { it.map(::toUser) }

    private fun toUser(entity: UserEntity): User {
        return User(
            aboutMe = entity.aboutMe,
            acceptRate = entity.acceptRate,
            accountId = entity.accountId,
            age = entity.age,
            answerCount = entity.answerCount,
            badgeCounts = toBadgeCount(entity.badgeCounts),
            collectives = toCollectives(entity.collectives),
            creationDate = entity.creationDate,
            displayName = entity.displayName,
            downVoteCount = entity.downVoteCount,
            isEmployee = entity.isEmployee,
            lastAccessDate = entity.lastAccessDate,
            lastModifiedDate = entity.lastModifiedDate,
            link = entity.link,
            location = entity.location,
            profileImage = entity.profileImage,
            questionCount = entity.questionCount,
            reputation = entity.reputation,
            reputationChangeDay = entity.reputationChangeDay,
            reputationChangeMonth = entity.reputationChangeMonth,
            reputationChangeQuarter = entity.reputationChangeQuarter,
            reputationChangeWeek = entity.reputationChangeWeek,
            reputationChangeYear = entity.reputationChangeYear,
            timedPenaltyDate = entity.timedPenaltyDate,
            upVoteCount = entity.upVoteCount,
            userId = entity.userId,
            userType = entity.userType,
            viewCount = entity.viewCount,
            websiteUrl = entity.websiteUrl,
        )
    }

    private fun toBadgeCount(entity: BadgeCountEntity): BadgeCounts {
        return BadgeCounts(
            bronze = entity.bronze,
            gold = entity.gold,
            silver = entity.silver,
        )
    }

    private fun toCollectives(entities: List<CollectiveMembershipEntity>): List<CollectiveMembership> {
        return entities.map(::toCollectiveMembership)
    }

    private fun toCollectiveMembership(entity: CollectiveMembershipEntity): CollectiveMembership {
        return CollectiveMembership(
            collective = toCollective(entity.collective),
            role = entity.role,
        )
    }

    private fun toCollective(entity: CollectiveEntity): Collective {
        return Collective(
            description = entity.description,
            externalLinks = entity.externalLinks.map(::toExternalLink),
            link = entity.link,
            name = entity.name,
            slug = entity.slug,
            tags = entity.tags
        )
    }

    private fun toExternalLink(entity: ExternalLinkEntity): ExternalLink {
        return ExternalLink(
            link = entity.link,
            type = entity.type,
        )
    }
}