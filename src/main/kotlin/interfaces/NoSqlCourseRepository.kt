package interfaces

import classes.Course

class NoSqlCourseRepository : CourseRepository {


    override fun getById(id: Int): Course {
        return Course(id, "Kotlin programming", "Bill Green")
    }


    override fun save(course: Course): Int {
        println("NoSql Save")
        return course.id
    }
}