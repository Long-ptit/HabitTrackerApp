package com.example.createbaseproject.ui

import android.os.Bundle
import com.example.createbaseproject.base.activity.BaseActivity
import com.example.createbaseproject.common.Logger
import com.example.createbaseproject.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

class MainActivity : BaseActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Logger.log("MainActivity Started")
        binding =   ActivityMainBinding.inflate(layoutInflater)
        setupOnClick()
        setContentView(binding.root)
    }

    fun setupOnClick() {
    }
}