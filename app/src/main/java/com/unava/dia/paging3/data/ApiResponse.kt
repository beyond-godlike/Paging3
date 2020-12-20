package com.unava.dia.paging3.data

import com.squareup.moshi.Json

data class ApiResponse(
    @Json(name = "support")
    val support: Support,
    @Json(name = "data")
    val myData: List<Data>,
    @Json(name = "page")
    val page: Int,
    @Json(name = "per_page")
    val perPage: Int,
    @Json(name = "total")
    val total: Int,
    @Json(name = "total_pages")
    val totalPages: Int
)