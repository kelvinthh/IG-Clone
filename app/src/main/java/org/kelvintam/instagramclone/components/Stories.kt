package org.kelvintam.instagramclone.components

import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import org.intellij.lang.annotations.JdkConstants
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
            StoryBox(username = "Your story", isSelf = true)
        }
        items(20) {
            StoryBox(username = "User", isSelf = false)
        }
    }
}

@Composable
fun StoryBox(username: String, isSelf: Boolean) {
    Column(
        modifier = Modifier
            .padding(horizontal = 5.dp, vertical = 5.dp)
            .width(70.dp)
            .height(90.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        val linearGradientBrush = Brush.linearGradient(
            colors = listOf(Color(0xFFb9117b), Color(0xFFFFFF66))
        )
        Box() {
            val imageUrl: String = if (isSelf) {
                "https://picsum.photos/150"
            } else {
                "https://picsum.photos/100"
            }
            AsyncImage(
                model = imageUrl,
                contentDescription = "Person",
                Modifier
                    .padding(bottom = 5.dp)
                    .sizeIn(70.dp, 70.dp, 70.dp, 70.dp)
                    .clip(CircleShape)
                    .border(
                        2.5.dp,
                        linearGradientBrush,
                        CircleShape
                    )
                    .border(
                        5.dp,
                        MaterialTheme.colors.background,
                        CircleShape
                    ),
            )
            // Add 'add' icon if it's the owner's icon
            if (isSelf) {
                Image(
                    painter = painterResource(id = R.drawable.ic_baseline_add_box_24),
                    contentDescription = "Add",
                    modifier = Modifier
                        .align(Alignment.BottomEnd)
                        .sizeIn(20.dp, 20.dp, 20.dp, 20.dp)
                        .background(Color.White, CircleShape)
                        .border(
                            3.dp,
                            MaterialTheme.colors.background,
                            CircleShape
                        ),
                    colorFilter = ColorFilter.tint(color = Color.Blue),

                    )
            }
        }
        Text(text = "$username", fontSize = 11.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun StoriesPreview() {
    Stories()
}