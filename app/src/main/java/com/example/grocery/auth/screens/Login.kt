package com.example.grocery.auth.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.grocery.navigation.destinations.Destination
import com.example.grocery.R
import com.example.grocery.general.components.CustomInputField

@Composable
fun Login(
navController: NavController
){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(.2f),
            contentAlignment = Alignment.Center
        ){
            Image(painter = painterResource(
                id = R. drawable.logo),
                contentDescription = ""
            )
        }
        Text(
            text = "Login",
            fontSize = 20.sp,
            fontWeight = FontWeight.SemiBold
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Enter your email and password",
            fontSize = 16.sp,
            color = Color(0xFF7C7C7C)
        )
        Spacer(modifier = Modifier.height(20.dp))
        CustomInputField(
            value = "",
            onValueChange = {},
            onFocusChange = {},
            modifier = Modifier.fillMaxWidth(),
            headerText = "Email" ,
            hasError = false,
            errorMessage = "",
            keyboardType = KeyboardType.Email,
            imeAction = ImeAction.Next
        )
        Spacer(modifier = Modifier.height(20.dp))
        CustomInputField(
            value = "",
            onValueChange = {},
            onFocusChange = {},
            modifier = Modifier.fillMaxWidth(),
            headerText = "Password" ,
            hasError = false,
            errorMessage = "",
            keyboardType = KeyboardType.Password,
            imeAction = ImeAction.Done

        )
    }
}

@Preview
@Composable
fun PreviewLogin(){
    Login(navController = rememberNavController())
}