package com.india.videos.data.room.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "favorites")
data class FavoriteEntity(
    @PrimaryKey val videoId: Long, // Reference to VideoEntity
    val addedDate: Long = System.currentTimeMillis()
)