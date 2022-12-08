package hw7

import java.util.*


/*
Оплата наличными
Класс CashPayment, который должен наследоваться от Payment и обаладать доп полем:

необходимое кол-во для оплаты (amount: Int)
кол-во, которое было передано (total: Int)
сдача, если нет, то 0 (change: Int)
Также должен быть перезаписан метод performPayment()

 */

class Order (
    val date: Date,
    val status: OrderStatus,
    val details: OrderDetails,
    val payment: Payment)

class OrderDetails (
    val location: String,
    val items: List<OrderItem>){

}

data class OrderItem(
    val name: String,
    val weight: Double,
    val price: Int) {

}

enum class OrderStatus {

}
class Customer(
    val name: String,
    val address: String,
    val orders: List<Order>){
}

class Payment(
    val amount: Int,
    val currency: Currency,
    val status: PaymentStatus,



    ){

}

enum class PaymentStatus {

}

enum class Currency {

}

fun main() {

}