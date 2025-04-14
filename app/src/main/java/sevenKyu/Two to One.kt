package sevenKyu

/*
Take 2 strings s1 and s2 including only letters from a to z.
Return a new sorted string, the longest possible, containing distinct letters -
each taken only once - coming from s1 or s2.
 */

fun longest(s1:String, s2:String):String {
    return (s1 + s2).toSet().sorted().joinToString("")
}




fun longestVer2(s1:String, s2:String):String {
    return (s1 + s2).toSortedSet().joinToString("")
}


fun longestVer3(s1:String, s2:String):String {
    return "abcdefghijklmnopqrstuvwxyz".filter { it in s1 || it in s2 }
}


fun longestVer4(s1:String, s2:String) = "$s1$s2".toSortedSet().joinToString("")


fun main() {
    println(longest("aretheyhere", "yestheyarehere"))
}