package com.programmers.kmooc.models

import java.io.Serializable

data class LectureList(
        val count: Int,
        val numPages: Int,
        val previous: String,
        val next: String,
        var lectures: List<Lecture>
) : Serializable
