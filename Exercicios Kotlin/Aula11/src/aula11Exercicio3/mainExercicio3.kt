package aula11Exercicio3

fun main() {

    val listaAluno = arrayListOf<Aluno>()

    listaAluno.add(Aluno("Bia", 111))
    listaAluno.add(Aluno("Julia", 121))
    listaAluno.add(Aluno("Alex", 131))
    listaAluno.add(Aluno("Marcos", 141))

    val novoAluno = Aluno("Junior", 111)

    println(listaAluno.contains(novoAluno))

}

//3- resultado false, novo aluno não está na contido na lista
//5- resultado true, compara somente o dado numeroDeAluno

