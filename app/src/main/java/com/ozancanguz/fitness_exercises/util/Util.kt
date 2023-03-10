package com.ozancanguz.fitness_exercises.util

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.ozancanguz.fitness_exercises.R


class Util {

    companion object{
        fun ImageView.loadImage(uri: String?) {
            val options = RequestOptions()

                .error(R.drawable.toolbaricon)
            Glide.with(context)
                .setDefaultRequestOptions(options)
                .load(uri)
                .into(this)

        }
    }
}