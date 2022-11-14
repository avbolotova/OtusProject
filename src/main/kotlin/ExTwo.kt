fun main() {
    val numMinutes = readln().toDouble()
    val countOfMonth = numMinutes / 518400
    print(countOfMonth.toInt())
    print(" and ")
    println((countOfMonth % 10).toInt())
}