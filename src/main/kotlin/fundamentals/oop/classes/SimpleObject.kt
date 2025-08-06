package fundamentals.oop.classes

object SimpleObject {

    fun log(message: String) {
        println("LOG: $message")
    }
}

fun main() {
    SimpleObject.log("Application Started")
}