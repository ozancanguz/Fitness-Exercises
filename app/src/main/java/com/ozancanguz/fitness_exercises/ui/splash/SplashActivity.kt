package com.ozancanguz.fitness_exercises.ui.splash

import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ozancanguz.fitness_exercises.R
import com.ozancanguz.fitness_exercises.ui.MainActivity
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

//splash ekran için bir Thread oluşturuyoruz
        val background = object : Thread() {
            override fun run() {
                try {
                    //threaad 5 sn yani 5000 ms uyusun
                    Thread.sleep(7000)
                    //intent ile splash ekranından sonra MainActivity ekranı açılsın diyoruz
                    val intent = Intent(baseContext, MainActivity::class.java)
                    startActivity(intent)
                }catch (e : Exception){
                    e.printStackTrace()
                }
            }
        }
        background.start()


        startAnimation()

    }

    private fun startAnimation() {
        val animator = ObjectAnimator.ofFloat(imageView, "rotation", 0f, 360f)
        animator.setDuration(5000)
        animator.setRepeatCount(1)
        animator.setRepeatMode(ValueAnimator.REVERSE)
        animator.start()

    }
}