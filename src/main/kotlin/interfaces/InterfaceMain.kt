package interfaces

fun main() {
    val sqlCourseRepository = SqlCourseRepository()
    val course1 = sqlCourseRepository.getById(1)
    println(course1)

    val course1Id = sqlCourseRepository.save(course1)
    println(course1Id)


    val noSqlCourseRepository = NoSqlCourseRepository()
    val course2 = noSqlCourseRepository.getById(1)
    println(course2)
    noSqlCourseRepository.save(course2)
}