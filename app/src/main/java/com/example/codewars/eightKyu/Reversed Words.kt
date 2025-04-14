package com.example.codewars.eightKyu

/*
Complete the solution so that it reverses all of the words within the string passed in.

Words are separated by exactly one space and there are no leading or trailing spaces.
 */


object Reverse{
    fun reverseWords(str:String):String = str.split(" ").reversed().toString().replace(",", "").replace("[", "").replace("]", "")
}




object ReverseVer2 {
    fun reverseWords(str: String): String = str.split(' ').reversed().joinToString(" ")
}