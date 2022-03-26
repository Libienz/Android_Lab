package basic_syntax
//리스트와 filter
//물음표와 느낌표
//반복문
fun main() {
    val testList1 = ArrayList<String>()
    testList1.add("a")
    testList1.add("b")
    testList1.add("c")
    testList1.add("d")

    println(testList1)
    println(testList1[0])
    println(testList1[1])
    println(testList1[2])


    val testList2 = listOf("a","b","c") //리스트를 만드는 여러가지 방법
    val testList3 = mutableListOf<String>("a","b","c")
    testList3.add("d")

    val testList4 = listOf("student1","student2","student3","student4","teacher1","teacher2")
    println(testList4)
    println(testList4.filter { it.startsWith("s") }) //filtering

    val testList5 = listOf("student1","student2","student3","student4",null)
    println(testList5.filterNotNull().filter { it.startsWith("s") })

    var test1 : String = "a"
    var test2 : String? = "b"

    test1 = test2!! // 원래는 널일수도 있는거랑 널 아닌거랑 서로 어사인이 안되는데
    // !!로 널이 아니라는 것을 알려줄 수 있음

    val i  = 1
    println("i의 값은 : $i")
    println("i의 값은 : " + i)

    val testList6 = listOf("a" , "b" ,"c")

    for (i in testList6) {
        println(i)
    }

    for (i in 1..10) {
        println(i)
    }

    for (i in 1..10 step 2) {
        println(i)
    }


}