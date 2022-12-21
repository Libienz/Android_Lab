package OOP_kot

fun main() {
    val j : Job1 = Job1()
    Job2()
}

open class AllJobs() { //부모 클래스
    init {
        println("일을 합니다")
    }
}
class Job1() {
    init {
        println("일을 한다")
        println("코딩을 한다")
    }
}
class Job2() {
    init {
        println("일을 한다")
        println("디자인을 한다")
    }
}
class job3() : AllJobs() { //상속받은 클래스
    init {
        println("마케팅을 합니다.")
    }
}