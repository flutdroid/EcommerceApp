package com.project.ecommerce_laza.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
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
fun AllReviewsScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp)
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(painter = painterResource(R.drawable.ic_back), contentDescription = null)
                Text(
                    "Add Review", modifier = Modifier.fillMaxWidth(), fontSize =
                    24.sp, color = Color.White, textAlign = TextAlign.Center
                )
            }
            Text(
                "Name",
                fontSize = 24.sp,
                color = Color.White,
                modifier = Modifier.padding(vertical = 8.dp)
            )
            TextField(
                "",
                onValueChange = {},
                modifier = Modifier.fillMaxWidth(),
                placeholder = {
                    Text("Type your name", color = Color.White)
                },
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color(0xFF222E34),
                    unfocusedContainerColor = Color(0xFF222E34),
                    focusedTextColor = Color.White,
                    unfocusedTextColor = Color.White
                )
            )
            Text(
                "How was your experience?",
                fontSize = 24.sp,
                color = Color.White,
                modifier = Modifier.padding(vertical = 8.dp)
            )
            TextField(
                "", onValueChange = {}, modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.4f),
                placeholder = {
                    Text("Describe your experience", color = Color.White)
                },
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color(0xFF222E34),
                    unfocusedContainerColor = Color(0xFF222E34),
                    focusedTextColor = Color.White,
                    unfocusedTextColor = Color.White
                )
            )
        }
        Button(
            onClick = {}, modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomStart)
        ) {
            Text("Submit Review", fontSize = 20.sp)
        }
    }
}