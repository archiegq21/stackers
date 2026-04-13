package com.feature.search.di

import com.feature.search.domain.SearchUserDetailViewModel
import com.feature.search.domain.SearchViewModel
import com.feature.search.sources.RealSearchRepository
import com.feature.search.sources.SearchRepository
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val searchModule = module {

    singleOf(::RealSearchRepository) {
        bind<SearchRepository>()
    }

    viewModelOf(::SearchViewModel)

    viewModelOf(::SearchUserDetailViewModel)

}