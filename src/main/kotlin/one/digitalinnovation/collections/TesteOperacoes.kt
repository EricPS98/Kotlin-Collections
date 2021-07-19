package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2350.0, 4000.0)

    for(salario in salarios){
        println(salario)
    }

    println("---------------------------------")
    println("Maior salário: ${salarios.maxOrNull()}")
    println("Menor salário: ${salarios.minOrNull()}")
    println("Média salarial: ${salarios.average()}")

    val salariosFiltro = salarios.filter { it > 2500 } //Pode interagir com outras expressões semelhantes
    println("---------------- Salarios maiores do que 2500 ---------------")
    salariosFiltro.forEach{ println(it)}
}