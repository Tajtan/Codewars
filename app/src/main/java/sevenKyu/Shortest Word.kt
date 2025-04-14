package sevenKyu

/*
Simple, given a string of words, return the length of the shortest word(s).

String will never be empty and you do not need to account for different data types.
 */

fun findShort(s: String): Int {
    return s.split(" ").minOf { it.length }
}