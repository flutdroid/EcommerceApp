package com.project.ecommerce_laza

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun HomeScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(painter = painterResource(R.drawable.ic_menu), contentDescription = null)
            Image(painter = painterResource(R.drawable.ic_cart), contentDescription = null)
        }
        Column(modifier = Modifier.fillMaxWidth()) {
            Text("Hello", fontSize = 24.sp, color = Color.White)
            Text("Welcome to Laza", fontSize = 16.sp, color = Color.White)
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            TextField("", onValueChange = {}, modifier = Modifier.weight(1f))
            Image(painter = painterResource(R.drawable.ic_voice), contentDescription = null)
        }
        Column(modifier = Modifier.fillMaxWidth()) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text("Choose Brand", fontSize = 24.sp, color = Color.White)
                Text("View All", fontSize = 16.sp, color = Color.White)
            }
            LazyRow(modifier = Modifier.fillMaxWidth()) {
                items(10) {
                    Box(
                        modifier = Modifier
                            .padding(end = 12.dp)
                            .background(Color.Blue)
                    ) {
                        Text(
                            "Brand name",
                            fontSize = 14.sp,
                            color = Color.White,
                            modifier = Modifier.padding(12.dp)
                        )
                    }
                }
            }
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text("New Arrival", fontSize = 24.sp, color = Color.White)
            Text("View All", fontSize = 16.sp, color = Color.White)
        }

    }

}