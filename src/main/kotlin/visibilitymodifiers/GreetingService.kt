package visibilitymodifiers

open class GreetingService {

    fun printGreeting(name: String, type: String) {
        val fullGreeting = buildFullGreeting(name, addGreeting(type))
        println(fullGreeting)
    }

    fun addGreeting(type : String) :String {
        if ("Formal" == type) {
            return "Hello"
        }
        if ("Informal" == type) {
            return "Hi"
        } else {
            return "Welcome"
        }
    }

    protected fun buildFullGreeting(name: String, greeting: String): String {
        return greeting + ", " + name
    }
}