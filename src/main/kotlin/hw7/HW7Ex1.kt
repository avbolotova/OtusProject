package hw7


fun main() {

    summNumenator(fractions1 = Fractions(1,6), fractions2 = Fractions(4,8))
    subNumenator(fractions1 = Fractions(1,6), fractions2 = Fractions(4,8))
}

class Fractions(
    val numerator: Long,
    val denominator: Long
)


fun summNumenator(fractions1: Fractions, fractions2: Fractions): Fractions {
    val numeratorOne = (fractions1.numerator * fractions2.denominator) + (fractions2.numerator * fractions1.denominator)
    val denominatorOne = fractions1.denominator * fractions2.denominator
    val fractionsSumm: Fractions = Fractions(numeratorOne, denominatorOne)
    return fractionsSumm
}

fun subNumenator(fractions1: Fractions, fractions2: Fractions): Fractions {
    val numeratorTwo = (fractions1.numerator * fractions2.denominator) - (fractions2.numerator * fractions1.denominator)
    val denominatorTwo = fractions1.denominator * fractions2.denominator
    val fractionsSub: Fractions = Fractions(numeratorTwo, denominatorTwo)
    return fractionsSub
}










































