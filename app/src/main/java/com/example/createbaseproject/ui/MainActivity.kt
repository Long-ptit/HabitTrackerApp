package com.example.createbaseproject.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.createbaseproject.base.activity.BaseActivity
import com.example.createbaseproject.common.Logger
import com.example.createbaseproject.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    fun setupOnClick() {
    }
}