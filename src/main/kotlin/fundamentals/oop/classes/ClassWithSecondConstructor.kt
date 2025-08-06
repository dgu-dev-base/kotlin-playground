package fundamentals.oop.classes

class ClassWithSecondConstructor {
    var name: String = ""
    var age: Int = 0
    var email: String = ""

    constructor() {

    }

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    constructor(name: String, age: Int, email: String) {
        this.name = name
        this.age = age
        this.email = email
    }

    fun printParameters() {
        println("Parameters: name: $name, age: $age, email: $email")
    }
}

fun main() {
    val class1 = ClassWithSecondConstructor()
    class1.printParameters()
    val class2 = ClassWithSecondConstructor("John", 32)
    class2.printParameters()
    val class3 = ClassWithSecondConstructor("Bill", 27, "bill@mail.com")
    class3.printParameters()
}