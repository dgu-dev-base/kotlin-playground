package fundamentals.oop.inheritance

class AbstractClassImplementation : SimpleAbstractClass() {

    override fun doSomething() {
        println("Do it good")
    }
}

fun main() {
    val ac = AbstractClassImplementation()
    ac.printSomething()
    ac.doSomething()
}