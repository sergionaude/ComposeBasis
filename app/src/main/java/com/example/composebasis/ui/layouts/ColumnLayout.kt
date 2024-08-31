package com.example.composebasis.ui.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun HelloColumn(name: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
            .background(Color.Gray),
    ) {
        Text(
            color = Color.Red,
            text = "Hola mundo $name",
            modifier = Modifier
                .padding(16.dp)
                .background(Color.Blue),
        )

        Text(text = "Hello world")
    }
}

@Preview(showBackground = true, device = Devices.DEFAULT, showSystemUi = true)
@Composable
fun previewColumn() {
    HelloColumn("Sergio")
}
