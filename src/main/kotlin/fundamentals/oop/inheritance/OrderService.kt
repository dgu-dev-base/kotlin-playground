package fundamentals.oop.inheritance

class OrderService {

    fun processCommand(cmd: OrderCommand) {
        when(cmd) {
            is OrderCommand.Create -> {
                println("Creating an order by customer with id: ${cmd.customerId}")
            }
            is OrderCommand.Cancel -> {
                println("Canceled order by id: ${cmd.orderId}")
            }
            is OrderCommand.Ship -> {
                println("Ship order by id: ${cmd.orderId}")
            }
        }
    }
}

fun main() {
    val orderService = OrderService()
    orderService.processCommand(OrderCommand.Create(2))
    orderService.processCommand(OrderCommand.Cancel(1))
    orderService.processCommand(OrderCommand.Ship(5))
}