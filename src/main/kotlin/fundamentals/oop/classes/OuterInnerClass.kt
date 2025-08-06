package fundamentals.oop.classes

class OuterInnerClass(val name: String) {
    val prefix = "Outer says: "

    inner class InnerClass {
        fun greet() {
            println("$prefix Hello, $name")
        }

        fun referenceToOuter() {
            println("Accessing outer class: ${this@OuterInnerClass.name}")
        }
    }
}

fun main() {
    val outer = OuterInnerClass("Kotlin")
    val inner = outer.InnerClass()
    inner.greet()
    inner.referenceToOuter()
}