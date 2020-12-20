package com.unava.dia.paging3.di.network

import dagger.Module

@Module(
    includes = [
        RetrofitModule::class,
        ApiModule::class,
        DataRepositoryModule::class
    ]
)
abstract class NetworkModule