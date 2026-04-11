package com.core.network

import io.ktor.client.plugins.logging.Logger

data object NetworkLogger: Logger {
    override fun log(message: String) {
        if (message.length > 4000) {
            val chunkCount: Int = message.length / 4000
            for (i in 0..chunkCount) {
                val max = 4000 * (i + 1)
                if (max >= message.length) {
                    co.touchlab.kermit.Logger.i(
                        message.substring(4000 * i),
                        tag = "http"
                    )
                } else {
                    co.touchlab.kermit.Logger.i(
                        message.substring(4000 * i, max),
                        tag = "http"
                    )
                }
            }
        } else {
            co.touchlab.kermit.Logger.i(message, tag = "http")
        }
    }
}