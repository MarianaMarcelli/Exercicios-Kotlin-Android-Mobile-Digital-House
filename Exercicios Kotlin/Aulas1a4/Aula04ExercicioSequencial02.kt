fun main() {

    println("Para saber seu salário informe os dados solicitados:")

    println("Quanto você ganha por hora (R$)?")
    var valorHora = readLine()!!.toDouble()

    println("Quantas horas você trabalhou esse mês?")
    var horasTrabalhadas = readLine()!!.toInt()

    var salario = valorHora * horasTrabalhadas
    println("Você receberá R\$$salario esse mês.")


}