package com.core.database.util

import androidx.room.TypeConverter
import com.core.database.data.CollectiveMembershipEntity
import com.core.database.data.ExternalLinkEntity
import kotlinx.serialization.json.Json

data object ListConverters {

    @TypeConverter
    fun fromCollectiveMembershipEntityString(
        value: String
    ): List<CollectiveMembershipEntity> = Json.decodeFromString(value)

    @TypeConverter
    fun fromCollectiveMembershipEntityList(
        list: List<CollectiveMembershipEntity>
    ): String = Json.encodeToString(list)

    @TypeConverter
    fun fromExternalLinkEntityString(
        value: String
    ): List<ExternalLinkEntity> = Json.decodeFromString(value)

    @TypeConverter
    fun fromExternalLinkEntityList(
        list: List<ExternalLinkEntity>
    ): String = Json.encodeToString(list)

}