package com.example.wotd.global_component

import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight

fun parseMarkdownBold(input: String): AnnotatedString {
    val regex = Regex("\\*\\*(.*?)\\*\\*")
    return buildAnnotatedString {
        var lastIndex = 0
        for (match in regex.findAll(input)) {
            append(input.substring(lastIndex, match.range.first))

            pushStyle(SpanStyle(fontWeight = FontWeight.Bold))
            append(match.groupValues[1])
            pop()

            lastIndex = match.range.last + 1
        }
        if (lastIndex < input.length) {
            append(input.substring(lastIndex))
        }
    }
}