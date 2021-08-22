package com.example.essai

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.essai.ui.theme.EssaiTheme

/*
* File name MainActivity.kt
*
* Mon project d'essaie
*
* @package com.example.essai
* @Author josh-Muleshi <jmuleshi2@gmail.com>
* */

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EssaiTheme {
                SimpleList()
            }
        }
    }
}
@Composable
fun SimpleList() {

    val scrollState = rememberLazyListState()

    LazyColumn(state = scrollState) {
        items(100) {
            Text("Item #$it")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AppPreview() {
    EssaiTheme {
        SimpleList()
    }
}
