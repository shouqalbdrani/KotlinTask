package com.example.lifecyclelogging

fun main() {
    // Declare and initialize different Kotlin data types.

    val num: Int = 24
    val num2: Double = 29.5
    val num3: Long = 4L
    val text: String = "Shouq Albdrani"
    val myChar: Char = 'M'
    val myValue: Boolean = true
    println("Integer: $num, Double: $num2, Long: $num3, Boolean: $myValue, Char: $myChar, String: $text")


    // Create and manipulate an array or a collection (List, Set, Map).
    val myArray = arrayOf(10, 20, 30, 40)
    println("Array Elements: ${myArray.joinToString()}")

    val myList = mutableListOf("Shouq", "Raghad", "Shahad", "Ahad")
    println("Before Add")
    println("List Elements: $myList")
    myList.add("Renad")
    println("After Add")
    println("List Elements: $myList")

    val mySet = setOf(1, 2, 3, 3, 4)
    println("Set Elements: $mySet")

    val myMap = mapOf("Shouq" to "Android Developer", "Reham" to "Web Developer")
    println("Map Elements: $myMap")

   // Implement control flow using if-else expressions.
    val value = true
    if (value) {
        println("Shouq is the best Developer!")
    } else {
        println("Reham is the best Developer")
    }

   // Another Example
    val number = 6
    val result = if (number % 2 == 0) "Even" else "Odd"
    println("The number is: $result")

    // Write a function and use a lambda expression
    val add: (Int, Int) -> Int = { a, b -> a + b }
    println("Sum: ${add(3, 5)}")
}
