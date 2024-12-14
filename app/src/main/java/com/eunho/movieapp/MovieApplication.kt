package com.eunho.movieapp

import android.app.Application
import android.util.Log

class MovieApplication(): Application() {

    override fun onCreate() {
        super.onCreate()
        Log.i("userLog", "application")
    }
}