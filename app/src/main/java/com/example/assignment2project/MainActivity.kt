package com.example.assignment2project

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity
import com.example.assignment2project.ui.theme.Assignment2ProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Assignment2ProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Braxton Rolle", "1124424")
                    ButtonLayout()
                }
            }
        }
    }


    @Preview(showBackground = true)
    @Composable
    fun AppPreview() {
        Assignment2ProjectTheme {
            Greeting("Braxton Rolle", "1124424")
            ButtonLayout()
        }
    }

    @Composable
    fun Greeting(
        name: String,
        id: String,
        modifier: Modifier = Modifier
    ) {
        Column(
            modifier = modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "App created by $name - $id.",
                modifier = modifier.padding(10.dp)
            )
        }
    }

    @Composable
    fun ButtonLayout(
        modifier: Modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center)
    ) {
        Column(
            modifier = modifier,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(onClick = {
                startActivity(Intent(this@MainActivity, SecondActivity::class.java))
            }) {
                Text("Start Activity Explicitly")
            }
            Button(onClick = {
                startActivity(Intent().apply {
                    action = "com.example.assignment2project.SecondActivity"
                })
            }) {
                Text("Start Activity Implicitly")
            }
        }
    }
}
