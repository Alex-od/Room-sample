package com.example.dn_room

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dn_room.db.AppDatabase
import com.example.dn_room.db.entity.User
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val db = AppDatabase(this)
        GlobalScope.launch {
            db.UserDao().insert(User( 2,"2","alex"))
            db.UserDao().insert(User( 3, "3","dima" ))
            val data = db.UserDao().getAll()

            data?.forEach {
                println("qwer ${it?.name}")
            }
        }
    }
}
