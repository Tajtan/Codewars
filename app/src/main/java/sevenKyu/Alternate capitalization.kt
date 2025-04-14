package sevenKyu

/*
Given a string, capitalize the letters that occupy even indexes and odd indexes separately, and return as shown below. Index 0 will be considered even.

For example, capitalize("abcdef") = ['AbCdEf', 'aBcDeF']. See test cases for more examples.

The input will be a lowercase string with no spaces.
 */


fun capitalize(text: String): List<String> {
    var result = mutableListOf<String>()
    result.add(
        text.mapIndexed { index, c ->
            if (index % 2 == 0) {
                c.uppercaseChar()
            } else {
                c
            }
        }.joinToString("")
    )

    result.add(
        text.mapIndexed { index, c ->
            if (index % 2 == 1) {
                c.uppercaseChar()
            } else {
                c
            }
        }.joinToString("")
    )

    return result.toList()
}

fun capitalizeVer2(text: String): List<String> =
    listOf(
        text.mapIndexed { index, c -> if (index % 2 == 0) c.uppercase() else c }.joinToString(""),
        text.mapIndexed { index, c -> if (index % 2 == 1) c.uppercase() else c }.joinToString("")
    )


fun capitalizeVer3(text: String) =
    (0..1).map{text.mapIndexed{i, c -> if(i % 2 == it) c.toUpperCase() else c}.joinToString("")}


fun main() {
    println(capitalize("abcd"))
}
