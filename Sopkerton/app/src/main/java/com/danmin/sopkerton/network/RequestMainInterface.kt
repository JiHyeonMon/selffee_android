package com.danmin.sopkerton.network

import com.danmin.sopkerton.data.ResponseMain
import retrofit2.Call
import retrofit2.http.GET

interface RequestMainInterface{
    @GET("/main")
    fun requestMain(): Call<ResponseMain>
}