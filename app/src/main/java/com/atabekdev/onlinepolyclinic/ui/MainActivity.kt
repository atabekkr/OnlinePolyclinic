package com.atabekdev.onlinepolyclinic.ui

import android.os.Build.VERSION_CODES.P
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.atabekdev.onlinepolyclinic.R
import com.atabekdev.onlinepolyclinic.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragment_container) as NavHostFragment

        navController = navHostFragment.findNavController()

        binding.bnvMain.setupWithNavController(navController)

    }

    fun visibilityBnv(bool: Boolean) {
        if (bool) {
            binding.bnvMain.visibility = View.VISIBLE
        } else {
            binding.bnvMain.visibility = View.GONE
        }
    }
}