package OOP_kot

//제너릭...
// 컴파일시에 타입 체크 가능
// 타입 캐스팅 필요 음슴

class Box1(test : Int) {
    var value = test
}
class Box2(test : String) {
    var value = test
}
class Box3<T>(test : T) { //제너릭 제너릭 제너릭
    var value = test
}
fun main() {
    val box1 = Box1(10)
    println(box1.value)

    val box3 = Box3<String>("asdf") //어떤 타입이 들어와도 유하게 반응 하고 싶을때
    //제너릭을 사용하즈아!!
    println(box3.value)
}