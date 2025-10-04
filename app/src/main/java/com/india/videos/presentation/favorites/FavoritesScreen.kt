package com.india.videos.presentation.favorites

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.india.videos.core.theme.PreviewWrapper


@Composable
fun FavoritesScreen(data: String, onNavigate: (String) -> Unit,
                    onBackPressed: () -> Unit) {

    Column(Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Text(
            text = "Favorites Screen $data"
        )
    }

}

@Preview
@Composable
fun FavoritesScreenPreview() {
    PreviewWrapper {
        FavoritesScreen(data = "No Data", onNavigate = {}, onBackPressed = {})
    }
}