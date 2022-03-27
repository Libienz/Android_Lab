package OOP_kot

// Kotlin Scope Function
// let / with / run / apply / also
// let -> non null일 떄 사용
// with -> 컨텍스트 내부에서 함수를 호출
// run -> 객체 초기화와 return값 계산이 필요할 때 주로 사용
// apply -> 값을 반환하지 않고, 객체 구성에 대해 주로 사용
// also -> 객체에 대해 추가적인 작업

fun main() {

    val str : String? = "hi"
    println(str?.length)

    val length = str?.let {
        println(it) //it 이 str
        it.length
    }

    println(length)

    val str2 : String? = null
    val length2 = str2?.let {
        println(it)

    }
}

class multiPortService(var url : String, var port : Int) {
    fun prepareRequest() : String = "기본 요청 url $url"
    fun query(request : String) = "결과 query $ request"
}