package sevenKyu

/*
In John's car the GPS records every s seconds the distance travelled from an origin (distances are measured in an arbitrary but consistent unit). For example, below is part of a record with s = 15:

x = [0.0, 0.19, 0.5, 0.75, 1.0, 1.25, 1.5, 1.75, 2.0, 2.25]
The sections are:

0.0-0.19, 0.19-0.5, 0.5-0.75, 0.75-1.0, 1.0-1.25, 1.25-1.50, 1.5-1.75, 1.75-2.0, 2.0-2.25
We can calculate John's average hourly speed on every section and we get:

[45.6, 74.4, 60.0, 60.0, 60.0, 60.0, 60.0, 60.0, 60.0]
Given s and x the task is to return as an integer the *floor* of the maximum average speed per hour obtained on the sections of x. If x length is less than or equal to 1 return 0 since the car didn't move.

Example:
With the above data your function gps(s, x) should return 74

Note
With floats it can happen that results depends on the operations order. To calculate hourly speed you can use:

 (3600 * delta_distance) / s.

Happy coding!
 */

fun gps(s:Int, x:DoubleArray):Int {
    val result = mutableListOf<Double>()
    if (x.size <= 1) {
        return 0
    } else {
        for (index in 1 until x.size) {
            result.add( (3600 * (x[index] - x[index - 1])) / s )
        }
        return result.max().toInt()
    }
}



fun gpsVer2(s: Int, x: DoubleArray) = x.toList()
    .windowed(2) { it[1] - it[0] }
    .map { 3600 * it / s }
    .max()
    ?.toInt() ?: 0




fun gpsVer3(s: Int, x: DoubleArray) =
    x.asSequence().zipWithNext { a, b -> (b - a) * 3600 / s }.max()?.toInt() ?: 0


fun gpsVer4(s:Int, x:DoubleArray) = x.mapIndexed { index: Int, d: Double ->
    (3600 * (x.getOrElse(index + 1) { d } - d))/s
}.max()?.toInt() ?: 0



fun gpsVer5(s:Int, x:DoubleArray) = if (x.size < 2) 0 else
    (0 until x.lastIndex).map{ (3600 * (x[it + 1] - x[it])) / s }.max()!!.toInt()