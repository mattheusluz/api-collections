package collections

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContrato: String
){
    override fun toString(): String =       // abre duas aspas e da enter dentro da segunda
        """ 
            Nome:    $nome
            Salário: $salario
            
        """.trimIndent()
}
