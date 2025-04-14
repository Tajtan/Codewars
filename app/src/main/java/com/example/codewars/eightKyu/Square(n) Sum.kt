package com.example.codewars.eightKyu

/*
Complete the square sum function so that it squares each number passed into it and then sums the results together.
 */

fun squareSum(n: Array<Int>): Int {
    return n.sumOf { it.times(it) }
}