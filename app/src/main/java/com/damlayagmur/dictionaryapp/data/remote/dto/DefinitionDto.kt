package com.damlayagmur.dictionaryapp.data.remote.dto

data class DefinitionDto(
    val antonyms: List<String>,
    val definition: String,
    val synonyms: List<String>
)