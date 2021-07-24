package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "CLT")
    val maria = Funcionario("Maria", 4000.0, "PJ")

    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach{ println(it)}

    println("------------------- Adicionado outro funcionário à lista mutável ------------------------")
    funcionarios.add(pedro)
    funcionarios.forEach{ println(it)}

    println("------------------- Removido funcionário (joão) da lista mutável ------------------------")
    funcionarios.remove(joao)
    funcionarios.forEach{ println(it)}

    println("---------------- Testes de set --------------------------")
    val funcionarioSet = mutableSetOf(joao)

    funcionarioSet.add(pedro)
    funcionarioSet.add(maria)
    funcionarioSet.forEach{println(it)}

    println("------------ Maria demitida ---------------")
    funcionarioSet.remove(maria)
    funcionarioSet.forEach{println(it)}
}