package fundamentals.oop.inheritance

open class Animal {

    fun greeting() {
        println("Welcome")
    }
    open fun makeSound() {
        println("General Sound")
    }
}