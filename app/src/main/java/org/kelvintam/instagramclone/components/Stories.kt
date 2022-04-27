package org.kelvintam.instagramclone.components

import android.graphics.drawable.Icon
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
            Column(
                modifier = Modifier.padding(horizontal = 5.dp).width(65.dp).height(70.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_baseline_person_24),
                    contentDescription = "Person",
                    Modifier.sizeIn(55.dp, 55.dp, 60.dp, 60.dp),
                )
                Text(text = "You", fontSize = 11.sp)
            }
        }
        items(20) {
            Column(
                modifier = Modifier.padding(horizontal = 5.dp).width(65.dp).height(70.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_baseline_person_24),
                    contentDescription = "Person",
                    Modifier.sizeIn(55.dp, 55.dp, 60.dp, 60.dp),
                )
                Text(text = "Username", fontSize = 11.sp)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun StoriesPreview() {
    Stories()
}