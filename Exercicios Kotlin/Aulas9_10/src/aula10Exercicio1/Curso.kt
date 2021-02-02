package aula10Exercicio1

abstract class Curso(
    val nomeCurso: String,
    val professorResponsavel: Professor
) {

    val aulas get() = ArrayList<Aula>()

    val alunos get() = ArrayList<Aluno>()


}