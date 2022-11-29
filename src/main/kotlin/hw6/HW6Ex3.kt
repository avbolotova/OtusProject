package hw6

import java.util.*

fun main() {
    val numList = readln()
    val list = numList.split(" ").map { it.toInt() }

    val result = list.sorted()

    println("Minimum: ${result.first()}")
    println("Maximum: ${result.last()}")
    println("Average: ${result.average()}")

}

