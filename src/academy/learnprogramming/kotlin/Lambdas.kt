package academy.learnprogramming.kotlin

fun main(args: Array<String>) {
    run { println("I'm in a lambda!") }

    val employees = listOf(LambdaEmployee("Javier", "Celada", 2012),
            LambdaEmployee("Mary", "Johnson", 2015),
            LambdaEmployee("Luismi", "Plaza", 2000))

    println("Oldest employee: " + employees.minBy { employee -> employee.startYear })
    println("Newest employee: " + employees.maxBy { it.startYear })
    // Lambdas outside the parenthesis when is the last argument

    // You can access local variables non final in lambdas
    var num = 10
    run {
        num += 15
        println(num)
    }

    println("Oldest employee: " + employees.minBy(LambdaEmployee::startYear))

    run(::topLevel)

    println(countTo100())
    println(countTo30())

    findByLastName(employees, "Celada")
    findByLastName(employees, "Wilson")

    //Nested label lambdas
    "Some String".apply someString@ {
        "Another String".apply {
            println(toLowerCase())
            println(this@someString.toUpperCase())
        }
    }
}

fun topLevel() = println("I'm in a function")

fun findByLastName(employees: List<LambdaEmployee>, lastName: String) {
    employees.forEach returnBlock@{
        if (it.lastName == lastName) {
            println("Yes, there is an employee with the last name $lastName")
            // Return from the lambda and the function (Non local return)
            return
            // Local return
            // return@returnBlock
        }
    }
    println("No, there is not an employee with the last name $lastName")
}

//Expression body
fun countTo30() = StringBuilder().apply {
    for (i in 1..29) {
        append(i)
        append(", ")
    }
    append(30)
}.toString()

fun countTo100(): String {
    // Lambda receiver, don't have to refer to it
    return with(StringBuilder()) {
        for (i in 1..99) {
            append(i)
            append(", ")
        }
        append(100)
        toString()
    }
}

//fun countTo100(): String {
//    val numbers = StringBuilder()
//    for (i in 1..99) {
//        numbers.append(i)
//        numbers.append(", ")
//    }
//    numbers.append(100)
//    return numbers.toString()
//}

data class LambdaEmployee(val firstName: String, val lastName: String, val startYear: Int) {

}