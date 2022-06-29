package com.example.grocery.domain.repositories

import com.example.grocery.data.local.models.Grocery
import kotlinx.coroutines.flow.Flow

interface GroceryRepository {
    suspend fun saveProduct(grocery: Grocery)
    fun getAllProducts(): Flow<List<Grocery>>

}