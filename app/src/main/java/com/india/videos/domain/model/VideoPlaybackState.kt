package com.india.videos.domain.model

data class VideoPlaybackState(
    val videoId: Long,
    val lastPlayedPosition: Long,
    val isCompleted: Boolean,
    val audioLanguage: String?,
    val subtitleLanguage: String?,
    val playbackSpeed: Float,
    val lastWatched: Long
)
