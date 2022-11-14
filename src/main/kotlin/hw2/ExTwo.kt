fun main() {
    val numMinutes = readln().toDouble()

    if (numMinutes > 0) {
        val countOfMonth = numMinutes / 518400
        print(countOfMonth.toInt())
        print(" and ")
        println((countOfMonth % 10).toInt())
    } else {
        "Ошибка"
    }
}
