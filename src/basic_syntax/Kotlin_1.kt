package basic_syntax

class Kotlin_1 {
}
// 주석 문법 자바와 동일
fun main() {
    println("Hello World")
    //val 리어사인먼트 불가능! 밀봉시킨다.
    //var은 변경가능
    val box1 = "test box1" //val 은 변수. 타입은?? 아직 잘 몰루..
    val box2 = "test box2" //tostring이 불리나..?
    var box3 = "test box3"
    println(box1)
    println(box2)
    println(box3)

    box3 = "update"
    println(box3)
    //box1 = "update"
}
