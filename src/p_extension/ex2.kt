package p_extension

// Int 클래스에 infix 함수를 추가합니다.
infix fun Int.divide(divisor: Int): Int {
    // 호출한 정수(this)를 인자로 받은 정수(divisor)로 나눈 후, 결과를 반환합니다.
    // Kotlin에서 정수 나눗셈은 소수점 이하를 버리고 정수 결과를 반환합니다.
    if (divisor == 0) throw ArithmeticException("Division by zero") // 0으로 나누려 할 때 예외 처리
    return this / divisor
}

fun main() {
    val quotient = 10 divide 2
    println(quotient)  // 출력: 5
}
