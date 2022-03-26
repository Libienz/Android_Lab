package basic_syntax

fun main() {
    val list_row = listOf(1,2,3,4,5,6,7,8,9)
    val list_col = listOf(1,2,3,4,5,6,7,8,9)

    for (i in list_row) {
        for (j in list_col) {
            println("$i * $j = " + i*j)
        }
    }

}