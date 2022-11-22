package hw5

fun main() {
    val list = listOf(10, 4, 2, 7)

    val min = findMin(list)
    println(min)

}

fun findMin(list: List<Int>): Int? {
    var min = Int.MAX_VALUE
    for (i in list) {
        min = min.coerceAtMost(i)
    }
    return min
}


