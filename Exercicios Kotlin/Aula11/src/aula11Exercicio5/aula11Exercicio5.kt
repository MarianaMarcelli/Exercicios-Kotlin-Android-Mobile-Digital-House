package aula11Exercicio5

fun main() {

    val listaAnimais = arrayListOf<String>()


    listaAnimais.add("Pato")
    listaAnimais.add("Cachorro")
    listaAnimais.add("Gato")
    println(listaAnimais[3])

    try {
        println(listaAnimais[3])
    } catch (ex: IndexOutOfBoundsException) {
        println("Erro: IndexOutOfBoundsException ,posição solicitada para impressão não existe na lista")
        println("Erro: IndexOutOfBoundsException, Index 3 out of bounds for length 3")
    }

}


// val array: ArrayList<String>? = null