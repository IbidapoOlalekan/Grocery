package com.example.grocery.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.grocery.data.local.models.Grocery

@Database(
    entities = [
        Grocery::class
    ],
    version = 1
)
abstract class GroceriesDatabase : RoomDatabase() {
    companion object {
        const val DATABASE_NAME = "groceries_db"
    }
}