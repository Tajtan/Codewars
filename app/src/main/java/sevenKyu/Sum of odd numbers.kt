package sevenKyu

import androidx.core.util.rangeTo

/*
Given the triangle of consecutive odd numbers:

             1
          3     5
       7     9    11
   13    15    17    19
21    23    25    27    29
...
Calculate the sum of the numbers in the nth row of this triangle (starting at index 1) e.g.: (Input --> Output)

1 -->  1
2 --> 3 + 5 = 8
 */

fun rowSumOddNumbers(n: Int): Int {
    var previousNumbers = 0

    for (i in 1..n-1) {
        previousNumbers += i
    }

    val firstNumber = previousNumbers * 2 + 1

    var result = 0
    for (i in 0..n-1) {
        result += firstNumber + 2 * i
    }

    return result
}

fun rowSumOddNumbersVer3(n: Int): Int {
    val firstOddNumberOfRow = (0 until n).sum() + 1
    return (firstOddNumberOfRow until  firstOddNumberOfRow + n).map { 2 * it - 1 }.sum()
}


fun rowSumOddNumbersVer4(n: Int): Int = (n * n - (n - 1)..n * n + (n - 1)).filter { it % 2 == 1 }.sum()

fun rowSumOddNumbersVer2(n: Int): Int = n * n * n






fun main() {
    rowSumOddNumbers(13)
}