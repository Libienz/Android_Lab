package OOP_kot

// 싱글톤 패턴을 사용할 때 object 사용

fun main() {
    val test1 = TestClass()
    val test2 = TestClass()

    test1.count = 10;
    //test1.count의 접근은 인스턴스가 다른 것 끼리는 x

    val test3 = testObject
    val test4 = testObject

    //3과 4는 하나의 인스턴스 전역변수처럼?

    val test5 = TestObjClass()
    val test6 = TestObjClass()
    test5.inc()

    println(TestObjClass.number)


}
class TestObjClass {
    companion object { //클래스안에서 사용하고 싶을 때 스태틱과 비슷 but 객체
        var number = 0
    }
    fun inc() {
        number++
    }
    fun dec() {
        number--
    }
}
object  testObject {
    init {
        println("testobj")
    }
    var count = 0
}
class TestClass {
    init {
        println("testClass")
    }

    var count = 0
}
