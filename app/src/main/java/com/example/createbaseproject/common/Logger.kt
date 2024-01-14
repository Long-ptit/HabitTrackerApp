package com.example.createbaseproject.common

import android.util.Log

object Logger {

    fun log(message: String, tag: String = "MyApp") {
        Log.d(tag, message)
    }

}