package i_function

fun main() {
    fun calculateAverage(vararg numbers: Int) {
        val length = numbers.size
        val avg = numbers.sum().toDouble()/length
        println(String.format("평균 성적은 %.2f입니다.", avg))
    }

    calculateAverage(90,80,100,70)
}