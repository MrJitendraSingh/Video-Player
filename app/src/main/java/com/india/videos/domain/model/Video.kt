package com.india.videos.domain.model

data class Video(
    val id: Long,
    val folderId: Long,
    val name: String,
    val path: String,
    val duration: Long,
    val size: Long,
    val resolution: String?,
    val thumbnailUri: String?
)