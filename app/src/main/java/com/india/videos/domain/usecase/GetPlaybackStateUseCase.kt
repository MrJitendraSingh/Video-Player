package com.india.videos.domain.usecase

import com.india.videos.domain.repository.VideoRepository

class GetPlaybackStateUseCase(
    private val repository: VideoRepository
) {
    suspend operator fun invoke(videoId: Long) =
        repository.getPlaybackState(videoId)
}