import java.util.Collections.max
import kotlin.math.max

fun main () {

    println("Digite 5 números: ")
    var numero = 0
    var maiorNumero = 0

    for(n in 1..5) {
        println("Digite o número $n:")
        numero = readLine()!!.toInt()
        maiorNumero = max(numero , maiorNumero)
    }

    print("O maior número entre os digitados é $maiorNumero.")




}