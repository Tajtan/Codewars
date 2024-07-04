package com.example.codewars.eightKyu

/*
This kata is about multiplying a given number by eight if it is an even number and by nine otherwise.
 */

fun simpleMultiplication(n: Int): Int {
    if (n%2 == 0) {
        return n.times(8)
    } else {
        return n.times(9)
    }
}


//inne rozwiązania

fun simpleMultiplicationVer2(n: Int): Int {
    return n * if (n % 2 == 0) 8 else 9
}


fun simpleMultiplicationVer3(n: Int) = n * (8 + n%2)
