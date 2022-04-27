package com.damlayagmur.dictionaryapp.domain.repository

import com.damlayagmur.dictionaryapp.core.util.Resource
import com.damlayagmur.dictionaryapp.domain.model.WordInfo
import kotlinx.coroutines.flow.Flow

interface WordInfoRepository {

    fun getWordInfo(word: String): Flow<Resource<List<WordInfo>>>

}