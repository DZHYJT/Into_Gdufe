package com.example.into_gdufe

import android.app.Activity
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_title.view.*

//自定义标题控件
class TitleLayout(context:Context,attrs:AttributeSet) : LinearLayout(context,attrs){
    init {
        LayoutInflater.from(context).inflate(R.layout.activity_title,this)
        //title的点击事件
       back.setOnClickListener {
           val activity = context as Activity
           activity.finish()
       }
    }
}