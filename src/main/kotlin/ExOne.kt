fun main() {
    println("Введите натуральное трехзначное число: ")
    val inputNaturalNumber = readln().toInt()
    val sumResult = (inputNaturalNumber / 10) / 10 + (inputNaturalNumber % 100) / 10 + (inputNaturalNumber % 10)
    println("Результат: $sumResult")
}