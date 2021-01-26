package chap03.section1

fun avgFunc(initial: Float = 0f, vararg numbers: Float): Double { // 초기값 0, vararg 사용
    var result = 0f
    for (num in numbers) {
        result += num // 가변 인자로 받은 값들을 모두 더함
    }
    println("result: $result, numbers.size: ${numbers.size}")
    val avg = (result/numbers.size).toDouble() // 평균을 구한 후, 출력값에 따라 Double형으로 변환
    return avg
}

fun main() {
    val result = avgFunc(5f, 100f, 90f, 80f)  // 첫번째 인자: 초기값, 이후 인자는 가변인자
    println("avg result: $result")
}