package com.unava.dia.paging3.di.network

import com.unava.dia.paging3.api.ApiService
import com.unava.dia.paging3.api.DataRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DataRepositoryModule {
    @Provides
    @Singleton
    internal fun provideDataRepository(apiService: ApiService): DataRepository {
        return DataRepository(apiService)
    }
}