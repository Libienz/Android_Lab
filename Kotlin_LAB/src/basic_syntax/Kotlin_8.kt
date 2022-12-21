package basic_syntax
//while
//List Map
//Iterator

fun main() {
    var count = 0

    while(count < 100) {
        count++
        println(count)
    }

    val testList1 = mutableListOf<String>("a","b","c")
    println(testList1)
    for (i in testList1) {
        println(i)
    }

    val testMap1 = mutableMapOf<Int, String>()
    testMap1.put(5,"유리1")
    testMap1.put(15,"유리2")
    testMap1.put(25,"유리3")
    testMap1.put(35,"유리4")
    println(testMap1)

    for (i in testMap1) {
        println(i)
    }

    val testMap2 = mutableMapOf<Int, String>()
    testMap2[5] = "유리1" //여기에선 인덱싱이 아니라 키값

    val testList2 = mutableListOf("a","b","c")
    val testIterator = testList2.listIterator()
    println(testIterator.next())
    println(testIterator.hasNext())



}