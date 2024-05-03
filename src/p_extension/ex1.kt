package p_extension

// String 클래스에 확장 함수를 추가합니다.
fun String.startsWithChar(ch: Char): Boolean {
    // 이 함수는 문자열의 첫 번째 문자와 주어진 문자를 비교하여 결과를 반환합니다.
    return this.isNotEmpty() && this[0] == ch
}

fun main() {
    val text = "kotlin"
    println(text.startsWithChar('k'))  // 출력: true
    println(text.startsWithChar('c'))  // 출력: false
}
