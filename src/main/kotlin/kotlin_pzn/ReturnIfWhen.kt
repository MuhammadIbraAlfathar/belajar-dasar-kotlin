package kotlin_pzn

fun main() {
    fun sayHello(name:String = ""): String{
//        return if(name == ""){
//            "Hello Bro"
//        } else {
//            "Hello $name"
//        }

        return when(name){
            "" -> "Hello bro"
            else -> "Hello $name"
        }
    }

    println( sayHello("Shella"))

    println(factorial(10))
}


fun factorial(value:Int): Int{
    var result = 1
    for(i in value downTo 1){
        result *= i
    }

    return result
}

