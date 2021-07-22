package com.programmers.kmooc.models

import java.io.Serializable
import java.util.*

data class Lecture(
    val id: String,
    val number: String,
    val name: String,
    val classfyName: String,
    val middleClassfyName: String,
    val courseImage: String,
    val courseImageLarge: String,
    val shortDescription: String,
    val orgName: String,
    val start: Date,
    val end: Date,
    val teachers: String?,
    val overview: String?
) : Serializable {
    companion object {
        val EMPTY = Lecture(
            "", "", "", "", "",
            "", "", "", "", Date(), Date(), null, null
        )
    }
}
