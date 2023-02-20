package kotlin_pzn

fun main() {
    val lastName = "Alfathar"
    val firstName = "Muhammad Ibra Alfathar"

    val addres : String = """
        Jl. Kebon singkong
        DKI JAKARTA
    """.trimIndent()

    println(firstName)
    println(lastName)
    println(addres)

    val fullName = "$firstName $lastName"

    val length  = "$firstName length = ${firstName.length}"

    println(fullName)
    println(length)
}