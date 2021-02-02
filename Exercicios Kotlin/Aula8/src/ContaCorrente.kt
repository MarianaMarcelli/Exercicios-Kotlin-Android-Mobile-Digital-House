class ContaCorrente (numeroConta: Int, saldo: Double, private val taxaDeOperacao: Double) : ContaBancaria(numeroConta , saldo){

    override fun depositar(valor: Double) {
       if (valor >= taxaDeOperacao){
           saldo += valor - taxaDeOperacao
       }
    }

    override fun sacar(valor: Double) {
        val valorTotalDoSaque = valor + taxaDeOperacao
        if(valor > valorTotalDoSaque) {
            println("Saldo insuficiente")
        } else {
            saldo -= valorTotalDoSaque
        }

        override fun mostrarDados() {
            super.mostrarDados()
            println("Taxa de operação: $taxaDeOperacao")
        }

    }

}