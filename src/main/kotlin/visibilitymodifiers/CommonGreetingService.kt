package visibilitymodifiers

open class CommonGreetingService {
    fun printGreeting(name: String, type: String) {
        val fullGreeting = buildFullGreeting(name, addGreeting(type))
        println(fullGreeting)
    }

    protected open fun addGreeting(type : String) :String {
        return "Welcome"
    }

    protected fun buildFullGreeting(name: String, greeting: String): String {
        return greeting + ", " + name
    }

}