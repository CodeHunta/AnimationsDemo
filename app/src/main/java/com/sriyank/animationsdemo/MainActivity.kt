package com.sriyank.animationsdemo

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
//import android.support.v7.app.AppCompatActivity
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private lateinit var batteryAnimation: AnimationDrawable
    private lateinit var signalAnimation: AnimationDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onStart() {
        super.onStart()

        targetImage.setBackgroundResource(R.drawable.battery_animation_list)
        batteryAnimation = targetImage.background as AnimationDrawable
        batteryAnimation.start()


        imageWifi.setBackgroundResource(R.drawable.signal_animation_list)
        signalAnimation = imageWifi.background as AnimationDrawable
        signalAnimation.start()

    }

    // Button click event handler 
    fun startStopAnimation() {

        if (batteryAnimation.isRunning)
            batteryAnimation.stop()
        else
            batteryAnimation.start()

    }
}
