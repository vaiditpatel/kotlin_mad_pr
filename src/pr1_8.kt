fun main() {

    val Array1 = arrayOf(10, 90, 60, 80, 100) // Array<Int>
    println(Array1.joinToString())

    val Array2 = Array<Int>(5) { 0 }
    println(Array2.joinToString())

    val Array3 = Array<Int>(8) { i -> i * 1 }
    println(Array3.joinToString())

    val Array4 = IntArray(size = 5) { 0 }
    println(Array4.joinToString())

    val Array5 = intArrayOf(12, 10, 1, 5, 18, 19)
    println(Array5.joinToString())

    val Array6 = arrayOf(
        intArrayOf(1, 3),
        intArrayOf(4, 5),
        intArrayOf(6, 7)
    )
    println(Array6.contentDeepToString())


}