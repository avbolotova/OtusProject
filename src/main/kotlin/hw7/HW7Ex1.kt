package hw7


fun main() {

    val number: Calculator = Calculator()
    number.sumFractions(fractions1 = Fractions(1,6), fractions2 = Fractions(2,3))
    number.subtractFractions(fractions1 = Fractions(4,6), fractions2 = Fractions(2,5))

}

class Fractions (
    val numerator: Int,
    val denominator: Int
    )

class Calculator () {
    fun sumFractions(fractions1: Fractions, fractions2: Fractions) {
        print((fractions1.numerator * fractions2.denominator) + (fractions2.numerator * fractions1.denominator))
        print("/")
        print(fractions1.denominator * fractions2.denominator)
    }

    fun subtractFractions(fractions1: Fractions, fractions2: Fractions) {
        println()
        print((fractions1.numerator * fractions2.denominator) - (fractions2.numerator * fractions1.denominator))
        print("/")
        print(fractions1.denominator * fractions2.denominator)
    }
}



