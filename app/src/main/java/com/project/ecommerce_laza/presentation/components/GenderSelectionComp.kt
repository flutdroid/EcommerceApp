package com.project.ecommerce_laza.presentation.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun GenderSelectionComp() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(12.dp),
        shape = RoundedCornerShape(10.dp),
        colors = CardColors(
            containerColor = Color(0xFF29363D),
            contentColor = Color.White,
            disabledContentColor = Color.Blue,
            disabledContainerColor = Color.Blue
        )
    ) {
        Text(
            "Look Good, Feel Good",
            fontSize = 28.sp,
            modifier = Modifier
                .padding(vertical = 12.dp)
                .fillMaxWidth(),
            textAlign = TextAlign.Center
        )
        Text(
            "Create your individual & unique style and look amazing everyday.",
            fontSize = 16.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 12.dp),
            textAlign = TextAlign.Center
        )
        Row(modifier = Modifier.fillMaxWidth()) {
            Button(
                onClick = {},
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 12.dp),
                contentPadding = PaddingValues(20.dp),
                shape = RoundedCornerShape(10.dp)
            ) {
                Text(
                    "Men",
                    fontSize = 16.sp,
                    textAlign = TextAlign.Center
                )
            }
            Button(
                onClick = {},
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 12.dp),
                contentPadding = PaddingValues(20.dp),
                shape = RoundedCornerShape(10.dp)

            ) {
                Text(
                    "Women",
                    fontSize = 16.sp,
                    textAlign = TextAlign.Center
                )
            }
        }
        Text(
            "Skip",
            fontSize = 16.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 12.dp),
            textAlign = TextAlign.Center
        )

    }
}