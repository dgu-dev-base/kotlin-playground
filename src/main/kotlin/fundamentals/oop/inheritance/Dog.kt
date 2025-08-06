package fundamentals.oop.inheritance

class Dog : Animal() {

    override fun makeSound() {
        println("Woof")
    }
}

fun main() {
    val dog = Dog()
    dog.makeSound()
    dog.greeting()
}