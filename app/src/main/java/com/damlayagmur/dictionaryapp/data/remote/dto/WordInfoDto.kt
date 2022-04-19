package com.damlayagmur.dictionaryapp.data.remote.dto

import com.damlayagmur.dictionaryapp.data.local.entity.WordInfoEntity
import com.damlayagmur.dictionaryapp.domain.model.WordInfo

data class WordInfoDto(
    val meanings: List<MeaningDto>,
    val phonetic: String,
    val phonetics: List<PhoneticDto>,
    val sourceUrls: List<String>,
    val word: String
) {
    fun toWordInfoEntity(): WordInfoEntity {
        return WordInfoEntity(
        meanings = meanings.map { it.toMeaning() },
        phonetic = phonetic,
        sourceUrl = sourceUrls,
        word = word
        )
    }
}