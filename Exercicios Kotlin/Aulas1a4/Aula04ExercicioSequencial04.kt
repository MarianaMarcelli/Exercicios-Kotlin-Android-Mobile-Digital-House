fun main() {

    println("Informe o peso do peixe (kg):")
    var pesoDoPeixe = readLine()!!.toFloat()
    var excessoPeso = pesoDoPeixe - 50
    println("Esse peixe possui um excesso de $excessoPeso" + " kg.")
    var multa = excessoPeso * 4
    println("O valor a ser pago é de R\$$multa .")

}