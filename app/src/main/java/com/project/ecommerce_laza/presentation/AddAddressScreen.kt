package com.project.ecommerce_laza.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Switch
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
fun AddAddressScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 16.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(painter = painterResource(R.drawable.ic_back), contentDescription = null)
                Text(
                    "Address",
                    fontSize = 24.sp,
                    color = Color.White,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
            }
            Text("Name", fontSize = 24.sp, color = Color.White)
            TextField(
                "",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 6.dp),
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color(0xFF222E34),
                    unfocusedContainerColor = Color(0xFF222E34),
                    focusedTextColor = Color.White,
                    unfocusedTextColor = Color.White
                )
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 6.dp)
            ) {
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .padding(end = 6.dp)
                ) {
                    Text("Country", fontSize = 24.sp, color = Color.White)
                    TextField("", onValueChange = {},colors = TextFieldDefaults.colors(
                        focusedContainerColor = Color(0xFF222E34),
                        unfocusedContainerColor = Color(0xFF222E34),
                        focusedTextColor = Color.White,
                        unfocusedTextColor = Color.White
                    ))
                }
                Column(modifier = Modifier.weight(1f)) {
                    Text("City", fontSize = 24.sp, color = Color.White)
                    TextField("", onValueChange = {},colors = TextFieldDefaults.colors(
                        focusedContainerColor = Color(0xFF222E34),
                        unfocusedContainerColor = Color(0xFF222E34),
                        focusedTextColor = Color.White,
                        unfocusedTextColor = Color.White
                    ))
                }
            }
            Text(
                "Phone Number",
                fontSize = 24.sp,
                color = Color.White,
                modifier = Modifier.padding(top = 6.dp)
            )
            TextField(
                "",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 6.dp, bottom = 6.dp),
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color(0xFF222E34),
                    unfocusedContainerColor = Color(0xFF222E34),
                    focusedTextColor = Color.White,
                    unfocusedTextColor = Color.White
                )
            )
            Text("Address", fontSize = 24.sp, color = Color.White)
            TextField(
                "",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 6.dp, bottom = 6.dp),
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color(0xFF222E34),
                    unfocusedContainerColor = Color(0xFF222E34),
                    focusedTextColor = Color.White,
                    unfocusedTextColor = Color.White
                )
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 6.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text("Save as primary address", fontSize = 24.sp, color = Color.White)
                Switch(checked = true, onCheckedChange = null)
            }
        }
        Button(
            onClick = {}, modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomStart)
        ) {
            Text("Save Address", fontSize = 18.sp, color = Color.White, modifier = Modifier.padding(vertical = 8.dp))
        }
    }
}