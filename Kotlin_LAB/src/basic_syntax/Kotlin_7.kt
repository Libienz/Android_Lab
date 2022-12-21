package basic_syntax
// List
// Map
// Set


fun main() {

    var testList1 = listOf("a", "b", "c")
    println(testList1)
    println(testList1[0])
    //testList1.add("b") 수정 안됨 다른 방식으로 만드러야 함
    //mutable 한걸로


    //val은 수정이 안되는 거지만 가르키는 객체에서 추가를 하거나 그렇기에
    //add연산이 가능한 듯?
    val testList2 = mutableListOf("a","b","c")
    println(testList2)
    testList2.add("d")
    println(testList2)
    testList2.remove("a")
    println(testList2)

    val mutableList1 = mutableListOf<Int>()
    mutableList1.add(5)
    mutableList1.add(10)
    mutableList1.add(15)
    mutableList1.add(22)


    val mutableList2 = mutableListOf<String>()
    mutableList2.add("유리")
    mutableList2.add("철수")
    mutableList2.add("짱구")
    mutableList2.add("훈이이")

    val findIndex = mutableList1.indexOf(10)
    println(findIndex)
    println(mutableList1)

    val testMap1 = mutableMapOf<Int, String>()

    testMap1.put(5,"유리")
    testMap1.put(10,"철수")
    testMap1.put(15,"짱구")
    testMap1.put(22,"훈이")

    val testSet1 = mutableSetOf("a","b","c")



}
