package com.example.grocery.data.repositories

import com.example.grocery.data.local.dao.GroceriesDAO
import com.example.grocery.data.local.models.Grocery
import com.example.grocery.domain.repositories.GroceryRepository
import kotlinx.coroutines.flow.Flow

class GroceryRepositoryImpl(
    private val groceryDao : GroceriesDAO
): GroceryRepository {
    override suspend fun saveProduct(grocery: Grocery) {
        groceryDao.saveGrocery(grocery)
    }

    override fun getAllProducts(): Flow<List<Grocery>> {
        return groceryDao.getAllGroceries()
    }
}