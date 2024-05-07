package t_lazy

// 지연 초기화된 프로퍼티
val primeNumbers: List<Int> by lazy {
    println("소수를 계산하고 있습니다.")
    (2..1000).filter { isPrime(it) }
}

// 소수 판별을 위한 함수
fun isPrime(number: Int): Boolean {
    if (number < 2) return false
    for (i in 2 until number) {
        if (number % i == 0) return false
    }
    return true
    // 나누어 떨어지지 않으면 소수
}