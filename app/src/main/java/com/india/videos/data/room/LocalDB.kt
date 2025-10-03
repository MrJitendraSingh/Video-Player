package com.india.videos.data.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.india.videos.data.room.entity.BookmarkEntity
import com.india.videos.data.room.entity.FavoriteEntity
import com.india.videos.data.room.entity.FolderEntity
import com.india.videos.data.room.entity.VideoEntity
import com.india.videos.data.room.entity.VideoPlaybackStateEntity

@Database(entities = [
    FolderEntity::class,
    VideoEntity::class,
    VideoPlaybackStateEntity::class,
    FavoriteEntity::class,
    BookmarkEntity::class], version = 1)
abstract class LocalDB : RoomDatabase() {

}