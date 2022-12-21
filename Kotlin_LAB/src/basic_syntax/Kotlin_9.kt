package basic_syntax

fun main() {

    val student = mutableMapOf<String, Int>()
    student.put("민지",99)
    student.put("철수",20)
    student.put("민수",35)
    student.put("가영",48)
    student.put("하영",100)
    student.put("수진",22)
    student.put("수달",46)

    for (i in student) {
        if (i.value >= 50) {
            println(i.key)
        }
    }


}