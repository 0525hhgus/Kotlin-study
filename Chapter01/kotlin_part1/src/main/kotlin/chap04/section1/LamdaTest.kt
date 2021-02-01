package chap04.section1

fun main() {
    val result: Int

    // 람다 함수에 사용할 매개변수 -> 반환할 식
    // val multi = { a: Int, b: Int -> a + b }

    // 일반 변수에 람다식 할당
    val multi: (a: Int, b: Int) -> Int = { a, b ->
        println("a: $a, b: $b")
        a * b
    }

    val nestedLambda: ()->()->Unit = { { println("nestedLambda") } }

    // 람다식이 할당된 변수는 함수처럼 사용 가능
    result = multi(10,20)
    println(result)
}