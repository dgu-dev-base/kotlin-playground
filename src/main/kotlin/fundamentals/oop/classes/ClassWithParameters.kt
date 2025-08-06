package fundamentals.oop.classes

class ClassWithParameters(val name: String, var age: Int) {
    fun execute() {
        println("Parameters: name: $name, age: $age")
    }
}

fun main() {
    val classWithParameters = ClassWithParameters("John", 35)
    classWithParameters.execute()
}