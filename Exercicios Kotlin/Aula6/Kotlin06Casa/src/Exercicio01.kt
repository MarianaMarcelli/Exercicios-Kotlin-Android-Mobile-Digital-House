fun main() {
    val numero = IntArray(3)

    println("Vamos comparar números!")
    for (contador in 1..3) {
        println("Insira o $contador º número:  ")
        numero[contador -1] = readLine()!!.toInt()
    }
    //deprecated in kotlin 1.4 - in 1.4 kotlin version use maxOrNull()
    //println(numero.max())
    println("O maior número é: ${numero.maxOrNull()}")





    //ou dessa outra maneira


    println("Vamos comparar números!")
    print("Insira o 1º número:  ")
    var maiorNumero = readLine()!!.toInt()

    for (contador in 2..3) {
        print("Insira o $contador º número:  ")
        var numero = readLine()!!.toInt()
        if (numero > maiorNumero) {
            maiorNumero = numero
        }
    }

    println("O maior número é : $maiorNumero")
}