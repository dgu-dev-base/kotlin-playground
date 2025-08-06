package fundamentals.oop.inheritance

class DrawableImplementation : DrawableInterface {

    override fun delete() {
        println("Delete draw")
    }
}

fun main() {
    val myDraw = DrawableImplementation()
    myDraw.draw()
    myDraw.delete()
}