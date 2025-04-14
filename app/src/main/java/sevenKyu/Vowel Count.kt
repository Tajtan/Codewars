package sevenKyu

/*
Return the number (count) of vowels in the given string.

We will consider a, e, i, o, u as vowels for this Kata (but not y).

The input string will only consist of lower case letters and/or spaces.
 */

fun getCount(str : String) : Int {
    val vowels = setOf<Char>('a', 'e', 'i', 'o', 'u')
    return str.count { it in vowels }
}



fun getCountVer2(str : String) = str.count { it in "aeiou" }

fun getCountVer3(str : String) : Int {
    return str.count{x->"aeiou".contains(x)}
}