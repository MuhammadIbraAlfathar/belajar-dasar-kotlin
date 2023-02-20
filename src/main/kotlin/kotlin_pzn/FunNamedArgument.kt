package kotlin_pzn

fun fullName(firstName:String? = null,
             middleName: String ? = null,
             lastName: String? = null )
{
    println("Hello $firstName $middleName $lastName")
}

fun main(){
    fullName(lastName = "Alfathar", firstName = "Muhammad", middleName = "Ibra")
}