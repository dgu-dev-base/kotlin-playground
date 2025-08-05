package classes

class Student(name: String) : User(name) {

    override var isLoggedIn = false

    companion object{
        const val noOfEnolledCoures = 10
        fun country() = "USA"
    }

    override fun login() {
        println("Student login")
    }
}
