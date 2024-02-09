package com.example.assignment2project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.assignment2project.ui.theme.Assignment2ProjectTheme
import androidx.compose.foundation.lazy.items

class SecondActivity : ComponentActivity() {

    private val challengeList: List<String> = listOf<String>(
        "UI is very important but hard to design.",
        "Security is very important.",
        "Many different device types, OS, size, etc.",
        "Cross platform development requires many changes (IOS/Android).",
        "Limited performance on some devices."
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Assignment2ProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TextList()
                }
            }
        }
    }


    @Preview(showBackground = true)
    @Composable
    fun AppPreview() {
        Assignment2ProjectTheme {
            TextList()
        }
    }

    @Composable
    fun TextList(
        modifier: Modifier = Modifier
    ) {
        LazyVerticalGrid(
            columns = GridCells.Adaptive(minSize = 256.dp)
        ) {
            items(challengeList.count()) { index ->
                Text(
                    text = challengeList[index],
                    modifier = modifier.padding(10.dp)
                )
            }
        }
    }
}