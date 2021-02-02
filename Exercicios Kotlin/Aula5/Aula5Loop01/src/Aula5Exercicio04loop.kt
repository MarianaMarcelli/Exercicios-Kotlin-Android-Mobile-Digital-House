fun main() {

    print("Informe seu nome: ")
    var nome = readLine().toString()
    while (nome.length < 4) {
        print("Informe seu nome (necessário um mínimo de 3 letras): ")
        nome = readLine().toString()
    }

    var idade = 0
    while (idade < 0 && idade > 150) {
        print("Informe seu sua idade: ")
        idade = readLine()!!.toInt()
    }
    var salario = 0.0
    while (salario <= 0) {
        print("Informe seu salário: ")
        salario = readLine()!!.toDouble()
    }

    var sexo = ""
    while (sexo != "F" && sexo != "M") {
        print("Digite seu sexo, sendo F (feminino) e M (masculino): ")
        sexo = readLine()!!.toUpperCase()
    }
    var estadoCivil = ""
    while (estadoCivil != "s" && estadoCivil != "c" && estadoCivil != "v" && estadoCivil != "d") {
        print("Informe seu estado civil, sendo s(solteiro), c(casado), v(viúvo), d(divorciado): ")
        estadoCivil = (readLine().toString()).toLowerCase()
    }
}
