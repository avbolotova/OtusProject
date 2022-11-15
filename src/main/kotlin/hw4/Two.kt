package hw4

fun main() {
    val inputNumber = readln().toInt()
    println(factorial(inputNumber))
}

fun factorial (inputNumber:Int): Int {
    if (inputNumber <= 1) return 1
    return inputNumber*factorial(inputNumber-1)
}