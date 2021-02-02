fun main() {

    var frase1 : String
    var frase2 : String

    print(" Insira uma frase: ")
    frase1 = readLine()!!.toString()
    print("Agora uma outra frase: ")
    frase2 = readLine()!!.toString()

    if (comparaStrings( frase1, frase2)) {
        print("As frases são diferentes")
    } else {
        print("As frases são iguais")
    }

}

fun comparaStrings (texto1: String , texto2: String) : Boolean {
    return texto1 != texto2
}
