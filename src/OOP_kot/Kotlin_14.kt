package OOP_kot

//Any
//최상위 클래스??
//is as

fun main() {
    var str1 : Any = "abc"
    println(str1)
    str1 = "cba"
    println(str1)
    str1 = 123

    //타입이 뭔지 확인하는 법이 is as
    //is --> 타입이 맞는지 확인
    //as --> 타입 캐스팅

    var str3 : Any = "abc"
    if(str3 is String) {
        println("this is String")
    }
    else {
        println("this is not String")
    }

    var str4 : Any = "abc"

    when(str4) {
        is Int -> {
            println("this is int")
        }
        is String -> {
            println("this is string")
        }
        else -> {
            println("this is else")
        }
    }

    var str5 : String = "abc"
    var str6 : String = str5 as String

    println(str6)

    var str7 : Int = 1
    //var str8 : String = str7 as String

    var str9 : String? = 1 as? String //as 옆에 붙은 물음표는 변환 안되면 null로
    println(str9)
}