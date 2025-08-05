package classes

class Person(
    val name: String = "",
    val age: Int = 18
) {

    init {
        println("Person is initialized")
    }
    fun action() {
        println("Person Walks")
    }
}

fun main() {
    val p = Person("John", 34)
    println("Name ${p.name}")
    val p2 = Person()
    println("Name ${p2.name}")
}

