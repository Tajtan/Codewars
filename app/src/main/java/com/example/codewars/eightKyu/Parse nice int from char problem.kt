package com.example.codewars.eightKyu

/*
You ask a small girl,"How old are you?" She always says, "x years old", where x is a random number between 0 and 9.

Write a program that returns the girl's age (0-9) as an integer.

Assume the test input string is always a valid string. For example, the test input may be "1 year old" or "5 years old". The first character in the string is always a number.


 */


class ParseIntCharProblem {
    fun getAge(yearsOld: String): Int {
        return yearsOld.first().toString().toInt()
    }
}






class ParseIntCharProblemVer2 {
    fun getAge(yearsOld: String) = yearsOld.take(1).toInt()
}



class ParseIntCharProblemVer3 {
    fun getAge(yearsOld: String): Int {
        return yearsOld[0].digitToInt()
    }
}



class ParseIntCharProblemVer4 {
    fun getAge(y: String): Int = y.first().digitToInt()
}