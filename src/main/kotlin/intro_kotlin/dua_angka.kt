fun main() {
    println("Perbandingan 1 ${time(200,100)}")
    println("Perbandingan 2 ${time(200,300)}")
    println("Perbandingan 3 ${time(300,300)}")

}

fun time(timeSpentToday: Int, spentTimeYesterday: Int): Boolean {
    return timeSpentToday >= spentTimeYesterday
}