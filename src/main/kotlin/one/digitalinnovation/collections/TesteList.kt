package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "CLT")
    val maria = Funcionario("Maria", 4000.0, "PJ")

    val funcionarios = listOf(joao, pedro, maria)

    funcionarios.forEach{ println(it) }

    println("Funcionários com nome: Maria")
    println(funcionarios.find{it.nome == "Maria"})

    println("Funcionários ordenados por salário")
    funcionarios.sortedBy{ it.salario }.forEach{println(it)}

    println("Funcionários agrupados por tipo de contratação")
    funcionarios.groupBy { it.tipoContratacao }.forEach{println(it)}

}

data class Funcionario (
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
    ){
    override fun toString():String =
        """
            Nome: $nome
            Salário: $salario
            -------------------------
        """.trimIndent()

}