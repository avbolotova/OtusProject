package hw5

import java.util.*

fun main() {
    val inputNum1 = readln().toInt()
    val inputNum2 = readln().toInt()
    val inputNum3 = readln().toInt()
    val inputNum4 = readln().toInt()

    val result = findMinNumber(inputNum1, inputNum2, inputNum3, inputNum4)
    println(result)
}

fun findMinNumber(num1: Int, num2: Int, num3: Int, num4: Int): Int {
    val arrayNumber = intArrayOf(num1, num2, num3, num4)
    var minValueNum = arrayNumber[0]
    var i = 0
    while (i < arrayNumber.size) {
        if (arrayNumber[i] < minValueNum) minValueNum = arrayNumber[i]
        i += 1
    }
    return minValueNum
}

