package fundamentals.functions

fun main() {
    printName("John")
    printName(name = "Philip")
//    printName() will not compile
    noParameter()
    noParameterUnit()
    println(returnString())
    println(parametersAndReturn(2, 5))
    println(shortFunction(5, 7))
    printPerson()
    printPerson(name = "Bill")
}

fun printName(name: String) {
    println("Name is $name")
}

fun noParameter() {
    println("Function without parameters")
}

fun noParameterUnit(): Unit {
    println("Function without parameters")
}

fun returnString(): String {
    return "Message";
}

fun parametersAndReturn(a: Int, b: Int): Int {
    return a + b
}

fun shortFunction(a: Int, b: Int): Int = a * b

fun printPerson(name: String = "", email: String = "@", age: Int = 20) {
    println("Name: $name, email: $email, age: $age")
}