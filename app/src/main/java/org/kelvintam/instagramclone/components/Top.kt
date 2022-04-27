package org.kelvintam.instagramclone.components

import org.kelvintam.instagramclone.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement.Absolute.Center
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Top() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .height(50.dp)
            .padding(horizontal = 20.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
//        Text(text = "camera icon")
        Icon(
            painter = painterResource(id = R.drawable.ic_baseline_photo_camera_24),
            contentDescription = "Add a story" // decorative element
        )
        Icon(
            painter = painterResource(id = R.drawable.ic_baseline_send_24),
            contentDescription = "Direct Message" // decorative element
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TopPreview() {
    Top()
}