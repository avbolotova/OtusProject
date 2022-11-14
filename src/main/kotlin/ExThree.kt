fun main() {
    val sideFirst = readln().toInt()
    val sideSecond = readln().toInt()
    if (sideFirst > 0 || sideSecond > 0) {
        val diagonalRectangle = (sideFirst * sideFirst) + (sideSecond * sideSecond)
        println(diagonalRectangle)
    } else {
        "Ошибка"
    }
}