package com.example.wallpaper.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.wallpaper.R
import com.example.wallpaper.databinding.ActivityMainBinding
import com.example.wallpaper.ui.fragments.DownloadFragment
import com.example.wallpaper.ui.fragments.HomeFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.newsNavHostFragment) as NavHostFragment
        val navController = navHostFragment.navController
        binding.bottomNavigationHome.setupWithNavController(navController)




    }

//    fun replace(fragment :Fragment){
//        supportFragmentManager.beginTransaction().add(R.id.flFragment,fragment).commit()
//    }
}