package com.example.codewars.eightKyu

/*
Create a function that checks if a number n is divisible by two numbers x AND y. All inputs are positive, non-zero numbers.
 */

fun isDivisible(n: Int, x: Int, y: Int): Boolean {
    return (n % x == 0) && (n % y == 0)
}