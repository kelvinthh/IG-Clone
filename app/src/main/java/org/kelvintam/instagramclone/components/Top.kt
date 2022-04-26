package org.kelvintam.instagramclone.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Top(){
    Row(modifier = Modifier.fillMaxWidth().background(Color.Magenta),horizontalArrangement = Arrangement.SpaceBetween,) {
        Text(text = "camera icon")
        Text(text = "message icon")
    }
}

@Preview(showBackground = true)
@Composable
fun TopPreview(){
    Top()
}