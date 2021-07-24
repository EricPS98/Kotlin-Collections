package one.digitalinnovation.collections

fun main() {
    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "1500".toBigDecimal(),
        "4000".toBigDecimal())

    println("Somatória de salários: " + salarios.somatoria())

    println("Média de salários :" + salarios.media())
}
