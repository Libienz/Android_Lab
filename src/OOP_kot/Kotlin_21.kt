package OOP_kot

fun main() {


}

open abstract class Car {
    open fun wheel() {
        println("굴러갑니다")
    }
    open fun engine() {
        println("시동이 켜짐")
    }

    abstract fun run()
}
class Bike() : Car() {
    override fun engine() {
        println("자전거가 준비되었다")
    }

    override fun run() {
        TODO("Not yet implemented")
    }

    override fun wheel() {
        println("자전거가 굴러간다")
    }
}