package com.ozancanguz.fitness_exercises.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ozancanguz.fitness_exercises.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar.title="Fitness Exercise"
        toolbar.setLogo(R.drawable.toolbaricon)
        toolbar.setTitleTextColor(resources.getColor(R.color.white))
        toolbar.setBackgroundColor(resources.getColor(R.color.black))
        setSupportActionBar(toolbar)


    }
}