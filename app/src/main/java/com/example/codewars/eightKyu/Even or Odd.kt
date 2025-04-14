package com.example.codewars.eightKyu

/*
Create a function that takes an integer as an argument and returns "Even" for even numbers or "Odd" for odd numbers.
 */


fun evenOrOdd(number: Int): String {
    return if (number % 2 == 0) {
        "Even"
    } else {
        "Odd"
    }
}





fun evenOrOddVer2(number: Int) = if (number % 2 == 0) "Even" else "Odd"

fun evenOrOddVer3(number: Int): String {
    return if (number%2 ===0) "Even" else "Odd"
}

fun evenOrOddVer4(number: Int) = when (number % 2) {
    0 -> "Even"
    else -> "Odd"
}