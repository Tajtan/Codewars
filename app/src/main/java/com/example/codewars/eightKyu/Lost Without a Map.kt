package com.example.codewars.eightKyu

// Given an array of integers, return a new array with each value doubled.

fun maps(x: IntArray): IntArray {
    return x.map { it*2 }.toIntArray()
}