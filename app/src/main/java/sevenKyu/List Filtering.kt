package sevenKyu

/*
In this kata you will create a function that takes a list of non-negative integers and strings and returns a new list with the strings filtered out.
 */

fun filterList(l: List<Any>): List<Int> {
    return l.filterIsInstance<Int>()
}