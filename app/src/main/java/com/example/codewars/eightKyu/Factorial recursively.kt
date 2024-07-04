package com.example.codewars.eightKyu

fun factorial(num: Int): Int {
    if (num > 0) {
        println(num)
        return num * factorial(num - 1)
    } else {
        return 0
    }
}

fun main() {
    val result = 7*6*5 * 4 * 3 * 2 * 1
    val expectedResult = factorial(7)
    assert(result == expectedResult)
    println("OK")
}