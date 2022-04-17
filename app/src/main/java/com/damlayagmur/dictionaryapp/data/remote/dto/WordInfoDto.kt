package com.damlayagmur.dictionaryapp.data.remote.dto

import com.damlayagmur.dictionaryapp.domain.model.WordInfo

data class WordInfoDto(
    val meanings: List<MeaningDto>,
    val phonetic: String,
    val phonetics: List<PhoneticDto>,
    val sourceUrls: List<String>,
    val word: String
) {
    fun toWordInfo(): WordInfo {
        return WordInfo(
        meanings = meanings.map { it.toMeaning() },
        phonetic = phonetic,
        sourceUrls = sourceUrls,
        word = word
        )
    }
}