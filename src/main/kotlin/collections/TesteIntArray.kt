package collections

fun main() {
    val values = IntArray(5)
    values[0] = 2
    values[1] = 6
    values[2] = 3
    values[3] = 9
    values[4] = 7

    for (valor in values)
        println(valor)

    println("--------------------------------------------------")
    values.forEach {
        println(it + 1)
    }

    println("--------------------------------------------------")
    values.forEach { qualquer ->
        println(qualquer + 2)
    }

    println("--------------------------------------------------")
    for (index in values.indices)
        println(values[index])

    println("--------------------------------------------------")
    values.sort() //ordena do menor para o maior
    for (valor in values)
        println(valor)
}