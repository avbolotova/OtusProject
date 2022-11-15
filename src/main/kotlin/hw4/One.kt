package hw4

fun main(args: Array<String>) {
    var inputNum = readln().toInt()
    var reversedInteger = 0
    var remainder: Int
    val originalInteger: Int

    originalInteger = inputNum


    while (inputNum != 0) {
        remainder = inputNum % 10
        reversedInteger = reversedInteger * 10 + remainder
        inputNum /= 10
    }

    if (originalInteger == reversedInteger)
        println("true")
    else
        println("false")
}