package OOP_kot

// 지연초기화
// lateinit / lazy

fun main() {

    var justString : String
    justString = "변경된 스트링"
    println(justString)
    lateinit var lateString : String
    //서버에서 데이터를 받아오는 일을 수행할 때
    //변수 선언만 해놓고 초기화 이따가
    //이걸 lateinit을 통해서 근데 왜?? 변수도 그냥 그렇게 쓰면 되는거 아닌가
    lateString = "변경된 스트링"
    println(lateString)

    val lazyString : String by lazy {
        "lazyTestString"
    }

    println(lazyString)
}