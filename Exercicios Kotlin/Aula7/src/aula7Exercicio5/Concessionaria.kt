package aula7Exercicio5

class Concessionaria {

    private val registroDeVendas = ArrayList<Venda>()

    fun registrarVenda(veiculo : Veiculo, cliente: Cliente, valor : Double) {
        val novaVenda = Venda(valor, veiculo, cliente)

        registroDeVendas.add(novaVenda)
// apenas para testar o git
    }

}