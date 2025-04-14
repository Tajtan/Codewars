package sevenKyu
/*
In a small town the population is p0 = 1000 at the beginning of a year. The population regularly increases by 2 percent per year and moreover 50 new inhabitants per year come to live in the town. How many years does the town need to see its population greater than or equal to p = 1200 inhabitants?

More generally given parameters:

p0, percent, aug (inhabitants coming or leaving each year), p (population to equal or surpass)

the function nb_year should return n number of entire years needed to get a population greater or equal to p.

aug is an integer, percent a positive or null floating number, p0 and p are positive integers (> 0)
 */


fun nbYear(pp0:Int, percent:Double, aug:Int, p:Int):Int {
    var currentPp = pp0
    var resultYears = 0

    while (currentPp < p) {
        currentPp += (currentPp * percent/100 + aug).toInt()
        resultYears++
    }
    return resultYears
}




fun nbYearVer2(pp0: Int, percent: Double, aug: Int, p: Int): Int =
    generateSequence(pp0.toDouble()) { it * (1 + percent / 100) + aug }.takeWhile { it < p }.count()


fun main() {
    println(nbYear(1500, 5.0, 100, 5000))
}