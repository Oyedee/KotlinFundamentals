fun main() {
    println("Hello World")

    val q = Question()
    q.answer = "42"
    q.display()

    println("The answer to the question ${q.question} is ${q.answer}")

    //using "if" as an expression
    val message = if (q.answer == q.correctAnswer) {
        "you are correct"
    } else {
        "try Again"
    }
    println(message)
}

class Question {
    var answer: String = ""
    val correctAnswer = "42"
    val question: String = "What is the answer to life, the universe and everything?"

    fun display() {
        println("You said $answer")
    }
}