fun main() {

    var numeroTabuada = 0
    var numeroMultiplicador = 0

    print("Informe o número que deseja saber a tabuada (entre 1 e 10): ")
    numeroTabuada = readLine()!!.toInt()


    for (numeroMultiplicador in 1..10) {
        if (numeroTabuada < 1 || numeroTabuada > 10) {
            do {
                print("O número deve estar entre 1 e 10. Digite novamente: ")
                numeroTabuada = readLine()!!.toInt()
            } while (numeroTabuada < 1 || numeroTabuada > 10)
            println("Tabuada do $numeroTabuada: ")
        } else {

            var resultadoTabuada = numeroTabuada * numeroMultiplicador
            println("$numeroTabuada x $numeroMultiplicador = $resultadoTabuada")
        }

    }
}
