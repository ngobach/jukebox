package com.ngobach.jukebox.models

data class Track(
    val id: String?,
    val name: String,
    val artist: Artist,
    val genre: Genre,
    val source: File
)