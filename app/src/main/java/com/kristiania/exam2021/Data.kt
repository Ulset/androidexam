package com.kristiania.exam2021

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Data(
    val data: Crypto
)



/*
data class DataList(
    val dataList: List<Crypto>
)
 */