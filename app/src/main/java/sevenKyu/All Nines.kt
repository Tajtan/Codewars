package sevenKyu

/*
Given any positive integer x ≤ 4000, find the smallest positive integer m such that mx consists of all 9's. Return -1 if no such m exists.

Examples:
11 -> 9, because 11 * 9 == 99.

12 -> -1, because 12 is even, so no multiple of it can contain only nines.

13 -> 76923, because 13 * 76923 == 999999, and no smaller positive integer, when multiplied by 13, generates an integer containing only nines.

NOTE: Although x ≤ 4000, m can be very very LARGE. Where necessary, the way of handling big integers appropriate to the language should be used.
 */


import java.math.BigInteger

fun allNines(x: BigInteger): BigInteger {
    if (x.toInt() % 2 == 0) return BigInteger.valueOf(-1)
    if (x.toString().last() == '5') return BigInteger.valueOf(-1)

    var mx = "9"

    while (mx.toBigInteger() % x != BigInteger.valueOf(0)) {
        mx += "9"
    }
    return mx.toBigInteger().divide(x)
}



fun main(){

    println(allNines(BigInteger.valueOf(3989)))
}