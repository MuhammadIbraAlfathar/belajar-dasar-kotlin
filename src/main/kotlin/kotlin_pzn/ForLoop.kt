package kotlin_pzn

fun main() {
    val array = arrayOf("Muhammad", "Ibra", "Alfathar")


    var total = 0

//    forLoop untuk array
    for (name in array){
        println(name)
        total++
    }

    println("Total Pengulangan Adalah = $total")


//    forLoop untuk range
//    val range = 0..20

    var arrayLength = array.size - 1
    for (i in 0..arrayLength){
        println("Indeks ke $i = ${array.get(i)}")
    }

    for (value in 10 downTo 0 step 5){
        println(value)
    }


}