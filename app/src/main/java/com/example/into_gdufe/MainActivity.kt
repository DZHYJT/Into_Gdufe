package com.example.into_gdufe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //隐藏标题栏
        supportActionBar?.hide()
        botton_begin.setOnClickListener {
            //显式intent
            val intent = Intent(this,Classification::class.java)
            startActivity(intent)
        }
    }


}