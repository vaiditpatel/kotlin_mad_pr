class Matrix(
    private val matrix: Array<IntArray>,
    private val noOfRow: Int,
    private val noOfCol: Int
) {

    // Addition
    operator fun plus(other: Matrix): Matrix {
        val result = Array(noOfRow) { IntArray(noOfCol) }

        for (i in 0 until noOfRow) {
            for (j in 0 until noOfCol) {
                result[i][j] = matrix[i][j] + other.matrix[i][j]
            }
        }

        return Matrix(result, noOfRow, noOfCol)
    }

    // Subtraction
    operator fun minus(other: Matrix): Matrix {
        val result = Array(noOfRow) { IntArray(noOfCol) }

        for (i in 0 until noOfRow) {
            for (j in 0 until noOfCol) {
                result[i][j] = matrix[i][j] - other.matrix[i][j]
            }
        }

        return Matrix(result, noOfRow, noOfCol)
    }

    // Multiplication
    operator fun times(other: Matrix): Matrix {
        val result = Array(noOfRow) { IntArray(other.noOfCol) }

        for (i in 0 until noOfRow) {
            for (j in 0 until other.noOfCol) {
                for (k in 0 until noOfCol) {
                    result[i][j] += matrix[i][k] * other.matrix[k][j]
                }
            }
        }

        return Matrix(result, noOfRow, other.noOfCol)
    }

    override fun toString(): String {
        var output = "\n"
        for (i in 0 until noOfRow) {
            for (j in 0 until noOfCol) {
                output += "${matrix[i][j]}\t"
            }
            output += "\n"
        }
        return output
    }
}

fun main() {

    val firstMatrix = Matrix(
        arrayOf(
            intArrayOf(3, -2, 5),
            intArrayOf(3, 0, 4)
        ),
        2,
        3
    )

    val secondMatrix = Matrix(
        arrayOf(
            intArrayOf(2, 3),
            intArrayOf(-9, 0),
            intArrayOf(0, 4)
        ),
        3,
        2
    )

    val secondMatrix1 = Matrix(
        arrayOf(
            intArrayOf(6, 3),
            intArrayOf(9, 0),
            intArrayOf(5, 4)
        ),
        3,
        2
    )

    println("**************Addition**************")
    print("Matrix:1 ")
    print(secondMatrix1)
    print("Matrix:2 ")
    print(secondMatrix)

    val thirdMatrix = secondMatrix1 + secondMatrix
    println("Addition: $thirdMatrix")

    println("**************Subtraction**************")
    print("Matrix:1 ")
    print(secondMatrix1)
    print("Matrix:2 ")
    print(secondMatrix)

    val subtractMatrix = secondMatrix1 - secondMatrix
    println("Subtraction: $subtractMatrix")

    println("**************Multiplication**************")
    print("Matrix:1 ")
    print(firstMatrix)
    print("Matrix:2 ")
    print(secondMatrix)

    val multiplication = firstMatrix * secondMatrix
    println("Multiplication: $multiplication")
}