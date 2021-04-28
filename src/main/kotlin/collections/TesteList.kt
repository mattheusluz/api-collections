package collections

fun main() {
    val joao = Funcionario("João", 3000.00, "CLT")
    val leticia = Funcionario("Leticia", 2500.00, "PJ")
    val mario = Funcionario("Mario", 4000.00, "CLT")

    val funcionarios = listOf(joao, leticia, mario)

    funcionarios.forEach{println(it)}

    println("-----------")
    println(funcionarios.find { it.nome == "Mario" })

    println("-----------")
    funcionarios.sortedBy { it.salario }.forEach { println(it) }

    println("-----------")
    funcionarios.groupBy { it.tipoContrato }.forEach { println(it) }
}
