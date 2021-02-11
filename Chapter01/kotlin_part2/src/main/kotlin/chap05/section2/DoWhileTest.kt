package chap05.section2

// 목표 : 5 -> 12345, 23451, 34512 ...
fun main() {

    do {
        print("Enter the number: ")
        val input = readLine()!!.toInt()

        for (i in 0 until input) { // == for (i in 0..(input - 1))
            for (j in 0 until input) {
                print((i + j) % input + 1)
            }
            println()
        }

    } while(input != 0)

}