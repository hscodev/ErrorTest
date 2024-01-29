package com.example.buzzboostertest2

import android.app.Application
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import okhttp3.OkHttpClient
import retrofit2.Retrofit

class App: Application() {

    override fun onCreate() {
        super.onCreate()

        Thread.setDefaultUncaughtExceptionHandler { thread: Thread?, e: Throwable ->
            e.printStackTrace()
        }

//        BuzzBoosterWrapper.init(this)
//        BuzzBoosterWrapper.setUser(3216163)

        CoroutineScope(Dispatchers.IO).launch {
            val retrofit = Retrofit.Builder().apply {
                client(OkHttpClient.Builder().build())
                baseUrl("0.0.0.0")
            }.build()
            val api = retrofit.create(ServiceConfigApi::class.java)
            api.getConfig()
        }
    }
}
