package controlflow

fun main() {
    forLoop()
    whileLoop()
    exploreDoWhileLoop()
}

fun exploreDoWhileLoop() {
    var k = 0
    do {
        println("k: $k")
        k++
    } while (k < 5)
}

fun forLoop() {
    val rangeUp = 1..10
    for (i in rangeUp) {
        print(i)
    }

    println()
    val rangeDown = 10 downTo 1
    for (i in rangeDown) {
        print(i)
    }

    println()
    for (i in rangeDown step 2) {
        print(i)
    }
    println()

    for(i in 1..20) {
        print(i)
    }
}

fun whileLoop() {
    var x = 1
    while (x < 5) {
        println("While Loop x: $x")
        x++
    }
}