package fundamentals.oop.classes

enum class EnumWithMethod {

    HAPPY, SAD;

    fun emoji(): String {
        return when (this) {
            HAPPY -> "😊"
            SAD -> "😢"
        }
    }
}

fun main() {
    println(EnumWithMethod.HAPPY.emoji())
    println(EnumWithMethod.SAD.emoji())
}