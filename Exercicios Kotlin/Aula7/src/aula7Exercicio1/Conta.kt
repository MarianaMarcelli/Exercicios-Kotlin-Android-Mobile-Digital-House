package aula7Exercicio1

class Conta (val titular: Cliente, val numeroConta: Int, var saldo: Double) {


    fun depositar(valor: Double) {
        saldo += valor
        println("Você realizou um depósito no valor de R\$ $valor e seu saldo atual é R\$ $saldo")
    }

    fun sacar(valor : Double) {
        if (valor > saldo) {
            println("Não é possível sacar este valor: saldo insuficiente")
        } else {
            saldo -= valor
            println("Você realizou um saque no valor de R\$$valor e seu saldo atual é de R\$$saldo")
        }

    }


}