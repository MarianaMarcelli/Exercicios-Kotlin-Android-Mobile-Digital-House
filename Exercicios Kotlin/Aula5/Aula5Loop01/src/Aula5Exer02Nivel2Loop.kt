import kotlin.math.roundToInt
import kotlin.math.roundToLong

fun main() {

    var quantidadeCDs = 0
    var valorCD = 0.0
    var valorTotalInvestido = 0.0
    var valorMedioCDs = 0.0
    var quantidadeNovosCDs = 0

    print("Qual a quantidade de itens de sua coleção de CDs? ")
    quantidadeCDs = readLine()!!.toInt()
    print("Quanto você investiu até o momento? ")
    valorTotalInvestido = readLine()!!.toDouble()
    print("Quantos itens novos você adquiriu para sua coleção de CDs? ")
    quantidadeNovosCDs = readLine()!!.toInt()
    quantidadeCDs += quantidadeNovosCDs

    for (n in 1..quantidadeNovosCDs) {

        print("qual o valor do item $n adquirido? ")
        valorCD = readLine()!!.toDouble()
        valorTotalInvestido += valorCD
        valorMedioCDs = (valorTotalInvestido / quantidadeCDs).roundToLong().toDouble()
    }

    println("O valor total investido em sua coleção é de R$ $valorTotalInvestido")
    println("O valor médio gasto em cada um de seus itens é de R$ $valorMedioCDs")

}