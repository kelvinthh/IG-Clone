package org.kelvintam.instagramclone.components

import android.graphics.drawable.Icon
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.kelvintam.instagramclone.R

@Composable
fun Stories() {
    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .border(5.dp, Color.Transparent)
            .padding(vertical = 5.dp)
    )
    {
        item {
            StoryBox(username = "You", isSelf = true)
        }
        items(20) {
            StoryBox(username = "User", isSelf = false)
        }
    }
}

@Composable
fun StoryBox(username: String, isSelf: Boolean)
{
    Column(
        modifier = Modifier
            .padding(horizontal = 2.dp, vertical = 5.dp)
            .width(65.dp)
            .height(75.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        val linearGradientBrush = Brush.linearGradient(
            colors = listOf(Color(0xFFb9117b), Color(0xFFFFFF66))
        )
        Icon(
            painter = painterResource(id = R.drawable.ic_baseline_person_24),
            contentDescription = "Person",
            Modifier
                .padding(bottom = 5.dp)
                .sizeIn(55.dp, 55.dp, 60.dp, 60.dp)
                .clip(CircleShape)
                .border(
                    3.dp,
                    linearGradientBrush,
                    CircleShape),
        )
        Text(text = "$username", fontSize = 12.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun StoriesPreview() {
    Stories()
}