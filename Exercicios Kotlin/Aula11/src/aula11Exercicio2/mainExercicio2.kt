package aula11Exercicio2

fun main() {

    val coca1 = Coca(tamanho= 2000, preco= 8.0 )
    val coca2 = Coca(tamanho= 2000, preco= 9.0)

    println(coca1 == coca2)
}

//3-false
//5 - true. passamos a comparar somente o atributo preco.