package com.india.videos.domain.usecase

import com.india.videos.domain.model.VideoPlaybackState
import com.india.videos.domain.repository.VideoRepository

class SavePlaybackStateUseCase(
    private val repository: VideoRepository
) {
    suspend operator fun invoke(
        videoId: Long,
        lastPosition: Long,
        isCompleted: Boolean,
        audioLanguage: String?,
        subtitleLanguage: String?,
        speed: Float
    ) {
        repository.savePlaybackState(
            VideoPlaybackState(
                videoId = videoId,
                lastPlayedPosition = lastPosition,
                isCompleted = isCompleted,
                audioLanguage = audioLanguage,
                subtitleLanguage = subtitleLanguage,
                playbackSpeed = speed,
                lastWatched = System.currentTimeMillis()
            )
        )
    }
}