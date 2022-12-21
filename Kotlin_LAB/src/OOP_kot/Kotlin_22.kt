package OOP_kot

interface Car1 {
    fun wheel()
    fun engine()
}

interface CarAutoDrive {
    fun AutoDrive()
}

interface CarAutoPark {
    fun AutoPark()
}


class BMW() : Car1, CarAutoDrive, CarAutoPark { //이게이게 인터페이스의 이유다!!
    override fun wheel() {
        println("bmw wheel 돌아감")
    }

    override fun engine() {
        println("bmw 엔진 돌아감")
    }

    override fun AutoDrive() {
        println("bmw 오토 드라이빙")
    }

    override fun AutoPark() {
        println("BMW 오토 파킹킹")
    }

}
fun main() {
    BMW().wheel()
    BMW().engine()
    BMW().AutoDrive()


}