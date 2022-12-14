package hw7

import java.time.LocalDate
import java.util.*

fun main() {
    val helena = Customer("Helena")

    val listItemOne = OrderItem("listItemOne", 10.0, 100)
    val listItemTwo = OrderItem("listItemTwo", 20.0, 200)
    val orderDetails = listOf<OrderItem>(listItemOne, listItemTwo)

    val payment = CashPayment(5, currency = Currency.DOLLARS, 20)
    println(payment)

}

class Order(
    val date: Date,
    val status: OrderStatus,
    val details: OrderDetails,
    val customer: Customer,
    val payment: Payment
) {
    fun calcPrice(): Int {
        return 1
    }
    fun calcWeight(): Int {
        return 1
    }
    fun pay(payment: Payment): Unit {}
}

class OrderDetails(
    val location: List<OrderItem>,
    val items: List<OrderItem>
) {
    fun calcPrice(): Int {
        return 1
    }
    fun calcWeight(): Int {
        return 1
    }
    fun addItem(item: OrderItem): Unit {}

}

data class OrderItem(
    val name: String,
    val weight: Double,
    val price: Int
) {
    init {
        println("$name, $weight, $price")
    }
}
enum class OrderStatus {
    SENT,
    AWAITING,
    PAYMENT,
    PAID,
    PROCESSED,
    RECEIVED
}
class Customer(val name: String) {
    val address: String = "Address"
    val orders: List<Order> = listOf()
    fun calcPrice(): Int {
        return 1
    }
    fun calcWeight(): Int {
        return 1
    }
    fun addItem(item: OrderItem): Unit {}
}

abstract class Payment(
    val amount: Int,
    val currency: Currency
) {

    val status: PaymentStatus = PaymentStatus.NOT_PAID
    val curr: Currency = Currency.EUR

    fun performPayment(): Unit {}
}

enum class PaymentStatus {
    NOT_PAID,
    IN_PROCESSING,
    PAID
}

enum class Currency {
    RUB,
    DOLLARS,
    EUR
}

class CashPayment(amount: Int, currency: Currency, total: Int) : Payment(amount, currency) {
    fun performPayment(change: Int): Int {
        return 1
    }
}
class OnlinePayment(amount: Int, currency: Currency) : Payment(amount, currency) {
    val bankId: String = "bankId"
    val bankName: String = "bankName"
    fun checkIfSucceed(): PaymentStatus {
        return PaymentStatus.IN_PROCESSING
    }
}

class DelayedPayment(amount: Int, currency: Currency) : Payment(amount, currency) {
    val endDate: Date = Date(14/12/2022)
    val partAmount: String = "partAmount"
    fun performPartialPayment(amount: Int): Unit {
        return performPayment()
    }

}

