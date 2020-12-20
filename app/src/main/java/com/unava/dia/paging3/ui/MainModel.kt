package com.unava.dia.paging3.ui

import androidx.paging.PagingData
import com.unava.dia.paging3.api.DataRepository
import com.unava.dia.paging3.data.Data
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class MainModel @Inject constructor(private val dataRepository: DataRepository) {
    fun getDataList(): Flow<PagingData<Data>> {
        return dataRepository.getListData()
    }
}