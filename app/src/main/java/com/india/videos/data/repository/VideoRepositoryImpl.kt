package com.india.videos.data.repository

import com.india.videos.data.mapper.toDomain
import com.india.videos.data.mapper.toEntity
import com.india.videos.data.room.VideoDao
import com.india.videos.data.room.entity.FavoriteEntity
import com.india.videos.domain.model.Bookmark
import com.india.videos.domain.model.Folder
import com.india.videos.domain.model.Video
import com.india.videos.domain.model.VideoPlaybackState
import com.india.videos.domain.repository.VideoRepository
import javax.inject.Inject

class VideoRepositoryImpl @Inject constructor(
    private val dao: VideoDao
) : VideoRepository {

    override suspend fun getAllFolders(): List<Folder> {
        return dao.getAllFolders().map { it.toDomain() }
    }

    override suspend fun getVideosByFolder(folderId: Long): List<Video> {
        return dao.getVideosByFolder(folderId).map { it.toDomain() }
    }

    override suspend fun getVideoById(videoId: Long): Video? {
        return dao.getVideosByFolder(videoId).firstOrNull()?.toDomain()
    }

    override suspend fun savePlaybackState(state: VideoPlaybackState) {
        dao.savePlaybackState(state.toEntity())
    }

    override suspend fun getPlaybackState(videoId: Long): VideoPlaybackState? {
        return dao.getPlaybackState(videoId)?.toDomain()
    }

    override suspend fun addToFavorites(videoId: Long) {
        dao.addToFavorites(FavoriteEntity(videoId = videoId))
    }

    override suspend fun getFavoriteVideos(): List<Video> {
        return dao.getFavoriteVideos().map { it.toDomain() }
    }

    override suspend fun removeFromFavorites(videoId: Long) {
        dao.removeFromFavorites(videoId)
    }

    override suspend fun addBookmark(bookmark: Bookmark) {
        dao.addBookmark(bookmark.toEntity())
    }

    override suspend fun getBookmarks(videoId: Long): List<Bookmark> {
        return dao.getBookmarks(videoId).map { it.toDomain() }
    }

    override suspend fun removeBookmark(bookmarkId: Long) {
        dao.removeBookmark(bookmarkId)
    }
}