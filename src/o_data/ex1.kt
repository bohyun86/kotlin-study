package o_data


enum class DayOfWeek(val isWeekend: Boolean) {
    MONDAY(false),
    TUESDAY(false),
    WEDNESDAY(false),
    THURSDAY(false),
    FRIDAY(false),
    SATURDAY(true),
    SUNDAY(true);

    fun printDayType() {
        if (this.isWeekend) println("Weekend")else println("Weekday")
    }
}

fun recommendActivity(day: DayOfWeek) {
    when (day.name) {
        "SATURDAY" -> println("산책하기")
        "SUNDAY" -> println("책 읽기")
    }
}

fun main() {
    recommendActivity(DayOfWeek.SATURDAY)
}
