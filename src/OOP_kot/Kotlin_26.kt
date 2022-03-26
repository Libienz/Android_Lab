package OOP_kot

// 고차 함수( Higher-Order Function )
// f(x) = x -> f(f(x))

fun main() {

    println(sumLambda(1,2))


    sum(1,2, {a : Int, b : Int -> a-b})
    sum(1,2) {a : Int, b : Int -> a-b} // 이렇게 쓸 수도 이씀..
    sum(1,2,::testSum)
    //함수를 입력 인자로 받을 수 가 있다.... 고차함수!!!
    //Unit void 같은 거임
}

fun test17() : Unit {
    println("abc")
    return
}

fun sum (a:Int,b:Int, operation : (Int, Int) -> Int) {
    println("$a $b")
    println(operation(a,b)) //함수안에서 함수를 사용한다.
}
fun testSum(a : Int, b : Int) : Int {
    return a + b
}

val sumLambda : (Int, Int) -> Int =  {a, b -> a + b}
val sumLambda2 = {a : Int, b : Int -> a + b }