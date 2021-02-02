fun main() {

    println("Responda às perguntas utilizando S(sim) ou N(não)")
    print("Telefonou para a vítima?")
    var telefonema = readLine()!!.toUpperCase()
    print("Esteve no local do crime?")
    var localCrime = readLine()!!.toUpperCase()
    print("Mora perto da vítima?")
    var moraPerto = readLine()!!.toUpperCase()
    print("Devia para a vítima?")
    var devia = readLine()!!.toUpperCase()
    print("Já trabalhou com a vítima?")
    var trabalhouJunto= readLine()!!.toUpperCase()

    var somaSuspeita = 0
        if(telefonema == "S") {
            somaSuspeita += 1
        }
        if(localCrime == "S") {
            somaSuspeita = somaSuspeita + 1
        }
        if(moraPerto == "S") {
             somaSuspeita = somaSuspeita + 1
        }
        if(devia == "S") {
            somaSuspeita = somaSuspeita + 1
        }
        if(trabalhouJunto == "S") {
            somaSuspeita = somaSuspeita + 1
        }

    if (somaSuspeita == 5){
        println("Você é o(a) assasino!")
    } else if(somaSuspeita == 3 || somaSuspeita == 4) {
        println("Você é cúmplice do crime.")
    } else if (somaSuspeita == 2) {
        println("Você é suspeito(a) do crime")
    } else {
        println("Você é inocente!")
    }



}