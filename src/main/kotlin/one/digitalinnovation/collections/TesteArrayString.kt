package one.digitalinnovation.collections

fun main() {
    val nomes = Array(3){""}

    nomes[0] = "Maria"
    nomes[1] = "Zazá"
    nomes[2] = "José"

    for (nome in nomes) {
        println(nome)
    }

    println("------------ Imprime ordenadamente (ordem alfabética) ------------------")
    nomes.sort()
    nomes.forEach {
        println(it)
    }

    // Declarar valores na inicialização
    println("----------------------- Valores declarados na inicialização --------------------------")

    val nomes2 = arrayOf("Maria", "Zazá", "Pedro")

    nomes2.sort()
    nomes2.forEach {
        println(it)
    }
}