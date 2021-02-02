fun main() {

    print("Digite o valor que deseja sacar (R$): ")

    var valorSaque = readLine()!!.toInt()
    var notas = 0

    println("Você receberá seu saque da sequinte forma: ")
        if(valorSaque < 10) {
            print("Valor de saque não permitido, o valor mínimo é de R$10,00 ")
        } else if(valorSaque > 600) {
            print("Valor de saque não permitido, o valor máximo é de R$600,00 ")
        } else {
            notas = valorSaque / 100

            if (notas > 0) {
            println("$notas nota(s) de R$ 100,00")
            }
            valorSaque = valorSaque - (notas * 100)
            notas = valorSaque / 50

            if (notas > 0) {
                println("$notas nota(s) de R$ 50,00")
            }
            valorSaque = valorSaque - (notas * 50)
            notas = valorSaque / 10

            if (notas > 0) {
                println("$notas nota(s) de R$ 10,00")
            }
            valorSaque = valorSaque - (notas * 10)
            notas = valorSaque / 5

            if (notas > 0) {
                println("$notas nota(s) de R$ 5,00")
            }
            valorSaque = valorSaque - (notas * 5)
            notas = valorSaque / 1

            if (notas > 0) {
                println("$notas nota(s) de R$ 1,00")
            }
        }
}
