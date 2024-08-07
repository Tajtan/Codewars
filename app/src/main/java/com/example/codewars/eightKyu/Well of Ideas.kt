package com.example.codewars.eightKyu


/*
For every good kata idea there seem to be quite a few bad ones!

In this kata you need to check the provided array (x) for good ideas 'good' and bad ideas 'bad'. If there are one or two good ideas, return 'Publish!', if there are more than 2 return 'I smell a series!'. If there are no good ideas, as is often the case, return 'Fail!'.
 */

fun well(x: Array<String>): String {
    return when( x.count { it == "good" } ) {
        0 -> "Fail!"
        1,2 -> "Publish!"
        else -> "I smell a series!"
    }
}