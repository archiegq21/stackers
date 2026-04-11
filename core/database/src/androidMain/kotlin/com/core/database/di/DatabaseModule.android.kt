package com.core.database.di

import androidx.room.RoomDatabase
import com.core.database.AppDatabase
import com.core.database.getDatabaseBuilder
import org.koin.android.ext.koin.androidContext
import org.koin.core.module.Module

internal actual fun Module.platformModule() {

    single<RoomDatabase.Builder<AppDatabase>> {
        getDatabaseBuilder(androidContext())
    }

}