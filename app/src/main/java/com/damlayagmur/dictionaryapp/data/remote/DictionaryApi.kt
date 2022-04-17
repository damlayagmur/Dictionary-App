package com.damlayagmur.dictionaryapp.data.remote

import com.damlayagmur.dictionaryapp.data.remote.dto.WordInfoDtoItem
import retrofit2.http.GET
import retrofit2.http.Path

interface DictionaryApi {

    @GET("/api/v2/entries/en/{word}")
    suspend fun getWordInfo(
        @Path("word") word: String
    ): List<WordInfoDtoItem>

}