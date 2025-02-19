package com.project.ecommerce_laza.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.project.ecommerce_laza.R
import com.project.ecommerce_laza.presentation.components.ProductReviewComp

@Preview
@Composable
fun ProductDetailScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.weight(0.5f)) {

            Box(
                modifier = Modifier
                    .fillMaxSize()

            ) {
                Image(
                    painter = painterResource(R.drawable.ic_men),
                    contentScale = ContentScale.FillWidth,
                    contentDescription = null
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Image(painter = painterResource(R.drawable.ic_back), contentDescription = null)
                    Image(painter = painterResource(R.drawable.ic_cart), contentDescription = null)
                }
            }
        }
        Column(modifier = Modifier
            .weight(0.5f)
            .padding(16.dp)) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text("Product Title", fontSize = 16.sp, color = Color.White)
                Text("Price", fontSize = 16.sp, color = Color.White)
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text("Product Description", fontSize = 24.sp, color = Color.White)
                Text("999", fontSize = 24.sp, color = Color.White)
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text("Size", fontSize = 24.sp, color = Color.White)
                Text("Size Guide", fontSize = 22.sp, color = Color.White)
            }

            LazyRow(modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 4.dp)) {
                items(10) {
                    Box(
                        modifier = Modifier
                            .padding(4.dp)
                            .background(Color.Gray, shape = RoundedCornerShape(6.dp)),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            modifier = Modifier.padding(horizontal = 28.dp, vertical = 24.dp),
                            text = "S",
                            fontSize = 20.sp,
                            color = Color.White
                        )
                    }
                }
            }
            Column(modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 4.dp)) {
                Text(
                    "Description",
                    fontSize = 24.sp,
                    color = Color.White,
                    modifier = Modifier.padding(
                        vertical = 4.dp
                    )
                )
                Text(
                    "The Nike Throwback Pullover" +
                            " Hoodie is made from premium" +
                            " French terry fabric that blen" +
                            "ds a performance feel with Rea" +
                            "d More..",
                    fontSize = 16.sp,
                    color = Color.White,
                    maxLines = 3
                )
            }
            ProductReviewComp()
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column(modifier = Modifier.wrapContentSize()) {
                    Text("Total Price", fontSize = 22.sp, color = Color.White)
                    Text("with VAT,SD", fontSize = 16.sp, color = Color.White)
                }
                Text("Rs 999", fontSize = 24.sp, color = Color.White)
            }
        }
        Button(onClick = {}, modifier = Modifier.fillMaxWidth()) {
            Text("Add To Cart")
        }
    }
}