package com.core.network

import io.ktor.client.HttpClient
import io.ktor.client.plugins.auth.Auth
import io.ktor.client.plugins.auth.providers.BearerTokens
import io.ktor.client.plugins.auth.providers.bearer
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logging
import io.ktor.client.request.accept
import io.ktor.http.ContentType
import io.ktor.http.contentType
import io.ktor.http.withCharset
import io.ktor.serialization.kotlinx.json.json
import io.ktor.utils.io.charsets.Charsets
import kotlinx.serialization.json.Json

data object Network {

    private val Json = Json {
        encodeDefaults = true
        explicitNulls = false
        ignoreUnknownKeys = true
        isLenient = true
        allowSpecialFloatingPointValues = true
        allowStructuredMapKeys = true
        prettyPrint = true
        useArrayPolymorphism = false
    }

    fun createClient(
        url: String,
        apiKey: String,
    ): HttpClient = HttpClient {
        expectSuccess = true
        defaultRequest {
            accept(ContentType.Application.Json)
            contentType(ContentType.Application.Json)

            url(url)
        }
        install(Auth) {
            bearer {
                loadTokens {
                    BearerTokens(apiKey, null)
                }
            }
        }
        install(ContentNegotiation) {
            json(Json)
        }
        install(Logging) {
            logger = NetworkLogger
            level = if (!NetworkConfig.IS_DEBUG) LogLevel.NONE else LogLevel.ALL
        }
        expectSuccess = true
    }

}