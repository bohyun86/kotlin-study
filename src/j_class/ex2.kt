package j_class

class Temperature(var celsius: Double) {

    var fahrenheit: Double
        get() = celsius * 9 / 5 + 32
        set(value) {
            celsius = (value - 32) * 5 / 9
        }

    fun display() {
        println("Celsius: $celsius°C")
        println("Fahrenheit: $fahrenheit°F")
    }
}

fun main() {
    val temp = Temperature(25.0)

    temp.display()

    temp.fahrenheit = 100.0
    temp.display()
}
