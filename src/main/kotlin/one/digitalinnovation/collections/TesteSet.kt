package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "CLT")
    val maria = Funcionario("Maria", 4000.0, "PJ")

    //Atribuir conjuntos de funcionários à variáveis com setOf
    val funcionarios = setOf(joao, pedro)
    val funcionarios2 = setOf(maria)
    val funcionarios3 = setOf(joao, pedro, maria)

    val resultUnion = funcionarios.union(funcionarios2)
    resultUnion.forEach{println(it)}

    println("Subtratrair funcionários de um grupo a partir de outro grupo de funcionários")
    println("-------------------------")
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach{println(it)}

    println("Funcionários em comum dos dois conjuntos")
    println("-------------------------")
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach{println(it)}
}