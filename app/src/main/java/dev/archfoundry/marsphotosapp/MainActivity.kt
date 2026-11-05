package dev.archfoundry.marsphotosapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import dev.archfoundry.marsphotosapp.ui.theme.MarsPhotosAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MarsPhotosAppTheme {
                MarsPhotosApp()
            }
        }
    }
}
