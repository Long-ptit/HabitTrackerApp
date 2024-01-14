package com.example.createbaseproject

import android.app.Application
import com.example.createbaseproject.common.Logger
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class CustomApplication : Application() {

    init {
        Logger.log("Application started")
    }

}