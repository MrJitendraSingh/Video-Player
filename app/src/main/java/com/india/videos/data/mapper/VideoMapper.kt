package com.india.videos.data.mapper

import com.india.videos.data.room.entity.BookmarkEntity
import com.india.videos.data.room.entity.FolderEntity
import com.india.videos.data.room.entity.VideoEntity
import com.india.videos.data.room.entity.VideoPlaybackStateEntity
import com.india.videos.domain.model.Bookmark
import com.india.videos.domain.model.Folder
import com.india.videos.domain.model.Video
import com.india.videos.domain.model.VideoPlaybackState

fun FolderEntity.toDomain() = Folder(
    id = folderId,
    name = folderName,
    path = folderPath,
    totalVideos = totalVideos
)

fun VideoEntity.toDomain() = Video(
    id = videoId,
    folderId = folderOwnerId,
    name = videoName,
    path = videoPath,
    duration = duration,
    size = size,
    resolution = resolution,
    thumbnailUri = thumbnailUri
)

fun VideoPlaybackStateEntity.toDomain() = VideoPlaybackState(
    videoId = videoId,
    lastPlayedPosition = lastPlayedPosition,
    isCompleted = isCompleted,
    audioLanguage = audioLanguage,
    subtitleLanguage = subtitleLanguage,
    playbackSpeed = playbackSpeed,
    lastWatched = lastWatched
)

fun VideoPlaybackState.toEntity() = VideoPlaybackStateEntity(
    videoId = videoId,
    lastPlayedPosition = lastPlayedPosition,
    isCompleted = isCompleted,
    audioLanguage = audioLanguage,
    subtitleLanguage = subtitleLanguage,
    playbackSpeed = playbackSpeed,
    lastWatched = lastWatched
)

fun BookmarkEntity.toDomain() = Bookmark(
    id = bookmarkId,
    videoId = videoId,
    timestamp = timestamp,
    note = note
)

fun Bookmark.toEntity() = BookmarkEntity(
    bookmarkId = id,
    videoId = videoId,
    timestamp = timestamp,
    note = note
)