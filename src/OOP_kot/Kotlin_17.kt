package OOP_kot
//class 에 대한 개괄적

class Test {
    val a = "abc"
}
class Test2(str : String) {
    val b = str
}
class Test3() {
    fun test3Fun() { //메소드
        println("test3Fun")
    }
}

class MyInfo {
    fun getMyAge() : Int {
        return 20
    }
    fun getMyName() : String {
        return "이근희"
    }
}
class Dog(name : String, age : Int) {
    val dogName = name
    val dogAge = age

    fun getMyDogInfo() : String {
        return dogName + " : " +  dogAge
    }
}

class InitTest() {
    init { //선언만 해줘도 바로 실행되는 부분 다른 메소드를 사용하더라도 ..
        println("???")
    }
    fun testInitFun() {
        println("test Init func")
    }
}

fun main() {
    println(Test().a)
    println(Test2("abcd").b)
    Test3().test3Fun()

    println(Dog("밍키", 1).getMyDogInfo())

    InitTest()


}
