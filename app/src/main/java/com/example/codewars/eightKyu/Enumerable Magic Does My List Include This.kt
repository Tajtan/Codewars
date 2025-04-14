package com.example.codewars.eightKyu

/*
Create a method that accepts a list and an item, and returns true if the item belongs to the list, otherwise false.
 */

fun include(arr: IntArray, item : Int): Boolean {
    return arr.contains(item)
}




fun includeVer2(arr: IntArray, item: Int) = item in arr