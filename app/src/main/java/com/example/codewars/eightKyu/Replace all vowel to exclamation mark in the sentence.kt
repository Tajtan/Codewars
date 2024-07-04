package com.example.codewars.eightKyu

/*
Replace all vowel to exclamation mark in the sentence. aeiouAEIOU is vowel.
 */

fun replace(s: String): String {
    return s.replace("[aeiouAEIOU]".toRegex(), "!")
}

//inne
fun replaceVer2(s: String): String = s.replace(Regex("a|e|i|o|u", RegexOption.IGNORE_CASE), "!")

fun replaceVer3(s: String) = s.map { if (it in "aeiouAEIOU") '!' else it}.joinToString("")

