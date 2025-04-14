package com.example.codewars.eightKyu

/*
Write a program that finds the summation of every number from 1 to num. The number will always be a positive integer greater than 0.
Your function only needs to return the result, what is shown between parentheses in the example below is how you reach that result and it's not part of it, see the sample tests.
 */

object GrassHopper {
    fun summation(n:Int):Int {
        if (n>0) {
            return n + summation(n-1)
        } else {
            return 0
        }
    }
}




object GrassHopperVer2 {
    fun summation(n: Int) = (1..n).sum()
}



object GrassHopperVer3 {
    fun summation(n:Int):Int {
        return n * (n + 1) / 2
    }
}


object GrassHopperVer4 {
    fun summation(n:Int) = 0.rangeTo(n).sum()
}



object GrassHopperVer5 {
    fun summation(n:Int)= n.downTo(1).sumOf { it }
}