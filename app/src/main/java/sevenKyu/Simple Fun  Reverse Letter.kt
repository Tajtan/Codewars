package sevenKyu

/*
Given a string str, reverse it and omit all non-alphabetic characters.

Example
For str = "krishan", the output should be "nahsirk".

For str = "ultr53o?n", the output should be "nortlu".
 */


fun reverseLetter(str: String): String {
    return str.filter {
        it in 'A'..'Z' || it in 'a'..'z'
    }.reversed()
}



fun reverseLetterVer2(str: String) = str.reversed().filter{ it.isLetter() }