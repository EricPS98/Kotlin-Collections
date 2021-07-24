package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "CLT")
    val maria = Funcionario("Maria", 4000.0, "PJ")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    println("----------------------------- Imprimir funcionário por ID ----------------------")
    println(repositorio.findById(pedro.nome))

    println("------------ Imprimir todos os funcionários do repositorio -------------")
    repositorio.findAll().forEach{ println(it)}

    println("--------------- Maria Removida -------------------")
    repositorio.remove(maria.nome)
    repositorio.findAll().forEach{ println(it)}

}