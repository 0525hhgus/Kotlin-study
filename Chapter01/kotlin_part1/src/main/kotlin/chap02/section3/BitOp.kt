package chap02.section3

fun main() {
    val x = 4 // 0100(2진수), 4(10진수)
    val y = 0b0000_1010 // 5(10진수)
    val z = 0x0f // 0b0000_1111(2진수), 15(10진수)

    println("x sh1 2 -> ${x.shl(2)}") // 16(10진수). 0001_0000(2진수)
    println("x inv -> ${x.inv()}") // -5(10진수), 111....1011(2진수)
}