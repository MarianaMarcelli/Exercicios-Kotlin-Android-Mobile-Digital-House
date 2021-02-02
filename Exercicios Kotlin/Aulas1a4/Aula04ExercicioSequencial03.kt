fun main() {

    println("Vamos calcular seu peso ideal?")
    println("Para isso digite os dados solicitados")

    println("Qual a sua altura em metros?")
    var altura = readLine()!!.toDouble()

    println("Qual o seu sexo? Digite 1 para masculino ou 2 para feminino.")
    var sexo = readLine()!!.toInt()

    var pesoIdealMasc = (72.7 * altura) - 58
    var pesoIdealFem = (62.1 * altura) - 44.7
    println("Seu peso ideal é $pesoIdealMasc.")



}