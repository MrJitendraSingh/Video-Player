package com.india.videos.domain.usecase

data class VideoUseCases(
    val getVideosByFolder: GetVideosByFolderUseCase,
    val getPlaybackState: GetPlaybackStateUseCase,
    val savePlaybackState: SavePlaybackStateUseCase,
    val addToFavorites: AddToFavoritesUseCase,
    val getFavoriteVideos: GetFavoriteVideosUseCase
)