package hw3

fun main(){
    println("Введите месяц: ")
    val month = readln().toInt()
    println("Введите число: ")
    val countDay = readln().toInt()

    val result = "До Нового года осталось: " + when (month) {
        1 -> 335 + (31 - countDay)
        2 -> 306 + (29 - countDay)
        3 -> 275 + (31 - countDay)
        4 -> 245 + (30 - countDay)
        5 -> 214 + (31 - countDay)
        6 -> 184 + (30 - countDay)
        7 -> 153 + (31 - countDay)
        8 -> 122 + (31 - countDay)
        9 -> 92 + (30 - countDay)
        10 -> 61 + (31 - countDay)
        11 -> 31 + (30 - countDay)
        12 -> 31 - countDay
        else -> "Ошибка"
    }
    println(result)
}