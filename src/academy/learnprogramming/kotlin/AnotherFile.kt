package academy.learnprogramming.kotlin

import academy.learnprogramming.kotlin.CompanyCommunications as Comm
import academy.learnprogramming.kotlin.topLevel as tp
import academy.learnprogramming.kotlin.Department.*
import academy.learnprogramming.kotlin.upperFirstAndLast as ufal


fun main(args: Array<String>) {
    tp("Hello from AnotherFile")
    println(Comm.getCopyrightLine())
    println(IT.getDeptInfo())
    println(SALES.getDeptInfo())
    println("some string".ufal())

}