fun main() {

    var quantidadeNotas = 0
    var somaNotas = 0.0
    var nota = 0.0
    var media = (somaNotas) /quantidadeNotas

    print("Deseja calcular a média de quantas notas? ")
    quantidadeNotas = readLine()!!.toInt()

    for (n in 1..quantidadeNotas) {
       print("digite a nota: ")
        nota = readLine()!!.toDouble()
        somaNotas += nota
        media = somaNotas / quantidadeNotas
    }
    print("Sua média é $media")


}