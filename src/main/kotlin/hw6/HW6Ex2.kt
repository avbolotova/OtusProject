package hw6

import java.util.*

fun main() {
    val arrayOne = arrayOf<String>(readln())
    val arrayTwo = arrayOf<String>(readln())

    val resultOne = concatinateArr(arrayOne, arrayTwo)
    println(resultOne)

    val resultTwo = subtractArr(arrayOne, arrayTwo)
    println(resultTwo)

    val resultThree = crossArr(arrayOne, arrayTwo)
    println(resultThree)

}

fun concatinateArr(arr1: Array<String>, arr2: Array<String>): CharArray {
    return arr1
        .plus(arr2)
        .joinToString(separator = "")
        .toCharArray()
}

fun subtractArr(arr1: Array<String>, arr2: Array<String>): CharArray {
    val res1 = arr1.joinToString().toList()
    val res2 = arr2.joinToString().toList()

    return res1.subtract(res2).toCharArray()

}

fun crossArr(arr1: Array<String>, arr2: Array<String>): CharArray {
    val res1 = arr1.joinToString().toList()
    val res2 = arr2.joinToString().toList()

    return res1.intersect(res2).toCharArray()
}
