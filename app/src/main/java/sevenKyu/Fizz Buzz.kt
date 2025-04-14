package sevenKyu

/*
Return an array containing the numbers from 1 to N, where N is the parametered value.

Replace certain values however if any of the following conditions are met:

If the value is a multiple of 3: use the value "Fizz" instead
If the value is a multiple of 5: use the value "Buzz" instead
If the value is a multiple of 3 & 5: use the value "FizzBuzz" instead
N will never be less than 1.

Method calling example:

fizzBuzz(3) -->  ["1", "2", "Fizz"]
 */


fun fizzBuzz(n: Int): Array<String> {
    return (1..n).map {
        if (it % 3 == 0 && it % 5 == 0) {
            "FizzBuzz"
        } else if (it % 5 == 0) {
            "Buzz"
        } else if (it % 3 == 0){
            "Fizz"
        } else {
            it.toString()
        }
    }.toTypedArray()
}



fun fizzBuzzVer2(n: Int) = (1..n).map {
    when{it % 15 == 0 -> "FizzBuzz"
        it % 5 == 0 -> "Buzz"
        it % 3 == 0 -> "Fizz"
        else -> "$it"
    }
}.toTypedArray()

fun main() {
    println(fizzBuzz(20))
}