package kotlin_pzn

//vararg wajib ditambahkan jika ingin menggunakan param dgn array dan vararg wajib ditulis di paling kanan (akhir param)

//fun sumArray(a:Int, vararg values : Int) (Maka ini akan error)

//fun sumArray(vararg values : Int) (Maka ini tidak akan error)



//Jika tidak menggunakan vararg dan menggunakan array
//fun sumArray(values: Array<Int>): Int {
//    var total = 0
//    for (value in values) {
//        total += value
//    }
//
//    return total
//}
//
//fun main() {
//    val values = arrayOf(10,10,10,10)
//    var result = sumArray(values)
//}


fun sumArray(a:Int, vararg values : Int): Int{
    var total = 0

    for (value in values){
        total += value
    }

    return  total + a
}


fun readArray(vararg names : String) {
    for (name in names) {
        println(name)
    }
}


fun main() {
    val result = sumArray(10,10,10,20,30,30)

    println(result)

    readArray("Ibra", "Joko", "Susi", "Susanti", "Jeki")
}


