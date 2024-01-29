package com.example.buzzboostertest2
import retrofit2.http.GET

interface ServiceConfigApi {
    @GET("/mapi/v1/common/config")
    suspend fun getConfig()
}
