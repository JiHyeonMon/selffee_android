package com.danmin.sopkerton.data

data class ResponseMain(
    val documents: List<ResponseMainData>
)

data class ResponseMainData(
    val title: String,
    val username: String,
    val img_content: String,
    val content: String
)