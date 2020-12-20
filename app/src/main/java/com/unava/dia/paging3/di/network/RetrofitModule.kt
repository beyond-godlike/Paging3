package com.unava.dia.paging3.di.network

import com.unava.dia.paging3.BuildConfig
import com.unava.dia.paging3.api.RetrofitFactory
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
class RetrofitModule {
    @Provides
    @Singleton
    fun provideOpenApiRetrofit(): Retrofit {
        return RetrofitFactory.retrofit(BuildConfig.API_URL)
    }
}