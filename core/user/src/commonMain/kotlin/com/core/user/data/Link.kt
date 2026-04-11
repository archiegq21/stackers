package com.core.user.data

sealed interface Link {
    val url: String

    data class Website(override val url: String) : Link
    data class Twitter(override val handle: String) : Link

}