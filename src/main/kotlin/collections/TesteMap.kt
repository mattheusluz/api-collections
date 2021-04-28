package collections

fun main() {
    val pair: Pair<String, Double> = Pair("Juca", 1700.00)
    val map1 = mapOf(pair)

    map1.forEach { p, q -> println("Chave: $p - Valor: $q") }

    println("-----------")

    val map2 = mapOf(
        "Juca" to 1700.00,
        "Luiz" to 1500.00,
        "Miguel" to 3000.00
    )
    map2.forEach { p, q -> println("Chave: $p - Valor: $q") }
}