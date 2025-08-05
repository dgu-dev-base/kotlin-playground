package classes

import functions.printPerson

data class Course(
    val id: Int,
    val name: String,
    val author: String,
    val courseCategory: CourseCategory = CourseCategory.DEVELOPMENT
)

enum class CourseCategory {
    DEVELOPMENT,
    BUSINESS,
    DESIGN,
    MARKETING
}

fun main() {
    val course1 = Course(1, "Kotlin programming", "John Doe")
    val course2 = Course(1, "Kotlin programming", "John Doe")
    println(course1)

    val person = Person()
    println(person)

    val course3 = course1.copy(
        id = 3,
        author = "Bill"
    )

    println(course3)

    println("Course equals: ${course1 == course2}")

    val course4 = Course(1,
        "Kotlin programming",
        "John Doe",
        CourseCategory.MARKETING
    )
    println(course4)




}
