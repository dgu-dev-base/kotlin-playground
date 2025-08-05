package classes

class Item {
    var name: String = ""
        get() {
            println("Get name")
            return field
        }
    var price: Double = 0.0
        get() {
            println("Get price")
            return field
        }
        set(value) {
            println("Set Price")
            field = value
        }
}

fun main() {
    var item = Item()
    item.name = "Iphone"
    println(item.name)
    println(item.price)
    item.price = 1245.5
    println(item.price)

}