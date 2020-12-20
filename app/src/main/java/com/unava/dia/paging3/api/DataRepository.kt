package com.unava.dia.paging3.api

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.unava.dia.paging3.data.Data
import com.unava.dia.paging3.data.PostDataSource
import kotlinx.coroutines.flow.Flow

class DataRepository(private val apiService: ApiService) {
    fun getListData(): Flow<PagingData<Data>> {
        return Pager(
            config = PagingConfig(
                pageSize = 6,
                enablePlaceholders = false
            ),
            pagingSourceFactory = { PostDataSource(apiService) }
        ).flow
    }

}