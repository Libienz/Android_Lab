package basic_syntax

fun main() {

    println(division(5.0,3.0)) //정수 나눗셈은 몫
    println(remainder(5,3))

}

fun sumTwo(num1 : Int, num2 : Int) : Int {
    return num1 + num2
}

fun sumThree(num1 : Int, num2 :Int, num3:Int) : Int {
    return num1 + num2 + num3
}

fun minus(num1 : Int, num2 : Int):Int {
    return num1 - num2
}
fun division(num1 : Double, num2 : Double) : Double {
    return num1/num2
}
fun remainder(num1 : Int, num2 : Int) :Int {
    return num1%num2
}