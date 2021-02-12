package chap06.section4

fun main() {
    data class Person(var name: String, var skills: String)
    var person = Person("Kildong", "Kotlin")

    val a = person.let {
        it.skills = "Java"
        "success"
    }

    println("a: $a")
    println(person)

    var b = person.also {
        it.skills = "Python"
        "success"
    }

    println("b: $b")
    println(person)
}