package chap05.section2

fun main() {

    var sum = 0

    for (num in 0..99 step 2) { // 짝수합
        sum += num
    }

    println("sum: $sum")
}