fun main() {

    print("Digite um número inteiro: ")
    var numero = readLine()!!.toInt()

    if (numero % 2 == 0) {
        print("O número digitado é par.")
    } else {
        print("O número digitado é ímpar")
    }
}