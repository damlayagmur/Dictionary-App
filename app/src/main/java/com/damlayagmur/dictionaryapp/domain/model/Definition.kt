package com.damlayagmur.dictionaryapp.domain.model

data class Definition(
    val antonyms: List<String>,
    val definition: String,
    val synonyms: List<String>
)
