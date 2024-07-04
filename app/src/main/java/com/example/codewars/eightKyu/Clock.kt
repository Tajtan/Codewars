package com.example.codewars.eightKyu

/*
Clock shows h hours, m minutes and s seconds after midnight.

Your task is to write a function which returns the time since midnight in milliseconds.
 */

fun past(h: Int, m: Int, s: Int): Int {
    return h.times(3_600_000).plus(m.times(60_000)).plus(s.times(1000))
}