package chap05.section2

fun main() {

    print("Enter the line:")

    val n = readLine()!!.toInt()

    for ( line in 1..n ) {
        for ( space in 1..(n - line) )
            print(" ")

        for ( star in 1 until 2 * line ) // == for ( star in 1..(2 * line - 1) )
            print("*")
        println()
    }
}