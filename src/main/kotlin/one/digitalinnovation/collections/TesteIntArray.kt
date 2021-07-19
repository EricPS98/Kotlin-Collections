package one.digitalinnovation.collections

fun main() {
    val values = IntArray(5)

    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2

// --------------------------------- Métodos de imprimir os valores no array ----------------------

//    for (valor in values) {
//       println(valor)
//    }

//    values.forEach{ valor ->
//        println(valor)
//    }

//    values.forEach{
//        println(it)
//    }

//    for (index in values.indices){
//        println(values[index])
//    }

    // -----------Imprime do menor para o maior -------------
    values.sort()
    for(valor in values) {
        println(valor)
    }
}
