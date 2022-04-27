package org.kelvintam.instagramclone.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.compose.SubcomposeAsyncImage
import coil.compose.rememberAsyncImagePainter
import org.kelvintam.instagramclone.R

// Main Post Body
@Composable
fun Posts() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        // User icon, user name, dropdown menu
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            val linearGradientBrush = Brush.linearGradient(
                colors = listOf(Color(0xFFb9117b), Color(0xFFFFFF66))
            )
            Row(
                modifier = Modifier
                    .width(200.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                AsyncImage(
                    model = "https://picsum.photos/100",
                    contentDescription = "Person",
                    Modifier
                        .padding(10.dp)
                        .sizeIn(40.dp, 40.dp, 50.dp, 50.dp)
                        .clip(CircleShape)
                        .border(
                            1.5.dp,
                            linearGradientBrush,
                            CircleShape
                        )
                        .border(
                            2.5.dp,
                            MaterialTheme.colors.background,
                            CircleShape
                        ),
                )
                Text(text = "User", fontSize = 15.sp, fontWeight = FontWeight.Bold)
            }
            Menu()
            //Text(text = "Button", fontSize = 15.sp, fontWeight = FontWeight.Bold)

        }

        // The main picture
        val image = "https://picsum.photos/1600/1500"
        SubcomposeAsyncImage(
            model = image,
            loading = {
                CircularProgressIndicator(
                    modifier = Modifier.fillMaxWidth(),
                    color = MaterialTheme.colors.onBackground,
                    50.dp
                )
            },
            contentDescription = "Test Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxWidth()
        )
        // Like, comment, share, save buttons
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                modifier = Modifier
                    .width(200.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                IconButton(onClick = {}) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_baseline_thumb_up_24),
                        contentDescription = "Like"
                    )
                }
                IconButton(onClick = {}) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_baseline_chat_bubble_outline_24),
                        contentDescription = "Comment"
                    )
                }
                IconButton(onClick = {}) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_baseline_send_24),
                        contentDescription = "Share"
                    )
                }
            }
            IconButton(onClick = {}) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_baseline_bookmark_border_24),
                    contentDescription = "Save"
                )
            }
        }
        // Like count
        Text(
            text = "1,337 likes",
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(horizontal = 10.dp)
        )

        // Username & description
        Text(
            text = buildAnnotatedString {
                pushStyle(style = SpanStyle(fontWeight = FontWeight.Bold))
                append("User")
                append("  ")
                pop()

                pushStyle(style = SpanStyle(color = MaterialTheme.colors.onBackground))
                append("Lorem Ipsum is simply dummy text of the printing and typesetting industry. ")
                append("Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, ")
                append("when an unknown printer took a galley of type and scrambled it to make a type specimen book. ")
                pop()
            },
            modifier = Modifier.padding(horizontal = 10.dp),
            textAlign = TextAlign.Start,
            fontSize = 14.sp
        )
    }

}

// Dropdown Menu
@Composable
fun Menu() {
    val suggestions = listOf("Option 1", "Option 2")
    var expanded by remember { mutableStateOf(false) }
    Column() {
        IconButton(onClick = { expanded = true }) {
            Icon(
                painter = painterResource(id = R.drawable.ic_baseline_menu_24),
                contentDescription = "Menu"
            )
        }
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false },
            modifier = Modifier
                .width(100.dp)
        ) {
            suggestions.forEach { label ->
                DropdownMenuItem(onClick = {
                    expanded = false
                }) {
                    Text(text = label)
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PostsPreview() {
    Posts()
}