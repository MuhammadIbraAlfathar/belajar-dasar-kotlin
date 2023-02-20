package kotlin_pzn

fun main() {

//    variable const adalah variable yg global yg bisa diakses dari mana saja
//    biasanya menggunkana UPPER_CASE
//    const val APPLICATION = "Kotlin"
//    const val VERSION: String = "10.0.1"


    val name = "Ibraa"
    val age = 20

    var fullName : String? = "Ibra"
    fullName = null

    println(name)
    println(age)

    println(fullName?.length)
}