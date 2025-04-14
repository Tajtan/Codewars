package com.example.codewars.eightKyu
import kotlin.math.absoluteValue
import kotlin.math.abs

/*
In this simple assignment you are given a number and have to make it negative. But maybe the number is already negative?
 */

class Kata3 {
    fun makeNegative(x: Int): Int {
        return if (x>0) {
            -x
        } else {
            x
        }
    }
}







class Kata3Ver2 {
    fun makeNegative(x: Int) = -abs(x)
}








class Kata3Ver3 {
    fun makeNegative(x: Int) = -x.absoluteValue
}