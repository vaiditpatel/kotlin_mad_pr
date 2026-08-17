# Practical-1: Kotlin Programming Concepts

## Objective

To develop Kotlin programs demonstrating fundamental programming concepts, including variables, type conversion, user input, control flow, functions, recursion, arrays, collections, classes, constructors, operator overloading, and matrix operations.

## 1.1 Store & Display Values in Different Variables

Create variables using different Kotlin data types:

- `Int`
- `Double`
- `Float`
- `Long`
- `Short`
- `Byte`
- `Char`
- `Boolean`
- `String`

Display the values using `println()`.

### Concepts Covered
- Variable declaration using `val` and `var`
- Kotlin primitive data types
- String and character handling
- Output using `println()`

---

## 1.2 Type Conversion

Demonstrate type conversion between different data types.

### Required Conversions

1. Integer to Double
2. String to Integer
3. String to Double

### Example

```kotlin
val intValue = 25
val doubleValue = intValue.toDouble()

val stringInt = "100"
val convertedInt = stringInt.toInt()

val stringDouble = "25.50"
val convertedDouble = stringDouble.toDouble()
```

### Concepts Covered
- Explicit type conversion
- `toDouble()`
- `toInt()`
- Kotlin's type-safety mechanism

---

## 1.3 Scan Student's Information and Display All Data

Accept student information from the user and display it.

### Suggested Information

- Student name
- Enrolment number
- Branch
- Semester
- Division
- Age
- College name

### Concepts Covered
- `readLine()`
- User input
- String interpolation
- Displaying formatted information

---

## 1.4 Check Odd or Even Numbers

Accept an integer from the user and determine whether it is odd or even using a conditional expression directly inside `println()`.

### Example

```kotlin
println(if (number % 2 == 0) "Even" else "Odd")
```

### Concepts Covered
- Modulus operator `%`
- `if-else` expression
- Conditional expression inside `println()`

---

## 1.5 Display Month Name

Accept a month number from the user and display the corresponding month name using Kotlin's `when` expression.

### Example

```kotlin
when (month) {
    1 -> println("January")
    2 -> println("February")
    3 -> println("March")
    // ...
    12 -> println("December")
    else -> println("Invalid month")
}
```

### Concepts Covered
- `when` expression
- Multiple conditions
- Input validation

---

## 1.6 User-Defined Function

Create a user-defined function that performs arithmetic operations on two numbers.

### Operations

- Addition
- Subtraction
- Multiplication
- Division

### Example

```kotlin
fun arithmeticOperations(a: Double, b: Double) {
    println("Addition = ${a + b}")
    println("Subtraction = ${a - b}")
    println("Multiplication = ${a * b}")
    println("Division = ${a / b}")
}
```

### Concepts Covered
- Function declaration
- Function parameters
- Return values
- Arithmetic operators

---

## 1.7 Factorial Calculation with Recursion

Calculate the factorial of a number using a recursive function.

### Formula

For a non-negative integer `n`:

```text
n! = n × (n-1) × (n-2) × ... × 1
```

with:

```text
0! = 1
```

### Example

```kotlin
fun factorial(n: Int): Long {
    return if (n <= 1) {
        1
    } else {
        n * factorial(n - 1)
    }
}
```

### Concepts Covered
- Recursion
- Base condition
- Recursive function calls

---

## 1.8 Working with Arrays

Demonstrate different array operations in Kotlin.

### Required Operations

- `Arrays.deepToString()`
- `contentDeepToString()`
- `IntArray.joinToString()`
- Array traversal using loops
- Range using `..`
- Reverse range using `downTo`
- Range excluding the end using `until`
- Sorting without built-in functions
- Sorting using built-in functions

### Example: Array Display

```kotlin
val arr = intArrayOf(5, 2, 8, 1, 3)

println(arr.joinToString())
```

### Example: Loop Using Range

```kotlin
for (i in 0..4) {
    println(arr[i])
}
```

### Example: Reverse Loop

```kotlin
for (i in 4 downTo 0) {
    println(arr[i])
}
```

### Example: Using `until`

```kotlin
for (i in 0 until arr.size) {
    println(arr[i])
}
```

### Sorting Without Built-in Function

Use a sorting algorithm such as Bubble Sort:

```kotlin
for (i in 0 until arr.size - 1) {
    for (j in 0 until arr.size - i - 1) {
        if (arr[j] > arr[j + 1]) {
            val temp = arr[j]
            arr[j] = arr[j + 1]
            arr[j + 1] = temp
        }
    }
}
```

### Built-in Sorting

```kotlin
arr.sort()
println(arr.joinToString())
```

### Concepts Covered

- Arrays
- Nested arrays
- Array traversal
- Loops and ranges
- Sorting algorithms
- Kotlin collection/array utility functions

---

## 1.9 Find Maximum Number from ArrayList

Create an `ArrayList<Int>` and find the maximum element.

### Example

```kotlin
val numbers = arrayListOf(10, 25, 5, 40, 15)

var max = numbers[0]

for (number in numbers) {
    if (number > max) {
        max = number
    }
}

println("Maximum = $max")
```

### Concepts Covered

- `ArrayList`
- Iteration
- Comparison
- Finding maximum values

---

## 1.10 Class and Constructor Creation

Create a `Car` class containing the following properties:

- Type
- Model
- Price
- Owner
- Miles driven

The class should contain functions to:

1. Get car information
2. Get original car price
3. Calculate/display current car price
4. Display complete car information

### Suggested Class Structure

```kotlin
class Car(
    val type: String,
    val model: String,
    val price: Double,
    val owner: String,
    val milesDriven: Double
) {

    fun getCarInformation() {
        println("Type: $type")
        println("Model: $model")
        println("Owner: $owner")
        println("Miles Driven: $milesDriven")
    }

    fun getOriginalPrice(): Double {
        return price
    }

    fun getCurrentPrice(): Double {
        return price * 0.8
    }

    fun displayCarInformation() {
        getCarInformation()
        println("Original Price: $price")
        println("Current Price: ${getCurrentPrice()}")
    }
}
```

> The depreciation formula for the current price can be modified according to the requirements specified by the practical instructor.

### Concepts Covered

- Classes
- Primary constructors
- Properties
- Member functions
- Object creation
- Encapsulation

---

## 1.11 Operator Overloading and Matrix Operations

### Operator Overloading

Operator overloading allows operators such as `+`, `-`, and `*` to be given custom behavior for user-defined classes.

In Kotlin, operators can be overloaded using the `operator` keyword.

For example:

```kotlin
operator fun plus(other: Matrix): Matrix
```

allows two `Matrix` objects to be added using:

```kotlin
matrix1 + matrix2
```

### Matrix Class

Create a `Matrix` class that supports:

- Matrix addition
- Matrix subtraction
- Matrix multiplication
- Customized `toString()` output

### Example Structure

```kotlin
class Matrix(private val data: Array<IntArray>) {

    operator fun plus(other: Matrix): Matrix {
        val result = Array(data.size) { IntArray(data[0].size) }

        for (i in data.indices) {
            for (j in data[0].indices) {
                result[i][j] = data[i][j] + other.data[i][j]
            }
        }

        return Matrix(result)
    }

    operator fun minus(other: Matrix): Matrix {
        val result = Array(data.size) { IntArray(data[0].size) }

        for (i in data.indices) {
            for (j in data[0].indices) {
                result[i][j] = data[i][j] - other.data[i][j]
            }
        }

        return Matrix(result)
    }

    operator fun times(other: Matrix): Matrix {
        val rows = data.size
        val cols = other.data[0].size
        val common = data[0].size

        val result = Array(rows) { IntArray(cols) }

        for (i in 0 until rows) {
            for (j in 0 until cols) {
                for (k in 0 until common) {
                    result[i][j] += data[i][k] * other.data[k][j]
                }
            }
        }

        return Matrix(result)
    }

    override fun toString(): String {
        return data.joinToString("\n") { row ->
            row.joinToString(" ")
        }
    }
}
```

### Concepts Covered

- Classes and objects
- Operator overloading
- `operator` functions
- Matrix addition
- Matrix subtraction
- Matrix multiplication
- `override`
- Customized `toString()`
- Nested loops

---

## Learning Outcomes

After completing this practical, students should be able to:

1. Declare and use different Kotlin data types.
2. Perform explicit type conversions.
3. Accept and process user input.
4. Use conditional statements and `when` expressions.
5. Define and call user-defined functions.
6. Implement recursion.
7. Work with arrays, loops, ranges, and sorting algorithms.
8. Use `ArrayList` and find maximum values.
9. Create classes, constructors, properties, and member functions.
10. Understand and implement operator overloading.
11. Perform matrix arithmetic using a custom Kotlin class.
12. Override `toString()` to provide customized object output.

## Software Requirements

- **Language:** Kotlin
- **JDK:** Java Development Kit (JDK)
- **IDE:** IntelliJ IDEA / Android Studio / Visual Studio Code with Kotlin support
- **Operating System:** Windows, Linux, or macOS

## Conclusion

This practical provides hands-on experience with the fundamental features of Kotlin programming. It progresses from basic variables and input/output to advanced object-oriented concepts, recursion, arrays, operator overloading, and matrix operations. Completing all sections establishes a foundation for developing more complex Kotlin applications.
