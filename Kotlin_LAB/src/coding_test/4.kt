
import kotlin.math.pow

// 별이 아래와 같이 2배씩 늘어나며 출력되는 solution을 완성하세요

fun main(){

    solution(3)
    // *
    // **
    // ****

    solution(5)
    // *
    // **
    // ****
    // ********
    // ****************
}

fun solution(star : Int){
    var count = 0
    while(count < star) {
        //출력해야 할 횟수
        var num = (2.0).pow(count)
        for(i in 1..num.toInt()) {
            print("*")
        }
        count++
        println()
    }


}


