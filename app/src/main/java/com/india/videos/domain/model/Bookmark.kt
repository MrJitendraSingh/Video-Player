package com.india.videos.domain.model

data class Bookmark(
    val id: Long,
    val videoId: Long,
    val timestamp: Long,
    val note: String?
)