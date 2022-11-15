package hw3

fun main() {
    var inputNum = readln().toInt()
    val naturalNum = listOf(100, 90, 50, 40, 10, 9, 5, 4, 1)
    val romanNum = listOf("C", "XC", "L", "XL", "X", "IX", "V", "IV", "I")
    var result = ""
    var i = 0
    while (inputNum > 0) {
        while (inputNum - naturalNum[i] >= 0) {
            result += romanNum[i]
            inputNum -= naturalNum[i]
        }
        i += 1
    }
    println(result)
}

