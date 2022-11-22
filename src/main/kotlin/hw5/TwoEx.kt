package hw5

fun main() {
    val coordinate = listOf(2, 4, 5, 8)
    val coordntX = coordinate[1] - coordinate[0]
    val coordntY = coordinate[3] - coordinate[2]
    val resultX = (coordntX * coordntX).toDouble()
    val resultY = (coordntY * coordntY).toDouble()

    println(resultX + resultY)
}
