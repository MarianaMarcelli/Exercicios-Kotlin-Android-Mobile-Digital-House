fun main() {

    println("Par ou ímpar?")
    print("Digite um número: ")
    var numeroEntrada = readLine()!!.toInt()

    if (ehPar(numeroEntrada)) {
        print("O número é par!")
        } else {
        print("O número é ímpar")
    }


}
    fun ehPar(numero: Int) : Boolean {
        return numero % 2 == 0
    }