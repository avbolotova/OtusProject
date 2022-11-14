package hw3

fun main(){
    println("Введите 1 сторону треугольника: ")
    val sideOne = readln().toInt()
    println("Введите 2 сторону треугольника: ")
    val sideTwo = readln().toInt()
    println("Введите 3 сторону треугольника: ")
    val sideThree = readln().toInt()

    val sideOneSquare = sideOne * sideOne
    val sideTwoSquare = sideTwo * sideTwo
    val sideThreeSquare = sideThree * sideThree

    if (sideOneSquare + sideTwoSquare > sideThreeSquare) {
        println("Треугольник тупоугольный")
    } else if (sideOneSquare + sideTwoSquare == sideThreeSquare) {
        println("Треугольник прямоугольный")
    } else if (sideOneSquare + sideTwoSquare < sideThreeSquare) {
        println("Треугольник остроугольный")
    } else {
        println("Ошибка")
    }
}