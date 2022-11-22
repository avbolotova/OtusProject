enum class WrongPasswords {
    CORRECTPASSWORDS,
    LENGTHPASSWORD,
    NUMBERPASSWORD,
    CAPSLOCKWORDS
}
fun main() {
    val inputPasswords = readln()
    when (correctPassword(inputPasswords)) {
        WrongPasswords.CORRECTPASSWORDS -> println("Успешно пройдена проверка")
        WrongPasswords.LENGTHPASSWORD -> println("Длина пароля не соответствует заданным параметрам")
        WrongPasswords.NUMBERPASSWORD -> println("Отсутствует цифры в пароле")
        WrongPasswords.CAPSLOCKWORDS -> println("Отсутствуют заглавные буквы")
    }
}
fun correctPassword(inputPasswords: String): WrongPasswords {
    if (!wrongPassOne(inputPasswords)) return WrongPasswords.LENGTHPASSWORD
    if (!wrongPassTwo(inputPasswords)) return WrongPasswords.NUMBERPASSWORD
    if (!wrongPassThree(inputPasswords)) return WrongPasswords.CAPSLOCKWORDS
    return WrongPasswords.CORRECTPASSWORDS
}
fun wrongPassOne(inputPasswords: String): Boolean {
    var value = inputPasswords.length
    if (value > 5) return true
    return false
}
fun wrongPassTwo(inputPasswords: String): Boolean {
    var value = 0
    for (i in inputPasswords) {
        if (i.isDigit()) value += 1
    }

    if (value > 0) return true
    return false
}
fun wrongPassThree(inputPasswords: String): Boolean {
    var value = 0
    for (i in inputPasswords) {
        if (i.isUpperCase()) value += 1
    }

    if (value > 0) return true
    return false
}
