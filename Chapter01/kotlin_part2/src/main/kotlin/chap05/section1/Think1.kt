package chap05.section1

fun main() {

    print("Enter the item:")
    val item = readLine()
    var price: Double = 0.0

    if (item.equals("apple")) {
        price = 100.0
    } else if (item.equals("orange")) {
        price = 120.0
    } else if (item.equals("melon")) {
        price = 50.0
    }

    when (price) {
        in 100.0..200.0 -> price *= 1.1
    }

    println("item: $item, price: $price")
}