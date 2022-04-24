package com.damlayagmur.dictionaryapp.presentation

import com.damlayagmur.dictionaryapp.domain.model.WordInfo

data class WordInfoState(
    val wordInfoItems: List<WordInfo> = emptyList(),
    val isLoading: Boolean = false
)

