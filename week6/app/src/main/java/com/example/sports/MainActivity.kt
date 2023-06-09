package com.example.sports

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import com.example.sports.ui.SportsApp
import com.example.sports.ui.theme.SportsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            SportsTheme {
                Surface {
                    SportsApp()
                }
            }
        }
    }
}
