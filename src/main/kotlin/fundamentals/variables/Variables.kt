package fundamentals.variables


const val z = 100

fun main() {
    // var - mutable variable, could be changed
    var x = 5
    x = 10
    println(x)

    // val - immutable variable, can not be changed
    val y = 5
    //y = 10 // commented due to will not be compiled
    println(y)

//    const val z = 100 // Will not compile, not local variable
    println(z)

}