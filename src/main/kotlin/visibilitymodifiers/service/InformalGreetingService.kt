package visibilitymodifiers.service

import visibilitymodifiers.CommonGreetingService

class InformalGreetingService: CommonGreetingService() {
    override fun addGreeting(type: String): String {
        return "Hi"
    }
}