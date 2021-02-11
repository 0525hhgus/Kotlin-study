package chap02.section3

fun main(){
    val str1: String?
    str1 = null
    val len = str1?.length ?: -1
    println("str: $str1, length: ${len}")
}