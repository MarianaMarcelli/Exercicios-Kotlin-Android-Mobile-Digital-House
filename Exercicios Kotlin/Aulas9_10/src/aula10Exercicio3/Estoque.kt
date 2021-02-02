package aula10Exercicio3

class Estoque(
    var nome: String,
    var qtdeAtual: Int,
    var qtdeMinima: Int
) {

    fun mudarNome( nome: String){
        this.nome = nome
    }
    fun mudarQtdeMinima(qtdeMinima: Int) {
        if (qtdeMinima < 0) {
            throw Exception("Quantidade não pode ser negativa")
        }
        this.qtdeMinima += qtdeMinima
    }
    fun repor(quantidade: Int) {
        this.qtdeAtual += quantidade
    }

    fun darBaixa(quantidade: Int){
        if(qtdeAtual - quantidade < 0){
            throw Exception("Quantidade não pode ser negativa")
        }
        this.qtdeAtual -= quantidade
    }

    fun mostra() {
        println("Produto: $nome\nQuantidade mínima: $qtdeMinima\nQuantidade atual: $qtdeAtual")
    }

    fun precisaRepor(): Boolean {
        return qtdeAtual <= qtdeMinima
    }

}