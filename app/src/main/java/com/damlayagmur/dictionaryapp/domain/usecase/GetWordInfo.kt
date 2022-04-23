package com.damlayagmur.dictionaryapp.domain.usecase

import com.damlayagmur.dictionaryapp.core.util.Resource
import com.damlayagmur.dictionaryapp.domain.model.WordInfo
import com.damlayagmur.dictionaryapp.domain.repository.WordInfoRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class GetWordInfo(private val repository: WordInfoRepository) {

    operator fun invoke(word: String): Flow<Resource<List<WordInfo>>> {
        if (word.isBlank()){
            return flow {  }
        }
        return repository.getWordInfo(word)
    }
}