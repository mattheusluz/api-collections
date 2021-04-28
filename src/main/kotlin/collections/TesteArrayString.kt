package collections

fun main() {
    val nomes = Array<String>(3){""}
    nomes[0] = "Maria"
    nomes[1] = "Lucas"
    nomes[2] = "Luan"

    nomes.forEach {
        println(it)
    }

    println("---------")
    nomes.sort()
    nomes.forEach { println(it) }

    println("----------------------------------")
    val nomes2 = arrayOf("Maria", "Lucas", "Luan")

    nomes2.forEach {
        println(it)
    }

    println("---------")
    nomes2.sort()
    nomes2.forEach { println(it) }
}