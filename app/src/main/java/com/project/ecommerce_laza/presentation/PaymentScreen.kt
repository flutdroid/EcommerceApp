package com.project.ecommerce_laza.presentation

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
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
fun PaymentScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.fillMaxSize()) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(painter = painterResource(R.drawable.ic_back), contentDescription = null)
                Text(
                    "Payment",
                    fontSize = 24.sp,
                    color = Color.White,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.25f)
                    .background(Color.Gray, shape = RoundedCornerShape(12.dp))
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text("Mr Anmol", fontSize = 18.sp, color = Color.White)
                    Image(painter = painterResource(R.drawable.ic_visa), contentDescription = null)

                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.BottomStart)
                        .padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        "Visa Classic",
                        fontSize = 18.sp,
                        color = Color.White,
                        modifier = Modifier.fillMaxWidth()
                    )
                    Text(
                        "5254 *****  ***** 7690",
                        fontSize = 36.sp,
                        color = Color.White,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )
                    Text(
                        "\$3,763.87",
                        fontSize = 24.sp,
                        color = Color.White,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            }
            OutlinedButton(
                onClick = {},
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(8.dp),
                border = BorderStroke(2.dp, color = Color.Blue)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Image(painter = painterResource(R.drawable.ic_plus), contentDescription = null)
                    Text(
                        "Add New Card",
                        fontSize = 16.sp,
                        modifier = Modifier.padding(start = 6.dp)
                    )
                }
            }
            Text("Card Owner", fontSize = 24.sp, color = Color.White)
            TextField("", onValueChange = {}, modifier = Modifier.fillMaxWidth())
            Text("Card Number", fontSize = 24.sp, color = Color.White)
            TextField("", onValueChange = {}, modifier = Modifier.fillMaxWidth())
            Text("Phone Number", fontSize = 24.sp, color = Color.White)
            TextField("", onValueChange = {}, modifier = Modifier.fillMaxWidth())
            Text("Address", fontSize = 24.sp, color = Color.White)
            TextField("", onValueChange = {}, modifier = Modifier.fillMaxWidth())
            Text("Card Number", fontSize = 24.sp, color = Color.White)
            TextField("", onValueChange = {}, modifier = Modifier.fillMaxWidth())
        }
        Button(onClick = {}, modifier = Modifier.fillMaxWidth().align(Alignment.BottomStart)) {
            Text("Save Card", fontSize = 20.sp, color = Color.White, modifier = Modifier.padding(vertical = 6.dp))
        }
    }
}