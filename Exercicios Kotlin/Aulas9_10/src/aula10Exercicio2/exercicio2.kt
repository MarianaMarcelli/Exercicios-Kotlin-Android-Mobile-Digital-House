package aula10Exercicio2

fun main() {

    val fatura = Fatura()

    val item1 = Item(1, "item1", 10, -1.0)
    val item2 = Item(2, "item2", 20, 15.0)
    val item3 = Item(3, "item3", -10, 20.0)

    fatura.itens.add(item1)
    fatura.itens.add(item2)
    fatura.itens.add(item3)

    fatura.getTotalFatura(item1)

    println(fatura.getTotalFatura(item1))

}