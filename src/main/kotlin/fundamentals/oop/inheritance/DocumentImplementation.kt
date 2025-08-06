package fundamentals.oop.inheritance

class DocumentImplementation(val name: String) : PrintableInterface {

    override fun print() {
        println("Printing document: $name")
    }
}

fun main() {
    val doc = DocumentImplementation("MyFile.pdf")
    doc.print()
}