package hw6

import hw5.findMinNumber


fun main() {
    val numList = readln()
    val list = numList.split(" ").map { it.toInt() }
    println(list.sorted())
}

