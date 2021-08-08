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

    //using a When statement in Kotlin
    p?.printResult()

    // using "try" and "catch" in kotlin
    val number: Int? = try {
        Integer.parseInt(q.answer)
    } catch (e:NumberFormatException) {
        null
    }
    println("Number is $number")

}


class Question {
    //var answer: String = "" //non-nullable
    var answer: String? = null //nullable
    val correctAnswer = "42"
    val question: String = "What is the answer to life, the universe and everything?"

    fun display() {
        println(" You said $answer")
    }

    fun printResult() {
        when (answer) {
            correctAnswer ->
                println("You are correct")
            else ->
                println("you're wrong")
        }
    }
}