fun main() {
    println("Hello World")

    val q = Question()
    q.answer = "42"
    q.display()

    println("The answer to the question ${q.question} is ${q.answer}")

    //using "if" as an expression and also assign the value of the expression result to a variable
    val message = if (q.answer == q.correctAnswer) {
        "you are correct"
    } else {
        "try Again"
    }
    println(message)

    // Null can never be assigned to a non-null variable
    //except we make the variable nullable by add a "?" to its declaration
    //Handling null expression in kotlin
    //How Kotlin improves the handling of null values

    if(q.answer != null){}

    // you can also make object "q" a nullable type by adding a "?" to the end object type
    //change "q" to "p"
    val p:Question? = Question()
}


class Question {
    //var answer: String = "" //non-nullable
    var answer: String? = null //nullable
    val correctAnswer = "42"
    val question: String = "What is the answer to life, the universe and everything?"

    fun display() {
        println("You said $answer")
    }
}