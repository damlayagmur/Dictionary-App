package com.damlayagmur.dictionaryapp.data.remote.dto

data class PhoneticDto(
    val audio: String,
    val licenseDto: LicenseXDto,
    val sourceUrl: String,
    val text: String
)