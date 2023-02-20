package kotlin_pzn


fun String.greeting(): String = "Hello $this"

fun String.printGreeting(): Unit = println("Hello $this")

fun Int.sumInt(): Int = this

fun main() {
    val name = "Ibraa"
    val i = 10+20
    val result = name.greeting()

    println(i.sumInt())
    println(result)
    name.printGreeting()
    "Ibra Alfathar".printGreeting()
}