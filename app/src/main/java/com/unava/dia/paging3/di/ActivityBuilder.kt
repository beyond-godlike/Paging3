package com.unava.dia.paging3.di

import com.unava.dia.paging3.di.subModules.MainViewModule
import com.unava.dia.paging3.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector(
        modules = [
            MainViewModule::class
        ]
    )
    internal abstract fun bindMainActivity(): MainActivity
}