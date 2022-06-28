package com.example.grocery.navigation.navhost

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.grocery.auth.screens.Login
import com.example.grocery.auth.screens.Register
import com.example.grocery.navigation.destinations.Destination

@Composable
fun AuthenticationNavigationHost(
    navController: NavHostController,
){
    NavHost(
        navController = navController,
        startDestination = Destination.LoginDestination.route
    ){
        composable(route = Destination.LoginDestination.route){
            Login()
        }
        composable(route = Destination.SignUpDestination.route){
            Register()
        }
    }
}