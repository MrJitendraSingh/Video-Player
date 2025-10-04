package com.india.videos.presentation.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.india.videos.core.common.PrimaryButton
import com.india.videos.core.theme.PreviewWrapper
import com.india.videos.core.theme.VideoPlayerTheme


@Composable
fun HomeScreen(onNavigate: (String) -> Unit) {

    Column(Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {


        LazyColumn {

        }

        PrimaryButton(text = "Next") {
            onNavigate("Data from Home")
        }
    }

}

 @Preview
 @Composable
 fun HomeScreenPreview() {
     PreviewWrapper {
         HomeScreen(onNavigate = {})
     }
 }