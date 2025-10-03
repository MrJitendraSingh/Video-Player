package com.india.videos.data.room.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "video_playback_state")
data class VideoPlaybackStateEntity(
    @PrimaryKey val videoId: Long, // Same as in VideoEntity
    val lastPlayedPosition: Long = 0L, // in milliseconds
    val isCompleted: Boolean = false,
    val audioLanguage: String? = null,
    val subtitleLanguage: String? = null,
    val playbackSpeed: Float = 1.0f,
    val lastWatched: Long = System.currentTimeMillis()
)