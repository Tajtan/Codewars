package com.example.codewars.eightKyu

/*
Given an array of integers as strings and numbers, return the sum of the array values as if all were numbers.

Return your answer as a number.
 */

public class MixedSum {

    public fun sum(mixed: List<Any>): Int {
        return mixed.sumOf { it.toString().toInt() }
    }
}