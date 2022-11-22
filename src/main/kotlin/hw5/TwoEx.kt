package hw5

import java.util.*
import kotlin.math.sqrt

fun main() {

    val minSegment = -10000
    val maxSegment = 10000


    val input = Scanner(System.`in`)
    val x1 = input.nextInt()
    val x2 = input.nextInt()
    val y1 = input.nextInt()
    val y2 = input.nextInt()

    if ((x1 >= minSegment && x1 <= maxSegment) && (x2 >= minSegment && x2 <= maxSegment) && (y1 >= minSegment && y1 <= maxSegment) && (y2 >= minSegment && y2 <= maxSegment)) {
        val result = lengthOfSegment(x1, x2, y1, y2)
        val stringResult = String.format("%.6f", result)
        println(stringResult)
    } else {
        println("Введите положительное число")
    }


}

fun lengthOfSegment(x1: Int, x2: Int, y1: Int, y2: Int): Double {
    val formulaY = (y2 - y1) * (y2 - y1)
    val formulaX = (x2 - x1) * (x2 - x1)

    return sqrt(formulaY.toDouble() + formulaX.toDouble())
}