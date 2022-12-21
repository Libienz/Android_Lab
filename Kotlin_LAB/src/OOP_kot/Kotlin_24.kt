package OOP_kot

//중첩 클래스 -> 객체지향 / 캡슐화
//내부 클래스 -> 리사이클러 뷰에서 사용됨
fun main() {

    Test1.Test1NestedClass().testFun1() //중첩 클래스에서는 외부에 있는 애로의 접근 불가능
    // Test1의 인스턴스 생성과 상관없이 중첩클래스를 만들 수 있어서 그런듯?
    Test15().Test15InnerClass().testFun2() //이너 클래스는 외부에 있는 애로의 접근 가능
    // 라이프사이클이 같기 때문인듯 ???

}
class Test1 {

    class Test1NestedClass {
        fun testFun1() {
            println("TestFun1")
        }
    }
}

class Test15 {
    val b = 5
    inner class Test15InnerClass {
        fun testFun2() {
            println("TestFun2")
        }
    }
}