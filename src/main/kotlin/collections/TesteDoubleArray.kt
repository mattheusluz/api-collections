package collections

fun main() {
    val salarios = DoubleArray(3)
    salarios[0] = 1000.00
    salarios[1] = 3000.00
    salarios[2] = 1500.00

    salarios.forEach { println(it) }

    println("--------------")
    salarios.sort()
    salarios.forEach { println(it) }

    println("--------------")
    salarios.forEachIndexed{ index, salario ->  //pega o indice e o valor do indice
        salarios[index] = salario * 1.1         //multiplica o valor do indice por 1.1(aumento de 10%)
    }
    salarios.forEach { println(it) }

    println("--------------")
    val salarios2 = doubleArrayOf(4500.00, 3500.00, 5000.00)

    salarios2.sort()
    salarios2.forEach { println(it) }

    println("--------------")
    salarios2.forEachIndexed{index, salario2 ->
        salarios2[index] = salario2 * 1.2
    }
    salarios2.forEach { println(it) }
}