package collections

fun main() {
    val salarios = doubleArrayOf(3000.00, 5000.00, 4500.00)

    for (salario in salarios)
        println(salario)

    println("------------")
    println("Maior salário: ${salarios.maxOrNull()}")
    println("Menor salário: ${salarios.minOrNull()}")
    println("Média dos salarios: ${salarios.average()}")

    println("------------")
    val filtroSalarios = salarios.filter { it >= 4500.00 }
    filtroSalarios.sorted().forEach{ println(it)}       // colocando em ordem crescente
}