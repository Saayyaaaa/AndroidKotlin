package com.example.lab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Looper
import android.content.Intent
import android.os.Handler

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val uiHandler = Handler(Looper.getMainLooper())

        uiHandler.postDelayed({
                val intent = Intent(this@SplashActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
            }, 3000)
    }
}