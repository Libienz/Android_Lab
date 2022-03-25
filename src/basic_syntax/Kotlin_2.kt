package basic_syntax



fun main() {
    val test1 = "1234"
    val test2 = 1234
    //test1 과 test2는 다름
    println(test1)
    println(test2)

    println(test1 + 1)
    println(test2 + 1)

    //자료형 출력해볼 수 있는
    println(test1::class.java.simpleName)
    println(test2::class.java.simpleName)

    val test3 = 1234.1234

    //타입추론이 확실한 듯
    println(test3::class.java.simpleName)

    //타입을 명시할 수도 있음
    val test4 : Int = 1234
    println(test4)

    val test5 : String = "1234"
    println(test5)

    //overflow
    //val test6 : Int = 1234123412341234
    val test7 : Long = 1234123412341234
    println(test7)

    val test8 : Float = 1234.1234f //기본이 더블인듯 f붙여주어야
    println(test8)


    //명시적 형변환
    val test9 : Int = 1234
    val test10 = test9.toString()
    println(test10::class.java.simpleName)

    val test11 : String = "1234"
    val test12 = Integer.parseInt(test11)

    val test13 = ""
    val test14 = null

    //val test15 : String = null
    //?가 null 일 수도 있다는 표시
    val test16 : String? = null



}