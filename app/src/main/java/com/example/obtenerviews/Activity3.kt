package com.example.obtenerviews

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity3.*
import kotlinx.android.synthetic.main.activity_main.*

class Activity3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity3)
        b5.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }




    }
}