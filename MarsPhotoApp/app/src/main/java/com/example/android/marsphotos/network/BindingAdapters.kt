package com.example.android.marsphotos.network

import android.widget.ImageView
import androidx.core.net.toUri
import androidx.databinding.BindingAdapter
import coil.load
import com.example.android.marsphotos.R

@BindingAdapter("imageUrl")
fun bindImage(imgView: ImageView, imgUrl: String?){
    imgUrl?.let{
        /**
         * convert the URL string to a Uri object using the toUri() method.
         * To use the HTTPS scheme, append buildUpon.scheme("https")
         * to the toUri builder. Call build() to build the object.
         */
        val imgUri = imgUrl.toUri().buildUpon().scheme("https").build()
        imgView.load(imgUri){
            placeholder(R.drawable.loading_animation)
            error(R.drawable.ic_broken_image)
        }
    }
}