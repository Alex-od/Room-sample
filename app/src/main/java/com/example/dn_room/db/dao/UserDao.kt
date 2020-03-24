package com.example.dn_room.db.dao

import androidx.room.*
import com.example.dn_room.db.entity.User


@Dao
interface UserDao {
    @Query("SELECT * FROM User")
    fun getAll(): List<User?>?

    @Query("SELECT * FROM User WHERE id = :id")
    fun getById(id: Long): User?

    @Insert
    fun insert(user: User?)

    @Update
    fun update(user: User?)

    @Delete
    fun delete(user: User?)

}