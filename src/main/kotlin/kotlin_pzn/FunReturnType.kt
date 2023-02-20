package kotlin_pzn

//Return type int

fun tambah(a:Int, b:Int): Int {
    return a + b
}

fun bagi(a:Int, b:Int): Int{
    if (b == 0){
        return 0
    }else{
        val result = a / b
        return result
    }
}

//Return type String

fun sayName(firstName:String, lastName:String): String{
    return "Hello $firstName $lastName"
}

fun main() {
    println(tambah(10,200))
    val total = tambah(200,300)
    println(total)

    println(bagi(10,0))

    println(sayName("Ibra","Alfathar"))
}