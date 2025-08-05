package visibilitymodifiers.service

import visibilitymodifiers.CommonGreetingService

class FormalGreetingService : CommonGreetingService() {


    override fun addGreeting(type: String): String {

        return "Hello"
    }
}