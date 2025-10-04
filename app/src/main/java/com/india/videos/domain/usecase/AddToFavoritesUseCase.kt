package com.india.videos.domain.usecase

import com.india.videos.domain.repository.VideoRepository

class AddToFavoritesUseCase(
    private val repository: VideoRepository
) {
    suspend operator fun invoke(videoId: Long) =
        repository.addToFavorites(videoId)
}