package com.core.user.sources

import androidx.paging.ExperimentalPagingApi
import androidx.paging.LoadType
import androidx.paging.PagingState
import androidx.paging.RemoteMediator
import com.core.database.dao.UserDao
import com.core.database.dao.UserRemoteKeyDao
import com.core.database.data.BadgeCountEntity
import com.core.database.data.CollectiveEntity
import com.core.database.data.CollectiveMembershipEntity
import com.core.database.data.ExternalLinkEntity
import com.core.database.data.UserEntity
import com.core.database.data.UserRemoteKeyEntity
import com.core.user.data.BadgeCountsData
import com.core.user.data.CollectiveData
import com.core.user.data.CollectiveMembershipData
import com.core.user.data.ExternalLinkData
import com.core.user.data.Order
import com.core.user.data.Sort
import com.core.user.data.UserData
import kotlin.time.Instant

@OptIn(ExperimentalPagingApi::class)
class UserRemoteMediator(
    private val source: String,
    private val userDao: UserDao,
    private val userService: UserService,
    private val remoteKeyDao: UserRemoteKeyDao,
) : RemoteMediator<Int, UserEntity>() {

    override suspend fun load(
        loadType: LoadType,
        state: PagingState<Int, UserEntity>,
    ): MediatorResult {
        return try {
            val loadKey = when (loadType) {
                LoadType.REFRESH -> null
                LoadType.PREPEND -> return MediatorResult.Success(endOfPaginationReached = true)
                LoadType.APPEND -> {
                    remoteKeyDao.remoteKeyByVideoId(source)
                        ?: return MediatorResult.Success(endOfPaginationReached = true)
                }
            }

            val usersData = userService.fetchUsers(
                page = loadKey?.key ?: 1,
                pageSize = state.config.pageSize,
                order = Order.DESC,
                sort = Sort.CREATION,
            )

            val endOfPaginationReached = !usersData.hasMore

            if (loadType == LoadType.REFRESH) {
                userDao.clearAll()
                remoteKeyDao.deleteBySource(source)
            }

            val entities = usersData.items.map(::toUserEntity)

            val key = UserRemoteKeyEntity(
                source = source,
                key = loadKey?.key?.plus(1) ?: 1
            )

            remoteKeyDao.insert(key)
            userDao.insertAll(entities)

            MediatorResult.Success(endOfPaginationReached = endOfPaginationReached)
        } catch (e: Exception) {
            MediatorResult.Error(e)
        }
    }

    private fun toUserEntity(data: UserData): UserEntity {
        return UserEntity(
            userId = data.userId,
            aboutMe = data.aboutMe,
            acceptRate = data.acceptRate,
            accountId = data.accountId,
            age = data.age,
            answerCount = data.answerCount,
            badgeCounts = toBadgeCountsEntity(data.badgeCounts),
            collectives = toCollectiveMembershipEntities(data.collectives),
            creationDate = Instant.fromEpochMilliseconds(data.creationDate),
            displayName = data.displayName,
            downVoteCount = data.downVoteCount,
            isEmployee = data.isEmployee,
            lastAccessDate = Instant.fromEpochMilliseconds(data.lastAccessDate),
            lastModifiedDate = data.lastModifiedDate?.let(Instant::fromEpochMilliseconds),
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
            timedPenaltyDate = data.timedPenaltyDate?.let(Instant::fromEpochMilliseconds),
            upVoteCount = data.upVoteCount,
            userType = data.userType,
            viewCount = data.viewCount,
            websiteUrl = data.websiteUrl,
        )
    }

    private fun toBadgeCountsEntity(data: BadgeCountsData): BadgeCountEntity {
        return BadgeCountEntity(
            bronze = data.bronze,
            gold = data.gold,
            silver = data.silver,
        )
    }

    private fun toCollectiveMembershipEntities(
        data: List<CollectiveMembershipData>,
    ): List<CollectiveMembershipEntity> {
        return data.map(::toCollectiveMembershipEntity)
    }

    private fun toCollectiveMembershipEntity(data: CollectiveMembershipData): CollectiveMembershipEntity {
        return CollectiveMembershipEntity(
            collective = toCollectiveEntity(data.collective),
            role = data.role,
        )
    }

    private fun toCollectiveEntity(data: CollectiveData): CollectiveEntity {
        return CollectiveEntity(
            description = data.description,
            externalLinks = data.externalLinks.map(::toExternalLinkEntity),
            link = data.link,
            name = data.name,
            slug = data.slug,
            tags = data.tags
        )
    }

    private fun toExternalLinkEntity(data: ExternalLinkData): ExternalLinkEntity {
        return ExternalLinkEntity(
            link = data.link,
            type = data.type,
        )
    }
}
