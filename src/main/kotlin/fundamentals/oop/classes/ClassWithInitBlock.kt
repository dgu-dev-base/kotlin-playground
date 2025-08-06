package fundamentals.oop.classes

class ClassWithInitBlock(name: String, age: Int) {

    var access: String = ""

    init{
        println("Name: $name, age: $age")
    }

    init{
        if(age >= 18) {
            access = "Accept"
        }else {
            access = "Denied"
        }
    }

    fun printAccess() {
        println("Access: $access")
    }

}

fun main() {
    val classWithInitBlock1 = ClassWithInitBlock("John", 20)
    classWithInitBlock1.printAccess()
    val classWithInitBlock2 = ClassWithInitBlock("Bill", 16)
    classWithInitBlock2.printAccess()
}