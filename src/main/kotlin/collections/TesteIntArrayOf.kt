package collections

fun main() {
    val values = intArrayOf(3, 6, 2, 9, 5)

    values.forEach {
        println(it)
    }

    println("-------------")
    values.sort()
    values.forEach {
        println(it)
    }
}