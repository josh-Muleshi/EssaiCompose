package com.example.essai

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.essai.ui.HomeScreen
import com.example.essai.ui.theme.EssaiTheme

class MainActivity : ComponentActivity() {
    @ExperimentalFoundationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EssaiTheme {
                HomeScreen()
            }
        }
    }
}
@ExperimentalFoundationApi
@Composable
@Preview
fun AppPreview(){
    EssaiTheme {
        HomeScreen()
    }
}


