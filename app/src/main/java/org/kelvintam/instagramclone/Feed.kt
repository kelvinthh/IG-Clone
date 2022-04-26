package org.kelvintam.instagramclone

import android.text.Layout
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import org.kelvintam.instagramclone.components.BotBar
import org.kelvintam.instagramclone.components.Top

@Composable
fun Feed(){
    Scaffold(
        topBar = { Top() },
        bottomBar = { BotBar()}
    ){
        Column() {
            Text(text = "Hello World!")
            Text(text = "This is a great test!")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FeedPreview(){
    Feed()
}