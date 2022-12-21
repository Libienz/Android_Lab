package basic_syntax



fun main() {
    val studentScore1 = 100

    if (studentScore1 > 50 ) {
        println("50점 이상입니다.")
    }
    else {
        println("50점 이상이 아닙니다.")
    }

    val studentScore2 = 50

    if (studentScore2 > 50) {
        println("50초과")
    }
    else if (studentScore2 == 50) {
        println("50점입니다.")
    }
    else {
        println("50점보다 아래입니다.")
    }

    val score = 100
    when (score) {
        100 -> {
            println("100")
        }
        90 -> {
            println("90")
        }
        else -> {
            println("else")
        }
    }
}