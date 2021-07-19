package one.digitalinnovation.collections

fun main() {
    val salarios = DoubleArray(3)

    salarios[0] = 1500.0
    salarios[1] = 2100.0
    salarios[2] = 900.0

    salarios.forEach {
        println(it)
    }

    println("-------------- Salários impressos com 1.1% de aumento cada -------------------")
    salarios.forEachIndexed{ index, salario ->
        salarios[index] = salario * 1.1
    }
    salarios.forEach {
        println(it)
    }

    println("------------ Salarios impressos ordenadamente, com array declarada na variável -------")
    val salarios2 = doubleArrayOf(1500.0, 1250.0, 5000.0)
    salarios2.sort()
    salarios2.forEach {
        println(it)
    }
}