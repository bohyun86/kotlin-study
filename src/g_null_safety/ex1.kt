package g_null_safety

fun main() {
    val cityPopulation = mapOf(
        "Seoul" to "10,000,000",
        "Tokyo" to "9,000,000"
    )

    print("도시 이름을 입력하세요: ")
    val cityName: String? = readln()

    if (cityName.isNullOrEmpty()) {
        println("알 수 없는 도시")
        return
    }

    val population: String? = cityPopulation[cityName]

    if (!population.isNullOrEmpty()) {
        println("${cityName}의 인구는 ${population}명입니다.")
    } else {
        println("인구 정보가 없습니다.")
    }
}
