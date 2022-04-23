package com.damlayagmur.dictionaryapp.presentation

import com.damlayagmur.dictionaryapp.domain.model.WordInfo

data class WordInfoState(
    val wordInItems: List<WordInfo> = emptyList(),
    val isLoading: Boolean = false
)

