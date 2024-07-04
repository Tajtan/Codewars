package com.example.codewars.eightKyu

/*
Build a function that returns an array of integers from n to 1 where n>0.

Example : n=5 --> [5,4,3,2,1]
 */

fun reverseSeq(n: Int): List<Int> {

    val list = mutableListOf<Int>()
    for (n in n downTo 1) {
        list.add(n)
    }
    return list
}

//Better solutions
fun reverseSeqVer2(n: Int) = n.downTo(1).toList()

fun reverseSeqVer3(n: Int) = List(n) { n  - it }