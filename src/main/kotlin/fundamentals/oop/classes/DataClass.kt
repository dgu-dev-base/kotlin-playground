package fundamentals.oop.classes

data class DataClass(
    val name: String,
    val age: Int,
    val salary: Double
)

fun main() {
    val data1 = DataClass("John", 23, 2330.5)
    println(data1)
    val data2 = DataClass("Bill", 21, 1330.5)
    println(data2)
}