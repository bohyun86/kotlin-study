package p_extension

inline fun measureTime(block: () -> Unit) {
    val start = System.nanoTime()
    block()
    val end = System.nanoTime()
    println("소요 시간 : ${end - start} ns")
}

fun main() {
    measureTime {
        for (i in 1..1000) {
            var num = i * i * i
        }
    }
}