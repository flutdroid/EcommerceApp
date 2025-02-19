package com.project.ecommerce_laza.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.project.ecommerce_laza.R

@Preview
@Composable
fun ProductReviewComp() {

    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(vertical = 4.dp)) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(painter = painterResource(R.drawable.ic_voice), contentDescription = null)
                Column(modifier = Modifier
                    .wrapContentSize()
                    .padding(start = 4.dp)) {
                    Text("Reviewer Name", fontSize = 12.sp, color = Color.White)
                    Row {
                        Image(
                            painter = painterResource(R.drawable.ic_clock),
                            contentDescription = null,
                        )
                        Text(
                            "13 Sep, 2020",
                            fontSize = 12.sp,
                            color = Color.White,
                            modifier = Modifier.padding(start = 4.dp)
                        )
                    }
                }
            }
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Text("4.8", fontSize = 16.sp, color = Color.White)
                    Text("Rating", fontSize = 12.sp, color = Color.White)
                }
                LazyRow {
                    items(5) {
                        Image(
                            painter = painterResource(R.drawable.ic_star),
                            contentDescription = null
                        )
                    }
                }
            }
        }
        Text(
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque malesuada eget vitae amet...",
            fontSize = 16.sp,
            color = Color.White,
            modifier = Modifier.fillMaxWidth()
        )
    }

}