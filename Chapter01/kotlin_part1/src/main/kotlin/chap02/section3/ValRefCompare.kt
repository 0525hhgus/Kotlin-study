package chap02.section3

fun main() {
    val a: Int = 128
    val b = a

    println(a == b)
    println(a === b)
    
    val c: Int? = a
    val d: Int? = a
    val e: Int? = c
    
    println(c == d)
    println(c === d) // 주소 공간이 다름
    println(c === e) // 주소 공간이 같음
}