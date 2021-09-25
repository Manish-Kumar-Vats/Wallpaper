package com.example.wallpaper.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import androidx.lifecycle.lifecycleScope
import com.example.wallpaper.R
import kotlinx.coroutines.delay

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen)
        lifecycleScope.launchWhenCreated{
            delay(2000)
            startActivity(Intent(this@SplashScreen, MainActivity::class.java))
        }
    }
}