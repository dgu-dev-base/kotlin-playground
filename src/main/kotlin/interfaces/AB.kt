package interfaces

class AB : A, B {

    override var isDone: Boolean = false


    override fun doSomething() {
        super<A>.doSomething()
        super<B>.doSomething()
        isDone = true
        println("Class AB")
    }
}

fun main() {
    val ab = AB()

    ab.doSomething()
    println(ab.isDone)
}