package i_function

fun main() {
    fun convertCelsiusToFahrenheit(celsius: Double) {
        val fahrenheit = (celsius * 9 / 5) + 32
        println(String.format("화씨 온도는 %.2f입니다.", fahrenheit))
    }

    println("섭씨 온도를 입력하세요:")
    convertCelsiusToFahrenheit(readln().toDouble())
}