package basic_syntax

fun main() {
    testFun()
    sum(20,40)
}

fun sum(a : Int, b : Int) : Int {
    println(a + b)
    return a+b // : : : : : 요거 사용 익숙해져야함

}
fun testFun() {
    println("func test")
}