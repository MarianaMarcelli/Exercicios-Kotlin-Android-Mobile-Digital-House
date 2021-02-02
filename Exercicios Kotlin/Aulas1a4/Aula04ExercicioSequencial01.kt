fun main(){

    println("Informe suas notas bimestrais")

    var nota1 = readLine()!!.toFloat()
    var nota2 = readLine()!!.toFloat()
    var nota3 = readLine()!!.toFloat()
    var nota4 = readLine()!!.toFloat()
    var media = (nota1 + nota2 + nota3 + nota4)/4

    println("Sua média é $media")


}