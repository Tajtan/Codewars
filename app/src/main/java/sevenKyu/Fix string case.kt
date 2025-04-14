package sevenKyu

/*
In this Kata, you will be given a string that may have mixed uppercase and lowercase letters and your task is to convert that string to either lowercase only or uppercase only based on:

make as few changes as possible.
if the string contains equal number of uppercase and lowercase letters, convert the string to lowercase.
For example:

solve("coDe") = "code". Lowercase characters > uppercase. Change only the "D" to lowercase.
solve("CODe") = "CODE". Uppercase characters > lowecase. Change only the "e" to uppercase.
solve("coDE") = "code". Upper == lowercase. Change all to lowercase.
 */

object FixStringCase {

    fun solve(s: String): String {
        var upper = 0
        var lower = 0

        s.forEach {
            if (it.isUpperCase()) {
                upper++
            } else {
                lower++
            }
        }

        return if (upper > lower) {
            s.uppercase()
        } else {
            s.lowercase()
        }
    }
}


object FixStringCaseVer2 {
    fun solve(s: String): String = if (s.count { it.isLowerCase() } >= s.length/2.0) s.lowercase() else s.uppercase()
}