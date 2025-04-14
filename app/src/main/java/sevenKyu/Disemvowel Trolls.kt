package sevenKyu

/*
Trolls are attacking your comment section!

A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the threat.

Your task is to write a function that takes a string and return a new string with all vowels removed.

For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".

Note: for this kata y isn't considered a vowel.
 */

fun disemvowel(str: String): String {
    return str.replace("[aeiouAEIOU]".toRegex(), "")
}


fun disemvowelVer2(str: String): String {
    return str.filterNot {
        listOf('a', 'o', 'e', 'i', 'u').contains(it)
    }
}


fun disemvowelVer3(str: String) = str.filterNot { it in "aiueo" || it in "AIUEO" }