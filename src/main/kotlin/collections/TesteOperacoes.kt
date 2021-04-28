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

    println("------------")
    println(salarios.count{it in 4000.00..6000.00})

    println("------------")
    println(salarios.find { it == 4500.00 })        //procura pelo valor no array e mostra quando acha
    println(salarios.find { it == 500.00 })         //se não acha retorna null

    println("------------")
    println(salarios.any { it == 5000.00})          //procura pelo valor e retorna true ou false
}