package com.example.codewars.eightKyu

/*
Given an array of integers.

Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers. 0 is neither positive nor negative.

If the input is an empty array or is null, return an empty array.
 */

fun countPositivesSumNegatives(input : Array<Int>?) : Array<Int> {

    var positives = 0
    var negatives = 0

    if (input.isNullOrEmpty()) {
        return emptyArray()
    } else {
        input.forEach {
            if (it > 0) {
                positives++
            } else {
                negatives += it
            }
        }
    }

    return arrayOf(positives, negatives)
}




fun countPositivesSumNegativesVer2(input : Array<Int>?) : Array<Int> {
    if (input == null || input.isEmpty()) return emptyArray()
    val (positive, negative) = input.partition { it > 0 }
    return arrayOf(positive.count(), negative.sum())
}



fun countPositivesSumNegativesVer3(input : Array<Int>?) : Array<Int> =
    if (input == null || input.isEmpty())
        arrayOf()
    else
        arrayOf(input.filter{ it > 0 }.count(), input.filter{ it < 0 }.sum())