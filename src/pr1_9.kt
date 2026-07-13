fun main() {

    val numbers = arrayListOf(57, 90, 10, 13, 14)

    for (i in numbers.indices) {
        println("a[$i]=${numbers[i]}")
    }

    var max = numbers[0]

    for (num in numbers) {
        if (num > max) {
            max = num
        }
    }
    println("\nLargest element = $max")
}