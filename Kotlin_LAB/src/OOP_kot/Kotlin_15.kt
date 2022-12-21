package OOP_kot

//엘비스 연산자란 널처리를 위한 ..
//null -> 아무것도 가리키지 않는
fun main() {

    var testStr1 : String? = null
    println(testStr1)



}

fun findStringLength(str: String) :Int {
    return str.length
}

fun findStringLength2(str : String?) : Int? {
    return str?.length
}

fun findStringLength3(str : String?) : Int {
    var resultCount = 0
    if (str != null) {
        resultCount = str.length
    }
    return resultCount
}

fun findStringLength4(str:String?) :Int {
    return str?.length ?: 0 //null이면 0리턴해라
}