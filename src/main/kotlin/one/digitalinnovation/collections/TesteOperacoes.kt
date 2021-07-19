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

    println("-----------------Contagem de salários entre 2000.0 e 5000.0 ------------------")
    println(salarios.count{it in 2000.0..5000.0})

    println("--------------- Encontrar um valor específico de salário")
    println(salarios.find {it == 2350.0})
    println(salarios.find {it == 550.0})

    println("----------------- Validar se existe algum índice com valor de 1000.0 -------------")
    println(salarios.any{it == 1000.0})
    println("----------------- Validar se existe algum índice com valor de 500.0 -------------")
    println(salarios.any{it == 500.0})
}