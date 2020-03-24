package com.example.dn_room.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.dn_room.db.dao.DepartmentDao
import com.example.dn_room.db.dao.UserDao
import com.example.dn_room.db.entity.Department
import com.example.dn_room.db.entity.User

@Database(entities = arrayOf(User::class, Department::class), version = 2)
abstract class AppDatabase : RoomDatabase() {
    abstract fun UserDao(): UserDao
    abstract fun DepartmentDao():DepartmentDao

    companion object {
        @Volatile private var instance: AppDatabase? = null
        private val LOCK = Any()

        operator fun invoke(context: Context)= instance ?: synchronized(LOCK){
            instance ?: buildDatabase(context).also { instance = it}
        }

        private fun buildDatabase(context: Context) = Room.databaseBuilder(context,
                AppDatabase::class.java, "todo-list.db").fallbackToDestructiveMigration()
            .build()
    }
}