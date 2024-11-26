package com.example.a20241116_harinkaklotar_nycschools.di

import com.example.a20241116_harinkaklotar_nycschools.network.SchoolApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    fun provideRetrofit(): Retrofit = Retrofit.Builder()
        .baseUrl("https://data.cityofnewyork.us/resource/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    @Provides
    fun provideSchoolApi(retrofit: Retrofit): SchoolApi =
        retrofit.create(SchoolApi::class.java)

}