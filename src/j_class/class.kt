package j_class

class Person {
    // 프로퍼티
    // 초기값이 필요
    var name: String = "무명"
    var age: Int = 0

    // 메서드
    fun greet() {
        println("안녕하세요, 저는 ${name}이고 ${age}세 입니다.")
    }
}

fun main() {
    // 인스턴스 생성 : 클래스명()  | 자바와 달리 new 키워드 없음.
    val person = Person() // 타입이 추론
    // val person: Person = Person()     // 타입이 분명할 경우 명시적으로 작성 X

    println(person.name)        // 내부적으로 getter 호출

    // 내부적으로 setter 호출
    person.name = "홍길동"
    person.age = 30

    person.greet()
}