package fundamentals.oop.classes

class OuterClass {

    val message = "Outer class"

    class Nested {
        fun greet() {
            println("Hello from Nested")
//            println(message) // ❌ Ошибка: Unresolved reference
        }
    }
}

fun main() {
    val nested = OuterClass.Nested()
    nested.greet()
}