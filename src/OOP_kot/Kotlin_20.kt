package OOP_kot

fun main() {
    val ins : Parents = Child()
    ins.disease()

}

open class Parents{

    open fun doing() {
        println("자식을 돌봅니다.")
    }
    open fun disease() {
        println("비염")
    }
}

class Child() : Parents() {
    override fun doing() {
        println("오버라이딩 완료")
    }

    override fun disease() {
        println("오버라이딩 디지즈")
    }
}