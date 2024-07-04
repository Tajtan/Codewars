package com.example.codewars.eightKyu

// Write a function that removes the spaces from the string, then return the resultant string.

fun noSpace(x: String): String {
    return x.replace(" ", "")
}




fun noSpaceVer2(x: String) = x.filterNot { it.isWhitespace() }