package typecheckingandcasting

import classes.Course

fun main() {
    val course = Course(1, "Kotlin programming", "John Doe")

    checkType(course)
    checkType("John")
    castNumber(1.0)
//    castNumber(1)
    val num = 1
    val numDouble = num.toDouble()
    castNumber(numDouble)

    if (num is Int) {
        println("Int")
    }
}

fun castNumber(any: Any) {
    when(any) {
        any as Double -> println("Value is Double")

    }
}

fun checkType(type: Any) {
    when(type) {
        is Course -> {
            println(type)
        }
        is String -> {
            println(type.lowercase())
        }
    }
}