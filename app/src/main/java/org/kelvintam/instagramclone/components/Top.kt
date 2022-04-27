package org.kelvintam.instagramclone.components

import org.kelvintam.instagramclone.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement.Absolute.Center
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.kelvintam.instagramclone.data.BotNavigationItem
import org.kelvintam.instagramclone.data.TopNavigationItem

@Composable
fun Top() {
    val items = listOf(
        TopNavigationItem.Stories,
        TopNavigationItem.DirectMessage
    )
//    val color: Color = if(MaterialTheme.colors.isLight) {
//        Color.White
//    } else {
//        Color.Black
//    }
    TopAppBar(backgroundColor = MaterialTheme.colors.background) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 5.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            items.forEach { item ->
                IconButton(
                    onClick = {},
                ) {
                    Icon(
                        painter = painterResource(id = item.icon),
                        contentDescription = item.title,
                        Modifier.sizeIn(30.dp, 30.dp, 50.dp, 50.dp)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TopPreview() {
    Top()
}