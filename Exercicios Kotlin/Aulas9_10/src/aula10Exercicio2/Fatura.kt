package aula10Exercicio2

class Fatura {

    val itens = ArrayList<Item>()

    fun getTotalFatura(itens : Item) : Double {
        return itens.quantidadeItem * itens.precoUnitario
    }
}