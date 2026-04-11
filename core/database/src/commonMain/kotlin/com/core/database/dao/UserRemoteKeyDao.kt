package com.core.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.core.database.data.UserRemoteKeyEntity

@Dao
interface UserRemoteKeyDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(key: UserRemoteKeyEntity)

    @Query("SELECT * FROM UserRemoteKeyEntity WHERE source = :source")
    suspend fun remoteKeyByVideoId(source: String): UserRemoteKeyEntity?

    @Query("DELETE FROM UserRemoteKeyEntity WHERE source = :source")
    suspend fun deleteBySource(source: String)

    @Query("DELETE FROM UserRemoteKeyEntity")
    suspend fun clearAll()
}