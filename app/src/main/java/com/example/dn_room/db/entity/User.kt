package com.example.dn_room.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class User(
    @PrimaryKey()
    var id: Int,
    @ColumnInfo(name = "departmentId") var departmentId: String,
    @ColumnInfo(name = "name") var name:String)