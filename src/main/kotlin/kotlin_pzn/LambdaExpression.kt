package kotlin_pzn


fun toUpper(value: String): String = value.toUpperCase()

fun main() {

    val contohLambda: (String, String, String) -> String = { firstName: String, lastName:String, middleName:String ->
        val result = "$firstName $middleName $lastName"
        result
    }

    println(contohLambda("Ibraa","Alfahar","Ribowo"))


//    Jika param hanya 1 tidak usah ditambahkan param akan default menjadi it
    val sayName: (String) -> String = {
        "Hello $it"
    }

    println(sayName("Muhammad Ibra Alfathar"))




    val toUpperCase : (String) -> String = ::toUpper

    println(toUpperCase("Ibra Alfathar"))
}