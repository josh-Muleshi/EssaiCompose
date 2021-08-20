package com.example.essai

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxSize()
            ) {
                DemoBottom()
            }
        }
    }
}
@Composable
fun DemoBottom() {
    val context = LocalContext.current

    Button(onClick = {
        Toast.makeText(context, "btn clicked", Toast.LENGTH_LONG).show()
    }) {
        Text(text = "click me")
    }

    Button(onClick = {
        Toast.makeText(context, "btn clicked", Toast.LENGTH_LONG).show()
        },
        enabled = false
        ) {
        Text(text = "click me")
    }

    TextButton(onClick = {
        Toast.makeText(context, "btn clicked", Toast.LENGTH_LONG).show()
    }) {
        Text(text = "click me")
    }

    OutlinedButton(onClick = {
        Toast.makeText(context, "btn clicked", Toast.LENGTH_LONG).show()
    }) {
        Text(text = "click me")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        DemoBottom()
    }
}