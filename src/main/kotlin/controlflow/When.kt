package controlflow

fun main() {
    // Sample 1
    val value = 5
    when (value) {
        1 -> {
            println("One")
        }

        2 -> {
            println("Two")
        }

        3 -> {
            println("Three")
        } else -> {
            println("Not found")
        }
    }

    // Sample 2
    val position = 3
    val result = when(position) {
        1 -> "ONE"
        2 -> "TWO"
        3 -> {
            println("Position is $position")
            "THREE"
        }
        else -> "No Poistion"
    }
    println(result)

    // Sample 3
    val season = "winter"
    val seasonFirstMonth = when(season) {
        "summer" -> 6
        "winter" -> 12
        "automn" -> 9
        "spring" -> 3
        else -> error("There is ony 4 seasons")
    }
    println(seasonFirstMonth)

}