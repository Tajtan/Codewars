package sevenKyu

/*
Task
Given a Divisor and a Bound , Find the largest integer N , Such That ,

Conditions :
N is divisible by divisor

N is less than or equal to bound

N is greater than 0.

Notes
The parameters (divisor, bound) passed to the function are only positive values .
 */

fun maxMultiple(d: Int, b: Int): Int {
    return b - (b%d)
}




fun maxMultipleVer2(d: Int, b: Int): Int = (b downTo d).first { it % d == 0 }



fun maxMultipleVer3(d: Int, b: Int): Int {
    for (i in b downTo 0) if (i % d == 0) return i
    return 0
}