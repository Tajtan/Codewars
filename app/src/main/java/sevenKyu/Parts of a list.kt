package sevenKyu

/*
Write a function partlist that gives all the ways to divide a list (an array) of at least two elements into two non-empty parts.

Each two non empty parts will be in a pair (or an array for languages without tuples or a structin C - C: see Examples test Cases - )
Each part will be in a string
Elements of a pair must be in the same order as in the original array.
 */

import java.util.Arrays

fun partlist(arr: Array<String>): Array<Array<String>> {
    val result: MutableList<Array<String>> = mutableListOf()

    for (index in 1 until arr.size) {
        val firstPart = arr.copyOfRange(0, index)
        val secondPart = arr.copyOfRange(index, arr.size)
        result.add(arrayOf(firstPart.joinToString(" "), secondPart.joinToString(" ")))
    }

    return result.toTypedArray()
}


fun partlistVer2(arr: Array<String>): Array<Array<String>> {
    return (1 until arr.size).map {
        arrayOf(arr.take(it).joinToString(" "), arr.drop(it).joinToString(" "))
    }.toTypedArray()
}



fun partlistVer3(arr:Array<String>):Array<Array<String>> {
    return (0 until arr.size - 1)
        .map {
            arrayOf(
                arr.sliceArray(0..it).joinToString(" "),
                arr.sliceArray(it + 1 until arr.size).joinToString(" ")
            )
        }.toTypedArray()
}


fun main() {
    println(partlist(arrayOf<String>("cdIw", "tzIy", "xDu", "rThG")))
}