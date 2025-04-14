package sevenKyu

import kotlin.math.sqrt

/*
My grandfather always predicted how old people would get, and right before he passed away he revealed his secret!

In honor of my grandfather's memory we will write a function using his formula!

Take a list of ages when each of your great-grandparent died.
Multiply each number by itself.
Add them all together.
Take the square root of the result.
Divide by two.
Example
predictAge(65, 60, 75, 55, 60, 63, 64, 45) === 86
Note: the result should be rounded down to the nearest integer.
 */


fun predictAge(age1: Int, age2: Int, age3: Int, age4: Int, age5: Int, age6: Int, age7: Int, age8: Int): Int{
    return sqrt(listOf(age1, age2, age3, age4, age5, age6, age7, age8).map {
        it * it
    }.sum().toDouble()).div(2).toInt()
}


fun predictAgeVer2(vararg ages: Int): Int =
    ages.map { it * it }
        .sum()
        .toDouble()
        .let { sqrt(it) }
        .div(2)
        .toInt()