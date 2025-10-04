package com.india.videos.domain.repository

import com.india.videos.domain.model.Bookmark
import com.india.videos.domain.model.Folder
import com.india.videos.domain.model.Video
import com.india.videos.domain.model.VideoPlaybackState

interface VideoRepository {

    // Folders
    suspend fun getAllFolders(): List<Folder>

    // Videos
    suspend fun getVideosByFolder(folderId: Long): List<Video>
    suspend fun getVideoById(videoId: Long): Video?

    // Playback
    suspend fun savePlaybackState(state: VideoPlaybackState)
    suspend fun getPlaybackState(videoId: Long): VideoPlaybackState?

    // Favorites
    suspend fun addToFavorites(videoId: Long)
    suspend fun getFavoriteVideos(): List<Video>
    suspend fun removeFromFavorites(videoId: Long)

    // Bookmarks
    suspend fun addBookmark(bookmark: Bookmark)
    suspend fun getBookmarks(videoId: Long): List<Bookmark>
    suspend fun removeBookmark(bookmarkId: Long)
}