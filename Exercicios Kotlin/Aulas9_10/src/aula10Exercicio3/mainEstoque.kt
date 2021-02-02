package aula10Exercicio3

fun main() {

    val estoque = Estoque("Estoque Estocando", 20, 3)

    estoque.darBaixa(10)
    println(estoque.mostra())
    println(estoque.precisaRepor())


    estoque.repor(18)
    println(estoque.mostra())
    println(estoque.precisaRepor())

    estoque.mudarNome("Estoque Lustre")
    println(estoque.nome)

    estoque.mudarQtdeMinima(1)
    println(estoque.qtdeMinima)

}

