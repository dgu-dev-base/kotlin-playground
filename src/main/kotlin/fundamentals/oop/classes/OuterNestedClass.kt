package fundamentals.oop.classes

class OuterNestedClass {

    val message = "Outer class"

    class Nested {
        fun greet() {
            println("Hello from Nested")
//            println(message) // ❌ Ошибка: Unresolved reference
        }
    }
}

fun main() {
    val nested = OuterNestedClass.Nested()
    nested.greet()
}