package kotlin_pzn

fun main() {
    val nilai = "A"

    when(nilai){
        "A" -> {
            println("Good Job")
        }
        "B" -> {
            println("Good")
        }
        "C" -> {
            println("Not Bad")
        }
        else -> {
            println("Try Again Next Year")
        }
    }


//    Multiple when expression

    when(nilai){
        "A", "B", "C" -> {
            println("Congratulation You Passed")
        } else -> {
            println("Try Again")
        }
    }


//    When expression in

    val nilaiLulus = arrayOf("A","B","C")

    when(nilai){
        in nilaiLulus -> {
            println("SELAMAT ANDA LULUS")
        }

        !in nilaiLulus -> {
            println("ANDA TIDAK LULUS")
        }
    }

//    When expression is (untuk mengecek tipe data)

    val name = "Ibra"
    when(name){
        is String -> {
            println("This is String")
        }
        !is String -> {
            println("This is not String")
        }
    }

//    When expression tanpa variable (Mirip seperti if else namun lebih sederhana)

    val nilaiUas = 90

    when{
        nilaiUas >= 90 -> println("Amazing")
        nilaiUas > 75 -> println("Good")
        nilaiUas > 65 -> println("Cool")
        else -> println("Ngulang lagi tahun depan")
    }
}