abstract class ContaBancaria (private val numeroConta: Int, protected var saldo: Double) : Imprimivel {

    abstract fun sacar(valor: Double)
    abstract fun depositar(valor: Double)
    override fun mostrarDados() {
        println("Conta: $numeroConta")
        println("Saldo: $saldo")
    }
    fun transferir(valor: Double, destino: ContaBancaria){
        sacar(valor)
        destino.depositar(valor)
    }

}