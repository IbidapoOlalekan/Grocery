package com.example.grocery.auth

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.grocery.navigation.navhost.AuthenticationNavigationHost

@Composable
fun AuthenticationWrapper(){
    val navHostController = rememberNavController()
    AuthenticationNavigationHost(navHostController = navHostController)
}