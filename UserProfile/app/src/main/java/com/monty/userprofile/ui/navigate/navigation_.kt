package com.monty.userprofile.ui.navigate

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import com.monty.userprofile.ui.screen.ProfileView
import com.monty.userprofile.ui.screen.LogIn

@Composable
fun AppNavigate(){

    val navController = rememberNavController()
    NavHost(navController= navController,startDestination = navigation.LogIn_.route){
        composable(route=navigation.LogIn_.route){
            LogIn(navController)
        }
        composable(route=navigation.Profile_.route){
           ProfileView(navController)
        }
    }

}