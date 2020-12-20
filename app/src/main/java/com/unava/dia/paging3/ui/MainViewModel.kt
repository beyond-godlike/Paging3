package com.unava.dia.paging3.ui

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val context: Context,
    private val model: MainModel
) : ViewModel() {

    val listData = model.getDataList().cachedIn(viewModelScope)
}