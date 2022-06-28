package com.example.grocery.data.remote.models

import com.example.grocery.auth.events.LoginFormEvent
import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("_id")
    val id: String,
    val email: String,
    val firstName: String,
    val lastName: String
)
