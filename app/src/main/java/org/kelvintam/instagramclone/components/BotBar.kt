package org.kelvintam.instagramclone.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun BotBar(){
    Row(modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween) {
        Text(text = "icon", textAlign = TextAlign.Center)
        Text(text = "icon", textAlign = TextAlign.Center)
        Text(text = "icon", textAlign = TextAlign.Center)
        Text(text = "icon", textAlign = TextAlign.Center)
        Text(text = "icon", textAlign = TextAlign.Center)
    }
}

@Preview(showBackground = true)
@Composable
fun BotBarPreview(){
    BotBar()
}