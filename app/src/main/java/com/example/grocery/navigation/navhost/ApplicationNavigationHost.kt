package com.example.grocery.navigation.navhost

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.grocery.cart.screens.Cart
import com.example.grocery.explore.screens.Explore
import com.example.grocery.favorite.screens.Favorites
import com.example.grocery.general.components.BottomNavBar
import com.example.grocery.navigation.destinations.PrimaryDestination
import com.example.grocery.profiles.screens.Profile
import com.example.grocery.store.screens.Store

@Composable
fun ApplicationNavigationHost() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = {
            BottomNavBar(
                modifier = Modifier.fillMaxWidth(),
                navController = navController
            )
        }
    ) {
        NavHost(
            navController = navController,
            startDestination = PrimaryDestination.Store.startRoute
        ) {
            composable(route = PrimaryDestination.Store.startRoute) {
                Store()
            }
            composable(route = PrimaryDestination.Explore.startRoute) {
                Explore()
            }
            composable(route = PrimaryDestination.Cart.startRoute) {
                Cart()
            }
            composable(route = PrimaryDestination.Favorite.startRoute) {
                Favorites()
            }
            composable(route = PrimaryDestination.Profile.startRoute) {
                Profile()
            }
        }
    }
}
