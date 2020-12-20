package com.unava.dia.paging3.data

import com.squareup.moshi.Json

data class Support(
    @Json(name = "text")
    val text: String,
    @Json(name = "url")
    val url: String
)