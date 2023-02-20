package kotlin_pzn



//Sebelumnnya seperti ini dan terlalu panjang jika hanya ingin mengembalikan return sederhana
//fun kaliDua(a:Int): Int{
//    return a*a
//}


//Berikut solusinya dgn singleExpressFunction agar lebih singkat
fun kaliDua(a:Int): Int = a*a

fun sayNames(name:String):String = "Hello $name"

fun sapa (names:String) = println("Hello $names")

fun main() {
    println(kaliDua(2))
    println(sayNames("Muhammad Ibra Alfathar"))
    sapa("Joko")
}

