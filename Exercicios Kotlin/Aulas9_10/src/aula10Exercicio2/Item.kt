package aula10Exercicio2

class Item(
    val numeroItemFaturado: Int,
    val descricao: String,
    var quantidadeItem: Int,
    var precoUnitario: Double
) {
    init {
        if (quantidadeItem < 0) {
            quantidadeItem = 0
        }

        if (precoUnitario < 0) {
            precoUnitario = 0.0
        }
    }

//quantidadeItem = max(0, quantidadeItem)
// precoUnitario = max(0 ,precoUnitario)


}