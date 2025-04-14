package sevenKyu

import androidx.core.util.rangeTo

/*
Take an integer n (n >= 0) and a digit d (0 <= d <= 9) as an integer.

Square all numbers k (0 <= k <= n) between 0 and n.

Count the numbers of digits d used in the writing of all the k**2.

Implement the function taking n and d as parameters and returning this count.
 */


fun nbDig(n:Int, d:Int):Int {
    return (0..n).toList().map { it * it }.joinToString("").count { it.toString() == d.toString() }
}


fun nbDigVer2(n: Int, d: Int): Int = (0..n).joinToString { "${it * it}" }.count { "$it" == "$d" }




fun main() {
    println(nbDig(10, 1))
}