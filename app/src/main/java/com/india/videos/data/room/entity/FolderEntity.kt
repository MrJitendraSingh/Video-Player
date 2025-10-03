package com.india.videos.data.room.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "folders")
data class FolderEntity (
    @PrimaryKey(autoGenerate = true) val folderId: Long = 0,
    val folderPath: String,
    val folderName: String,
    val totalVideos: Int = 0,
    val lastUpdated: Long = System.currentTimeMillis()
)