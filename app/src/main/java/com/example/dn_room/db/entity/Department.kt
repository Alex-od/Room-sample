package com.example.dn_room.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*
@Entity
class Department(
    @PrimaryKey(autoGenerate = false)
    var uid: String = UUID.randomUUID().toString(),
    var name: String)