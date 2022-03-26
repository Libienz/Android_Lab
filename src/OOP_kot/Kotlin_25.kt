package OOP_kot

// 선언 되지 않았지만 즉시 표현식으로 전달되는 람다식!!

fun main() {
    println(a())
    println(b())

    println(sumNumber(1,2))
}

fun a() : String {
    return "text"
}

fun b() = "text"

val sumTypeNum : (Int, Int) -> Int = {a, b -> a+b}
val sumNumber = {a : Int, b : Int -> a + b}