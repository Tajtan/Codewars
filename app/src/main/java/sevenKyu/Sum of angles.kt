package sevenKyu

/*
Find the total sum of internal angles (in degrees) in an n-sided simple polygon. N will be greater than 2.
 */

fun twoOldestAges(ages: List<Int>): List<Int> {
    return ages.sorted().subList(ages.size-2, ages.size)
}


fun twoOldestAgesVer2(ages: List<Int>) = ages.sorted().takeLast(2)