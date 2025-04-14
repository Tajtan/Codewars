package sevenKyu

/*
This time no story, no theory. The examples below show you how to write function accum:

Examples:
accum("abcd") -> "A-Bb-Ccc-Dddd"
accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
accum("cwAt") -> "C-Ww-Aaa-Tttt"
The parameter of accum is a string which includes only letters from a..z and A..Z.
 */

fun accum(s:String):String {
    var result = ""
    s.lowercase().forEachIndexed { index, letter ->
        result += "-" + letter.uppercase() + letter.toString().repeat(index)
    }
    return result.drop(1)
}


fun accumVer2(s:String):String = s.mapIndexed { index, char -> char.uppercaseChar() + char.toString().lowercase().repeat(index) }.joinToString("-")


fun main() {
    println(accum("abCd"))
}