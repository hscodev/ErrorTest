package com.example.buzzboostertest2

import android.app.Application
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class App: Application() {

    override fun onCreate() {
        super.onCreate()

        Thread.setDefaultUncaughtExceptionHandler { thread: Thread?, e: Throwable ->
            e.printStackTrace()
        }

//        BuzzBoosterWrapper.init(this)
//        BuzzBoosterWrapper.setUser(3216163)

        CoroutineScope(Dispatchers.IO).launch {
            throw Exception()
        }
    }
}
