package com.damlayagmur.dictionaryapp.di

import android.app.Application
import androidx.room.Room
import com.damlayagmur.dictionaryapp.data.local.WordInfoDao
import com.damlayagmur.dictionaryapp.data.local.WordInfoDatabase
import com.damlayagmur.dictionaryapp.data.remote.DictionaryApi
import com.damlayagmur.dictionaryapp.data.repository.WordInfoRepositoryImpl
import com.damlayagmur.dictionaryapp.data.util.GsonParser
import com.damlayagmur.dictionaryapp.domain.repository.WordInfoRepository
import com.damlayagmur.dictionaryapp.domain.usecase.GetWordInfo
import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class WordInfoModule {

    @Provides
    @Singleton
    fun provideGetWordInfoUseCase(repository: WordInfoRepository): GetWordInfo {
        return GetWordInfo(repository)
    }

    @Provides
    @Singleton
    fun provideWordInfoRepository(
        db: WordInfoDatabase,
        api: DictionaryApi
    ): WordInfoRepository {
        return WordInfoRepositoryImpl(api, db.dao)
    }

    @Provides
    @Singleton
    fun provideWordInfoDatabase(app: Application): WordInfoDatabase {
        return Room.databaseBuilder(
            app, WordInfoDatabase::class.java, "word_db"
        ).addTypeConverter(GsonParser(Gson())).build()
    }

    @Provides
    @Singleton
    fun provideDictionaryApi(): DictionaryApi {
        return Retrofit.Builder().baseUrl(DictionaryApi.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create()).build()
            .create(DictionaryApi::class.java)
    }
}