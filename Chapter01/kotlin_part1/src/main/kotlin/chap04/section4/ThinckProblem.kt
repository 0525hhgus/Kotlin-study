package chap04.section4

fun main() {
    val number = 4
    val result: Long

    result = fibo(number)
    println("Fibo: $number -> $result")
}

tailrec fun fibo(n: Int, run: Int = 1): Long {
    return if (n == 1 || n == 2) 1 else fibo(n-1) + fibo(n-2)
}
fun fibo(n: Int): Long {
    return if (n == 1 || n == 2) 1 else fibo(n-1) + fibo(n-2)
}