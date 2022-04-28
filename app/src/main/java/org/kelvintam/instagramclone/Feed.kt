package org.kelvintam.instagramclone

import android.graphics.drawable.Icon
import android.text.Layout
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.accompanist.swiperefresh.SwipeRefresh
import com.google.accompanist.swiperefresh.rememberSwipeRefreshState
import kotlinx.coroutines.delay
import org.kelvintam.instagramclone.components.BotBar
import org.kelvintam.instagramclone.components.Posts
import org.kelvintam.instagramclone.components.Stories
import org.kelvintam.instagramclone.components.Top
import org.kelvintam.instagramclone.data.TopNavigationItem

@Composable
fun Feed() {
    Scaffold(
        topBar = { Top() },
        bottomBar = { BotBar() }
    ) {
        var refreshing by remember { mutableStateOf(false) }
        LaunchedEffect(refreshing) {
            if (refreshing) {
                delay(2000)
                refreshing = false
            }
        }
        SwipeRefresh(
            state = rememberSwipeRefreshState(isRefreshing = refreshing),
            onRefresh = { refreshing = true }
        ) {
            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center

            ) {
                item { Stories() }
                items(100) { index ->
                    Posts(index)
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FeedPreview() {
    Feed()
}