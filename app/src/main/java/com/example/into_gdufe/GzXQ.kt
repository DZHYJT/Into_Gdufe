package com.example.into_gdufe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.youth.banner.Banner
import com.youth.banner.adapter.BannerImageAdapter
import com.youth.banner.holder.BannerImageHolder
import com.youth.banner.indicator.CircleIndicator

class GzXQ : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gz_xq)

        //隐藏标题栏
        supportActionBar?.hide()
        var banner7: Banner<DataBean, BannerImageAdapter<DataBean>> = findViewById(R.id.banner7)

        banner7.setAdapter(object : BannerImageAdapter<DataBean>(DataBean.gzxqData) {
            override fun onBindView(holder: BannerImageHolder, data: DataBean, position: Int, size: Int) {
                //图片加载自己实现
                Glide.with(holder.itemView)
                    .load(data.imageUrl)
                    .apply(RequestOptions.bitmapTransform(RoundedCorners(30)))
                    .into(holder.imageView) }
        }).addBannerLifecycleObserver(this).indicator = CircleIndicator(this)

    }
}