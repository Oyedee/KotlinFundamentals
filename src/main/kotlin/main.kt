import java.io.FileReader
import java.io.IOException
import java.util.*

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

    //Kotlin Looping Constructs
    //while and for loops
    //for loop using the concepts of a range
    for(i in 10 downTo 1) {}
    for(i in 1 until 10) {}

    val numbers = listOf<Int>(1,2,3,4,5,6)

    var ages = TreeMap<String, Int>()
    ages["kelvin"] = 55
    ages["Sam"] =34
    ages["hamid"] = 28
    ages["qidos"] = 29
    //print name and age in the list
    for((name, age) in ages) {
        println("$name is $age")
    }
    //print the index and element of the list
    for ((index, element) in numbers.withIndex()) {
        println("$element at $index")
    }

    //Kotlin support for Exceptions
    var reader = FileReader("filename")
    try {
        reader.read()
    } catch (e :IOException) {

    }finally {

    }
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