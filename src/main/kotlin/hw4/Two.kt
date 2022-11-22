package hw4


fun main() {
    try {
        val InputNumber = readln().toInt()
        println(factorial(InputNumber))

    } catch (e: Exception) {
        println("Факториал от отрицательного числа не определен")
    }
}

fun factorial(InputNumber: Int): Int {
    if (InputNumber <= 1) return 1
    return InputNumber * factorial(InputNumber - 1)
}

