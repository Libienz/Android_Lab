import java.util.*

// 가장 가까운 사람의 이름을 알려주는 함수를 완성하세요
// 거리는 음수가 아닙니다 / 같은 거리는 없습니다.

fun main(){

    val result1 = solution("민수 : 3, 민지  : 4, 찬혁 : 1.5, 지우 : 2")
    println(result1)
    // 찬혁

    val result2 = solution("지영 : 3.7, 민영 : 1.2, 해피 : 2.7, 퍼니 : 3")
    println(result2)
    // 민영

}


fun solution(str: String) : String {
    var resMap = mutableMapOf<String, Double>()
    var info = str.split(", ")
    for (i in info) {
        var name = i.split(" : ")[0]
        var dist = i.split(" : ")[1]
        resMap.put(name, dist.toDouble())

    }

    var least = Collections.min(resMap.values)
    return least.toString()

}
