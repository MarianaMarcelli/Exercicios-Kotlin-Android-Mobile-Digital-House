fun main() {

    val contaPoupanca1 = ContaPoupanca(1111, 25, 50)
    val contaCorrente1 = ContaCorrente( 1010, 0, 5)

    val relatorio = Relatorio()

    contaPoupanca1.depositar(10.0)
    contaCorrente1.depositar(50.5)
    contaPoupanca1.sacar(50.0)


    relatorio.gerarRelatorio(contaPoupanca1)
    relatorio.gerarRelatorio(contaPoupanca1.)



}