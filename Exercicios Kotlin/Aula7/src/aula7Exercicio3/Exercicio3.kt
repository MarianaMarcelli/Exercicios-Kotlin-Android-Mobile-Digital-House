package aula7Exercicio3

fun main() {

    var atletaUm = Atleta("Lucas", 6, 50)
    var atletaDois = Atleta("Márcio", 10, 70)

    var provaUm = Prova(4, 20)
    var provaDois = Prova(7, 50)
    var provaTres = Prova(10, 80)



    if (provaUm.realizarProva(atletaUm)) {
        println("${atletaUm.nome} você pode realizar a prova 1")
    } else {
        println("${atletaUm.nome} você  não pode realizar a prova 1")
    }
    if (provaDois.realizarProva(atletaUm)) {
        println("${atletaUm.nome} você pode realizar a prova 2")
    } else {
        println("${atletaUm.nome} você não pode realizar a prova 2")
    }
    if (provaTres.realizarProva(atletaUm)) {
        println("${atletaUm.nome} você pode realizar a prova 3")
    } else {
        println("${atletaUm.nome} você  não pode realizar a prova 3")
    }


    if (provaUm.realizarProva(atletaDois)) {
        println("${atletaDois.nome} você pode realizar a prova 1")
    } else {
        println("${atletaDois.nome} você  não pode realizar a prova 1")
    }
    if (provaDois.realizarProva(atletaDois)) {
        println("${atletaDois.nome} você pode realizar a prova 2")
    } else {
        println("${atletaDois.nome} você não pode realizar a prova 2")
    }
    if (provaTres.realizarProva(atletaDois)) {
        println("${atletaDois.nome} você pode realizar a prova 3")
    } else {
        println("${atletaDois.nome} você  não pode realizar a prova 3")
    }


}



