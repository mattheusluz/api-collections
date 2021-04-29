package collections

fun main() {
    val joao = Funcionario("João", 3000.00, "CLT")
    val leticia = Funcionario("Leticia", 2500.00, "PJ")
    val mario = Funcionario("Mario", 4000.00, "CLT")

    println("-------LIST-------")
    val funcionarios = mutableListOf(joao, mario)
    funcionarios.forEach { println(it) }

    println("-------ADD--------")
    funcionarios.add(leticia)
    funcionarios.forEach { println(it) }

    println("------REMOVE------")
    funcionarios.remove(mario)
    funcionarios.forEach { println(it) }

    println("--------SET-------")
    val funcionarioSet = mutableSetOf(mario)
    funcionarioSet.forEach { println(it) }

    println("-------ADD--------")
    funcionarioSet.add(leticia)
    funcionarioSet.add(joao)
    funcionarioSet.forEach { println(it) }

    println("------REMOVE------")
    funcionarioSet.remove(joao)
    funcionarioSet.forEach { println(it) }
}