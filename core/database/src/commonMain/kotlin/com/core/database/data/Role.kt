package com.core.database.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class Role {
    @SerialName("admin") ADMIN,
    @SerialName("recognized_member") RECOGNIZED_MEMBER,
    @SerialName("member") MEMBER,
    @SerialName("analyst") ANALYST,
    @SerialName("limited_recognized_member") LIMITED_RECOGNIZE_MEMBER,
}