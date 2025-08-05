package classes

open class User(val name: String) {

    open var isLoggedIn : Boolean = false

    open fun login() {
        println("Login for user: $name")
    }
}