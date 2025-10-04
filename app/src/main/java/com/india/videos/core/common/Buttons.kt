package com.india.videos.core.common

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.india.videos.core.theme.White

@Composable
fun PrimaryButton(modifier: Modifier = Modifier,
                  text: String = "Submit",
                  onClick: () -> Unit,){
    Text(text = text,
        style = MaterialTheme.typography.titleSmall,
        color = White,
        modifier = modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.primary, shape = RoundedCornerShape(10.dp))
            .clip(RoundedCornerShape(10.dp))
            .clickable { onClick() }
            .padding(vertical = 16.dp),
        textAlign = TextAlign.Center)
}