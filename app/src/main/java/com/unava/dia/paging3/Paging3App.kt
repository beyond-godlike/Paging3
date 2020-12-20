package com.unava.dia.paging3

import android.app.Activity
import androidx.multidex.MultiDexApplication
import com.unava.dia.paging3.di.AppComponent
import com.unava.dia.paging3.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

class Paging3App : MultiDexApplication(), HasActivityInjector {
    @Inject
    lateinit var dispatchingActivityInjector: DispatchingAndroidInjector<Activity>

    var appComponent: AppComponent? = null
        private set

    override fun onCreate() {
        super.onCreate()
        this.initDagger()
    }

    private fun initDagger() {
        this.appComponent = DaggerAppComponent.builder()
            .application(this)
            .build()
        this.appComponent!!
            .inject(this)
    }

    override fun activityInjector(): AndroidInjector<Activity>? {
        return dispatchingActivityInjector
    }
}