package com.example.into_gdufe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.youth.banner.Banner
import com.youth.banner.adapter.BannerImageAdapter
import com.youth.banner.holder.BannerImageHolder
import com.youth.banner.indicator.CircleIndicator
import kotlinx.android.synthetic.main.activity_classification.*

class Classification : AppCompatActivity() {

    private val data = mutableListOf("广财简介","校徽校训校歌","学校导图","校园风光")
    private val data2 = mutableListOf("   广州校区","   佛山校区")
    private var isClicked = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_classification)

        //隐藏标题栏
        supportActionBar?.hide()

        val adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data)
        listView.adapter = adapter
        listView.setOnItemClickListener{
            parent,view,position,id ->
                val dt = data[position]
            when(dt){
                "校徽校训校歌" -> {
                    //显式Intent
                    val intent = Intent(this,XXXHXG::class.java)
                    startActivity(intent)
                }
                "广财简介" -> {
                    //显式Intent
                    val intent = Intent(this,BriefIntro::class.java)
                    startActivity(intent)
                }
                "校园风光" -> {
                    if(isClicked){
                        val adapter2 = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data2)
                        listView2.adapter = adapter2
                        listView2.setOnItemClickListener {
                                parent,view,position,id ->
                            val dt2 = data2[position]
                            when(dt2){
                                "   广州校区" -> {
                                    val intent = Intent(this,GzCampus::class.java)
                                    startActivity(intent)
                                }
                                "   佛山校区" -> {
                                    val intent = Intent(this,FsCampus::class.java)
                                    startActivity(intent)
                                }
                            }
                        }
                        isClicked = false
                    }else{
                        val adapter3 = null
                        listView2.adapter = adapter3
                        isClicked = true
                    }

                }
                "学校导图" -> {
                    val intent = Intent(this,SchoolMap::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}