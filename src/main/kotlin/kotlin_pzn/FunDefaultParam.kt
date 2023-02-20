package kotlin_pzn

fun hello(firstName: String, lastName: String? = null){
    if (lastName == null){
        println("Hello $firstName")
    }else{
        println("Hello $firstName $lastName")
    }
}

fun main() {
    hello("Ibra")
    hello("Joko","Ribowo")
    hello("Inee")
}