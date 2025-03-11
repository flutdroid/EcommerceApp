package com.project.ecommerce_laza.presentation

import android.content.Context
import android.view.animation.OvershootInterpolator
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.project.ecommerce_laza.R
import kotlinx.coroutines.delay

//@Preview
@Composable
fun LazaSplashScreen(navController: NavController){
    val scale = remember {
       Animatable(0f)
    }
    LaunchedEffect(key1 = true) {
        scale.animateTo(
            targetValue = 0.7f,
            animationSpec = tween(
                durationMillis = 800,
                easing = {
                    OvershootInterpolator(4f).getInterpolation(it)
                })
        )
        delay(1500L)
        navController.navigate("gender_selection_screen")
    }
    Box(modifier = Modifier.fillMaxSize().background(Color(0xFF1B262C)), contentAlignment = Alignment.Center) {
        Image(painter = painterResource(
            R.drawable.ic_logo), contentDescription = null)

    }
}


@Preview
@Composable
fun LazaSplashScreenPreview(){
    LazaSplashScreen(navController = NavController(context = LocalContext.current))
}