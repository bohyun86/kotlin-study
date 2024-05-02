package n_nested

class Outer {
    private val number: Int = 1

    // 중첩 클래스 : 클래스 내부에 클래스 선언
    class Nested {
        fun function() = 2    // number + 1
        // 중첩 클래스에서는 바깥 클래스의 멤버에 접근할 수 없음
        // val nestedNumber = number + 1
    }

    // 내부 클래스
    inner class Inner {
        fun function() = number + 1
    }
}

fun main() {
    // Outer 클래스의 인스턴스 생성 없이 중첩 클래스를 접근하고 생성 가능
    val nested = Outer.Nested()
    println(nested.function())

    // 내부 클래스는 바깥 클래스의 인스턴스 생성 없이 생성 불가
    // val inner = Outer.Inner()
    val inner =  Outer().Inner()
    println(inner.function())    // 바깥 인스턴스의 멤버에 내부 클래스의 멤버가 접근 가능
}