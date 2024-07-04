package com.example.codewars.eightKyu

/*
Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.

The output should be two capital letters with a dot separating them.
 */

fun abbrevName(name: String): String {
    return name.split(" ").first().first().uppercase()+"."+name.split(" ").last().first().uppercase()
}







fun abbrevNameVer2(name: String) = name.split(" ").joinToString(".") { it.take(1).uppercase() }


fun abbrevNameVer3(name:String) = name.split(" ").map { it.first().uppercase() }.joinToString(".")