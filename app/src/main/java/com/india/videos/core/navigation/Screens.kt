package com.india.videos.core.navigation

import kotlinx.serialization.Serializable


@Serializable
sealed class Screens {
    @Serializable
    object HomeScreen : Screens()
    @Serializable
    data class FavoritesScreen(val data: String) : Screens()
    @Serializable
    object BookmarksScreen : Screens()
}