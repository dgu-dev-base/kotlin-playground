package interfaces

import classes.Course

class SqlCourseRepository : CourseRepository {

    override fun getById(id: Int): Course {
        return Course(id, "Kotlin programming", "John Doe")
    }
}