fun main(){
    var border = "[]"
    var timeToRepeat = 23
    borderDisplay(border, timeToRepeat)
    println("Happy Birthday")
    borderDisplay(border, timeToRepeat)
}

fun borderDisplay(border: String, timeToRepeat: Int){
    repeat(timeToRepeat){
        print(border)
    }
    println()
}