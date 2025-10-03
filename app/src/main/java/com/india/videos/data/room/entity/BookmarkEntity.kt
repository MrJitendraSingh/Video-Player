package com.india.videos.data.room.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "video_bookmarks")
data class BookmarkEntity(
    @PrimaryKey(autoGenerate = true) val bookmarkId: Long = 0,
    val videoId: Long,
    val timestamp: Long, // in milliseconds
    val note: String? = null,
    val createdAt: Long = System.currentTimeMillis()
)