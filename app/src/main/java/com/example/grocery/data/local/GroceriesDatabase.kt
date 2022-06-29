package com.example.grocery.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.grocery.data.local.models.Grocery
import com.example.grocery.data.local.typeconverters.ApplicationTypeConverter

@Database(
    entities = [
        Grocery::class
    ],
    version = 1
)

    @TypeConverters(ApplicationTypeConverter::class)
    abstract class GroceriesDatabase : RoomDatabase() {
        companion object {
            const val DATABASE_NAME = "groceries_db"
    }
}