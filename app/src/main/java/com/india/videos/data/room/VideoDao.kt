package com.india.videos.data.room

import androidx.room.*
import com.india.videos.data.room.entity.BookmarkEntity
import com.india.videos.data.room.entity.FavoriteEntity
import com.india.videos.data.room.entity.FolderEntity
import com.india.videos.data.room.entity.VideoEntity
import com.india.videos.data.room.entity.VideoPlaybackStateEntity

@Dao
interface VideoDao {

    // Folder queries
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertFolder(folder: FolderEntity): Long

    @Query("SELECT * FROM folders")
    suspend fun getAllFolders(): List<FolderEntity>

    // Video queries
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertVideo(video: VideoEntity): Long

    @Query("SELECT * FROM videos WHERE folderOwnerId = :folderId")
    suspend fun getVideosByFolder(folderId: Long): List<VideoEntity>

    // Playback state
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun savePlaybackState(state: VideoPlaybackStateEntity)

    @Query("SELECT * FROM video_playback_state WHERE videoId = :videoId")
    suspend fun getPlaybackState(videoId: Long): VideoPlaybackStateEntity?

    // Favorites
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addToFavorites(favorite: FavoriteEntity)

    @Query("SELECT v.* FROM videos v INNER JOIN favorites f ON v.videoId = f.videoId")
    suspend fun getFavoriteVideos(): List<VideoEntity>

    // Bookmarks
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addBookmark(bookmark: BookmarkEntity)

    @Query("SELECT * FROM video_bookmarks WHERE videoId = :videoId")
    suspend fun getBookmarks(videoId: Long): List<BookmarkEntity>
}

