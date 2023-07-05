package com.example.into_gdufe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SchoolMap : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_school_map)

        //隐藏标题栏
        supportActionBar?.hide()

    }
}