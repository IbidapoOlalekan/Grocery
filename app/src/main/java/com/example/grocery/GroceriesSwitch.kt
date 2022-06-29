package com.example.grocery

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.grocery.auth.AuthenticationWrapper
import com.example.grocery.auth.viewmodels.AuthViewModel
import com.example.grocery.navigation.navhost.ApplicationNavigationHost

@Composable
fun GroceriesSwitch(
    authViewModel: AuthViewModel = hiltViewModel()
) {
    val isAuthenticated = authViewModel.state.value.isAuthenticated

    if (isAuthenticated) {
       ApplicationNavigationHost()
    } else {
        AuthenticationWrapper(
            viewModel = authViewModel
        )
    }
}