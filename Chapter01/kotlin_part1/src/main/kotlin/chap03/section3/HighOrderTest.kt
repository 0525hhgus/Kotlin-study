package chap03.section3

fun highFunc(a: Int, b: Int, sum: (Int, Int) -> Int): Int {
    return sum(a, b)
}

fun main() {
    val result = highFunc(1, 3) {x, y ->
        x + y
    }
    println(result)
}