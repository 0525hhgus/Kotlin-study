package chap03.section1

fun sum(vararg a: Int): Int{
    return a.sum()
}

fun main() {
    print(sum(10,20,30,40,50,60,70,80,90,100)) // sum : 550
}