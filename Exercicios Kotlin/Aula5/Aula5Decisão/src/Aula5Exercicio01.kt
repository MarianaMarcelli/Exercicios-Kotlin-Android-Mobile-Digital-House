fun main() {

        print("Digite seu sexo, sendo F (feminino) e M (masculino): ")
    var sexo = readLine()!!.toUpperCase()

    if (sexo == "F") {
        print("Feminino")
    } else if ( sexo == "M") {
        print("Masculino")
    } else {
        print("Sexo inválido")
    }

}