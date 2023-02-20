package kotlin_pzn

fun main() {
    tailrec fun display(value: Int){
        println("Revursive $value")
        if (value > 0){
            display(value-1)
        }
    }

//    display(10000)


    fun tailRekursif(value: Int, total:Int = 1): Int {
        return when (value){
            1 -> total
            else -> tailRekursif(value - 1, value * total)
        }
    }

    println(tailRekursif(10))
}