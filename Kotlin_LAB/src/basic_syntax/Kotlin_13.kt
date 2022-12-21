package basic_syntax

fun main() {
    val testString : String = "동해물과 백두산이 마르고 닳도록"
    //이거 c에서 char[] 랑 굉장히 유사한듯

    //testString[0] 동

    testString.substring(1,3)
    testString.replace("백두산","한라산")
    val newTestString = testString.split(" ") //
    println(newTestString)

    val testList = mutableListOf<String>()
    testList.add("a@naver.com")
    testList.add("a1@google.com")
    testList.add("a2@naver.com")


    for (i in testList) {

        if(i.split("@")[1] == "naver.com") {
            println(i)// split은 배열 반환
        }
    }

}