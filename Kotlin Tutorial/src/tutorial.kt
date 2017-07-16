/**
 * Created by Nico on 10 Jun 2017.
 */

fun main(args: Array<String>) {

    val numList = 1..20
    val times7 = numList.map { it * 7 }
    times7.forEach{ n -> println(n)}

}

// Collections
val numList = 1..20
// Filtering based on a criteria
val bigger3 = numList.filter { it > 3 }
// Looping to print: bigger3.forEach { n -> println("$n is bigger than 3")}
// Applying an operation to every item in a collection
val times7 = numList.map { it * 7 }

// Function that takes another function as a param
fun mathOnList(num: Int, myFunc: (num: Int) -> Int) {
    println("MathOnList: ${myFunc(num)}")
}
// Example: val times2 = {num: Int -> num * 2}
// mathOnList(5, times2)

// Functions that can generate/return new functions
fun makeMathFunction(num1: Int): (Int) -> Int = {num2 -> num1 * num2}
val times3 = makeMathFunction(3)
// Run with: println("5 x 3 = ${times3(5)}")

// function that takes in an indeterminate number of params
fun getSum(vararg nums: Int): Int {
    var sum = 0
    nums.forEach { n -> sum += n }
    return sum
}
// example: println(getSum(1,2,3,4,5,6))

// function that returns multiple values
fun nextTwo(num: Int): Pair<Int, Int> {
    return Pair(num + 1, num + 2)
}
// declaring two variables at once: val (two, three) = nextTwo(1); println("1 $two $three")

// One-line functions
fun add(num1: Int, num2: Int): Int = num1 + num2
val multiply = {num1: Int, num2: Int -> num1 * num2}


// Declaring an array
val myArray = arrayOf(1, 2, "Bob")

// Looping through array indices
fun printArray(arr: Array<Any>) {
    for (i in arr.indices) {
        println(arr[i])
    }
}


// Ranges
val oneToTwenty = 1..20
val alphabet = "A".."Z"
// Cycling through range: myArray.forEach {n -> println(n)} (only seems to work for ranges of numbers though)
// FIltering a list: val evenList = oneToTwenty.filter { it % 2 == 0 }