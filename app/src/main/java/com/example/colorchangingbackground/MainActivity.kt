package com.example.colorchangingbackground

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.colorchangingbackground.ui.theme.ColorChangingBackgroundTheme

var color: Color = Color.White

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ColorChangingBackgroundTheme {
                Scaffold(modifier = Modifier.fillMaxSize(), containerColor = color) { p ->
                    ColorChangingApp(p)
                }
            }
        }
    }
}

@Composable
fun ColorChangingApp(p: PaddingValues) {
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button (
            onClick = {
                color = Color((0..255).random(), (0..255).random(), (0..255).random())
            }
        ) {
            Text (text = "Change color")
        }
    }
}