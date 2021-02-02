fun main() {

    println("Por favor, informe os números que deseja efetuar a soma.")
    println("Informe o primeiro número:")
        var numero1 = readLine()!!.toInt()

    println("Agora o outro número:")
        var numero2 = readLine()!!.toInt()

    var soma = numero1 + numero2

    print( "A soma dos números informados é $soma")

}
