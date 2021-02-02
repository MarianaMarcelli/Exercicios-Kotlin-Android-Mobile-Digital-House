import kotlin.math.absoluteValue

fun main() {

    println("Digite suas notas para saber se foi aprovado.")
    print("Digite a primeira nota: ")
    var primeiraNota = readLine()!!.toDouble()
    print("Digite a segunda nota: ")
    var segundaNota =  readLine()!!.toDouble()
    var media = (primeiraNota.absoluteValue + segundaNota.absoluteValue) / 2

    if (media == 10.0) {
        print("Aprovado com distinção! Sua média foi $media.")
    } else if (media >= 7 && media < 10 ) {
        print("Aprovado, sua média foi $media.")
    } else {
        print("Reprovado, sua média foi $media.")
    }

}