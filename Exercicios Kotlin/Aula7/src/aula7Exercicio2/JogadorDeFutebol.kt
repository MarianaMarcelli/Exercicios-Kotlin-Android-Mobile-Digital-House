package aula7Exercicio2

class JogadorDeFutebol(val nome: String,
                       var energia: Int,
                       var alegria: Int,
                       var gols: Int,
                       var experiencia: Int) {

    fun fazerGol(numeroGols: Int) {
        gols += numeroGols
        if (numeroGols > 0) {
            energia -= 5 * numeroGols
            alegria += 10 * numeroGols
            gols += numeroGols
            println("GOOOOOL!")
        }
    }

    fun correr() {
        energia -= 10
        println("Cansei")

    }


    fun ganharExperiencia(valor: Int) {
        println("Sua experiência inicial era de $experiencia e agora é de ${experiencia + valor}")
        experiencia += valor

    }
}

