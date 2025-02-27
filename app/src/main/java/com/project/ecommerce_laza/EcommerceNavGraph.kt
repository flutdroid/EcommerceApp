package com.project.ecommerce_laza

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.project.ecommerce_laza.presentation.CreateAccountScreen
import com.project.ecommerce_laza.presentation.ForgotPasswordScreen
import com.project.ecommerce_laza.presentation.GenderSelectionScreen
import com.project.ecommerce_laza.presentation.LazaSplashScreen
import com.project.ecommerce_laza.presentation.LoginScreen
import com.project.ecommerce_laza.presentation.NewPasswordScreen
import com.project.ecommerce_laza.presentation.OtpVerificationScreen
import com.project.ecommerce_laza.presentation.ProductDetailScreen
import com.project.ecommerce_laza.presentation.SignUpScreen
import com.project.ecommerce_laza.presentation.components.GenderSelectionComp

@Composable
fun Navigation(){
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "splash_screen"
    ){
        composable("splash_screen"){
            LazaSplashScreen(navController)
        }
        composable("gender_selection_screen") {
            GenderSelectionScreen()
        }
        composable("create_account_screen") {
            CreateAccountScreen()
        }
        composable("sign_up_screen") {
            SignUpScreen()
        }
        composable("login_screen") {
            LoginScreen()
        }
        composable("forgot_password_screen") {
            ForgotPasswordScreen()
        }
        composable("verification_code_screen") {
            OtpVerificationScreen()
        }
        composable("new_password_screen") {
            NewPasswordScreen()
        }
        composable("home_screen") {
            HomeScreen()
        }
        composable("product_detail_screen") {
            ProductDetailScreen()
        }
    }

}