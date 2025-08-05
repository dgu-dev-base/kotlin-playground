package visibilitymodifiers

import visibilitymodifiers.service.FormalGreetingService
import visibilitymodifiers.service.InformalGreetingService

fun main() {
    val greetingService = GreetingService()
    greetingService.printGreeting("John", "Formal")

    val informalGreetingService = InformalGreetingService()
    informalGreetingService.printGreeting("Bill", "Informal")

    val formalGreetingService = FormalGreetingService()
    formalGreetingService.printGreeting("Jane", "Formal")
}