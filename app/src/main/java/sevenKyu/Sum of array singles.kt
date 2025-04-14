package sevenKyu

/*
In this Kata, you will be given an array of numbers in which two numbers occur once and the rest occur only twice. Your task will be to return the sum of the numbers that occur only once.

For example, repeats([4,5,7,5,4,8]) = 15 because only the numbers 7 and 8 occur once, and their sum is 15. Every other number occurs twice.
 */

fun repeats(arr: IntArray): Int {
    return arr.groupBy { it }.filterNot {
        it.value.count() == 2
    }.keys.sum()
}


fun repeatsVer2(arr: IntArray): Int =
    2 * arr.distinct().sum() - arr.sum()



fun repeatsVer3(arr: IntArray) = arr.filter { arr.count {i -> i == it } == 1 }.sum()