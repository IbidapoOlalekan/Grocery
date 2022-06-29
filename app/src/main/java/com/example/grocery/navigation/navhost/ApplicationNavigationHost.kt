package com.example.grocery.navigation.navhost

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.grocery.general.components.BottomNavBar

@Composable
fun ApplicationNavigationHost(){
    val navController = rememberNavController()
    Scaffold(
        bottomBar ={
            BottomNavBar(
                modifier = Modifier.fillMaxWidth(),
                navController = navController
            )
        }
    ) {

    }
}
