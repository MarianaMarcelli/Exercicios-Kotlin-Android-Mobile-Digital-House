import kotlin.test.assertTrue

fun main() {

    var numA : Int
    var numB : Int
    var numC : Int
    var numD : Int

    print("Digite o 1º número inteiro: ")
    numA = readLine()!!.toInt()
    print("Digite o 2º número inteiro: ")
    numB = readLine()!!.toInt()
    print("Digite o 3º número inteiro: ")
    numC = readLine()!!.toInt()
    print("Digite o 4º número inteiro: ")
    numD = readLine()!!.toInt()

    if (comparaNumeros(numA, numB, numC, numD)) {
        println("O(s) primeiro(s) número(s) é/são maior(es) que os últimos números.")
    } else {
        print("O(s) primeiro(s) número(s) é/são menor(es) ou iguais aos últimos números.")
    }


}

fun comparaNumeros (num1 : Int, num2 : Int, num3 : Int, num4 : Int) : Boolean {
    if ((num1 > num3 && num1 > num4) || (num2 > num3 && num2 > num4)) {
        return true
    }
    return false
}

