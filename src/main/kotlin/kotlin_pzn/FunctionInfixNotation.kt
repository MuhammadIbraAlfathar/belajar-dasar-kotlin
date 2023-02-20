package kotlin_pzn

infix fun String.to(type: String): String{
    if(type == "UP"){
        return this.toUpperCase()
    } else {
        return this.toLowerCase()
    }
}

fun main() {
    val result = "Muhammad Ibra Alfathar " to "UP"
    println(result)
}