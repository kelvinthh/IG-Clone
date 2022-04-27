package org.kelvintam.instagramclone.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.kelvintam.instagramclone.R

@Composable
fun BotBar(){
    Row(modifier = Modifier
        .fillMaxWidth()
        .background(Color.White)
        .height(60.dp)
        .padding(horizontal = 20.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically) {
        Icon(
            painter = painterResource(id = R.drawable.ic_baseline_home_24),
            contentDescription = "Direct Message" // decorative element
        )
        Icon(
            painter = painterResource(id = R.drawable.ic_baseline_search_24),
            contentDescription = "Direct Message" // decorative element
        )
        Icon(
            painter = painterResource(id = R.drawable.ic_baseline_add_box_24),
            contentDescription = "Direct Message" // decorative element
        )
        Icon(
            painter = painterResource(id = R.drawable.ic_baseline_notifications_24),
            contentDescription = "Direct Message" // decorative element
        )
        Icon(
            painter = painterResource(id = R.drawable.ic_baseline_person_24),
            contentDescription = "Direct Message" // decorative element
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BotBarPreview(){
    BotBar()
}