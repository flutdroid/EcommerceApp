package com.project.ecommerce_laza.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
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
import com.project.ecommerce_laza.presentation.components.AddNewCardComp

@Preview
@Composable
fun AddNewCardScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(painter = painterResource(R.drawable.ic_back), contentDescription = null)
                Text(
                    "Add New Card",
                    fontSize = 24.sp,
                    color = Color.White,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
            }
            AddNewCardComp()
            Text("Card Owner", fontSize = 24.sp, color = Color.White)
            TextField("", onValueChange = {}, modifier = Modifier.fillMaxWidth())
            Text("Card Number", fontSize = 24.sp, color = Color.White)
            TextField("", onValueChange = {}, modifier = Modifier.fillMaxWidth())
            Row(modifier = Modifier.fillMaxWidth()) {
                Column(modifier = Modifier.weight(1f)) {
                    Text("EXP", fontSize = 24.sp, color = Color.White)
                    TextField("", onValueChange = {})
                }
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .padding(start = 6.dp)
                ) {
                    Text("CVV", fontSize = 24.sp, color = Color.White)
                    TextField("", onValueChange = {})
                }
            }
        }
        Button(
            onClick = {}, modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomStart)
        ) {
            Text(
                "Add Card",
                fontSize = 24.sp,
                color = Color.White,
                modifier = Modifier.padding(vertical = 6.dp)
            )
        }
    }
}