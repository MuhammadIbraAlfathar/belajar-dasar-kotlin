package android_dasar

fun main(){

    val greeting = birthdayGreeting("Ibraa", 20)
    println(greeting)
}

fun birthdayGreeting(name : String, age : Int): String{
    val a = "Hello $name"
    val b = "Your age is $age"

    return "$a \n$b"
}