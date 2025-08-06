package fundamentals.oop.classes

class ClassCompanionNamedObject private constructor(val name: String){

    companion object Creator {
        fun create(): ClassCompanionNamedObject = ClassCompanionNamedObject("Regular User")
    }
}

fun main() {
    val userType1 = ClassCompanionNamedObject.Creator.create()
    val userType2 = ClassCompanionNamedObject.create()
    println(userType1.name)
    println(userType2.name)
}
