package aula7Exercicio2

fun main() {

    val jogadorUm = JogadorDeFutebol("Alexander", 100, 0, 0, 0)
    val jogadorDois = JogadorDeFutebol("Juju", 100, 10, 0, 10)

    println(jogadorUm.nome)
    var sessaoDeTreinamento = SessaoDeTreinamento(jogadorUm)
    sessaoDeTreinamento.treinarA()

    println("O jogador ${jogadorDois.nome} realizará uma sessão de treinamento")
    sessaoDeTreinamento = SessaoDeTreinamento(jogadorDois)
    sessaoDeTreinamento.treinarA()






}
