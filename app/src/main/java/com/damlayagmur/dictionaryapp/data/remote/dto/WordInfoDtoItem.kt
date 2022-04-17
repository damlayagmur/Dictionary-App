package com.damlayagmur.dictionaryapp.data.remote.dto

data class WordInfoDtoItem(
    val license: LicenseDto,
    val meanings: List<MeaningDto>,
    val phonetic: String,
    val phonetics: List<PhoneticDto>,
    val sourceUrls: List<String>,
    val word: String
)