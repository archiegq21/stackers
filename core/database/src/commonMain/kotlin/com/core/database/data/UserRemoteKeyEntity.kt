package com.core.database.data

import androidx.room.Entity
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.PrimaryKey
import androidx.room.Query

@Entity
data class UserRemoteKeyEntity(
    @PrimaryKey val source: String,
    val key: Int,
)