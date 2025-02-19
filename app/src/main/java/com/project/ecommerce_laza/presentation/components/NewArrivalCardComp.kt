package com.project.ecommerce_laza.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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
fun NewArrivalCardComp() {
    Column(modifier = Modifier.width(160.dp).height(250.dp)) {
        Box(
            modifier = Modifier
                .width(120.dp)
                .height(200.dp)
        ) {
            Card(
                modifier = Modifier.fillMaxSize(),
                shape = RoundedCornerShape(12.dp),
                colors = CardDefaults.cardColors(
                    Color.Red
                )
            ) {
            }
            Image(
                painter = painterResource(R.drawable.ic_heart),
                contentDescription = null,
                modifier = Modifier
                    .padding(4.dp)
                    .align(
                        Alignment.TopEnd
                    )
            )
        }
        Text("Nike Sportswear Club Fleece", fontSize = 10.sp, color = Color.White)
        Text("Rs 99", fontSize = 12.sp, color = Color.White)

    }
}