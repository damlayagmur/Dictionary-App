package com.damlayagmur.dictionaryapp.domain.model

import com.damlayagmur.dictionaryapp.data.remote.dto.DefinitionDto

data class Meaning(
    val antonyms: List<String>,
    val definitions: List<Definition>,
    val partOfSpeech: String,
    val synonyms: List<String>
)
