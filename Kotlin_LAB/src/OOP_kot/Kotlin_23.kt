package OOP_kot

//Data Class --> 데이터를 넣어놓는 클래스 전역변수 처럼 사용하나 ..?
//서버에서 데이터를 받아온 것을 넣을 때 데이터 클래스 사용함 ..


class JustDog(var name : String, var age : Int)
data class DataDog(var name : String, var age : Int)


fun main() {


    val justdog = JustDog("파트라슈" , 21)
    println(justdog.name)
    println(justdog.age)
    println(justdog)
    val datadog = DataDog("파트라슈 친구",15)
    println(datadog.name)
    println(datadog.age)
    println(datadog) //to string에서 차이가 있다



}