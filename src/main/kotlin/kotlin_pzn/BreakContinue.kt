package kotlin_pzn

fun main() {

//    Break
    var i = 1
    while (true){
        println("Perulangan ke $i")
        i++

        if (i >= 10){
            break
        }
    }

//    Continue (utk menskip perulangan dan melanjutkan ke perulangan berikutnya)

    for (i in 0..100){
        if (i % 2 == 0){
            continue
        }

        println("Perulangan kes $i")
    }

}