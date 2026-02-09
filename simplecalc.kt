// Simple Kotlin Calculator
// This program takes two numbers and an operator from the user
// and performs the selected operation.

fun main() {

    // Ask user for first number
    print("Enter first number: ")
    val num1 = readLine()!!.toDouble()

    // Ask user for operator
    print("Enter operator (+, -, *, /): ")
    val operator = readLine()

    // Ask user for second number
    print("Enter second number: ")
    val num2 = readLine()!!.toDouble()

    // Perform calculation based on operator
    val result = when (operator) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> num1 / num2
        else -> {
            println("Invalid operator")
            return
        }
    }

    // Display result
    println("Result: $result")
}
