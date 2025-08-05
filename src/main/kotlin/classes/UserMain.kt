package classes

fun main() {
    val student = Student("John")
    println(student.name)
    student.login()
    student.isLoggedIn = true

    val country = Student.country()
    println(country)
    println(Student.noOfEnolledCoures)

    val instructor = Instructor("Bill")
    println(instructor.name)
    instructor.login()


    Authenticator.authenticate("Michael", "12345")
}