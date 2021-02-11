package chap02.section3

fun main() {
    var a = 10
    var b = 10
    var result1 = ++a // num1 값 증가 후 대입
    var result2 = b++ // 먼저 num2 값 대입 후 증가

    println("result1: $result1")
    println("result2: $result2")
    println("a: $a")
    println("num2: $b")
}