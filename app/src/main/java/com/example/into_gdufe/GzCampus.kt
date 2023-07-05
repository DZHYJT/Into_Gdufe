package com.example.into_gdufe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_gz_campus.*

class GzCampus : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gz_campus)

        //花
        imageButton9.setOnClickListener {
            val intent = Intent(this, GzH::class.java)
            startActivity(intent)
        }
        //图书馆
        imageButton5.setOnClickListener {
            val intent = Intent(this, GzLibrary::class.java)
            startActivity(intent)
        }

        //广州校区
        imageButton11.setOnClickListener {
            val intent = Intent(this, GzXQ::class.java)
            startActivity(intent)
        }
    }
}