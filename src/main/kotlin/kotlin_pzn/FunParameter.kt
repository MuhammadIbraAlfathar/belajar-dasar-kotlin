package kotlin_pzn

fun greetingName(firstName:String, lastName:String? = ""){
    if(lastName == null){
        println("Hello $firstName")
    } else {
        println("Hello $firstName $lastName")
    }
}

fun main() {
    greetingName("Muhammad Ibra","Alfathar")
    greetingName("Joko")
}