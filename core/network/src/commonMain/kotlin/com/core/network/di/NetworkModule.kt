package com.core.network.di

import com.core.network.Network
import com.core.network.NetworkConfig
import io.ktor.client.HttpClient
import org.koin.dsl.module

val networkModule = module {

    single<HttpClient> {
        Network.createClient(
            url = "https://api.stackexchange.com/2.3/",
            apiKey = NetworkConfig.API_KEY,
        )
    }

}