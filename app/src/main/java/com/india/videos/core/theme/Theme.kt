package com.india.videos.core.theme

import android.os.Build
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

private val LightColorScheme = lightColorScheme(
    primary = Color(0xFFE85E00),
    secondary = Color(0xFFD8F5E5),
    background = Color(0xFFFFFFFF),
    surface = Color(0xFFF8F8F8),
    onPrimary = Color(0xFF000000),
    onSecondary = Color(0xFF808080),
    onBackground = Color(0xFFFFFFFF),
    onSurface = Color(0xFF1C1C1E),
    error = Color(0xFFFF3B30)
)

private val DarkColorScheme = darkColorScheme(
    primary = Color(0xFFE85E00),
    secondary = Color(0xFF1C1C1E),
    background = Color(0xFF000000),
    surface = Color(0xFF1C1C1E),
    onPrimary = Color(0xFFFFFFFF),
    onSecondary = Color(0xFF808080),
    onBackground = Color(0xFFFFFFFF),
    onSurface = Color(0xFFFFFFFF),
    error = Color(0xFFFF453A)
)

@Composable
fun VideoPlayerTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        /*dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }*/

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme,
        typography = Typography,
        content = content
    )
}

@Composable
fun PreviewWrapper(content: @Composable () -> Unit) {
    VideoPlayerTheme {
        Column(Modifier.fillMaxSize().background(White)) {
            content()
        }
    }
}