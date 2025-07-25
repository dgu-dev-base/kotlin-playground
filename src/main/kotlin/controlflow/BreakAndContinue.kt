package controlflow

fun main() {
    for(i in 1..5) {
        println("i in $i")
        if (i==3) {
            break
        }
    }
}