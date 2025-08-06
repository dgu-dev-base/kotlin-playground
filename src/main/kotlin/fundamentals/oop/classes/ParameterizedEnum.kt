package fundamentals.oop.classes

enum class ParameterizedEnum(val code: Int) {
    SUCCESS(200),
    ERROR(500),
    NOT_FOUND(404)
}

fun main(){
    val s = ParameterizedEnum.ERROR
    println("Code: ${s.code}")
}