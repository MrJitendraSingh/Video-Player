package com.india.videos.data.room.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "videos",
    foreignKeys = [
        ForeignKey(
            entity = FolderEntity::class,
            parentColumns = ["folderId"],
            childColumns = ["folderOwnerId"],
            onDelete = ForeignKey.Companion.CASCADE
        )
    ]
)
data class VideoEntity(
    @PrimaryKey(autoGenerate = true) val videoId: Long = 0,
    val folderOwnerId: Long, // Foreign key
    val videoPath: String,
    val videoName: String,
    val duration: Long,
    val size: Long,
    val resolution: String?,
    val thumbnailUri: String?, // optional
    val addedDate: Long = System.currentTimeMillis()
)