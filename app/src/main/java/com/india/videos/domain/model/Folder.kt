package com.india.videos.domain.model

data class Folder(
    val id: Long,
    val name: String,
    val path: String,
    val totalVideos: Int
)