package com.core.user.data

import com.core.database.data.LinkType

data class ExternalLink(
    val link: String,
    val type: LinkType,
)