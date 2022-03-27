package OOP_kot

// enum

fun main() {
    println(Direction.NORTH)
    Direction.values().forEach {
        println(it)
    }
}
enum class Color(val rgb : Int) {
    RED(0xff000),
    GREEN(0x00ff00),
    BlUE(0x000FF)
}
enum class Direction { //열거해서 쓴다..
    NORTH, SOUTH, WEST, EAST
}

enum class CustomerType {
    A, B, C, D, VIP
}