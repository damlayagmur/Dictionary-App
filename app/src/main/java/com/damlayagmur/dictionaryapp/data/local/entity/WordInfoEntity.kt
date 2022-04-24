package com.damlayagmur.dictionaryapp.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.damlayagmur.dictionaryapp.domain.model.Meaning
import com.damlayagmur.dictionaryapp.domain.model.WordInfo

@Entity
data class WordInfoEntity(
    val word: String,
    val phonetic: String,
   // val sourceUrl: List<String>,
    val meanings: List<Meaning>,
    @PrimaryKey val id: Int? = null
) {
    fun toWordInfo(): WordInfo{
        return WordInfo(
            meanings = meanings,
            word = word,
            phonetic = phonetic,
            //sourceUrls = sourceUrl
        )
    }
}
