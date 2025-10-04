package com.india.videos.domain.usecase

import com.india.videos.domain.repository.VideoRepository

class GetFavoriteVideosUseCase(
    private val repository: VideoRepository
) {
    suspend operator fun invoke() =
        repository.getFavoriteVideos()
}