package r_collection_fp

import kotlin.system.measureTimeMillis

// 시퀀스 : 지연 평가를 사용하여 데이터 컬렉션을 효율적으로 처리
// Java 의 Stream API에 대응
fun main() {
    // 시퀀스 생성

    // 1. sequenceOf를 통한 생성
    val seq1: Sequence<Int> = sequenceOf(1, 2, 3, 4)

    // 2. 기존 컬렉션을 시퀀스로 변환
    val list: List<Int> = listOf(1, 2, 3, 4, 5)
    val seq2: Sequence<Int> = list.asSequence()

    // 사용할때는 최종연산 수행 후 사용
    println(seq1.toList())
    println(seq2.toList())

    // 컬렉션과 비교
    val largeList = (1..1_000_000).toList()
    val collectionTime = measureTimeMillis {
        largeList.filter { it % 2 == 0 }
            .map { it * it }
            .toList()
    }

    println("collectionTime = ${collectionTime} ms")

    val sequenceTime = measureTimeMillis {
        largeList.asSequence()
            .filter { it % 2 == 0 }
            .map { it * it }
            .toList()
    }

    println("sequenceTime = ${sequenceTime} ms")

}