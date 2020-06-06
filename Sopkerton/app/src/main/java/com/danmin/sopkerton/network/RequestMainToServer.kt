package com.danmin.sopkerton.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RequestMainToServer {
    var retrofit = Retrofit.Builder()
        .baseUrl("http://13.209.182.154:3724")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    var service: RequestMainInterface = retrofit.create(RequestMainInterface::class.java)
}