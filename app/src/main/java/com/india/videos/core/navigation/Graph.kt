package com.india.videos.core.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.india.videos.presentation.favorites.FavoritesScreen
import com.india.videos.presentation.home.HomeScreen


@Composable
fun Graph(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier
) {

    NavHost(
        navController = navController,
        startDestination = Screens.HomeScreen,
        modifier = modifier
    ) {

        composable<Screens.HomeScreen> {
            HomeScreen(
                onNavigate = { data ->
                    navController.navigate(Screens.FavoritesScreen(data))
                }
            )
        }

        composable<Screens.FavoritesScreen> {
            FavoritesScreen(data = it.arguments?.getString("data") ?: "No Data",
                onNavigate = { data ->
                    navController.navigate(Screens.FavoritesScreen(data))
                },
                onBackPressed = {
                    navController.popBackStack()
                }
            )
        }
    }

}