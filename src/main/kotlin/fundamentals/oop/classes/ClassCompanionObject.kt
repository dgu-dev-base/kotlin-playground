package fundamentals.oop.classes

class ClassCompanionObject private constructor(val name: String){

    companion object {
        fun create(): ClassCompanionObject = ClassCompanionObject("Guest")
    }

}

fun main() {
    val guest = ClassCompanionObject.create()
    println(guest.name)
}