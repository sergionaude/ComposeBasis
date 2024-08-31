package com.example.composebasis.ui.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.example.composebasis.R

@Composable
fun HelloRow(name: String? = "Row") {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize().background(Color.DarkGray)
    ) {
        Text(
            text = "${stringResource(id = R.string.first_text)} + $name",
            modifier = Modifier.background(Color.White).width(100.dp).height(30.dp),
            color = Color(R.color.purple_200),
            fontSize = TextUnit.Unspecified,
            fontStyle = null,
        )
        Text(
            text = stringResource(id = R.string.second_text),
            modifier = Modifier.padding(8.dp).background(Color.Yellow),
            color = Color.Red,
        )
        Text(
            text = stringResource(id = R.string.third_text),
            color = Color.White,
            modifier = Modifier.background(Color.Black),
        )
    }
}

@Composable
@Preview(showSystemUi = true, showBackground = true, device = Devices.DEFAULT)
fun ShowHelloRow() {
    HelloRow()
}
