package org.kelvintam.instagramclone.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.kelvintam.instagramclone.data.BotNavigationItem

@Composable
fun BotBar() {
    val items = listOf(
        BotNavigationItem.Feed,
        BotNavigationItem.Search,
        BotNavigationItem.Create,
        BotNavigationItem.Notifications,
        BotNavigationItem.Profile
    )
//    val color: Color = if(MaterialTheme.colors.isLight) {
//        Color.White
//    } else {
//        Color.Black
//    }
    BottomNavigation(backgroundColor = MaterialTheme.colors.background) {
        items.forEach { item ->
            BottomNavigationItem(
                icon = {
                    Icon(
                        painter = painterResource(id = item.icon),
                        contentDescription = item.title,
                        Modifier.sizeIn(30.dp, 30.dp, 50.dp, 50.dp),
                    )
                },
//                label = { Text(text = item.title) },
//                selectedContentColor = Color.Black.copy(0.4f),
//                unselectedContentColor = Color.Black,
                unselectedContentColor = MaterialTheme.colors.onBackground,
                alwaysShowLabel = false,
                selected = false,
                onClick = {}
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BotBarPreview() {
    BotBar()
}