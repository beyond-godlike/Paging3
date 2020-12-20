package com.unava.dia.paging3.di.subModules

import androidx.lifecycle.ViewModel
import com.unava.dia.paging3.ui.MainViewModel
import dagger.Binds
import dagger.Module

@Module
abstract class MainViewModule {
    @Binds
    abstract fun bindMainViewModel(viewModel: MainViewModel): ViewModel
}