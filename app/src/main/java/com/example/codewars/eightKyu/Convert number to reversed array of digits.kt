package com.example.codewars.eightKyu

/*
Given a random non-negative number, you have to return the digits of this number within an array in reverse order.
 */

object Kata2 {
    fun digitize(n:Long):IntArray {
        return n.toString().map {
            it.toString().toInt()
        }.reversed().toIntArray()
    }
}