package org.kelvintam.instagramclone.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.compose.SubcomposeAsyncImage
import coil.compose.rememberAsyncImagePainter
import org.kelvintam.instagramclone.R

@Composable
fun Posts() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            val linearGradientBrush = Brush.linearGradient(
                colors = listOf(Color(0xFFb9117b), Color(0xFFFFFF66))
            )
            Icon(
                painter = painterResource(id = R.drawable.ic_baseline_person_24),
                contentDescription = "Person",
                Modifier
                    .padding(10.dp)
                    .sizeIn(40.dp, 40.dp, 50.dp, 50.dp)
                    .clip(CircleShape)
                    .border(
                        3.dp,
                        linearGradientBrush,
                        CircleShape
                    ),
            )
            Text(text = "Button", fontSize = 15.sp, fontWeight = FontWeight.Bold)
        }
        val image = "https://picsum.photos/1000/1000"
        SubcomposeAsyncImage(
            model = image,
            loading = {
                CircularProgressIndicator()
            },
            contentDescription = "Test Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxWidth()
        )
        Text(text = "Hello冇圖")
    }

}

@Preview(showBackground = true)
@Composable
fun PostsPreview() {
    Posts()
}