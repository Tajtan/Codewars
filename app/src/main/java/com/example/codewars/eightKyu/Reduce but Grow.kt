package com.example.codewars.eightKyu

//Given a non-empty array of integers, return the result of multiplying the values together in order.


fun grow(arr: IntArray): Int {
    var result: Int = 1
    arr.forEach { result *= it }
    return result
}

//inne
fun growVer2(arr: IntArray): Int = arr.reduce { a, b -> a * b }

fun growVer3(arr: IntArray) = arr.reduce(Int::times)