package basic_syntax

fun main() {
    val score = 80
    /* 학생점수가
    100 초과면 A
    90 초과면 B
    80 초과면 C
    70 초과면 D
    70 이하면 F를 준다.
     */

    if (score > 100) {
        println("A")
    }
    else if (score > 90) {
        println("B")
    }
    else if (score > 80) {
        println("C")
    }
    else if (score > 70) {
        println("D")
    }
    else {
        println("F")
    }
}