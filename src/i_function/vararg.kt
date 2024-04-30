package i_function


// vararg : 가변인자
// 같은 타입의 매개변수를 한 번에 받기
// 매개변수 앞에 vararg 키워드 사용
fun printNumbers(vararg numbers: Int) {
    // 같은 배열로 인자를 받음
    for (number in numbers) {
        print("$number ")
    }
    println()
}

// 가변인자는 매개변수 어디에나 올 수 있지만, 가변인자 뒤에 다른 매개변수가 있으면
// 반드시 매개변수 이름을 지정하여 호출해야 함.
fun printNumbersWithSuffix(vararg numbers: Int, suffix: String) {
    // 같은 배열로 인자를 받음
    for (number in numbers) {
        print("$number$suffix ")
    }
    println()
}

fun main() {
    // 인자로 0개 이상의 값을 입력 받을 수 있음.
    printNumbers(5)
    printNumbers(5, 1, 2, 3)
    printNumbers(1, 4, 65, 4, 23, 3, 4, 2, 12, 100)

    //  가변인자 뒤에 다른 매개변수가 있으면
    // 반드시 매개변수 이름을 지정하여 호출해야 함.
    printNumbersWithSuffix(1,2,3, suffix = "개")
    printNumbersWithSuffix(4,5,6, suffix = "자루")
}