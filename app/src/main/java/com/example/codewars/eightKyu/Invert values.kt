package com.example.codewars.eightKyu

/*
Given a set of numbers, return the additive inverse of each. Each positive becomes negatives, and the negatives become positives.
 */

fun invert(arr: IntArray): IntArray {
    val invertedArray = mutableListOf<Int>()
    arr.forEach {
        invertedArray.add(-it)
    }
    return invertedArray.toIntArray()
}

/*
inne rozwiązania
fun invert(arr: IntArray) = arr.map { -it }.toIntArray()


fun invert(arr: IntArray): IntArray {
    return IntArray(arr.size){ -arr[it] }
}
 */