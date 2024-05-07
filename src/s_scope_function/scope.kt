package s_scope_function

fun main() {
    // 1. let
    var name: String = "홍길동"
    // name : 수신 객체, 블록 내부에서 수신 객체를 가리키는 키워드는 it
    val length = name.let {
        println("내 이름은 $it 입니다.")
        it.length       // 마지막 행에 있는 경우 리턴 값
    }
    println("length = ${length}")

    // 2. run
    // 수신객체 this
    val result = "코틀린".run {
        println("수신 객체의 길이는 ${this.length} 입니다.")
        this.length     // 마지막 행 리턴 값
    }

    println("result = ${result}")

    // 3. apply
    class Person {
        var name = ""
        var age = 0
    }

    // 반환 값으로 수신객체 자체를 리턴
    // this 키워드로 수신 객체에 접근,
    // 객체 프로퍼티 설정하거나 초기화할 때 주로 사용
    val person: Person = Person().apply {
        this.name = "홍길동"       // 중복 변수명이 있을 경우 this
        age = 30    // 수신 객체 내부에서 this 키워드 생략하여 속성에 접근 가능
    }
    println("${person.name}은 ${person.age}세")

    // 4. also
    // 객체에서 부수적인 작업을 수행할 때 사용
    val mutableList = mutableListOf(1, 2, 3).also {
        println("리스트 : ${it}")      // it으로 수신 객체 접근
        it.add(4)
        // 수신 객체 자체를 리턴
    }
    println("mutableList = ${mutableList}")

    // 5. with
    val sb = StringBuilder()
    // 수신객체를 with의 인자로 받아 영역 범위를 만듬
    val str: String = with(sb) {
        // 내부 수신 객체는 this 또는 생략하여 접근
        append("안녕하세요 ")
        append("여기는 스콥 함수 내부입니다.")
        append("수신 객체가 하는일을 편하게 해주고 ")
        append("메서드 체이닝을 간결하게 해줘요.")
        toString()  // 마지막 람다행을 리턴값으로 반환
    }

    println("str = ${str}")
}