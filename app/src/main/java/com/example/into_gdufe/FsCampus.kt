package com.example.into_gdufe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_fs_campus.*

class FsCampus : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fs_campus)

        //隐藏标题栏
        supportActionBar?.hide()

        imageButton2.setOnClickListener {
            val intent = Intent(this,FsLibrary::class.java)
            startActivity(intent)
        }

        //沁湖
        imageButton.setOnClickListener {
            val intent = Intent(this,FsQH::class.java)
            startActivity(intent)
        }

        //校门
        imageButton3.setOnClickListener {
            val intent = Intent(this,FsDoor::class.java)
            startActivity(intent)
        }
    }
}