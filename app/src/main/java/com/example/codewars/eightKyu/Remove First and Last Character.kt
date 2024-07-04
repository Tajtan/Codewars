package com.example.codewars.eightKyu

/*
It's pretty straightforward.
Your goal is to create a function that removes the first and last characters of a string.
You're given one parameter, the original string.
You don't have to worry about strings with less than two characters.
 */

fun removeChar(str: String): String {
    return str.drop(1).dropLast(1)
}




fun removeCharVer2(str: String): String = str.substring(1,str.lastIndex)