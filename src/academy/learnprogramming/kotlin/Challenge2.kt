package academy.learnprogramming.kotlin

fun main(args: Array<String>) {

    // 1. Declare a non-nullable float variable two ways,
    // and assign it the value -3847.384
    val float1: Float? = -3847.384f
    val float3: Float? = -3847.384.toFloat()



    // 2. Now change both of those variable declarations into nullable variables.


    // 3. Now declare an array of type non-nullable Short. Make it size 5,
    // and assign it the values 1, 2, 3, 4, and 5.
    val shortArray = shortArrayOf(1, 2, 3, 4, 5)
    val shortArray2: Array<Short> = arrayOf(1, 2, 3, 4, 5)


    // 4. Now declare an array of nullable Ints and initialize it with the values
    // 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, etc., all the way up to 200.
    val intArray = Array<Int?>(40) { i -> (i + 1) * 5 }


    // 5. You have to call a Java method with the following signature from Kotlin:
    // public void method1(char[] charArray). Declare an array that you could
    // pass to the method and initialize it with the values 'a', 'b', and 'c'.
    val charArray = charArrayOf('a', 'b', 'c')


    // 6. Given the following code:
    val x: String? = "I AM IN UPPERCASE"
    // Using one line of code, declare another string variable,
    // and assign it x.toLowerCase() when x isn't null,
    // and the string "I give up!" when x is null.
    val z = x?.toLowerCase() ?: "I give up!"
    println(z)



    // 7. Now use the let function to (a) lowercase the string, and then
    // (b) replace "am" with "am not" in the result
    x?.let { println(it.toLowerCase().replace("am", "am not"))}




    // 8. You're really, really confident that the variable myNonNullVariable can't
    // contain null.
    // Change the following code to assert that myNonNullVariable isn't null
    // (and shoot yourself in the foot!)
    val myNonNullVariable: Int? = null
    myNonNullVariable!!.toDouble()

}


