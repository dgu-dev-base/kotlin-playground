package interfaces

import classes.Course

interface CourseRepository {

    fun getById(id: Int) : Course

    fun save(course: Course): Int {
        println(course)
        return course.id
    }
}