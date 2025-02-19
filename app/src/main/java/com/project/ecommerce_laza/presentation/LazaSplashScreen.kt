package com.project.ecommerce_laza.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.project.ecommerce_laza.R

@Preview
@Composable
fun LazaSplashScreen(){
    Box(modifier = Modifier.fillMaxSize().background(Color(0xFF1B262C)), contentAlignment = Alignment.Center) {
        Image(painter = painterResource(
            R.drawable.ic_logo), contentDescription = null)

    }
}