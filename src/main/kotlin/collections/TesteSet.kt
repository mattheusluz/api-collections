package collections

fun main() {
    val joao = Funcionario("João", 3000.00, "CLT")
    val leticia = Funcionario("Leticia", 2500.00, "PJ")
    val mario = Funcionario("Mario", 4000.00, "CLT")

    val funcionarios1 = setOf(joao, mario)
    val funcionarios2 = setOf(leticia)

    val uniao = funcionarios1.union(funcionarios2)
    uniao.forEach { println(it) }

    println("-------------")
    val funcionarios3 = setOf(joao, mario, leticia)
    val subtracao = funcionarios3.subtract(funcionarios2)
    subtracao.forEach { println(it) }

    println("-------------")
    val intercecao = funcionarios3.intersect(funcionarios2)
    intercecao.forEach { println(it) }
}