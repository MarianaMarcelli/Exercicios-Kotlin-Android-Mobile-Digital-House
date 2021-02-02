fun main() {

    println("Informe um número inicial: ")
    var numeroInicial = readLine()!!.toInt()
    println("Informe um número final: ")
    var numeroFinal = readLine()!!.toInt()

    for(n in numeroInicial..numeroFinal) {
       if(n != numeroInicial && n != numeroFinal) {
           println(n)       }

    }

}