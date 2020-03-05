package academy.learnprogramming.kotlin

fun main(args: Array<String>)  {

    var number: Int
    number = 10;
    number = 20

    val employee1 = Employee("Lynn Jones", 500)
    employee1.name = "Lynn Smith"

    println(employee1)

    val change = 4.22
    println("Your change is $")

    val numerator = 10.99
    val denominator = 20.00
    println("The value of $numerator divided by $denominator is ${numerator/denominator}")

    println("The employee's id is ${employee1.id}")

    val eggName = "Humpty"
    val nurseryRhyme = """$eggName Dumpty sat on the wall
                        |$eggName Dumpty had a great fall
                        |All the king's horses and all the king's men
                        |Couldn't put $eggName together again.""".trimMargin()
    println(nurseryRhyme)
}

class Employee(var name: String, val id : Int) {

    override fun toString(): String {
        return "Employee(name=$name, id=$id)"
    }
}


