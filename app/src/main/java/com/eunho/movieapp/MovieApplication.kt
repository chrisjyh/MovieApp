package com.eunho.movieapp

import android.app.Application
import android.util.Log
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MovieApplication(): Application() {

    override fun onCreate() {
        super.onCreate()
        Log.i("userLog", "application")
    }
}