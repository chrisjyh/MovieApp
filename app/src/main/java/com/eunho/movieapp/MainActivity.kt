package com.eunho.movieapp

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.eunho.movieapp.ui.screen.AppEntry
import com.eunho.movieapp.ui.theme.MovieAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("userLog", "MainActivity onCreate")
        enableEdgeToEdge()
        setContent {
            MovieAppTheme {
                AppEntry()
            }
        }
    }
}

@Preview
@Composable
fun PreviewMain(){
    MovieAppTheme {
        AppEntry()
    }
}