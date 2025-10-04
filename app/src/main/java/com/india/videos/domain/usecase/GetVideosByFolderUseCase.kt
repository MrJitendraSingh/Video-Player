package com.india.videos.domain.usecase

import com.india.videos.domain.model.Video
import com.india.videos.domain.repository.VideoRepository

class GetVideosByFolderUseCase(
    private val repository: VideoRepository
) {
    suspend operator fun invoke(folderId: Long): List<Video> {
        return repository.getVideosByFolder(folderId)
    }
}