package sevenKyu

/*
Your task is to add up letters to one letter.

The function will be given a List<Char>, each one being a letter to add, and the function will return a Char.

Notes:
Letters will always be lowercase.
Letters can overflow (see second to last example of the description)
If no letters are given, the function should return 'z'
Examples:
addLetters(listOf("a", "b", "c")) = "f"
addLetters(listOf("a", "b")) = "c"
addLetters(listOf("z")) = "z"
addLetters(listOf("z", "a")) = "a"
addLetters(listOf("y", "c", "b")) = "d" // notice the letters overflowing
addLetters(listOf()) = "z"
 */

fun addLetters(arr: List<Char>): Char {
    return if(arr.isNotEmpty()){
        arr.sumOf { it.code - 96 }.mod(26).plus(96).toChar().takeUnless {
            it.code - 96 == 0
        } ?: 'z'
    } else {
        'z'
    }
}




fun addLettersVer2(arr: List<Char>) = 'z' - arr.sumOf { 'z' - it } % 26


fun addLettersVer3(arr: List<Char>) = arr.sumOf { it.code - 96 }.plus(25).rem(26).plus(97).toChar()



fun main() {
    println(addLetters(listOf('o', 'o')))
    println('a'.code)
    println('z'.code)
    println('`'.code)

    //println(('a'.code to 'z'.code))
}