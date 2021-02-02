package aula7Exercicio2

class SessaoDeTreinamento (var jogador: JogadorDeFutebol) {

    fun treinarA () {
        jogador.correr()
        jogador.fazerGol(numeroGols = 1)
        jogador.correr()
        jogador.ganharExperiencia(10)
    }

}