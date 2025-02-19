package com.project.ecommerce_laza.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
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
import com.project.ecommerce_laza.presentation.components.CreateAccountComp

@Preview
@Composable
fun CreateAccountScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            Image(
                painter = painterResource(R.drawable.ic_back),
                contentDescription = null
            )
            Text(
                "Let’s Get Started",
                fontSize = 28.sp,
                color = Color.White,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )
        }
        Column(modifier = Modifier.align(Alignment.Center)) {
            CreateAccountComp("Facebook", icon = R.drawable.ic_back)
            CreateAccountComp("Twitter", icon = R.drawable.ic_back)
            CreateAccountComp("Google", icon = R.drawable.ic_back)
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomEnd),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Already have an account? Signin", fontSize = 16.sp, color = Color.White)
            Button(onClick = {}, modifier = Modifier.fillMaxWidth()) {
                Text("Create an Account", fontSize = 16.sp, modifier = Modifier.padding(6.dp))
            }
        }
    }

}