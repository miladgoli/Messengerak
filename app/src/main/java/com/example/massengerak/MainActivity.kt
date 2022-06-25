package com.example.massengerak

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //set toolbar
        val toolbar = findViewById<Toolbar>(R.id.toolbarMain)
        toolbar.title = ""
        setSupportActionBar(toolbar)

        supportFragmentManager.beginTransaction()
            .replace(R.id.mainFragmentContainer, ContactsFragment())
            .commit()

    }
}