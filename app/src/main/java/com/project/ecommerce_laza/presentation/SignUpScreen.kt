package com.project.ecommerce_laza.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
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
fun SignUpScreen() {
    Box(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp)) {
        Column(modifier = Modifier.fillMaxWidth()) {
            Image(painter = painterResource(R.drawable.ic_back), contentDescription = null)
            Text(
                "Sign Up",
                fontSize = 28.sp,
                color = Color.White,
                modifier = Modifier
                    .wrapContentSize()
                    .align(Alignment.CenterHorizontally)
            )
        }
        Column(modifier = Modifier
            .fillMaxWidth()
            .align(Alignment.Center)) {
            TextField(
                "",
                onValueChange = {},
                placeholder = {
                    Text("Username")
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 6.dp),
            )
            TextField(
                "",
                onValueChange = {},
                placeholder = {
                    Text("Password")
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 6.dp)
            )
            TextField("", onValueChange = {},
                placeholder = {
                    Text("Email Address")
                },
                modifier = Modifier.fillMaxWidth())

        }
        Button(onClick = {}, modifier = Modifier
            .fillMaxWidth()
            .align(Alignment.BottomStart)) {
            Text("Sign Up", fontSize = 16.sp, modifier = Modifier.padding(6.dp))
        }
    }
}