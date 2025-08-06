package fundamentals.oop.inheritance

class Button : Clickable, Focusable {

    override fun hover() {
        println("Hover")
    }
}


fun main() {
    val btn = Button()
    btn.click()
    btn.focus()
    btn.hover()
}
