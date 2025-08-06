package fundamentals.oop.classes

object ObjectWithState {

    var count = 0

    fun increment() {
        count++
    }

    fun print() {
        println("Count: $count")
    }
}

fun main() {
    ObjectWithState.increment()
    ObjectWithState.increment()
    ObjectWithState.print()
}