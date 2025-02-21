package com.project.ecommerce_laza.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.project.ecommerce_laza.R

@Preview
@Composable
fun AddNewCardComp() {
    Row(modifier = Modifier.fillMaxWidth()) {
        Box(
            modifier = Modifier
                .weight(0.3f)
                .background(color = Color.Red, shape = RoundedCornerShape(6.dp)),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(R.drawable.ic_home),
                contentDescription = null,
                modifier = Modifier.padding(vertical = 16.dp)
            )
        }
        Box(
            modifier = Modifier
                .weight(0.3f)
                .background(color = Color.Red, shape = RoundedCornerShape(6.dp)),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(R.drawable.ic_home),
                contentDescription = null,
                modifier = Modifier.padding(vertical = 16.dp)
            )
        }
        Box(
            modifier = Modifier
                .fillMaxWidth(0.3f)
                .background(color = Color.Red, shape = RoundedCornerShape(6.dp)),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(R.drawable.ic_home),
                contentDescription = null,
                modifier = Modifier.padding(vertical = 16.dp)
            )
        }
    }
}