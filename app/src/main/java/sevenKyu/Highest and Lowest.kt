package sevenKyu

/*
In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.

All numbers are valid Int32, no need to validate them.
There will always be at least one number in the input string.
Output string must be two numbers separated by a single space, and highest number is first.
 */

fun highAndLow(numbers: String): String {
    val sorted = numbers.split(" ").map { it.toInt() }
    return sorted.max().toString() + " " + sorted.min().toString()
}






fun highAndLowVer2(numbers: String) =
    numbers.split(" ").map { it.toInt() }.run {
        "${this.maxOrNull()} ${this.minOrNull()}"
    }




fun main() {
    println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"))
}