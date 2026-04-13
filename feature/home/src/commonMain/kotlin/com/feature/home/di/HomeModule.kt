package com.feature.home.di

import com.feature.home.domain.HomeViewModel
import com.feature.home.domain.HomeDetailsViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val homeModule = module {

    viewModelOf(::HomeViewModel)

    viewModelOf(::HomeDetailsViewModel)

}