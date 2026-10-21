package com.example.bloom.ui.theme


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyComplexLayout()
        }
    }
}


@Preview(showSystemUi = true)
@Composable
fun MyComplexLayout(){
    Column(modifier = Modifier.fillMaxSize()) {

        Box(
            Modifier
                .fillMaxSize()
                .weight(1f)
                .background(Color.Magenta)

        )
        Spacer(modifier = Modifier.height(30.dp))
        Row(
            Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            Box(modifier= Modifier.weight(1f).fillMaxHeight().background(Color.Yellow))
            Spacer(modifier = Modifier.width(30.dp))
            Box(modifier= Modifier.weight(1f).fillMaxHeight().background(Color.Blue))

        }
        Spacer(modifier = Modifier.height(30.dp))
        Box(
            Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Green)
        )
    }
}


