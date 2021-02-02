package aula7Exercicio1

fun main() {

    val clienteUm = Cliente(nome = "Júlia", sobrenome = "Lustre")
    val contaUm = Conta(clienteUm, numeroConta = 1111, saldo = 100.0)

    val clienteDois = Cliente(nome = "Luiza", sobrenome = "Lustre")
    val contaDois = Conta(titular = clienteDois, numeroConta = 2222, saldo = 150.0)

    println(contaUm.titular.nome + " " +contaUm.titular.sobrenome)
    print("Entre com o valor do depósito: ")
    contaUm.depositar(readLine()!!.toDouble())
    println()
    print("Entre com o valor do saque: ")
    contaUm.sacar(readLine()!!.toDouble())
    println()
    println(contaDois.titular.nome + " " +contaDois.titular.sobrenome)
    print("Entre com o valor do depósito: ")
    contaDois.depositar(readLine()!!.toDouble())
    println()
    print("Entre com o valor do saque: ")
    contaDois.sacar(readLine()!!.toDouble())
}


