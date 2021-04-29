package collections

fun main() {
    val joao = Funcionario("João", 3000.00, "CLT")
    val leticia = Funcionario("Leticia", 2500.00, "PJ")
    val mario = Funcionario("Mario", 4000.00, "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(leticia.nome, leticia)
    repositorio.create(mario.nome, mario)

    println(repositorio.findById(leticia.nome))

    println("----------------------")
    repositorio.findAll().forEach { println(it) }

    println("----------------------")
    repositorio.remove(leticia.nome)
    repositorio.findAll().forEach { println(it) }
}