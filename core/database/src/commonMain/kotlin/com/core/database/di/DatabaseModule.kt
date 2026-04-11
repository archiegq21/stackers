package com.core.database.di

import com.core.database.AppDatabase
import com.core.database.dao.UserDao
import com.core.database.dao.UserRemoteKeyDao
import com.core.database.getRoomDatabase
import org.koin.core.module.Module
import org.koin.dsl.module

val databaseModule = module {

    single<AppDatabase> {
        getRoomDatabase(get())
    }

    single<UserDao> {
        get<AppDatabase>().userDao()
    }

    single<UserRemoteKeyDao> {
        get<AppDatabase>().userRemoteKeyDao()
    }

    platformModule()

}

internal expect fun Module.platformModule()