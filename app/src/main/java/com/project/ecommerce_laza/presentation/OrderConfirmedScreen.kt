package com.project.ecommerce_laza.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.project.ecommerce_laza.R

@Preview
@Composable
fun OrderConfirmedScreen() {
    Box(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Image(painter = painterResource(R.drawable.ic_back), contentDescription = null)
        Column(modifier = Modifier.align(Alignment.Center)) {
            Image(
                painter = painterResource(R.drawable.ic_order_confirmed), contentDescription = null,
                modifier = Modifier.fillMaxWidth()
            )
            Text(
                "Order Confirmed!",
                fontSize = 30.sp,
                color = Color.White,
                modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp),
                textAlign = TextAlign.Center
            )
            Text(
                "Your order has been confirmed, we will send you confirmation email shortly.",
                fontSize = 16.sp,
                color = Color.White,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
        }
        Column(modifier = Modifier.fillMaxWidth().wrapContentHeight().align(Alignment.BottomStart)) {
            Button(
                onClick = {},
                modifier = Modifier.fillMaxWidth().padding(bottom = 8.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.DarkGray)
            ) {
                Text("Go To Orders", fontSize = 18.sp, modifier = Modifier.padding(8.dp))
            }
            Button(onClick = {}, modifier = Modifier.fillMaxWidth()) {
                Text("Continue Shopping", fontSize = 18.sp, modifier = Modifier.padding(8.dp))
            }
        }
    }
}