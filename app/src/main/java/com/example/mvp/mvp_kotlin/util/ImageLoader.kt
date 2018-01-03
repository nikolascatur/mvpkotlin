package com.example.mvp.mvp_kotlin.util

import android.content.Context
import android.widget.ImageView
import com.squareup.picasso.Picasso

/**
 * Created by nikolascatur on 03/01/18.
 */
class ImageLoader {
    companion object {
        fun showImage(context: Context,url:String,imageView: ImageView){
            Picasso.with(context).load(url).into(imageView)
        }
    }
}