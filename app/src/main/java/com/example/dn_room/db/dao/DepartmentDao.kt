package com.example.dn_room.db.dao

import androidx.room.*
import com.example.dn_room.db.entity.Department


@Dao
interface DepartmentDao {
    @Query("SELECT * FROM Department")
    fun getAll(): List<Department?>?

    @Query("SELECT * FROM Department WHERE uid = :id")
    fun getById(id: Long): Department?

    @Insert
    fun insert(department: Department?)

    @Update
    fun update(department: Department?)

    @Delete
    fun delete(department: Department?)

}