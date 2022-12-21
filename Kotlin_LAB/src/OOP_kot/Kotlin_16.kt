package OOP_kot

//List 가공하기

fun main() {
    val testList1 = mutableListOf<Int>()
    testList1.add(1)
    testList1.add(2)
    testList1.add(3)
    testList1.add(4)
    testList1.add(10)
    testList1.add(10)
    testList1.add(11)
    testList1.add(11)


    println(testList1.distinct()) //중복제거 결과가 반영돼지는 않음
    println(testList1)

    println(testList1.maxOrNull())
    println(testList1.minOrNull())
    println(testList1.average())

    val testList2 = listOf("john","jay","minsu", "minji","bokchi")


    println(testList2.filter { it.startsWith("j") })

    val testList3 = listOf(1,2,3,4,5)

    println(testList3.filter {it%2 == 0})


    val testList4 = listOf("a","aa","aaa","aaaa")

    val result = testList4.groupBy {it.length > 2}
    //참인 애들하고 참이 아닌애들을 나눠주네

    println(result)
    println(result[true])

    println(result::class.java.simpleName)


}
