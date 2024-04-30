package i_function

fun main() {
    fun greet(name: String, time: String = "오전") {
        if (time == "오전") {
            println("Good morning, $name!")
        } else if (time == "오후") {
            println("Good afternoon, $name!")
        } else {
            println("오전/오후만 입력 가능합니다..")
        }
    }

    greet("Jack")
}