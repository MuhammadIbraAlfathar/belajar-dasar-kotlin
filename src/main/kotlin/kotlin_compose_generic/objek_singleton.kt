package kotlin_compose_generic

//object Studend{
//    val answered = 10
//    val total = 20
//}
//
//fun main() {
//    println("Answered ${Studend.answered} , Total : ${Studend.total}")
//}

data class Question <T>(
    val questionText: String,
    val answer: T,
    val difficutly: Difficulty,

    )

enum class Difficulty{
    EASY, MEDIUM, HARD,
}


class Quiz {
    val question1 = Question<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = Question<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val question3 = Question<Int>("How many days are there between full moons?", 28, Difficulty.HARD)

    companion object StudentProgress {
        var total: Int = 10
        var answered: Int = 9
    }
}

val Quiz.StudentProgress.progressText : String get() = "${Quiz.answered} of ${Quiz.total}"

fun Quiz.StudentProgress.printProgressBar() {
    repeat(Quiz.answered) {
        print("▓")
    }

    repeat(Quiz.total - Quiz.answered) {
        print("▒")
    }

    println()
    println(Quiz.progressText)
}



fun main() {
    Quiz.printProgressBar();
}
