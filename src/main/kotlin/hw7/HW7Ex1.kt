package hw7


fun main() {

    val number: Calculator = Calculator()
    print(number.sumNumerator(fractions1 = Fractions(1,6), fractions2 = Fractions(2,3)))
    print("/")
    print(number.sumDenominator(fractions1 = Fractions(3,5), fractions2 = Fractions(1,6)))

    println()

    print(number.subtractNumerator(fractions1 = Fractions(6,8), fractions2 = Fractions(3,5)))
    print("/")
    print(number.subtractDenominator(fractions1 = Fractions(1,8), fractions2 = Fractions(4,6)))



}

class Fractions (
    val numerator: Long,
    val denominator: Long
    )

class Calculator () {
    fun sumNumerator(fractions1: Fractions, fractions2: Fractions) : Long {
        val numeratorOne = ((fractions1.numerator * fractions2.denominator) + (fractions2.numerator * fractions1.denominator))
        return numeratorOne
    }

    fun sumDenominator(fractions1: Fractions, fractions2: Fractions) : Long {
        val denominatorOne = fractions1.denominator * fractions2.denominator
        return denominatorOne
    }


    fun subtractNumerator(fractions1: Fractions, fractions2: Fractions) : Long {
        val numeratorTwo = ((fractions1.numerator * fractions2.denominator) - (fractions2.numerator * fractions1.denominator))
        return numeratorTwo
    }

    fun subtractDenominator(fractions1: Fractions, fractions2: Fractions) : Long {
        val denominatorTwo = fractions1.denominator * fractions2.denominator
        return denominatorTwo
    }
}










































