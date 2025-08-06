package fundamentals.oop.inheritance

sealed class OrderCommand {
    data class Create(val customerId: Long): OrderCommand()
    data class Cancel(val orderId: Long): OrderCommand()
    data class Ship(val orderId: Long): OrderCommand()
}