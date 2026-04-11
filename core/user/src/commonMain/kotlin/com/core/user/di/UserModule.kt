package com.core.user.di

import com.core.user.sources.HttpUserService
import com.core.user.sources.RealUserRepository
import com.core.user.sources.UserRepository
import com.core.user.sources.UserService
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val userModule = module {

    singleOf(::HttpUserService) {
        bind<UserService>()
    }

    singleOf(::RealUserRepository) {
        bind<UserRepository>()
    }

}