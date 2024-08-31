package com.example.composebasis.ui.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun HelloBox(name: String = "Box") {
    Box(
        contentAlignment = Alignment.TopEnd,
        modifier = Modifier.fillMaxSize().background(Color.Black),
    ) {
        Box(modifier = Modifier.background(Color.Yellow).size(100.dp))
    }
    Box(
        contentAlignment = Alignment.BottomEnd,
        modifier = Modifier.fillMaxSize(),
    ) {
        Box(modifier = Modifier.background(Color.Yellow).size(100.dp))
    }
}

@Composable
@Preview(showSystemUi = true, showBackground = true, device = Devices.DEFAULT)
fun ShowBox() {
    HelloBoxHomeWork()
}

@Composable
fun HelloBoxHomeWork() {
    Box(
        contentAlignment = Alignment.TopStart,
        modifier = Modifier.fillMaxSize().padding(8.dp).background(Color.White),
    ) {
        Box(modifier = Modifier.size(100.dp).background(Color.Magenta))
    }
    Box(
        contentAlignment = Alignment.TopEnd,
        modifier = Modifier.fillMaxSize().padding(8.dp),
    ) {
        Box(modifier = Modifier.size(100.dp).background(Color.DarkGray))
    }
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize().padding(8.dp),
    ) {
        Box(modifier = Modifier.size(100.dp).background(Color.Blue))
    }
    Box(
        contentAlignment = Alignment.BottomStart,
        modifier = Modifier.fillMaxSize().padding(8.dp),
    ) {
        Box(modifier = Modifier.size(100.dp).background(Color.Yellow))
    }
    Box(
        contentAlignment = Alignment.BottomEnd,
        modifier = Modifier.fillMaxSize().padding(8.dp),
    ) {
        Box(modifier = Modifier.size(100.dp).background(Color.Green))
    }
}
