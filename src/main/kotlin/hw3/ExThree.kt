package hw3

fun main() {
    println("Введите 1 сторону треугольника: ")
    val sideOne = readln().toInt()
    println("Введите 2 сторону треугольника: ")
    val sideTwo = readln().toInt()
    println("Введите 3 сторону треугольника: ")
    val sideThree = readln().toInt()

    if (sideOne <= 0 || sideTwo <= 0 || sideThree <= 0) {
        println("Ошибка")
    } else {
        if (sideThree * sideThree > (sideOne * sideOne) + (sideTwo * sideTwo)) {
            println("Треугольник тупоугольный")
        } else if (sideThree * sideThree == (sideOne * sideOne) + (sideTwo * sideTwo)) {
            println("Треугольник прямоугольный")
        } else if (sideThree * sideThree < (sideOne * sideOne) + (sideTwo * sideTwo)) {
            println("Треугольник остроугольный")
        } else {
            println("Ошибка")
        }

    }
}






