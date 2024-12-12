package com.example.nearby.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun WelcomeScreen(
    modifier: Modifier = Modifier) {
    Column (
        modifier = modifier
            .padding(horizontal = 40.dp, vertical = 48.dp)
    ){  }

}

@Preview
@Composable
private fun WelcomeScreenPreview() {
    WelcomeScreen(

    )
}