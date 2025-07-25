package basic

fun main() {
    // var - variables are mutable
    // mutable - means that values could be changed
    var x = 5
    x = 10
    println(x)


    // val - immutable, can not be changed
    // it will not compiles
    val y = 5
    //y = 10 // commented due to will not be compiled
    println(y)

    val z: Long =12

    var s = 100
    var mZ: Long = s.toLong()
    println(z)
    println(mZ)
}