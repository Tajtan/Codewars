package com.example.codewars.eightKyu

// You get an array of numbers, return the sum of all of the positives ones.

fun sum(numbers: IntArray): Int {
    return numbers.filter { it > 0 }.sum()
}





fun sumVer2(numbers: IntArray)
        = numbers.sumOf { it.coerceAtLeast(0) }